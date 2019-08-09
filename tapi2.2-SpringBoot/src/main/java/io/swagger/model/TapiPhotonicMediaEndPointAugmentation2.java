package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaEndPointAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaEndPointAugmentation2   {
  @JsonProperty("media-channel-connectivity-service-end-point-spec")
  private TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec mediaChannelConnectivityServiceEndPointSpec = null;

  public TapiPhotonicMediaEndPointAugmentation2 mediaChannelConnectivityServiceEndPointSpec(TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec mediaChannelConnectivityServiceEndPointSpec) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaEndPointAugmentation2 tapiPhotonicMediaEndPointAugmentation2 = (TapiPhotonicMediaEndPointAugmentation2) o;
    return Objects.equals(this.mediaChannelConnectivityServiceEndPointSpec, tapiPhotonicMediaEndPointAugmentation2.mediaChannelConnectivityServiceEndPointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaChannelConnectivityServiceEndPointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaEndPointAugmentation2 {\n");
    
    sb.append("    mediaChannelConnectivityServiceEndPointSpec: ").append(toIndentedString(mediaChannelConnectivityServiceEndPointSpec)).append("\n");
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
