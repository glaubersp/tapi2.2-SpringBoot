package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamPmParameterValue;
import io.swagger.model.TapiOamThresholdCrossingQualifier;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamThresholdParameter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamThresholdParameter   {
  @JsonProperty("pm-parameter-above-thrs")
  private TapiOamPmParameterValue pmParameterAboveThrs = null;

  @JsonProperty("pm-parameter-below-thrs")
  private TapiOamPmParameterValue pmParameterBelowThrs = null;

  @JsonProperty("pm-parameter-clear-thrs")
  private TapiOamPmParameterValue pmParameterClearThrs = null;

  @JsonProperty("pm-parameter-name")
  private String pmParameterName = null;

  @JsonProperty("threshold-location")
  private TapiOamThresholdCrossingQualifier thresholdLocation = null;

  public TapiOamThresholdParameter pmParameterAboveThrs(TapiOamPmParameterValue pmParameterAboveThrs) {
    this.pmParameterAboveThrs = pmParameterAboveThrs;
    return this;
  }

  /**
   * Get pmParameterAboveThrs
   * @return pmParameterAboveThrs
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamPmParameterValue getPmParameterAboveThrs() {
    return pmParameterAboveThrs;
  }

  public void setPmParameterAboveThrs(TapiOamPmParameterValue pmParameterAboveThrs) {
    this.pmParameterAboveThrs = pmParameterAboveThrs;
  }

  public TapiOamThresholdParameter pmParameterBelowThrs(TapiOamPmParameterValue pmParameterBelowThrs) {
    this.pmParameterBelowThrs = pmParameterBelowThrs;
    return this;
  }

  /**
   * Get pmParameterBelowThrs
   * @return pmParameterBelowThrs
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamPmParameterValue getPmParameterBelowThrs() {
    return pmParameterBelowThrs;
  }

  public void setPmParameterBelowThrs(TapiOamPmParameterValue pmParameterBelowThrs) {
    this.pmParameterBelowThrs = pmParameterBelowThrs;
  }

  public TapiOamThresholdParameter pmParameterClearThrs(TapiOamPmParameterValue pmParameterClearThrs) {
    this.pmParameterClearThrs = pmParameterClearThrs;
    return this;
  }

  /**
   * Get pmParameterClearThrs
   * @return pmParameterClearThrs
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamPmParameterValue getPmParameterClearThrs() {
    return pmParameterClearThrs;
  }

  public void setPmParameterClearThrs(TapiOamPmParameterValue pmParameterClearThrs) {
    this.pmParameterClearThrs = pmParameterClearThrs;
  }

  public TapiOamThresholdParameter pmParameterName(String pmParameterName) {
    this.pmParameterName = pmParameterName;
    return this;
  }

  /**
   * none
   * @return pmParameterName
  **/
  @ApiModelProperty(value = "none")

  public String getPmParameterName() {
    return pmParameterName;
  }

  public void setPmParameterName(String pmParameterName) {
    this.pmParameterName = pmParameterName;
  }

  public TapiOamThresholdParameter thresholdLocation(TapiOamThresholdCrossingQualifier thresholdLocation) {
    this.thresholdLocation = thresholdLocation;
    return this;
  }

  /**
   * Get thresholdLocation
   * @return thresholdLocation
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamThresholdCrossingQualifier getThresholdLocation() {
    return thresholdLocation;
  }

  public void setThresholdLocation(TapiOamThresholdCrossingQualifier thresholdLocation) {
    this.thresholdLocation = thresholdLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamThresholdParameter tapiOamThresholdParameter = (TapiOamThresholdParameter) o;
    return Objects.equals(this.pmParameterAboveThrs, tapiOamThresholdParameter.pmParameterAboveThrs) &&
        Objects.equals(this.pmParameterBelowThrs, tapiOamThresholdParameter.pmParameterBelowThrs) &&
        Objects.equals(this.pmParameterClearThrs, tapiOamThresholdParameter.pmParameterClearThrs) &&
        Objects.equals(this.pmParameterName, tapiOamThresholdParameter.pmParameterName) &&
        Objects.equals(this.thresholdLocation, tapiOamThresholdParameter.thresholdLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pmParameterAboveThrs, pmParameterBelowThrs, pmParameterClearThrs, pmParameterName, thresholdLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamThresholdParameter {\n");
    
    sb.append("    pmParameterAboveThrs: ").append(toIndentedString(pmParameterAboveThrs)).append("\n");
    sb.append("    pmParameterBelowThrs: ").append(toIndentedString(pmParameterBelowThrs)).append("\n");
    sb.append("    pmParameterClearThrs: ").append(toIndentedString(pmParameterClearThrs)).append("\n");
    sb.append("    pmParameterName: ").append(toIndentedString(pmParameterName)).append("\n");
    sb.append("    thresholdLocation: ").append(toIndentedString(thresholdLocation)).append("\n");
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
