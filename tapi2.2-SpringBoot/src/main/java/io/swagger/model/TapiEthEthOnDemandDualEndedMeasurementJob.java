package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOnDemandMeasurementJobControlSink;
import io.swagger.model.TapiEthEthOnDemandMeasurementJobControlSource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthOnDemandDualEndedMeasurementJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthOnDemandDualEndedMeasurementJob   {
  @JsonProperty("eth-on-demand-measurement-job-control-sink")
  private TapiEthEthOnDemandMeasurementJobControlSink ethOnDemandMeasurementJobControlSink = null;

  @JsonProperty("eth-on-demand-measurement-job-control-source")
  private TapiEthEthOnDemandMeasurementJobControlSource ethOnDemandMeasurementJobControlSource = null;

  public TapiEthEthOnDemandDualEndedMeasurementJob ethOnDemandMeasurementJobControlSink(TapiEthEthOnDemandMeasurementJobControlSink ethOnDemandMeasurementJobControlSink) {
    this.ethOnDemandMeasurementJobControlSink = ethOnDemandMeasurementJobControlSink;
    return this;
  }

  /**
   * Get ethOnDemandMeasurementJobControlSink
   * @return ethOnDemandMeasurementJobControlSink
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemandMeasurementJobControlSink getEthOnDemandMeasurementJobControlSink() {
    return ethOnDemandMeasurementJobControlSink;
  }

  public void setEthOnDemandMeasurementJobControlSink(TapiEthEthOnDemandMeasurementJobControlSink ethOnDemandMeasurementJobControlSink) {
    this.ethOnDemandMeasurementJobControlSink = ethOnDemandMeasurementJobControlSink;
  }

  public TapiEthEthOnDemandDualEndedMeasurementJob ethOnDemandMeasurementJobControlSource(TapiEthEthOnDemandMeasurementJobControlSource ethOnDemandMeasurementJobControlSource) {
    this.ethOnDemandMeasurementJobControlSource = ethOnDemandMeasurementJobControlSource;
    return this;
  }

  /**
   * Get ethOnDemandMeasurementJobControlSource
   * @return ethOnDemandMeasurementJobControlSource
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemandMeasurementJobControlSource getEthOnDemandMeasurementJobControlSource() {
    return ethOnDemandMeasurementJobControlSource;
  }

  public void setEthOnDemandMeasurementJobControlSource(TapiEthEthOnDemandMeasurementJobControlSource ethOnDemandMeasurementJobControlSource) {
    this.ethOnDemandMeasurementJobControlSource = ethOnDemandMeasurementJobControlSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOnDemandDualEndedMeasurementJob tapiEthEthOnDemandDualEndedMeasurementJob = (TapiEthEthOnDemandDualEndedMeasurementJob) o;
    return Objects.equals(this.ethOnDemandMeasurementJobControlSink, tapiEthEthOnDemandDualEndedMeasurementJob.ethOnDemandMeasurementJobControlSink) &&
        Objects.equals(this.ethOnDemandMeasurementJobControlSource, tapiEthEthOnDemandDualEndedMeasurementJob.ethOnDemandMeasurementJobControlSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemandMeasurementJobControlSink, ethOnDemandMeasurementJobControlSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOnDemandDualEndedMeasurementJob {\n");
    
    sb.append("    ethOnDemandMeasurementJobControlSink: ").append(toIndentedString(ethOnDemandMeasurementJobControlSink)).append("\n");
    sb.append("    ethOnDemandMeasurementJobControlSource: ").append(toIndentedString(ethOnDemandMeasurementJobControlSource)).append("\n");
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
