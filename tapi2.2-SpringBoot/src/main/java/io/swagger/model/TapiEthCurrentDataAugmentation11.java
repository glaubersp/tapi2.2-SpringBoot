package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthLinkTraceResultData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthCurrentDataAugmentation11
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthCurrentDataAugmentation11   {
  @JsonProperty("eth-link-trace-result-data")
  private TapiEthEthLinkTraceResultData ethLinkTraceResultData = null;

  public TapiEthCurrentDataAugmentation11 ethLinkTraceResultData(TapiEthEthLinkTraceResultData ethLinkTraceResultData) {
    this.ethLinkTraceResultData = ethLinkTraceResultData;
    return this;
  }

  /**
   * Get ethLinkTraceResultData
   * @return ethLinkTraceResultData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthLinkTraceResultData getEthLinkTraceResultData() {
    return ethLinkTraceResultData;
  }

  public void setEthLinkTraceResultData(TapiEthEthLinkTraceResultData ethLinkTraceResultData) {
    this.ethLinkTraceResultData = ethLinkTraceResultData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthCurrentDataAugmentation11 tapiEthCurrentDataAugmentation11 = (TapiEthCurrentDataAugmentation11) o;
    return Objects.equals(this.ethLinkTraceResultData, tapiEthCurrentDataAugmentation11.ethLinkTraceResultData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethLinkTraceResultData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthCurrentDataAugmentation11 {\n");
    
    sb.append("    ethLinkTraceResultData: ").append(toIndentedString(ethLinkTraceResultData)).append("\n");
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
