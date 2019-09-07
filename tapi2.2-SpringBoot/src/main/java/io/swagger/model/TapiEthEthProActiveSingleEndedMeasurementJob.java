package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthProActiveMeasurementJobControlSource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthProActiveSingleEndedMeasurementJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthProActiveSingleEndedMeasurementJob   {
  @JsonProperty("eth-pro-active-measurement-job-control-source")
  private TapiEthEthProActiveMeasurementJobControlSource ethProActiveMeasurementJobControlSource = null;

  public TapiEthEthProActiveSingleEndedMeasurementJob ethProActiveMeasurementJobControlSource(TapiEthEthProActiveMeasurementJobControlSource ethProActiveMeasurementJobControlSource) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthProActiveSingleEndedMeasurementJob tapiEthEthProActiveSingleEndedMeasurementJob = (TapiEthEthProActiveSingleEndedMeasurementJob) o;
    return Objects.equals(this.ethProActiveMeasurementJobControlSource, tapiEthEthProActiveSingleEndedMeasurementJob.ethProActiveMeasurementJobControlSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethProActiveMeasurementJobControlSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthProActiveSingleEndedMeasurementJob {\n");
    
    sb.append("    ethProActiveMeasurementJobControlSource: ").append(toIndentedString(ethProActiveMeasurementJobControlSource)).append("\n");
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
