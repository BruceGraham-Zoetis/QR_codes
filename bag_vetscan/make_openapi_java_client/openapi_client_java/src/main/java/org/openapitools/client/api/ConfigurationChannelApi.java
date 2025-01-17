/*
 * Analyzer and HUB API
 * The definition of the software interface between analyzers and the HUB.  The interface will be implemented as a RESTful interface with all server endpoints hosted on the Analyzer.  The following requirements will be met by all interfaces:  1. All data passed back from server shall be in JSON format. 2. All query parameters and JSON data properties shall be named using snake case and be all lower case. 4. All data types that describe a measurement value shall end with an underscore followed by the unit of that physical value.  i.e. motor_current_ma.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ResponseBadRequest400;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigurationChannelApi {
    private ApiClient localVarApiClient;

    public ConfigurationChannelApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConfigurationChannelApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for configurationFactoryResetPut
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer successfully began a factory reset </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call configurationFactoryResetPutCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/configuration/factory_reset";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call configurationFactoryResetPutValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = configurationFactoryResetPutCall(_callback);
        return localVarCall;

    }

    /**
     * 
     * Restore the analyzer to the state it was in when it left the factory. All settings and data are removed.
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer successfully began a factory reset </td><td>  -  </td></tr>
     </table>
     */
    public void configurationFactoryResetPut() throws ApiException {
        configurationFactoryResetPutWithHttpInfo();
    }

    /**
     * 
     * Restore the analyzer to the state it was in when it left the factory. All settings and data are removed.
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer successfully began a factory reset </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> configurationFactoryResetPutWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = configurationFactoryResetPutValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Restore the analyzer to the state it was in when it left the factory. All settings and data are removed.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer successfully began a factory reset </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call configurationFactoryResetPutAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = configurationFactoryResetPutValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for configurationGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer responds with the its configuration information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> This response is sent to a request that violates the predefined request schema </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call configurationGetCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/configuration";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call configurationGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = configurationGetCall(_callback);
        return localVarCall;

    }

    /**
     * 
     * Request the configuration from the analyzer
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer responds with the its configuration information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> This response is sent to a request that violates the predefined request schema </td><td>  -  </td></tr>
     </table>
     */
    public Object configurationGet() throws ApiException {
        ApiResponse<Object> localVarResp = configurationGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * Request the configuration from the analyzer
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer responds with the its configuration information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> This response is sent to a request that violates the predefined request schema </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> configurationGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = configurationGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Request the configuration from the analyzer
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer responds with the its configuration information </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> This response is sent to a request that violates the predefined request schema </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call configurationGetAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = configurationGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for configurationPut
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer successfully made configuration changes requested by the client </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> This response is sent to a request that violates the predefined request schema </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call configurationPutCall(Object body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/configuration";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call configurationPutValidateBeforeCall(Object body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling configurationPut(Async)");
        }
        

        okhttp3.Call localVarCall = configurationPutCall(body, _callback);
        return localVarCall;

    }

    /**
     * 
     * Set the configuration of the analyzer
     * @param body  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer successfully made configuration changes requested by the client </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> This response is sent to a request that violates the predefined request schema </td><td>  -  </td></tr>
     </table>
     */
    public void configurationPut(Object body) throws ApiException {
        configurationPutWithHttpInfo(body);
    }

    /**
     * 
     * Set the configuration of the analyzer
     * @param body  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer successfully made configuration changes requested by the client </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> This response is sent to a request that violates the predefined request schema </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> configurationPutWithHttpInfo(Object body) throws ApiException {
        okhttp3.Call localVarCall = configurationPutValidateBeforeCall(body, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Set the configuration of the analyzer
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer successfully made configuration changes requested by the client </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> This response is sent to a request that violates the predefined request schema </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call configurationPutAsync(Object body, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = configurationPutValidateBeforeCall(body, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for configurationSchemaGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer responds with the configuration schema that is used to validate the configuration </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> The analyzer does not provide a schema for the configuration </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call configurationSchemaGetCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/configuration/schema";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call configurationSchemaGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = configurationSchemaGetCall(_callback);
        return localVarCall;

    }

    /**
     * 
     * Request the configuration schema from the analyzer
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer responds with the configuration schema that is used to validate the configuration </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> The analyzer does not provide a schema for the configuration </td><td>  -  </td></tr>
     </table>
     */
    public Object configurationSchemaGet() throws ApiException {
        ApiResponse<Object> localVarResp = configurationSchemaGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * Request the configuration schema from the analyzer
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer responds with the configuration schema that is used to validate the configuration </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> The analyzer does not provide a schema for the configuration </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> configurationSchemaGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = configurationSchemaGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Request the configuration schema from the analyzer
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Analyzer responds with the configuration schema that is used to validate the configuration </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> The analyzer does not provide a schema for the configuration </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call configurationSchemaGetAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = configurationSchemaGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
