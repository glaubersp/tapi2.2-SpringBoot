package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthConnectionEndPointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthConnectionEndPointAugmentation6
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthConnectionEndPointAugmentation6   {
  @JsonProperty("eth-connection-end-point-spec")
  private TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec = null;

  public TapiEthConnectionEndPointAugmentation6 ethConnectionEndPointSpec(TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec) {
    this.ethConnectionEndPointSpec = ethConnectionEndPointSpec;
    return this;
  }

  /**
   * Get ethConnectionEndPointSpec
   * @return ethConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthConnectionEndPointSpec getEthConnectionEndPointSpec() {
    return ethConnectionEndPointSpec;
  }

  public void setEthConnectionEndPointSpec(TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec) {
    this.ethConnectionEndPointSpec = ethConnectionEndPointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthConnectionEndPointAugmentation6 tapiEthConnectionEndPointAugmentation6 = (TapiEthConnectionEndPointAugmentation6) o;
    return Objects.equals(this.ethConnectionEndPointSpec, tapiEthConnectionEndPointAugmentation6.ethConnectionEndPointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethConnectionEndPointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthConnectionEndPointAugmentation6 {\n");
    
    sb.append("    ethConnectionEndPointSpec: ").append(toIndentedString(ethConnectionEndPointSpec)).append("\n");
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
