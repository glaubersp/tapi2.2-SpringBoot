package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthCtpCommonPac;
import io.swagger.model.TapiEthEthTerminationCommonPac;
import io.swagger.model.TapiEthEtyTerminationCommonPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthConnectivityServiceEndPointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthConnectivityServiceEndPointSpec   {
  @JsonProperty("eth-ctp-common-pac")
  private TapiEthEthCtpCommonPac ethCtpCommonPac = null;

  @JsonProperty("eth-termination-common-pac")
  private TapiEthEthTerminationCommonPac ethTerminationCommonPac = null;

  @JsonProperty("ety-termination-common-pac")
  private TapiEthEtyTerminationCommonPac etyTerminationCommonPac = null;

  public TapiEthEthConnectivityServiceEndPointSpec ethCtpCommonPac(TapiEthEthCtpCommonPac ethCtpCommonPac) {
    this.ethCtpCommonPac = ethCtpCommonPac;
    return this;
  }

  /**
   * Get ethCtpCommonPac
   * @return ethCtpCommonPac
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthCtpCommonPac getEthCtpCommonPac() {
    return ethCtpCommonPac;
  }

  public void setEthCtpCommonPac(TapiEthEthCtpCommonPac ethCtpCommonPac) {
    this.ethCtpCommonPac = ethCtpCommonPac;
  }

  public TapiEthEthConnectivityServiceEndPointSpec ethTerminationCommonPac(TapiEthEthTerminationCommonPac ethTerminationCommonPac) {
    this.ethTerminationCommonPac = ethTerminationCommonPac;
    return this;
  }

  /**
   * Get ethTerminationCommonPac
   * @return ethTerminationCommonPac
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthTerminationCommonPac getEthTerminationCommonPac() {
    return ethTerminationCommonPac;
  }

  public void setEthTerminationCommonPac(TapiEthEthTerminationCommonPac ethTerminationCommonPac) {
    this.ethTerminationCommonPac = ethTerminationCommonPac;
  }

  public TapiEthEthConnectivityServiceEndPointSpec etyTerminationCommonPac(TapiEthEtyTerminationCommonPac etyTerminationCommonPac) {
    this.etyTerminationCommonPac = etyTerminationCommonPac;
    return this;
  }

  /**
   * Get etyTerminationCommonPac
   * @return etyTerminationCommonPac
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEtyTerminationCommonPac getEtyTerminationCommonPac() {
    return etyTerminationCommonPac;
  }

  public void setEtyTerminationCommonPac(TapiEthEtyTerminationCommonPac etyTerminationCommonPac) {
    this.etyTerminationCommonPac = etyTerminationCommonPac;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthConnectivityServiceEndPointSpec tapiEthEthConnectivityServiceEndPointSpec = (TapiEthEthConnectivityServiceEndPointSpec) o;
    return Objects.equals(this.ethCtpCommonPac, tapiEthEthConnectivityServiceEndPointSpec.ethCtpCommonPac) &&
        Objects.equals(this.ethTerminationCommonPac, tapiEthEthConnectivityServiceEndPointSpec.ethTerminationCommonPac) &&
        Objects.equals(this.etyTerminationCommonPac, tapiEthEthConnectivityServiceEndPointSpec.etyTerminationCommonPac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethCtpCommonPac, ethTerminationCommonPac, etyTerminationCommonPac);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthConnectivityServiceEndPointSpec {\n");
    
    sb.append("    ethCtpCommonPac: ").append(toIndentedString(ethCtpCommonPac)).append("\n");
    sb.append("    ethTerminationCommonPac: ").append(toIndentedString(ethTerminationCommonPac)).append("\n");
    sb.append("    etyTerminationCommonPac: ").append(toIndentedString(etyTerminationCommonPac)).append("\n");
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
