package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthTestJob;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthInputAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthInputAugmentation2   {
  @JsonProperty("eth-test-job")
  private TapiEthEthTestJob ethTestJob = null;

  public TapiEthInputAugmentation2 ethTestJob(TapiEthEthTestJob ethTestJob) {
    this.ethTestJob = ethTestJob;
    return this;
  }

  /**
   * Get ethTestJob
   * @return ethTestJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthTestJob getEthTestJob() {
    return ethTestJob;
  }

  public void setEthTestJob(TapiEthEthTestJob ethTestJob) {
    this.ethTestJob = ethTestJob;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthInputAugmentation2 tapiEthInputAugmentation2 = (TapiEthInputAugmentation2) o;
    return Objects.equals(this.ethTestJob, tapiEthInputAugmentation2.ethTestJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethTestJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthInputAugmentation2 {\n");
    
    sb.append("    ethTestJob: ").append(toIndentedString(ethTestJob)).append("\n");
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
