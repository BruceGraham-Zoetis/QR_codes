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


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Consumable
 */
public class ConsumableTest {
    private final Consumable model = new Consumable();

    /**
     * Model tests for Consumable
     */
    @Test
    public void testConsumable() {
        // TODO: test Consumable
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'uuid'
     */
    @Test
    public void uuidTest() {
        // TODO: test uuid
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'species'
     */
    @Test
    public void speciesTest() {
        // TODO: test species
    }

    /**
     * Test the property 'duration'
     */
    @Test
    public void durationTest() {
        // TODO: test duration
    }

    /**
     * Test the property 'assays'
     */
    @Test
    public void assaysTest() {
        // TODO: test assays
    }

    /**
     * Test the property 'schema'
     */
    @Test
    public void schemaTest() {
        // TODO: test schema
    }

}