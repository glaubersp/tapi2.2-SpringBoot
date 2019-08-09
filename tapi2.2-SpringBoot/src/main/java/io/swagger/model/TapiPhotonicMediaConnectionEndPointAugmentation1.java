package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaConnectionEndPointAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaConnectionEndPointAugmentation1   {
  @JsonProperty("otsi-assembly-connection-end-point-spec")
  private TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec = null;

  public TapiPhotonicMediaConnectionEndPointAugmentation1 otsiAssemblyConnectionEndPointSpec(TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaConnectionEndPointAugmentation1 tapiPhotonicMediaConnectionEndPointAugmentation1 = (TapiPhotonicMediaConnectionEndPointAugmentation1) o;
    return Objects.equals(this.otsiAssemblyConnectionEndPointSpec, tapiPhotonicMediaConnectionEndPointAugmentation1.otsiAssemblyConnectionEndPointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otsiAssemblyConnectionEndPointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaConnectionEndPointAugmentation1 {\n");
    
    sb.append("    otsiAssemblyConnectionEndPointSpec: ").append(toIndentedString(otsiAssemblyConnectionEndPointSpec)).append("\n");
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
