package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthMegSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthMegAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthMegAugmentation1   {
  @JsonProperty("eth-meg-spec")
  private TapiEthEthMegSpec ethMegSpec = null;

  public TapiEthMegAugmentation1 ethMegSpec(TapiEthEthMegSpec ethMegSpec) {
    this.ethMegSpec = ethMegSpec;
    return this;
  }

  /**
   * Get ethMegSpec
   * @return ethMegSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMegSpec getEthMegSpec() {
    return ethMegSpec;
  }

  public void setEthMegSpec(TapiEthEthMegSpec ethMegSpec) {
    this.ethMegSpec = ethMegSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthMegAugmentation1 tapiEthMegAugmentation1 = (TapiEthMegAugmentation1) o;
    return Objects.equals(this.ethMegSpec, tapiEthMegAugmentation1.ethMegSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethMegSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthMegAugmentation1 {\n");
    
    sb.append("    ethMegSpec: ").append(toIndentedString(ethMegSpec)).append("\n");
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
