#!/usr/bin/env python3
# 
# # see https://towardsdatascience.com/building-a-barcode-qr-code-reader-using-python-360e22dfb6e5

# Computer Vision
# ==========================
#   $ sudo -H pip3 install opencv-python
#   $ sudo -H apt-get install libzbar0
#   $ sudo -H pip3 install pyzbar
#   $ sudo -H pip3 install pyzbar[scripts]
#
# Video for Linux
# ==================
# v4l2ctl is a python package to control v4l2 drivers.
# https://pypi.org/project/v4l2ctl/
# https://v4l2ctl.readthedocs.io/en/latest/
#
# console app
# --------------------
# sudo apt install v4l-utils
#    $ v4l2-ctl --device=/dev/video0 -l
# Python lib
# -------------------
#    $ sudo pip3 install v4l2ctl

#import libraries
#import subprocess
from typing import Text
import cv2
from pyzbar import pyzbar
import json
import os
import time
#import v4l2ctl

import sys
sys.path.append('../../audio_control')
#sys.path.insert(1, '/.../../audio_control')
import audio_play


def decode_qr_code_in_frame(frame):
    bFound = False
    barcode_info = ""
    barcode = ""
    dicContents = {}

    try:
        barcodes = pyzbar.decode(frame)
    except:
        return bFound, frame, barcode, dicContents

    for barcode in barcodes:
        barcode_info = barcode.data.decode('utf-8')
        
        try:
            dicContents = json.loads(barcode_info)
            bFound = True

        except:
            dicContents = {"raw": barcode_info}
            bFound = True

    return bFound, frame, barcode, dicContents

if __name__ == '__main__':
    camera = cv2.VideoCapture(0)

    # turn off the LED
    if (os.name == 'nt'):
        print("NT")
    elif (os.name == 'posix'):
        """
        lstCmd = ["./OneDrive_1_7-30-2021/SP_V4L2_API-2021-07-19/Demo_V4L2/bin/SPCA_v4l2_tool_GNU_x64", "-D0", "-w", "-a2043", "-e0"]
        print(*lstCmd)
        subprocess.call(lstCmd)
        """
        pass

    # turn off the camera auto-focus
    camera.set(cv2.CAP_PROP_AUTOFOCUS, 0)
    camera.set(cv2.CAP_PROP_FOCUS, 900)

    iCount = 0
    barcode_info = ""
    bFound = False
    dicContents= {}
    bContinue = True

    t_end = time.time()

    while bContinue:
        if cv2.waitKey(1) & 0xFF == 27:
            bContinue = False

        ret, frameIn = camera.read()
        bFound, frameIn, barcode, dicContents = decode_qr_code_in_frame(frameIn)
        cv2.imshow('Barcode/QR code reader', frameIn)
        if (bFound):
            x, y , w, h = barcode.rect
            cv2.rectangle(frameIn, (x, y),(x+w, y+h), (0, 255, 0), 2)
            font = cv2.FONT_HERSHEY_DUPLEX

            # Print to the console and on the window, the key:Value of dicContents, one line per key
            xPos = x + 6
            yPos = y + h + 30
            keys = dicContents.keys()
            for key in keys:
                txtDisplay = key + ": " + dicContents[key]
                cv2.putText(frameIn, txtDisplay, (xPos, yPos), font, 1.0, (255, 255, 255), 1)
                print(txtDisplay)
                yPos += 30
            print("")

            cv2.imshow('Barcode/QR code reader', frameIn)

            try:
                if (t_end <= time.time()):
                    # beep to let the user know the QR code was detected.
                    audio_play.playWaveFileNoBlock('./beep-08b.wav')
                    t_end = time.time() + 1
            except:
                pass

            bFound = False
        else:
            pass

    camera.release()
    cv2.destroyAllWindows()

