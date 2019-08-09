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
import io.swagger.model.TapiPhotonicMediaConnectionEndPointAugmentation1;
import io.swagger.model.TapiPhotonicMediaConnectionEndPointAugmentation2;
import io.swagger.model.TapiPhotonicMediaConnectionEndPointAugmentation3;
import io.swagger.model.TapiPhotonicMediaMediaChannelConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiConnectionEndPointSpec;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint extends TapiConnectivityConnectionEndPoint  {
  @JsonProperty("otsi-assembly-connection-end-point-spec")
  private TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec = null;

  @JsonProperty("otsi-connection-end-point-spec")
  private TapiPhotonicMediaOtsiConnectionEndPointSpec otsiConnectionEndPointSpec = null;

  @JsonProperty("media-channel-connection-end-point-spec")
  private TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec = null;

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint otsiAssemblyConnectionEndPointSpec(TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec) {
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

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint otsiConnectionEndPointSpec(TapiPhotonicMediaOtsiConnectionEndPointSpec otsiConnectionEndPointSpec) {
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

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint mediaChannelConnectionEndPointSpec(TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint = (TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint) o;
    return Objects.equals(this.otsiAssemblyConnectionEndPointSpec, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.otsiAssemblyConnectionEndPointSpec) &&
        Objects.equals(this.otsiConnectionEndPointSpec, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.otsiConnectionEndPointSpec) &&
        Objects.equals(this.mediaChannelConnectionEndPointSpec, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.mediaChannelConnectionEndPointSpec) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otsiAssemblyConnectionEndPointSpec, otsiConnectionEndPointSpec, mediaChannelConnectionEndPointSpec, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    otsiAssemblyConnectionEndPointSpec: ").append(toIndentedString(otsiAssemblyConnectionEndPointSpec)).append("\n");
    sb.append("    otsiConnectionEndPointSpec: ").append(toIndentedString(otsiConnectionEndPointSpec)).append("\n");
    sb.append("    mediaChannelConnectionEndPointSpec: ").append(toIndentedString(mediaChannelConnectionEndPointSpec)).append("\n");
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
