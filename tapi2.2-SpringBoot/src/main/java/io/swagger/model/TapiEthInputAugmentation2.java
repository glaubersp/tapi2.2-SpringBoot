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
 * TapiEthInputAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthInputAugmentation2   {
  @JsonProperty("eth-link-trace-job")
  private TapiEthEthLinkTraceJob ethLinkTraceJob = null;

  public TapiEthInputAugmentation2 ethLinkTraceJob(TapiEthEthLinkTraceJob ethLinkTraceJob) {
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
    TapiEthInputAugmentation2 tapiEthInputAugmentation2 = (TapiEthInputAugmentation2) o;
    return Objects.equals(this.ethLinkTraceJob, tapiEthInputAugmentation2.ethLinkTraceJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethLinkTraceJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthInputAugmentation2 {\n");
    
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
