package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiEthEthMipSpec;
import io.swagger.model.TapiOduOduMipSpec;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamMegMip
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamMegMip extends TapiCommonLocalClass  {
  @JsonProperty("eth-mip-spec")
  private TapiEthEthMipSpec ethMipSpec = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("odu-mip-spec")
  private TapiOduOduMipSpec oduMipSpec = null;

  public TapiOamMegMip ethMipSpec(TapiEthEthMipSpec ethMipSpec) {
    this.ethMipSpec = ethMipSpec;
    return this;
  }

  /**
   * Get ethMipSpec
   * @return ethMipSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMipSpec getEthMipSpec() {
    return ethMipSpec;
  }

  public void setEthMipSpec(TapiEthEthMipSpec ethMipSpec) {
    this.ethMipSpec = ethMipSpec;
  }

  public TapiOamMegMip layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  /**
   * Get layerProtocolName
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonLayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiOamMegMip oduMipSpec(TapiOduOduMipSpec oduMipSpec) {
    this.oduMipSpec = oduMipSpec;
    return this;
  }

  /**
   * Get oduMipSpec
   * @return oduMipSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduMipSpec getOduMipSpec() {
    return oduMipSpec;
  }

  public void setOduMipSpec(TapiOduOduMipSpec oduMipSpec) {
    this.oduMipSpec = oduMipSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamMegMip tapiOamMegMip = (TapiOamMegMip) o;
    return Objects.equals(this.ethMipSpec, tapiOamMegMip.ethMipSpec) &&
        Objects.equals(this.layerProtocolName, tapiOamMegMip.layerProtocolName) &&
        Objects.equals(this.oduMipSpec, tapiOamMegMip.oduMipSpec) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethMipSpec, layerProtocolName, oduMipSpec, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamMegMip {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ethMipSpec: ").append(toIndentedString(ethMipSpec)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    oduMipSpec: ").append(toIndentedString(oduMipSpec)).append("\n");
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
