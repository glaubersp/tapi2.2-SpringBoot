package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthConnectivityServiceEndPointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEndPointAugmentation4
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEndPointAugmentation4   {
  @JsonProperty("eth-connectivity-service-end-point-spec")
  private TapiEthEthConnectivityServiceEndPointSpec ethConnectivityServiceEndPointSpec = null;

  public TapiEthEndPointAugmentation4 ethConnectivityServiceEndPointSpec(TapiEthEthConnectivityServiceEndPointSpec ethConnectivityServiceEndPointSpec) {
    this.ethConnectivityServiceEndPointSpec = ethConnectivityServiceEndPointSpec;
    return this;
  }

  /**
   * Get ethConnectivityServiceEndPointSpec
   * @return ethConnectivityServiceEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthConnectivityServiceEndPointSpec getEthConnectivityServiceEndPointSpec() {
    return ethConnectivityServiceEndPointSpec;
  }

  public void setEthConnectivityServiceEndPointSpec(TapiEthEthConnectivityServiceEndPointSpec ethConnectivityServiceEndPointSpec) {
    this.ethConnectivityServiceEndPointSpec = ethConnectivityServiceEndPointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEndPointAugmentation4 tapiEthEndPointAugmentation4 = (TapiEthEndPointAugmentation4) o;
    return Objects.equals(this.ethConnectivityServiceEndPointSpec, tapiEthEndPointAugmentation4.ethConnectivityServiceEndPointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethConnectivityServiceEndPointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEndPointAugmentation4 {\n");
    
    sb.append("    ethConnectivityServiceEndPointSpec: ").append(toIndentedString(ethConnectivityServiceEndPointSpec)).append("\n");
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
