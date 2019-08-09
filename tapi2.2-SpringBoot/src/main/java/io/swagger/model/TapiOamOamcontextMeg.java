package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonOperationalStatePac;
import io.swagger.model.TapiEthEthMegSpec;
import io.swagger.model.TapiEthMegAugmentation1;
import io.swagger.model.TapiOamMegMep;
import io.swagger.model.TapiOamMegMip;
import io.swagger.model.TapiOduMegAugmentation2;
import io.swagger.model.TapiOduOduMegSpec;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamOamcontextMeg
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamOamcontextMeg extends TapiCommonGlobalClass  {
  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("eth-meg-spec")
  private TapiEthEthMegSpec ethMegSpec = null;

  @JsonProperty("odu-meg-spec")
  private TapiOduOduMegSpec oduMegSpec = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("mep")
  @Valid
  private List<TapiOamMegMep> mep = null;

  @JsonProperty("mip")
  @Valid
  private List<TapiOamMegMip> mip = null;

  public TapiOamOamcontextMeg operationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  /**
   * Get operationalState
   * @return operationalState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonOperationalState getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
  }

  public TapiOamOamcontextMeg lifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * Get lifecycleState
   * @return lifecycleState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonLifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
  }

  public TapiOamOamcontextMeg ethMegSpec(TapiEthEthMegSpec ethMegSpec) {
    this.ethMegSpec = ethMegSpec;
    return this;
  }

  /**
   * Get ethMegSpec
   * @return ethMegSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMegSpec getEthMegSpec() {
    return ethMegSpec;
  }

  public void setEthMegSpec(TapiEthEthMegSpec ethMegSpec) {
    this.ethMegSpec = ethMegSpec;
  }

  public TapiOamOamcontextMeg oduMegSpec(TapiOduOduMegSpec oduMegSpec) {
    this.oduMegSpec = oduMegSpec;
    return this;
  }

  /**
   * Get oduMegSpec
   * @return oduMegSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduMegSpec getOduMegSpec() {
    return oduMegSpec;
  }

  public void setOduMegSpec(TapiOduOduMegSpec oduMegSpec) {
    this.oduMegSpec = oduMegSpec;
  }

  public TapiOamOamcontextMeg layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiOamOamcontextMeg mep(List<TapiOamMegMep> mep) {
    this.mep = mep;
    return this;
  }

  public TapiOamOamcontextMeg addMepItem(TapiOamMegMep mepItem) {
    if (this.mep == null) {
      this.mep = new ArrayList<TapiOamMegMep>();
    }
    this.mep.add(mepItem);
    return this;
  }

  /**
   * 1. ME may have 0 MEPs (case of transit domains where at least 1 MIP is present)                  2. ME may have 1 MEP (case of edge domaind, where the peer MEP is ouside the managed domain)                  3. ME may have 2 MEPs
   * @return mep
  **/
  @ApiModelProperty(value = "1. ME may have 0 MEPs (case of transit domains where at least 1 MIP is present)                  2. ME may have 1 MEP (case of edge domaind, where the peer MEP is ouside the managed domain)                  3. ME may have 2 MEPs")
  @Valid
  public List<TapiOamMegMep> getMep() {
    return mep;
  }

  public void setMep(List<TapiOamMegMep> mep) {
    this.mep = mep;
  }

  public TapiOamOamcontextMeg mip(List<TapiOamMegMip> mip) {
    this.mip = mip;
    return this;
  }

  public TapiOamOamcontextMeg addMipItem(TapiOamMegMip mipItem) {
    if (this.mip == null) {
      this.mip = new ArrayList<TapiOamMegMip>();
    }
    this.mip.add(mipItem);
    return this;
  }

  /**
   * ME may 0, 1, or more MIPs
   * @return mip
  **/
  @ApiModelProperty(value = "ME may 0, 1, or more MIPs")
  @Valid
  public List<TapiOamMegMip> getMip() {
    return mip;
  }

  public void setMip(List<TapiOamMegMip> mip) {
    this.mip = mip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamOamcontextMeg tapiOamOamcontextMeg = (TapiOamOamcontextMeg) o;
    return Objects.equals(this.operationalState, tapiOamOamcontextMeg.operationalState) &&
        Objects.equals(this.lifecycleState, tapiOamOamcontextMeg.lifecycleState) &&
        Objects.equals(this.ethMegSpec, tapiOamOamcontextMeg.ethMegSpec) &&
        Objects.equals(this.oduMegSpec, tapiOamOamcontextMeg.oduMegSpec) &&
        Objects.equals(this.layerProtocolName, tapiOamOamcontextMeg.layerProtocolName) &&
        Objects.equals(this.mep, tapiOamOamcontextMeg.mep) &&
        Objects.equals(this.mip, tapiOamOamcontextMeg.mip) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalState, lifecycleState, ethMegSpec, oduMegSpec, layerProtocolName, mep, mip, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamOamcontextMeg {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    ethMegSpec: ").append(toIndentedString(ethMegSpec)).append("\n");
    sb.append("    oduMegSpec: ").append(toIndentedString(oduMegSpec)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    mep: ").append(toIndentedString(mep)).append("\n");
    sb.append("    mip: ").append(toIndentedString(mip)).append("\n");
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
