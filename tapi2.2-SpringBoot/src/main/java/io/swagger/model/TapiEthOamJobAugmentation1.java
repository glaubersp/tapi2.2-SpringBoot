package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthLinkTraceJob;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthOamJobAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthOamJobAugmentation1   {
  @JsonProperty("eth-link-trace-job")
  private TapiEthEthLinkTraceJob ethLinkTraceJob = null;

  public TapiEthOamJobAugmentation1 ethLinkTraceJob(TapiEthEthLinkTraceJob ethLinkTraceJob) {
    this.ethLinkTraceJob = ethLinkTraceJob;
    return this;
  }

  /**
   * Get ethLinkTraceJob
   * @return ethLinkTraceJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthLinkTraceJob getEthLinkTraceJob() {
    return ethLinkTraceJob;
  }

  public void setEthLinkTraceJob(TapiEthEthLinkTraceJob ethLinkTraceJob) {
    this.ethLinkTraceJob = ethLinkTraceJob;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthOamJobAugmentation1 tapiEthOamJobAugmentation1 = (TapiEthOamJobAugmentation1) o;
    return Objects.equals(this.ethLinkTraceJob, tapiEthOamJobAugmentation1.ethLinkTraceJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethLinkTraceJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthOamJobAugmentation1 {\n");
    
    sb.append("    ethLinkTraceJob: ").append(toIndentedString(ethLinkTraceJob)).append("\n");
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