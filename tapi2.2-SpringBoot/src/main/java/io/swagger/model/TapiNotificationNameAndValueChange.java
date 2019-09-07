package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiNotificationNameAndValueChange
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiNotificationNameAndValueChange   {
  @JsonProperty("new-value")
  private String newValue = null;

  @JsonProperty("old-value")
  private String oldValue = null;

  @JsonProperty("value-name")
  private String valueName = null;

  public TapiNotificationNameAndValueChange newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * The value
   * @return newValue
  **/
  @ApiModelProperty(value = "The value")

  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  public TapiNotificationNameAndValueChange oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }

  /**
   * The value
   * @return oldValue
  **/
  @ApiModelProperty(value = "The value")

  public String getOldValue() {
    return oldValue;
  }

  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }

  public TapiNotificationNameAndValueChange valueName(String valueName) {
    this.valueName = valueName;
    return this;
  }

  /**
   * The name of the value. The value need not have a name.
   * @return valueName
  **/
  @ApiModelProperty(value = "The name of the value. The value need not have a name.")

  public String getValueName() {
    return valueName;
  }

  public void setValueName(String valueName) {
    this.valueName = valueName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationNameAndValueChange tapiNotificationNameAndValueChange = (TapiNotificationNameAndValueChange) o;
    return Objects.equals(this.newValue, tapiNotificationNameAndValueChange.newValue) &&
        Objects.equals(this.oldValue, tapiNotificationNameAndValueChange.oldValue) &&
        Objects.equals(this.valueName, tapiNotificationNameAndValueChange.valueName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newValue, oldValue, valueName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationNameAndValueChange {\n");
    
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    valueName: ").append(toIndentedString(valueName)).append("\n");
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
