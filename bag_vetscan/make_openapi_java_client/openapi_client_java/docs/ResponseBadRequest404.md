

# ResponseBadRequest404


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detail** | **String** | A description of the problem with the request | 
**status** | [**StatusEnum**](#StatusEnum) | The number of the HTTP error code | 
**title** | [**TitleEnum**](#TitleEnum) | The title of the error indicated by the status | 
**type** | **String** | Additional error information if available describing the type of error | 



## Enum: StatusEnum

Name | Value
---- | -----
NUMBER_404 | new BigDecimal(&quot;404&quot;)



## Enum: TitleEnum

Name | Value
---- | -----
NOT_FOUND | &quot;Not Found&quot;



