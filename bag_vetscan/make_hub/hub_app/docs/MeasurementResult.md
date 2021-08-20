# MeasurementResult

This object will contain results of the most recent measurement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consumable_name** | **str** | A descriptive name of the consumable that can be used to uniquely identify it | [optional] 
**start_date_and_time** | **str** | The local date and time the measurement was started in format MM-DD-YYYY HH:MM:SS | [optional] 
**end_date_and_time** | **str** | The local date and time the measurement ended in format MM-DD-YYYY HH:MM:SS | [optional] 
**duration_sec** | **float** | The number of seconds the measurement took from start to end | [optional] 
**result** | **str** | The overall result of the measurement | [optional] 
**test_results** | **object** | The test results.  Will need to flush this out as we go on as to what this looks like | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

