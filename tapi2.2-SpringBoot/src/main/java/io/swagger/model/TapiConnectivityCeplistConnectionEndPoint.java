package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonPortDirection;
import io.swagger.model.TapiCommonPortRole;
import io.swagger.model.TapiCommonTerminationDirection;
import io.swagger.model.TapiCommonTerminationState;
import io.swagger.model.TapiConnectivityConnectionEndPoint;
import io.swagger.model.TapiConnectivityConnectionEndPointRef;
import io.swagger.model.TapiConnectivityProtectionRole;
import io.swagger.model.TapiEthConnectionEndPointAugmentation6;
import io.swagger.model.TapiEthEthConnectionEndPointSpec;
import io.swagger.model.TapiOamConnectionEndPointAugmentation5;
import io.swagger.model.TapiOamMepMipList;
import io.swagger.model.TapiOduConnectionEndPointAugmentation1;
import io.swagger.model.TapiOduOduConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaConnectionEndPointAugmentation2;
import io.swagger.model.TapiPhotonicMediaConnectionEndPointAugmentation3;
import io.swagger.model.TapiPhotonicMediaConnectionEndPointAugmentation4;
import io.swagger.model.TapiPhotonicMediaMediaChannelConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiConnectionEndPointSpec;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityCeplistConnectionEndPoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityCeplistConnectionEndPoint extends TapiConnectivityConnectionEndPoint  {
  @JsonProperty("eth-connection-end-point-spec")
  private TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec = null;

  @JsonProperty("mep-mip-list")
  private TapiOamMepMipList mepMipList = null;

  @JsonProperty("odu-connection-end-point-spec")
  private TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec = null;

  @JsonProperty("otsi-connection-end-point-spec")
  private TapiPhotonicMediaOtsiConnectionEndPointSpec otsiConnectionEndPointSpec = null;

  @JsonProperty("media-channel-connection-end-point-spec")
  private TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec = null;

  @JsonProperty("otsi-assembly-connection-end-point-spec")
  private TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec = null;

  public TapiConnectivityCeplistConnectionEndPoint ethConnectionEndPointSpec(TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec) {
    this.ethConnectionEndPointSpec = ethConnectionEndPointSpec;
    return this;
  }

  /**
   * Get ethConnectionEndPointSpec
   * @return ethConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthConnectionEndPointSpec getEthConnectionEndPointSpec() {
    return ethConnectionEndPointSpec;
  }

  public void setEthConnectionEndPointSpec(TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec) {
    this.ethConnectionEndPointSpec = ethConnectionEndPointSpec;
  }

  public TapiConnectivityCeplistConnectionEndPoint mepMipList(TapiOamMepMipList mepMipList) {
    this.mepMipList = mepMipList;
    return this;
  }

  /**
   * Get mepMipList
   * @return mepMipList
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamMepMipList getMepMipList() {
    return mepMipList;
  }

  public void setMepMipList(TapiOamMepMipList mepMipList) {
    this.mepMipList = mepMipList;
  }

  public TapiConnectivityCeplistConnectionEndPoint oduConnectionEndPointSpec(TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec) {
    this.oduConnectionEndPointSpec = oduConnectionEndPointSpec;
    return this;
  }

  /**
   * Get oduConnectionEndPointSpec
   * @return oduConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduConnectionEndPointSpec getOduConnectionEndPointSpec() {
    return oduConnectionEndPointSpec;
  }

  public void setOduConnectionEndPointSpec(TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec) {
    this.oduConnectionEndPointSpec = oduConnectionEndPointSpec;
  }

  public TapiConnectivityCeplistConnectionEndPoint otsiConnectionEndPointSpec(TapiPhotonicMediaOtsiConnectionEndPointSpec otsiConnectionEndPointSpec) {
    this.otsiConnectionEndPointSpec = otsiConnectionEndPointSpec;
    return this;
  }

  /**
   * Get otsiConnectionEndPointSpec
   * @return otsiConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiConnectionEndPointSpec getOtsiConnectionEndPointSpec() {
    return otsiConnectionEndPointSpec;
  }

  public void setOtsiConnectionEndPointSpec(TapiPhotonicMediaOtsiConnectionEndPointSpec otsiConnectionEndPointSpec) {
    this.otsiConnectionEndPointSpec = otsiConnectionEndPointSpec;
  }

  public TapiConnectivityCeplistConnectionEndPoint mediaChannelConnectionEndPointSpec(TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec) {
    this.mediaChannelConnectionEndPointSpec = mediaChannelConnectionEndPointSpec;
    return this;
  }

  /**
   * Get mediaChannelConnectionEndPointSpec
   * @return mediaChannelConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaMediaChannelConnectionEndPointSpec getMediaChannelConnectionEndPointSpec() {
    return mediaChannelConnectionEndPointSpec;
  }

  public void setMediaChannelConnectionEndPointSpec(TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec) {
    this.mediaChannelConnectionEndPointSpec = mediaChannelConnectionEndPointSpec;
  }

  public TapiConnectivityCeplistConnectionEndPoint otsiAssemblyConnectionEndPointSpec(TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec) {
    this.otsiAssemblyConnectionEndPointSpec = otsiAssemblyConnectionEndPointSpec;
    return this;
  }

  /**
   * Get otsiAssemblyConnectionEndPointSpec
   * @return otsiAssemblyConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec getOtsiAssemblyConnectionEndPointSpec() {
    return otsiAssemblyConnectionEndPointSpec;
  }

  public void setOtsiAssemblyConnectionEndPointSpec(TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec) {
    this.otsiAssemblyConnectionEndPointSpec = otsiAssemblyConnectionEndPointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityCeplistConnectionEndPoint tapiConnectivityCeplistConnectionEndPoint = (TapiConnectivityCeplistConnectionEndPoint) o;
    return Objects.equals(this.ethConnectionEndPointSpec, tapiConnectivityCeplistConnectionEndPoint.ethConnectionEndPointSpec) &&
        Objects.equals(this.mepMipList, tapiConnectivityCeplistConnectionEndPoint.mepMipList) &&
        Objects.equals(this.oduConnectionEndPointSpec, tapiConnectivityCeplistConnectionEndPoint.oduConnectionEndPointSpec) &&
        Objects.equals(this.otsiConnectionEndPointSpec, tapiConnectivityCeplistConnectionEndPoint.otsiConnectionEndPointSpec) &&
        Objects.equals(this.mediaChannelConnectionEndPointSpec, tapiConnectivityCeplistConnectionEndPoint.mediaChannelConnectionEndPointSpec) &&
        Objects.equals(this.otsiAssemblyConnectionEndPointSpec, tapiConnectivityCeplistConnectionEndPoint.otsiAssemblyConnectionEndPointSpec) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethConnectionEndPointSpec, mepMipList, oduConnectionEndPointSpec, otsiConnectionEndPointSpec, mediaChannelConnectionEndPointSpec, otsiAssemblyConnectionEndPointSpec, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityCeplistConnectionEndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ethConnectionEndPointSpec: ").append(toIndentedString(ethConnectionEndPointSpec)).append("\n");
    sb.append("    mepMipList: ").append(toIndentedString(mepMipList)).append("\n");
    sb.append("    oduConnectionEndPointSpec: ").append(toIndentedString(oduConnectionEndPointSpec)).append("\n");
    sb.append("    otsiConnectionEndPointSpec: ").append(toIndentedString(otsiConnectionEndPointSpec)).append("\n");
    sb.append("    mediaChannelConnectionEndPointSpec: ").append(toIndentedString(mediaChannelConnectionEndPointSpec)).append("\n");
    sb.append("    otsiAssemblyConnectionEndPointSpec: ").append(toIndentedString(otsiAssemblyConnectionEndPointSpec)).append("\n");
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
