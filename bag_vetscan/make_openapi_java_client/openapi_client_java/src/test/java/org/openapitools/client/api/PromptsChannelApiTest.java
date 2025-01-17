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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.BodyNotificationAck;
import org.openapitools.client.model.BodyPromptsOptionChosen;
import org.openapitools.client.model.BodyPromptsQrScanned;
import org.openapitools.client.model.ResponseBadRequest400;
import org.openapitools.client.model.ResponseServiceUnavailable503;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PromptsChannelApi
 */
@Ignore
public class PromptsChannelApiTest {

    private final PromptsChannelApi api = new PromptsChannelApi();

    
    /**
     * 
     *
     * Hub is informing the analyzer a notification was acknowledged by the operator in response to a websocket message named notification on the prompts channel.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void promptsNotificationAckPostTest() throws ApiException {
        BodyNotificationAck body = null;
        api.promptsNotificationAckPost(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Hub is informing the analyzer of an option that was made by the operator in response to a websocket message named choose_option on the prompts channel.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void promptsOptionChosenPostTest() throws ApiException {
        BodyPromptsOptionChosen body = null;
        api.promptsOptionChosenPost(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Hub is informing the analyzer of a QR scan attempt in response to a websocket message named scan_qr on the prompts channel.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void promptsQrScannedPostTest() throws ApiException {
        BodyPromptsQrScanned body = null;
        api.promptsQrScannedPost(body);

        // TODO: test validations
    }
    
}
