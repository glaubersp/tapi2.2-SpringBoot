package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOnDemandSingleEndedMeasurementJob;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthOamJobAugmentation5
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthOamJobAugmentation5   {
  @JsonProperty("eth-on-demand-single-ended-measurement-job")
  private TapiEthEthOnDemandSingleEndedMeasurementJob ethOnDemandSingleEndedMeasurementJob = null;

  public TapiEthOamJobAugmentation5 ethOnDemandSingleEndedMeasurementJob(TapiEthEthOnDemandSingleEndedMeasurementJob ethOnDemandSingleEndedMeasurementJob) {
    this.ethOnDemandSingleEndedMeasurementJob = ethOnDemandSingleEndedMeasurementJob;
    return this;
  }

  /**
   * Get ethOnDemandSingleEndedMeasurementJob
   * @return ethOnDemandSingleEndedMeasurementJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemandSingleEndedMeasurementJob getEthOnDemandSingleEndedMeasurementJob() {
    return ethOnDemandSingleEndedMeasurementJob;
  }

  public void setEthOnDemandSingleEndedMeasurementJob(TapiEthEthOnDemandSingleEndedMeasurementJob ethOnDemandSingleEndedMeasurementJob) {
    this.ethOnDemandSingleEndedMeasurementJob = ethOnDemandSingleEndedMeasurementJob;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthOamJobAugmentation5 tapiEthOamJobAugmentation5 = (TapiEthOamJobAugmentation5) o;
    return Objects.equals(this.ethOnDemandSingleEndedMeasurementJob, tapiEthOamJobAugmentation5.ethOnDemandSingleEndedMeasurementJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemandSingleEndedMeasurementJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthOamJobAugmentation5 {\n");
    
    sb.append("    ethOnDemandSingleEndedMeasurementJob: ").append(toIndentedString(ethOnDemandSingleEndedMeasurementJob)).append("\n");
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
