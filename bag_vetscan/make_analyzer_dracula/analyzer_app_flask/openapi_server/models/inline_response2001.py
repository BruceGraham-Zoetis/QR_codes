# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.measurement_result import MeasurementResult
from openapi_server import util

from openapi_server.models.measurement_result import MeasurementResult  # noqa: E501

class InlineResponse2001(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, measurement_results=None):  # noqa: E501
        """InlineResponse2001 - a model defined in OpenAPI

        :param measurement_results: The measurement_results of this InlineResponse2001.  # noqa: E501
        :type measurement_results: List[MeasurementResult]
        """
        self.openapi_types = {
            'measurement_results': List[MeasurementResult]
        }

        self.attribute_map = {
            'measurement_results': 'measurement_results'
        }

        self._measurement_results = measurement_results

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse2001':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_1 of this InlineResponse2001.  # noqa: E501
        :rtype: InlineResponse2001
        """
        return util.deserialize_model(dikt, cls)

    @property
    def measurement_results(self):
        """Gets the measurement_results of this InlineResponse2001.

        An array of measurement result objects that were taken in between the times sent in the request.  If there are no historical results to report, this will return as an empty array  # noqa: E501

        :return: The measurement_results of this InlineResponse2001.
        :rtype: List[MeasurementResult]
        """
        return self._measurement_results

    @measurement_results.setter
    def measurement_results(self, measurement_results):
        """Sets the measurement_results of this InlineResponse2001.

        An array of measurement result objects that were taken in between the times sent in the request.  If there are no historical results to report, this will return as an empty array  # noqa: E501

        :param measurement_results: The measurement_results of this InlineResponse2001.
        :type measurement_results: List[MeasurementResult]
        """
        if measurement_results is None:
            raise ValueError("Invalid value for `measurement_results`, must not be `None`")  # noqa: E501

        self._measurement_results = measurement_results
