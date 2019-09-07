package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaOtsiServerAdaptationPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec   {
  @JsonProperty("otsi-adapter")
  private TapiPhotonicMediaOtsiServerAdaptationPac otsiAdapter = null;

  public TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAdapter(TapiPhotonicMediaOtsiServerAdaptationPac otsiAdapter) {
    this.otsiAdapter = otsiAdapter;
    return this;
  }

  /**
   * Get otsiAdapter
   * @return otsiAdapter
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiServerAdaptationPac getOtsiAdapter() {
    return otsiAdapter;
  }

  public void setOtsiAdapter(TapiPhotonicMediaOtsiServerAdaptationPac otsiAdapter) {
    this.otsiAdapter = otsiAdapter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec tapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec = (TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec) o;
    return Objects.equals(this.otsiAdapter, tapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec.otsiAdapter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otsiAdapter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec {\n");
    
    sb.append("    otsiAdapter: ").append(toIndentedString(otsiAdapter)).append("\n");
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
