package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiNotificationGetsupportednotificationtypesOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiNotificationGetsupportednotificationtypesOutput   {
  @JsonProperty("supported-object-types")
  @Valid
  private List<String> supportedObjectTypes = null;

  @JsonProperty("supported-notification-types")
  @Valid
  private List<String> supportedNotificationTypes = null;

  public TapiNotificationGetsupportednotificationtypesOutput supportedObjectTypes(List<String> supportedObjectTypes) {
    this.supportedObjectTypes = supportedObjectTypes;
    return this;
  }

  public TapiNotificationGetsupportednotificationtypesOutput addSupportedObjectTypesItem(String supportedObjectTypesItem) {
    if (this.supportedObjectTypes == null) {
      this.supportedObjectTypes = new ArrayList<String>();
    }
    this.supportedObjectTypes.add(supportedObjectTypesItem);
    return this;
  }

  /**
   * none
   * @return supportedObjectTypes
  **/
  @ApiModelProperty(value = "none")

  public List<String> getSupportedObjectTypes() {
    return supportedObjectTypes;
  }

  public void setSupportedObjectTypes(List<String> supportedObjectTypes) {
    this.supportedObjectTypes = supportedObjectTypes;
  }

  public TapiNotificationGetsupportednotificationtypesOutput supportedNotificationTypes(List<String> supportedNotificationTypes) {
    this.supportedNotificationTypes = supportedNotificationTypes;
    return this;
  }

  public TapiNotificationGetsupportednotificationtypesOutput addSupportedNotificationTypesItem(String supportedNotificationTypesItem) {
    if (this.supportedNotificationTypes == null) {
      this.supportedNotificationTypes = new ArrayList<String>();
    }
    this.supportedNotificationTypes.add(supportedNotificationTypesItem);
    return this;
  }

  /**
   * none
   * @return supportedNotificationTypes
  **/
  @ApiModelProperty(value = "none")

  public List<String> getSupportedNotificationTypes() {
    return supportedNotificationTypes;
  }

  public void setSupportedNotificationTypes(List<String> supportedNotificationTypes) {
    this.supportedNotificationTypes = supportedNotificationTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationGetsupportednotificationtypesOutput tapiNotificationGetsupportednotificationtypesOutput = (TapiNotificationGetsupportednotificationtypesOutput) o;
    return Objects.equals(this.supportedObjectTypes, tapiNotificationGetsupportednotificationtypesOutput.supportedObjectTypes) &&
        Objects.equals(this.supportedNotificationTypes, tapiNotificationGetsupportednotificationtypesOutput.supportedNotificationTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedObjectTypes, supportedNotificationTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationGetsupportednotificationtypesOutput {\n");
    
    sb.append("    supportedObjectTypes: ").append(toIndentedString(supportedObjectTypes)).append("\n");
    sb.append("    supportedNotificationTypes: ").append(toIndentedString(supportedNotificationTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
