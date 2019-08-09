package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthLoopbackResultData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthCurrentDataAugmentation6
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthCurrentDataAugmentation6   {
  @JsonProperty("eth-loopback-result-data")
  private TapiEthEthLoopbackResultData ethLoopbackResultData = null;

  public TapiEthCurrentDataAugmentation6 ethLoopbackResultData(TapiEthEthLoopbackResultData ethLoopbackResultData) {
    this.ethLoopbackResultData = ethLoopbackResultData;
    return this;
  }

  /**
   * Get ethLoopbackResultData
   * @return ethLoopbackResultData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthLoopbackResultData getEthLoopbackResultData() {
    return ethLoopbackResultData;
  }

  public void setEthLoopbackResultData(TapiEthEthLoopbackResultData ethLoopbackResultData) {
    this.ethLoopbackResultData = ethLoopbackResultData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthCurrentDataAugmentation6 tapiEthCurrentDataAugmentation6 = (TapiEthCurrentDataAugmentation6) o;
    return Objects.equals(this.ethLoopbackResultData, tapiEthCurrentDataAugmentation6.ethLoopbackResultData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethLoopbackResultData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthCurrentDataAugmentation6 {\n");
    
    sb.append("    ethLoopbackResultData: ").append(toIndentedString(ethLoopbackResultData)).append("\n");
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
