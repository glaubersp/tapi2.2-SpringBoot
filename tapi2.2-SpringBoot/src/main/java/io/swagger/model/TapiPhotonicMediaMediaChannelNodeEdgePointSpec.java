package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaMediaChannelPoolCapabilityPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaMediaChannelNodeEdgePointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaMediaChannelNodeEdgePointSpec   {
  @JsonProperty("mc-pool")
  private TapiPhotonicMediaMediaChannelPoolCapabilityPac mcPool = null;

  public TapiPhotonicMediaMediaChannelNodeEdgePointSpec mcPool(TapiPhotonicMediaMediaChannelPoolCapabilityPac mcPool) {
    this.mcPool = mcPool;
    return this;
  }

  /**
   * Get mcPool
   * @return mcPool
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaMediaChannelPoolCapabilityPac getMcPool() {
    return mcPool;
  }

  public void setMcPool(TapiPhotonicMediaMediaChannelPoolCapabilityPac mcPool) {
    this.mcPool = mcPool;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaMediaChannelNodeEdgePointSpec tapiPhotonicMediaMediaChannelNodeEdgePointSpec = (TapiPhotonicMediaMediaChannelNodeEdgePointSpec) o;
    return Objects.equals(this.mcPool, tapiPhotonicMediaMediaChannelNodeEdgePointSpec.mcPool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcPool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaMediaChannelNodeEdgePointSpec {\n");
    
    sb.append("    mcPool: ").append(toIndentedString(mcPool)).append("\n");
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
