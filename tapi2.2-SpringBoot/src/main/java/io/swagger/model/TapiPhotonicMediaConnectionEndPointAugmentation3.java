package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaMediaChannelConnectionEndPointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaConnectionEndPointAugmentation3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaConnectionEndPointAugmentation3   {
  @JsonProperty("media-channel-connection-end-point-spec")
  private TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec = null;

  public TapiPhotonicMediaConnectionEndPointAugmentation3 mediaChannelConnectionEndPointSpec(TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec) {
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
    TapiPhotonicMediaConnectionEndPointAugmentation3 tapiPhotonicMediaConnectionEndPointAugmentation3 = (TapiPhotonicMediaConnectionEndPointAugmentation3) o;
    return Objects.equals(this.mediaChannelConnectionEndPointSpec, tapiPhotonicMediaConnectionEndPointAugmentation3.mediaChannelConnectionEndPointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaChannelConnectionEndPointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaConnectionEndPointAugmentation3 {\n");
    
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
