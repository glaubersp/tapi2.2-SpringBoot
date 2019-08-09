package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOnDemandMeasurementJobControlSource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthOnDemandSingleEndedMeasurementJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthOnDemandSingleEndedMeasurementJob   {
  @JsonProperty("eth-on-demand-measurement-job-control-source")
  private TapiEthEthOnDemandMeasurementJobControlSource ethOnDemandMeasurementJobControlSource = null;

  public TapiEthEthOnDemandSingleEndedMeasurementJob ethOnDemandMeasurementJobControlSource(TapiEthEthOnDemandMeasurementJobControlSource ethOnDemandMeasurementJobControlSource) {
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
    TapiEthEthOnDemandSingleEndedMeasurementJob tapiEthEthOnDemandSingleEndedMeasurementJob = (TapiEthEthOnDemandSingleEndedMeasurementJob) o;
    return Objects.equals(this.ethOnDemandMeasurementJobControlSource, tapiEthEthOnDemandSingleEndedMeasurementJob.ethOnDemandMeasurementJobControlSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemandMeasurementJobControlSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOnDemandSingleEndedMeasurementJob {\n");
    
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
