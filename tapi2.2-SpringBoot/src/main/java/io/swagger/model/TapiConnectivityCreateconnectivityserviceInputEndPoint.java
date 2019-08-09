package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonPortDirection;
import io.swagger.model.TapiCommonPortRole;
import io.swagger.model.TapiCommonServiceInterfacePointRef;
import io.swagger.model.TapiConnectivityConnectionEndPointRef;
import io.swagger.model.TapiConnectivityConnectivityServiceEndPoint;
import io.swagger.model.TapiConnectivityConnectivityServiceEndPointRef;
import io.swagger.model.TapiConnectivityProtectionRole;
import io.swagger.model.TapiEthEndPointAugmentation1;
import io.swagger.model.TapiEthEthConnectivityServiceEndPointSpec;
import io.swagger.model.TapiPhotonicMediaEndPointAugmentation2;
import io.swagger.model.TapiPhotonicMediaEndPointAugmentation3;
import io.swagger.model.TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityCreateconnectivityserviceInputEndPoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityCreateconnectivityserviceInputEndPoint extends TapiConnectivityConnectivityServiceEndPoint  {
  @JsonProperty("eth-connectivity-service-end-point-spec")
  private TapiEthEthConnectivityServiceEndPointSpec ethConnectivityServiceEndPointSpec = null;

  @JsonProperty("media-channel-connectivity-service-end-point-spec")
  private TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec mediaChannelConnectivityServiceEndPointSpec = null;

  @JsonProperty("otsi-connectivity-service-end-point-spec")
  private TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec otsiConnectivityServiceEndPointSpec = null;

  public TapiConnectivityCreateconnectivityserviceInputEndPoint ethConnectivityServiceEndPointSpec(TapiEthEthConnectivityServiceEndPointSpec ethConnectivityServiceEndPointSpec) {
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

  public TapiConnectivityCreateconnectivityserviceInputEndPoint mediaChannelConnectivityServiceEndPointSpec(TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec mediaChannelConnectivityServiceEndPointSpec) {
    this.mediaChannelConnectivityServiceEndPointSpec = mediaChannelConnectivityServiceEndPointSpec;
    return this;
  }

  /**
   * Get mediaChannelConnectivityServiceEndPointSpec
   * @return mediaChannelConnectivityServiceEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec getMediaChannelConnectivityServiceEndPointSpec() {
    return mediaChannelConnectivityServiceEndPointSpec;
  }

  public void setMediaChannelConnectivityServiceEndPointSpec(TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec mediaChannelConnectivityServiceEndPointSpec) {
    this.mediaChannelConnectivityServiceEndPointSpec = mediaChannelConnectivityServiceEndPointSpec;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint otsiConnectivityServiceEndPointSpec(TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec otsiConnectivityServiceEndPointSpec) {
    this.otsiConnectivityServiceEndPointSpec = otsiConnectivityServiceEndPointSpec;
    return this;
  }

  /**
   * Get otsiConnectivityServiceEndPointSpec
   * @return otsiConnectivityServiceEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec getOtsiConnectivityServiceEndPointSpec() {
    return otsiConnectivityServiceEndPointSpec;
  }

  public void setOtsiConnectivityServiceEndPointSpec(TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec otsiConnectivityServiceEndPointSpec) {
    this.otsiConnectivityServiceEndPointSpec = otsiConnectivityServiceEndPointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityCreateconnectivityserviceInputEndPoint tapiConnectivityCreateconnectivityserviceInputEndPoint = (TapiConnectivityCreateconnectivityserviceInputEndPoint) o;
    return Objects.equals(this.ethConnectivityServiceEndPointSpec, tapiConnectivityCreateconnectivityserviceInputEndPoint.ethConnectivityServiceEndPointSpec) &&
        Objects.equals(this.mediaChannelConnectivityServiceEndPointSpec, tapiConnectivityCreateconnectivityserviceInputEndPoint.mediaChannelConnectivityServiceEndPointSpec) &&
        Objects.equals(this.otsiConnectivityServiceEndPointSpec, tapiConnectivityCreateconnectivityserviceInputEndPoint.otsiConnectivityServiceEndPointSpec) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethConnectivityServiceEndPointSpec, mediaChannelConnectivityServiceEndPointSpec, otsiConnectivityServiceEndPointSpec, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityCreateconnectivityserviceInputEndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ethConnectivityServiceEndPointSpec: ").append(toIndentedString(ethConnectivityServiceEndPointSpec)).append("\n");
    sb.append("    mediaChannelConnectivityServiceEndPointSpec: ").append(toIndentedString(mediaChannelConnectivityServiceEndPointSpec)).append("\n");
    sb.append("    otsiConnectivityServiceEndPointSpec: ").append(toIndentedString(otsiConnectivityServiceEndPointSpec)).append("\n");
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
