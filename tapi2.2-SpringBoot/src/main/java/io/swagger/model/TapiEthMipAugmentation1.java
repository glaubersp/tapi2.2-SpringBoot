package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthMipSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthMipAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthMipAugmentation1   {
  @JsonProperty("eth-mip-spec")
  private TapiEthEthMipSpec ethMipSpec = null;

  public TapiEthMipAugmentation1 ethMipSpec(TapiEthEthMipSpec ethMipSpec) {
    this.ethMipSpec = ethMipSpec;
    return this;
  }

  /**
   * Get ethMipSpec
   * @return ethMipSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMipSpec getEthMipSpec() {
    return ethMipSpec;
  }

  public void setEthMipSpec(TapiEthEthMipSpec ethMipSpec) {
    this.ethMipSpec = ethMipSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthMipAugmentation1 tapiEthMipAugmentation1 = (TapiEthMipAugmentation1) o;
    return Objects.equals(this.ethMipSpec, tapiEthMipAugmentation1.ethMipSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethMipSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthMipAugmentation1 {\n");
    
    sb.append("    ethMipSpec: ").append(toIndentedString(ethMipSpec)).append("\n");
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
