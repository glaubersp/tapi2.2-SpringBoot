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
 * TapiCommonNameAndValue
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiCommonNameAndValue   {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("value-name")
  private String valueName = null;

  public TapiCommonNameAndValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value
   * @return value
  **/
  @ApiModelProperty(value = "The value")

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TapiCommonNameAndValue valueName(String valueName) {
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
    TapiCommonNameAndValue tapiCommonNameAndValue = (TapiCommonNameAndValue) o;
    return Objects.equals(this.value, tapiCommonNameAndValue.value) &&
        Objects.equals(this.valueName, tapiCommonNameAndValue.valueName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, valueName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonNameAndValue {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
