package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaOtsiConnectionEndPointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaConnectionEndPointAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaConnectionEndPointAugmentation2   {
  @JsonProperty("otsi-connection-end-point-spec")
  private TapiPhotonicMediaOtsiConnectionEndPointSpec otsiConnectionEndPointSpec = null;

  public TapiPhotonicMediaConnectionEndPointAugmentation2 otsiConnectionEndPointSpec(TapiPhotonicMediaOtsiConnectionEndPointSpec otsiConnectionEndPointSpec) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaConnectionEndPointAugmentation2 tapiPhotonicMediaConnectionEndPointAugmentation2 = (TapiPhotonicMediaConnectionEndPointAugmentation2) o;
    return Objects.equals(this.otsiConnectionEndPointSpec, tapiPhotonicMediaConnectionEndPointAugmentation2.otsiConnectionEndPointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otsiConnectionEndPointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaConnectionEndPointAugmentation2 {\n");
    
    sb.append("    otsiConnectionEndPointSpec: ").append(toIndentedString(otsiConnectionEndPointSpec)).append("\n");
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
