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

import java.util.Objects;
import java.util.Arrays;
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
import org.openapitools.client.model.Consumable;

/**
 * ResponseSupportedConsumables
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-07T10:16:52.817798-04:00[America/Nassau]")
public class ResponseSupportedConsumables {
  public static final String SERIALIZED_NAME_CONSUMABLES = "consumables";
  @SerializedName(SERIALIZED_NAME_CONSUMABLES)
  private List<Consumable> consumables = null;


  public ResponseSupportedConsumables consumables(List<Consumable> consumables) {
    
    this.consumables = consumables;
    return this;
  }

  public ResponseSupportedConsumables addConsumablesItem(Consumable consumablesItem) {
    if (this.consumables == null) {
      this.consumables = new ArrayList<Consumable>();
    }
    this.consumables.add(consumablesItem);
    return this;
  }

   /**
   * Get consumables
   * @return consumables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Consumable> getConsumables() {
    return consumables;
  }


  public void setConsumables(List<Consumable> consumables) {
    this.consumables = consumables;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseSupportedConsumables responseSupportedConsumables = (ResponseSupportedConsumables) o;
    return Objects.equals(this.consumables, responseSupportedConsumables.consumables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseSupportedConsumables {\n");
    sb.append("    consumables: ").append(toIndentedString(consumables)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
