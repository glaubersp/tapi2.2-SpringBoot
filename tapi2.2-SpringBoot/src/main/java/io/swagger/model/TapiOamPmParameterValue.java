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
 * TapiOamPmParameterValue
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamPmParameterValue   {
  @JsonProperty("pm-parameter-int-value")
  private Integer pmParameterIntValue = null;

  @JsonProperty("pm-parameter-real-value")
  private String pmParameterRealValue = null;

  public TapiOamPmParameterValue pmParameterIntValue(Integer pmParameterIntValue) {
    this.pmParameterIntValue = pmParameterIntValue;
    return this;
  }

  /**
   * none
   * @return pmParameterIntValue
  **/
  @ApiModelProperty(value = "none")

  public Integer getPmParameterIntValue() {
    return pmParameterIntValue;
  }

  public void setPmParameterIntValue(Integer pmParameterIntValue) {
    this.pmParameterIntValue = pmParameterIntValue;
  }

  public TapiOamPmParameterValue pmParameterRealValue(String pmParameterRealValue) {
    this.pmParameterRealValue = pmParameterRealValue;
    return this;
  }

  /**
   * none
   * @return pmParameterRealValue
  **/
  @ApiModelProperty(value = "none")

  public String getPmParameterRealValue() {
    return pmParameterRealValue;
  }

  public void setPmParameterRealValue(String pmParameterRealValue) {
    this.pmParameterRealValue = pmParameterRealValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamPmParameterValue tapiOamPmParameterValue = (TapiOamPmParameterValue) o;
    return Objects.equals(this.pmParameterIntValue, tapiOamPmParameterValue.pmParameterIntValue) &&
        Objects.equals(this.pmParameterRealValue, tapiOamPmParameterValue.pmParameterRealValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pmParameterIntValue, pmParameterRealValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamPmParameterValue {\n");
    
    sb.append("    pmParameterIntValue: ").append(toIndentedString(pmParameterIntValue)).append("\n");
    sb.append("    pmParameterRealValue: ").append(toIndentedString(pmParameterRealValue)).append("\n");
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
