package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthProActiveMeasurementJobControlSink;
import io.swagger.model.TapiEthEthProActiveMeasurementJobControlSource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthProActiveDualEndedMeasurementJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthProActiveDualEndedMeasurementJob   {
  @JsonProperty("eth-pro-active-measurement-job-control-source")
  private TapiEthEthProActiveMeasurementJobControlSource ethProActiveMeasurementJobControlSource = null;

  @JsonProperty("eth-pro-active-measurement-job-control-sink")
  private TapiEthEthProActiveMeasurementJobControlSink ethProActiveMeasurementJobControlSink = null;

  public TapiEthEthProActiveDualEndedMeasurementJob ethProActiveMeasurementJobControlSource(TapiEthEthProActiveMeasurementJobControlSource ethProActiveMeasurementJobControlSource) {
    this.ethProActiveMeasurementJobControlSource = ethProActiveMeasurementJobControlSource;
    return this;
  }

  /**
   * Get ethProActiveMeasurementJobControlSource
   * @return ethProActiveMeasurementJobControlSource
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActiveMeasurementJobControlSource getEthProActiveMeasurementJobControlSource() {
    return ethProActiveMeasurementJobControlSource;
  }

  public void setEthProActiveMeasurementJobControlSource(TapiEthEthProActiveMeasurementJobControlSource ethProActiveMeasurementJobControlSource) {
    this.ethProActiveMeasurementJobControlSource = ethProActiveMeasurementJobControlSource;
  }

  public TapiEthEthProActiveDualEndedMeasurementJob ethProActiveMeasurementJobControlSink(TapiEthEthProActiveMeasurementJobControlSink ethProActiveMeasurementJobControlSink) {
    this.ethProActiveMeasurementJobControlSink = ethProActiveMeasurementJobControlSink;
    return this;
  }

  /**
   * Get ethProActiveMeasurementJobControlSink
   * @return ethProActiveMeasurementJobControlSink
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActiveMeasurementJobControlSink getEthProActiveMeasurementJobControlSink() {
    return ethProActiveMeasurementJobControlSink;
  }

  public void setEthProActiveMeasurementJobControlSink(TapiEthEthProActiveMeasurementJobControlSink ethProActiveMeasurementJobControlSink) {
    this.ethProActiveMeasurementJobControlSink = ethProActiveMeasurementJobControlSink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthProActiveDualEndedMeasurementJob tapiEthEthProActiveDualEndedMeasurementJob = (TapiEthEthProActiveDualEndedMeasurementJob) o;
    return Objects.equals(this.ethProActiveMeasurementJobControlSource, tapiEthEthProActiveDualEndedMeasurementJob.ethProActiveMeasurementJobControlSource) &&
        Objects.equals(this.ethProActiveMeasurementJobControlSink, tapiEthEthProActiveDualEndedMeasurementJob.ethProActiveMeasurementJobControlSink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethProActiveMeasurementJobControlSource, ethProActiveMeasurementJobControlSink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthProActiveDualEndedMeasurementJob {\n");
    
    sb.append("    ethProActiveMeasurementJobControlSource: ").append(toIndentedString(ethProActiveMeasurementJobControlSource)).append("\n");
    sb.append("    ethProActiveMeasurementJobControlSink: ").append(toIndentedString(ethProActiveMeasurementJobControlSink)).append("\n");
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
