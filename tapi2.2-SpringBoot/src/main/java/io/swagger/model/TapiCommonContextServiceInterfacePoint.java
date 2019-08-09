package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonServiceInterfacePoint;
import io.swagger.model.TapiEthEthServiceIntefacePointSpec;
import io.swagger.model.TapiEthServiceInterfacePointAugmentation3;
import io.swagger.model.TapiPhotonicMediaMediaChannelServiceInterfacePointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiServiceInterfacePointSpec;
import io.swagger.model.TapiPhotonicMediaServiceInterfacePointAugmentation1;
import io.swagger.model.TapiPhotonicMediaServiceInterfacePointAugmentation2;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiCommonContextServiceInterfacePoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiCommonContextServiceInterfacePoint extends TapiCommonServiceInterfacePoint  {
  @JsonProperty("eth-service-inteface-point-spec")
  private TapiEthEthServiceIntefacePointSpec ethServiceIntefacePointSpec = null;

  @JsonProperty("otsi-service-interface-point-spec")
  private TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec = null;

  @JsonProperty("media-channel-service-interface-point-spec")
  private TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mediaChannelServiceInterfacePointSpec = null;

  public TapiCommonContextServiceInterfacePoint ethServiceIntefacePointSpec(TapiEthEthServiceIntefacePointSpec ethServiceIntefacePointSpec) {
    this.ethServiceIntefacePointSpec = ethServiceIntefacePointSpec;
    return this;
  }

  /**
   * Get ethServiceIntefacePointSpec
   * @return ethServiceIntefacePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthServiceIntefacePointSpec getEthServiceIntefacePointSpec() {
    return ethServiceIntefacePointSpec;
  }

  public void setEthServiceIntefacePointSpec(TapiEthEthServiceIntefacePointSpec ethServiceIntefacePointSpec) {
    this.ethServiceIntefacePointSpec = ethServiceIntefacePointSpec;
  }

  public TapiCommonContextServiceInterfacePoint otsiServiceInterfacePointSpec(TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec) {
    this.otsiServiceInterfacePointSpec = otsiServiceInterfacePointSpec;
    return this;
  }

  /**
   * Get otsiServiceInterfacePointSpec
   * @return otsiServiceInterfacePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiServiceInterfacePointSpec getOtsiServiceInterfacePointSpec() {
    return otsiServiceInterfacePointSpec;
  }

  public void setOtsiServiceInterfacePointSpec(TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec) {
    this.otsiServiceInterfacePointSpec = otsiServiceInterfacePointSpec;
  }

  public TapiCommonContextServiceInterfacePoint mediaChannelServiceInterfacePointSpec(TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mediaChannelServiceInterfacePointSpec) {
    this.mediaChannelServiceInterfacePointSpec = mediaChannelServiceInterfacePointSpec;
    return this;
  }

  /**
   * Get mediaChannelServiceInterfacePointSpec
   * @return mediaChannelServiceInterfacePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaMediaChannelServiceInterfacePointSpec getMediaChannelServiceInterfacePointSpec() {
    return mediaChannelServiceInterfacePointSpec;
  }

  public void setMediaChannelServiceInterfacePointSpec(TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mediaChannelServiceInterfacePointSpec) {
    this.mediaChannelServiceInterfacePointSpec = mediaChannelServiceInterfacePointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonContextServiceInterfacePoint tapiCommonContextServiceInterfacePoint = (TapiCommonContextServiceInterfacePoint) o;
    return Objects.equals(this.ethServiceIntefacePointSpec, tapiCommonContextServiceInterfacePoint.ethServiceIntefacePointSpec) &&
        Objects.equals(this.otsiServiceInterfacePointSpec, tapiCommonContextServiceInterfacePoint.otsiServiceInterfacePointSpec) &&
        Objects.equals(this.mediaChannelServiceInterfacePointSpec, tapiCommonContextServiceInterfacePoint.mediaChannelServiceInterfacePointSpec) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethServiceIntefacePointSpec, otsiServiceInterfacePointSpec, mediaChannelServiceInterfacePointSpec, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonContextServiceInterfacePoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ethServiceIntefacePointSpec: ").append(toIndentedString(ethServiceIntefacePointSpec)).append("\n");
    sb.append("    otsiServiceInterfacePointSpec: ").append(toIndentedString(otsiServiceInterfacePointSpec)).append("\n");
    sb.append("    mediaChannelServiceInterfacePointSpec: ").append(toIndentedString(mediaChannelServiceInterfacePointSpec)).append("\n");
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
