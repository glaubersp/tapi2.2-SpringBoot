package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPathComputationPathComputationContext;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPathComputationContextAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPathComputationContextAugmentation1   {
  @JsonProperty("path-computation-context")
  private TapiPathComputationPathComputationContext pathComputationContext = null;

  public TapiPathComputationContextAugmentation1 pathComputationContext(TapiPathComputationPathComputationContext pathComputationContext) {
    this.pathComputationContext = pathComputationContext;
    return this;
  }

  /**
   * Get pathComputationContext
   * @return pathComputationContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPathComputationPathComputationContext getPathComputationContext() {
    return pathComputationContext;
  }

  public void setPathComputationContext(TapiPathComputationPathComputationContext pathComputationContext) {
    this.pathComputationContext = pathComputationContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPathComputationContextAugmentation1 tapiPathComputationContextAugmentation1 = (TapiPathComputationContextAugmentation1) o;
    return Objects.equals(this.pathComputationContext, tapiPathComputationContextAugmentation1.pathComputationContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathComputationContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPathComputationContextAugmentation1 {\n");
    
    sb.append("    pathComputationContext: ").append(toIndentedString(pathComputationContext)).append("\n");
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
