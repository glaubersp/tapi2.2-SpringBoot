package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaOtsiTerminationPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaOtsiConnectionEndPointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaOtsiConnectionEndPointSpec   {
  @JsonProperty("otsi-termination")
  private TapiPhotonicMediaOtsiTerminationPac otsiTermination = null;

  public TapiPhotonicMediaOtsiConnectionEndPointSpec otsiTermination(TapiPhotonicMediaOtsiTerminationPac otsiTermination) {
    this.otsiTermination = otsiTermination;
    return this;
  }

  /**
   * Get otsiTermination
   * @return otsiTermination
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiTerminationPac getOtsiTermination() {
    return otsiTermination;
  }

  public void setOtsiTermination(TapiPhotonicMediaOtsiTerminationPac otsiTermination) {
    this.otsiTermination = otsiTermination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaOtsiConnectionEndPointSpec tapiPhotonicMediaOtsiConnectionEndPointSpec = (TapiPhotonicMediaOtsiConnectionEndPointSpec) o;
    return Objects.equals(this.otsiTermination, tapiPhotonicMediaOtsiConnectionEndPointSpec.otsiTermination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otsiTermination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaOtsiConnectionEndPointSpec {\n");
    
    sb.append("    otsiTermination: ").append(toIndentedString(otsiTermination)).append("\n");
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
