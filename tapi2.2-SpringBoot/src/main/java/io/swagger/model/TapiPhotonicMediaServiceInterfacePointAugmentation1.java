package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaOtsiServiceInterfacePointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaServiceInterfacePointAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaServiceInterfacePointAugmentation1   {
  @JsonProperty("otsi-service-interface-point-spec")
  private TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec = null;

  public TapiPhotonicMediaServiceInterfacePointAugmentation1 otsiServiceInterfacePointSpec(TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec) {
    this.otsiServiceInterfacePointSpec = otsiServiceInterfacePointSpec;
    return this;
  }

  /**
   * Get otsiServiceInterfacePointSpec
   * @return otsiServiceInterfacePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiServiceInterfacePointSpec getOtsiServiceInterfacePointSpec() {
    return otsiServiceInterfacePointSpec;
  }

  public void setOtsiServiceInterfacePointSpec(TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec) {
    this.otsiServiceInterfacePointSpec = otsiServiceInterfacePointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaServiceInterfacePointAugmentation1 tapiPhotonicMediaServiceInterfacePointAugmentation1 = (TapiPhotonicMediaServiceInterfacePointAugmentation1) o;
    return Objects.equals(this.otsiServiceInterfacePointSpec, tapiPhotonicMediaServiceInterfacePointAugmentation1.otsiServiceInterfacePointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otsiServiceInterfacePointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaServiceInterfacePointAugmentation1 {\n");
    
    sb.append("    otsiServiceInterfacePointSpec: ").append(toIndentedString(otsiServiceInterfacePointSpec)).append("\n");
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
