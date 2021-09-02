# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.event_info import EventInfo
from openapi_server import util

from openapi_server.models.event_info import EventInfo  # noqa: E501

class InlineResponse2003(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, currently_activated_events=None):  # noqa: E501
        """InlineResponse2003 - a model defined in OpenAPI

        :param currently_activated_events: The currently_activated_events of this InlineResponse2003.  # noqa: E501
        :type currently_activated_events: List[EventInfo]
        """
        self.openapi_types = {
            'currently_activated_events': List[EventInfo]
        }

        self.attribute_map = {
            'currently_activated_events': 'currently_activated_events'
        }

        self._currently_activated_events = currently_activated_events

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse2003':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_3 of this InlineResponse2003.  # noqa: E501
        :rtype: InlineResponse2003
        """
        return util.deserialize_model(dikt, cls)

    @property
    def currently_activated_events(self):
        """Gets the currently_activated_events of this InlineResponse2003.

        An array of all events that are currently activated  # noqa: E501

        :return: The currently_activated_events of this InlineResponse2003.
        :rtype: List[EventInfo]
        """
        return self._currently_activated_events

    @currently_activated_events.setter
    def currently_activated_events(self, currently_activated_events):
        """Sets the currently_activated_events of this InlineResponse2003.

        An array of all events that are currently activated  # noqa: E501

        :param currently_activated_events: The currently_activated_events of this InlineResponse2003.
        :type currently_activated_events: List[EventInfo]
        """
        if currently_activated_events is None:
            raise ValueError("Invalid value for `currently_activated_events`, must not be `None`")  # noqa: E501

        self._currently_activated_events = currently_activated_events
