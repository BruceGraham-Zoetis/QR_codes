# coding: utf-8

"""
    Analyzer and HUB API

    The definition of the software interface between analyzers and the HUB.  The interface will be implemented as a RESTful interface with all server endpoints hosted on the Analyzer.  The following requirements will be met by all interfaces:  1. All data passed back from server shall be in JSON format. 2. All query parameters and JSON data properties shall be named using snake case and be all lower case. 4. All data types that describe a measurement value shall end with an underscore followed by the unit of that physical value.  i.e. motor_current_ma.  # noqa: E501

    The version of the OpenAPI document: 1.0
    Generated by: https://openapi-generator.tech
"""


try:
    from inspect import getfullargspec
except ImportError:
    from inspect import getargspec as getfullargspec
import pprint
import re  # noqa: F401
import six

from openapi_client.configuration import Configuration


class EventInfo(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'activation_time': 'str',
        'severity': 'str',
        'event_name': 'str',
        'event_additional_information': 'str'
    }

    attribute_map = {
        'activation_time': 'activation_time',
        'severity': 'severity',
        'event_name': 'event_name',
        'event_additional_information': 'event_additional_information'
    }

    def __init__(self, activation_time=None, severity=None, event_name=None, event_additional_information=None, local_vars_configuration=None):  # noqa: E501
        """EventInfo - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._activation_time = None
        self._severity = None
        self._event_name = None
        self._event_additional_information = None
        self.discriminator = None

        if activation_time is not None:
            self.activation_time = activation_time
        if severity is not None:
            self.severity = severity
        if event_name is not None:
            self.event_name = event_name
        if event_additional_information is not None:
            self.event_additional_information = event_additional_information

    @property
    def activation_time(self):
        """Gets the activation_time of this EventInfo.  # noqa: E501

        The local date and time the event was activated in format MM-DD-YYYY HH:MM:SS  # noqa: E501

        :return: The activation_time of this EventInfo.  # noqa: E501
        :rtype: str
        """
        return self._activation_time

    @activation_time.setter
    def activation_time(self, activation_time):
        """Sets the activation_time of this EventInfo.

        The local date and time the event was activated in format MM-DD-YYYY HH:MM:SS  # noqa: E501

        :param activation_time: The activation_time of this EventInfo.  # noqa: E501
        :type activation_time: str
        """

        self._activation_time = activation_time

    @property
    def severity(self):
        """Gets the severity of this EventInfo.  # noqa: E501

        A string value indicating the severity of the event  # noqa: E501

        :return: The severity of this EventInfo.  # noqa: E501
        :rtype: str
        """
        return self._severity

    @severity.setter
    def severity(self, severity):
        """Sets the severity of this EventInfo.

        A string value indicating the severity of the event  # noqa: E501

        :param severity: The severity of this EventInfo.  # noqa: E501
        :type severity: str
        """
        allowed_values = ["Notification", "Warning", "Error", "Halt"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and severity not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `severity` ({0}), must be one of {1}"  # noqa: E501
                .format(severity, allowed_values)
            )

        self._severity = severity

    @property
    def event_name(self):
        """Gets the event_name of this EventInfo.  # noqa: E501

        The name of the event  # noqa: E501

        :return: The event_name of this EventInfo.  # noqa: E501
        :rtype: str
        """
        return self._event_name

    @event_name.setter
    def event_name(self, event_name):
        """Sets the event_name of this EventInfo.

        The name of the event  # noqa: E501

        :param event_name: The event_name of this EventInfo.  # noqa: E501
        :type event_name: str
        """

        self._event_name = event_name

    @property
    def event_additional_information(self):
        """Gets the event_additional_information of this EventInfo.  # noqa: E501

        Additional information to describe the event that has occurred.  This can be anything that will help the operator understand in more detail the event  # noqa: E501

        :return: The event_additional_information of this EventInfo.  # noqa: E501
        :rtype: str
        """
        return self._event_additional_information

    @event_additional_information.setter
    def event_additional_information(self, event_additional_information):
        """Sets the event_additional_information of this EventInfo.

        Additional information to describe the event that has occurred.  This can be anything that will help the operator understand in more detail the event  # noqa: E501

        :param event_additional_information: The event_additional_information of this EventInfo.  # noqa: E501
        :type event_additional_information: str
        """

        self._event_additional_information = event_additional_information

    def to_dict(self, serialize=False):
        """Returns the model properties as a dict"""
        result = {}

        def convert(x):
            if hasattr(x, "to_dict"):
                args = getfullargspec(x.to_dict).args
                if len(args) == 1:
                    return x.to_dict()
                else:
                    return x.to_dict(serialize)
            else:
                return x

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            attr = self.attribute_map.get(attr, attr) if serialize else attr
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: convert(x),
                    value
                ))
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], convert(item[1])),
                    value.items()
                ))
            else:
                result[attr] = convert(value)

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, EventInfo):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, EventInfo):
            return True

        return self.to_dict() != other.to_dict()
