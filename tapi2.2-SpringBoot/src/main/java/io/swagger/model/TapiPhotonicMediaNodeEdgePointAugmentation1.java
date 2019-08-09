package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaMediaChannelNodeEdgePointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaNodeEdgePointAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaNodeEdgePointAugmentation1   {
  @JsonProperty("media-channel-node-edge-point-spec")
  private TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec = null;

  public TapiPhotonicMediaNodeEdgePointAugmentation1 mediaChannelNodeEdgePointSpec(TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec) {
    this.mediaChannelNodeEdgePointSpec = mediaChannelNodeEdgePointSpec;
    return this;
  }

  /**
   * Get mediaChannelNodeEdgePointSpec
   * @return mediaChannelNodeEdgePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaMediaChannelNodeEdgePointSpec getMediaChannelNodeEdgePointSpec() {
    return mediaChannelNodeEdgePointSpec;
  }

  public void setMediaChannelNodeEdgePointSpec(TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec) {
    this.mediaChannelNodeEdgePointSpec = mediaChannelNodeEdgePointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaNodeEdgePointAugmentation1 tapiPhotonicMediaNodeEdgePointAugmentation1 = (TapiPhotonicMediaNodeEdgePointAugmentation1) o;
    return Objects.equals(this.mediaChannelNodeEdgePointSpec, tapiPhotonicMediaNodeEdgePointAugmentation1.mediaChannelNodeEdgePointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaChannelNodeEdgePointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaNodeEdgePointAugmentation1 {\n");
    
    sb.append("    mediaChannelNodeEdgePointSpec: ").append(toIndentedString(mediaChannelNodeEdgePointSpec)).append("\n");
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
