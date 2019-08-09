package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthCtpPac;
import io.swagger.model.TapiEthEthTerminationPac;
import io.swagger.model.TapiEthEtyTerminationPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthConnectionEndPointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthConnectionEndPointSpec   {
  @JsonProperty("eth-term")
  private TapiEthEthTerminationPac ethTerm = null;

  @JsonProperty("ety-term")
  private TapiEthEtyTerminationPac etyTerm = null;

  @JsonProperty("eth-ctp")
  private TapiEthEthCtpPac ethCtp = null;

  public TapiEthEthConnectionEndPointSpec ethTerm(TapiEthEthTerminationPac ethTerm) {
    this.ethTerm = ethTerm;
    return this;
  }

  /**
   * Get ethTerm
   * @return ethTerm
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthTerminationPac getEthTerm() {
    return ethTerm;
  }

  public void setEthTerm(TapiEthEthTerminationPac ethTerm) {
    this.ethTerm = ethTerm;
  }

  public TapiEthEthConnectionEndPointSpec etyTerm(TapiEthEtyTerminationPac etyTerm) {
    this.etyTerm = etyTerm;
    return this;
  }

  /**
   * Get etyTerm
   * @return etyTerm
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEtyTerminationPac getEtyTerm() {
    return etyTerm;
  }

  public void setEtyTerm(TapiEthEtyTerminationPac etyTerm) {
    this.etyTerm = etyTerm;
  }

  public TapiEthEthConnectionEndPointSpec ethCtp(TapiEthEthCtpPac ethCtp) {
    this.ethCtp = ethCtp;
    return this;
  }

  /**
   * Get ethCtp
   * @return ethCtp
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthCtpPac getEthCtp() {
    return ethCtp;
  }

  public void setEthCtp(TapiEthEthCtpPac ethCtp) {
    this.ethCtp = ethCtp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthConnectionEndPointSpec tapiEthEthConnectionEndPointSpec = (TapiEthEthConnectionEndPointSpec) o;
    return Objects.equals(this.ethTerm, tapiEthEthConnectionEndPointSpec.ethTerm) &&
        Objects.equals(this.etyTerm, tapiEthEthConnectionEndPointSpec.etyTerm) &&
        Objects.equals(this.ethCtp, tapiEthEthConnectionEndPointSpec.ethCtp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethTerm, etyTerm, ethCtp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthConnectionEndPointSpec {\n");
    
    sb.append("    ethTerm: ").append(toIndentedString(ethTerm)).append("\n");
    sb.append("    etyTerm: ").append(toIndentedString(etyTerm)).append("\n");
    sb.append("    ethCtp: ").append(toIndentedString(ethCtp)).append("\n");
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
