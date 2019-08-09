package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaEndPointAugmentation3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaEndPointAugmentation3   {
  @JsonProperty("otsi-connectivity-service-end-point-spec")
  private TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec otsiConnectivityServiceEndPointSpec = null;

  public TapiPhotonicMediaEndPointAugmentation3 otsiConnectivityServiceEndPointSpec(TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec otsiConnectivityServiceEndPointSpec) {
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
    TapiPhotonicMediaEndPointAugmentation3 tapiPhotonicMediaEndPointAugmentation3 = (TapiPhotonicMediaEndPointAugmentation3) o;
    return Objects.equals(this.otsiConnectivityServiceEndPointSpec, tapiPhotonicMediaEndPointAugmentation3.otsiConnectivityServiceEndPointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otsiConnectivityServiceEndPointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaEndPointAugmentation3 {\n");
    
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
