# coding: utf-8

"""
    Analyzer and HUB API

    The definition of the software interface between analyzers and the HUB.  The interface will be implemented as a RESTful interface with all server endpoints hosted on the Analyzer.  The following requirements will be met by all interfaces:  1. All data passed back from server shall be in JSON format. 2. All query parameters and JSON data properties shall be named using snake case and be all lower case. 4. All data types that describe a measurement value shall end with an underscore followed by the unit of that physical value.  i.e. motor_current_ma.  # noqa: E501

    The version of the OpenAPI document: 1.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import openapi_client
from openapi_client.models.inline_response200 import InlineResponse200  # noqa: E501
from openapi_client.rest import ApiException

class TestInlineResponse200(unittest.TestCase):
    """InlineResponse200 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test InlineResponse200
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.inline_response200.InlineResponse200()  # noqa: E501
        if include_optional :
            return InlineResponse200(
                measurement_id = '', 
                elapsed_time_msec = 0, 
                measurement_status = 'Initializing', 
                status_detail = ''
            )
        else :
            return InlineResponse200(
                measurement_id = '',
                elapsed_time_msec = 0,
                measurement_status = 'Initializing',
                status_detail = '',
        )

    def testInlineResponse200(self):
        """Test InlineResponse200"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
