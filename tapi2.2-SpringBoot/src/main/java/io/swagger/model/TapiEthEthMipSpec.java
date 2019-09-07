package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthMipCommon;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthMipSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthMipSpec   {
  @JsonProperty("eth-mip-common")
  private TapiEthEthMipCommon ethMipCommon = null;

  @JsonProperty("mip-mac")
  private String mipMac = null;

  public TapiEthEthMipSpec ethMipCommon(TapiEthEthMipCommon ethMipCommon) {
    this.ethMipCommon = ethMipCommon;
    return this;
  }

  /**
   * Get ethMipCommon
   * @return ethMipCommon
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMipCommon getEthMipCommon() {
    return ethMipCommon;
  }

  public void setEthMipCommon(TapiEthEthMipCommon ethMipCommon) {
    this.ethMipCommon = ethMipCommon;
  }

  public TapiEthEthMipSpec mipMac(String mipMac) {
    this.mipMac = mipMac;
    return this;
  }

  /**
   * This attribute contains the MAC address of the MIP instance.
   * @return mipMac
  **/
  @ApiModelProperty(value = "This attribute contains the MAC address of the MIP instance.")

  public String getMipMac() {
    return mipMac;
  }

  public void setMipMac(String mipMac) {
    this.mipMac = mipMac;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthMipSpec tapiEthEthMipSpec = (TapiEthEthMipSpec) o;
    return Objects.equals(this.ethMipCommon, tapiEthEthMipSpec.ethMipCommon) &&
        Objects.equals(this.mipMac, tapiEthEthMipSpec.mipMac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethMipCommon, mipMac);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthMipSpec {\n");
    
    sb.append("    ethMipCommon: ").append(toIndentedString(ethMipCommon)).append("\n");
    sb.append("    mipMac: ").append(toIndentedString(mipMac)).append("\n");
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
