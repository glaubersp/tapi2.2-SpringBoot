package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduOduConnectivityServiceEndPointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduEndPointAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduEndPointAugmentation1   {
  @JsonProperty("odu-connectivity-service-end-point-spec")
  private TapiOduOduConnectivityServiceEndPointSpec oduConnectivityServiceEndPointSpec = null;

  public TapiOduEndPointAugmentation1 oduConnectivityServiceEndPointSpec(TapiOduOduConnectivityServiceEndPointSpec oduConnectivityServiceEndPointSpec) {
    this.oduConnectivityServiceEndPointSpec = oduConnectivityServiceEndPointSpec;
    return this;
  }

  /**
   * Get oduConnectivityServiceEndPointSpec
   * @return oduConnectivityServiceEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduConnectivityServiceEndPointSpec getOduConnectivityServiceEndPointSpec() {
    return oduConnectivityServiceEndPointSpec;
  }

  public void setOduConnectivityServiceEndPointSpec(TapiOduOduConnectivityServiceEndPointSpec oduConnectivityServiceEndPointSpec) {
    this.oduConnectivityServiceEndPointSpec = oduConnectivityServiceEndPointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduEndPointAugmentation1 tapiOduEndPointAugmentation1 = (TapiOduEndPointAugmentation1) o;
    return Objects.equals(this.oduConnectivityServiceEndPointSpec, tapiOduEndPointAugmentation1.oduConnectivityServiceEndPointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduConnectivityServiceEndPointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduEndPointAugmentation1 {\n");
    
    sb.append("    oduConnectivityServiceEndPointSpec: ").append(toIndentedString(oduConnectivityServiceEndPointSpec)).append("\n");
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
