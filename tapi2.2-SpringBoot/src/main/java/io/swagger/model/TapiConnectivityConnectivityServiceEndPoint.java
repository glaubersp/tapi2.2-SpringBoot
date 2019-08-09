package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * TapiConnectivityConnectivityserviceEndPoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityConnectivityServiceEndPoint  {
  @JsonProperty("eth-connectivity-service-end-point-spec")
  private TapiEthEthConnectivityServiceEndPointSpec ethConnectivityServiceEndPointSpec = null;

  @JsonProperty("odu-connectivity-service-end-point-spec")
  private TapiOduOduConnectivityServiceEndPointSpec oduConnectivityServiceEndPointSpec = null;

  @JsonProperty("media-channel-connectivity-service-end-point-spec")
  private TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec mediaChannelConnectivityServiceEndPointSpec = null;

  @JsonProperty("otsi-connectivity-service-end-point-spec")
  private TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec otsiConnectivityServiceEndPointSpec = null;

  public TapiConnectivityConnectivityServiceEndPoint ethConnectivityServiceEndPointSpec(TapiEthEthConnectivityServiceEndPointSpec ethConnectivityServiceEndPointSpec) {
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

  public TapiConnectivityConnectivityServiceEndPoint oduConnectivityServiceEndPointSpec(TapiOduOduConnectivityServiceEndPointSpec oduConnectivityServiceEndPointSpec) {
    this.oduConnectivityServiceEndPointSpec = oduConnectivityServiceEndPointSpec;
    return this;
  }

  /**
   * Get oduConnectivityServiceEndPointSpec
   * @return oduConnectivityServiceEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduConnectivityServiceEndPointSpec getOduConnectivityServiceEndPointSpec() {
    return oduConnectivityServiceEndPointSpec;
  }

  public void setOduConnectivityServiceEndPointSpec(TapiOduOduConnectivityServiceEndPointSpec oduConnectivityServiceEndPointSpec) {
    this.oduConnectivityServiceEndPointSpec = oduConnectivityServiceEndPointSpec;
  }

  public TapiConnectivityConnectivityServiceEndPoint mediaChannelConnectivityServiceEndPointSpec(TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec mediaChannelConnectivityServiceEndPointSpec) {
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

  public TapiConnectivityConnectivityServiceEndPoint otsiConnectivityServiceEndPointSpec(TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec otsiConnectivityServiceEndPointSpec) {
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
    TapiConnectivityConnectivityServiceEndPoint tapiConnectivityConnectivityserviceEndPoint = (TapiConnectivityConnectivityServiceEndPoint) o;
    return Objects.equals(this.ethConnectivityServiceEndPointSpec, tapiConnectivityConnectivityserviceEndPoint.ethConnectivityServiceEndPointSpec) &&
        Objects.equals(this.oduConnectivityServiceEndPointSpec, tapiConnectivityConnectivityserviceEndPoint.oduConnectivityServiceEndPointSpec) &&
        Objects.equals(this.mediaChannelConnectivityServiceEndPointSpec, tapiConnectivityConnectivityserviceEndPoint.mediaChannelConnectivityServiceEndPointSpec) &&
        Objects.equals(this.otsiConnectivityServiceEndPointSpec, tapiConnectivityConnectivityserviceEndPoint.otsiConnectivityServiceEndPointSpec) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethConnectivityServiceEndPointSpec, oduConnectivityServiceEndPointSpec, mediaChannelConnectivityServiceEndPointSpec, otsiConnectivityServiceEndPointSpec, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityConnectivityserviceEndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ethConnectivityServiceEndPointSpec: ").append(toIndentedString(ethConnectivityServiceEndPointSpec)).append("\n");
    sb.append("    oduConnectivityServiceEndPointSpec: ").append(toIndentedString(oduConnectivityServiceEndPointSpec)).append("\n");
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
