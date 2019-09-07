package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaOtsiTerminationConfigPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec   {
  @JsonProperty("otsi-config")
  private TapiPhotonicMediaOtsiTerminationConfigPac otsiConfig = null;

  public TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec otsiConfig(TapiPhotonicMediaOtsiTerminationConfigPac otsiConfig) {
    this.otsiConfig = otsiConfig;
    return this;
  }

  /**
   * Get otsiConfig
   * @return otsiConfig
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiTerminationConfigPac getOtsiConfig() {
    return otsiConfig;
  }

  public void setOtsiConfig(TapiPhotonicMediaOtsiTerminationConfigPac otsiConfig) {
    this.otsiConfig = otsiConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec tapiPhotonicMediaOtsiConnectivityServiceEndPointSpec = (TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec) o;
    return Objects.equals(this.otsiConfig, tapiPhotonicMediaOtsiConnectivityServiceEndPointSpec.otsiConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otsiConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec {\n");
    
    sb.append("    otsiConfig: ").append(toIndentedString(otsiConfig)).append("\n");
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
