package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkContext;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiVirtualNetworkContextAugmentation3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiVirtualNetworkContextAugmentation3   {
  @JsonProperty("virtual-network-context")
  private TapiVirtualNetworkVirtualNetworkContext virtualNetworkContext = null;

  public TapiVirtualNetworkContextAugmentation3 virtualNetworkContext(TapiVirtualNetworkVirtualNetworkContext virtualNetworkContext) {
    this.virtualNetworkContext = virtualNetworkContext;
    return this;
  }

  /**
   * Get virtualNetworkContext
   * @return virtualNetworkContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiVirtualNetworkVirtualNetworkContext getVirtualNetworkContext() {
    return virtualNetworkContext;
  }

  public void setVirtualNetworkContext(TapiVirtualNetworkVirtualNetworkContext virtualNetworkContext) {
    this.virtualNetworkContext = virtualNetworkContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkContextAugmentation3 tapiVirtualNetworkContextAugmentation3 = (TapiVirtualNetworkContextAugmentation3) o;
    return Objects.equals(this.virtualNetworkContext, tapiVirtualNetworkContextAugmentation3.virtualNetworkContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualNetworkContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkContextAugmentation3 {\n");
    
    sb.append("    virtualNetworkContext: ").append(toIndentedString(virtualNetworkContext)).append("\n");
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
