package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamOamJobRef;
import io.swagger.model.TapiOamPerceivedTcaSeverity;
import io.swagger.model.TapiOamThresholdParameter;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamTcaInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamTcaInfo   {
  @JsonProperty("is-transient")
  private Boolean isTransient = false;

  @JsonProperty("measurement-interval")
  private String measurementInterval = null;

  @JsonProperty("oam-job")
  private TapiOamOamJobRef oamJob = null;

  @JsonProperty("perceived-severity")
  private TapiOamPerceivedTcaSeverity perceivedSeverity = null;

  @JsonProperty("suspect-interval-flag")
  private Boolean suspectIntervalFlag = false;

  @JsonProperty("threshold-parameter")
  private TapiOamThresholdParameter thresholdParameter = null;

  public TapiOamTcaInfo isTransient(Boolean isTransient) {
    this.isTransient = isTransient;
    return this;
  }

  /**
   * none
   * @return isTransient
  **/
  @ApiModelProperty(value = "none")

  public Boolean isIsTransient() {
    return isTransient;
  }

  public void setIsTransient(Boolean isTransient) {
    this.isTransient = isTransient;
  }

  public TapiOamTcaInfo measurementInterval(String measurementInterval) {
    this.measurementInterval = measurementInterval;
    return this;
  }

  /**
   * none
   * @return measurementInterval
  **/
  @ApiModelProperty(value = "none")

  public String getMeasurementInterval() {
    return measurementInterval;
  }

  public void setMeasurementInterval(String measurementInterval) {
    this.measurementInterval = measurementInterval;
  }

  public TapiOamTcaInfo oamJob(TapiOamOamJobRef oamJob) {
    this.oamJob = oamJob;
    return this;
  }

  /**
   * Get oamJob
   * @return oamJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamOamJobRef getOamJob() {
    return oamJob;
  }

  public void setOamJob(TapiOamOamJobRef oamJob) {
    this.oamJob = oamJob;
  }

  public TapiOamTcaInfo perceivedSeverity(TapiOamPerceivedTcaSeverity perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
    return this;
  }

  /**
   * Get perceivedSeverity
   * @return perceivedSeverity
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamPerceivedTcaSeverity getPerceivedSeverity() {
    return perceivedSeverity;
  }

  public void setPerceivedSeverity(TapiOamPerceivedTcaSeverity perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
  }

  public TapiOamTcaInfo suspectIntervalFlag(Boolean suspectIntervalFlag) {
    this.suspectIntervalFlag = suspectIntervalFlag;
    return this;
  }

  /**
   * none
   * @return suspectIntervalFlag
  **/
  @ApiModelProperty(value = "none")

  public Boolean isSuspectIntervalFlag() {
    return suspectIntervalFlag;
  }

  public void setSuspectIntervalFlag(Boolean suspectIntervalFlag) {
    this.suspectIntervalFlag = suspectIntervalFlag;
  }

  public TapiOamTcaInfo thresholdParameter(TapiOamThresholdParameter thresholdParameter) {
    this.thresholdParameter = thresholdParameter;
    return this;
  }

  /**
   * Get thresholdParameter
   * @return thresholdParameter
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamThresholdParameter getThresholdParameter() {
    return thresholdParameter;
  }

  public void setThresholdParameter(TapiOamThresholdParameter thresholdParameter) {
    this.thresholdParameter = thresholdParameter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamTcaInfo tapiOamTcaInfo = (TapiOamTcaInfo) o;
    return Objects.equals(this.isTransient, tapiOamTcaInfo.isTransient) &&
        Objects.equals(this.measurementInterval, tapiOamTcaInfo.measurementInterval) &&
        Objects.equals(this.oamJob, tapiOamTcaInfo.oamJob) &&
        Objects.equals(this.perceivedSeverity, tapiOamTcaInfo.perceivedSeverity) &&
        Objects.equals(this.suspectIntervalFlag, tapiOamTcaInfo.suspectIntervalFlag) &&
        Objects.equals(this.thresholdParameter, tapiOamTcaInfo.thresholdParameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTransient, measurementInterval, oamJob, perceivedSeverity, suspectIntervalFlag, thresholdParameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamTcaInfo {\n");
    
    sb.append("    isTransient: ").append(toIndentedString(isTransient)).append("\n");
    sb.append("    measurementInterval: ").append(toIndentedString(measurementInterval)).append("\n");
    sb.append("    oamJob: ").append(toIndentedString(oamJob)).append("\n");
    sb.append("    perceivedSeverity: ").append(toIndentedString(perceivedSeverity)).append("\n");
    sb.append("    suspectIntervalFlag: ").append(toIndentedString(suspectIntervalFlag)).append("\n");
    sb.append("    thresholdParameter: ").append(toIndentedString(thresholdParameter)).append("\n");
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
