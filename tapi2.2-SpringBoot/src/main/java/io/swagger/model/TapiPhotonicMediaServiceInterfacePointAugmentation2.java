package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaMediaChannelServiceInterfacePointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaServiceInterfacePointAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaServiceInterfacePointAugmentation2   {
  @JsonProperty("media-channel-service-interface-point-spec")
  private TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mediaChannelServiceInterfacePointSpec = null;

  public TapiPhotonicMediaServiceInterfacePointAugmentation2 mediaChannelServiceInterfacePointSpec(TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mediaChannelServiceInterfacePointSpec) {
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
    TapiPhotonicMediaServiceInterfacePointAugmentation2 tapiPhotonicMediaServiceInterfacePointAugmentation2 = (TapiPhotonicMediaServiceInterfacePointAugmentation2) o;
    return Objects.equals(this.mediaChannelServiceInterfacePointSpec, tapiPhotonicMediaServiceInterfacePointAugmentation2.mediaChannelServiceInterfacePointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaChannelServiceInterfacePointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaServiceInterfacePointAugmentation2 {\n");
    
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
