package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthLoopbackJob;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthOamJobAugmentation6
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthOamJobAugmentation6   {
  @JsonProperty("eth-loopback-job")
  private TapiEthEthLoopbackJob ethLoopbackJob = null;

  public TapiEthOamJobAugmentation6 ethLoopbackJob(TapiEthEthLoopbackJob ethLoopbackJob) {
    this.ethLoopbackJob = ethLoopbackJob;
    return this;
  }

  /**
   * Get ethLoopbackJob
   * @return ethLoopbackJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthLoopbackJob getEthLoopbackJob() {
    return ethLoopbackJob;
  }

  public void setEthLoopbackJob(TapiEthEthLoopbackJob ethLoopbackJob) {
    this.ethLoopbackJob = ethLoopbackJob;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthOamJobAugmentation6 tapiEthOamJobAugmentation6 = (TapiEthOamJobAugmentation6) o;
    return Objects.equals(this.ethLoopbackJob, tapiEthOamJobAugmentation6.ethLoopbackJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethLoopbackJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthOamJobAugmentation6 {\n");
    
    sb.append("    ethLoopbackJob: ").append(toIndentedString(ethLoopbackJob)).append("\n");
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
