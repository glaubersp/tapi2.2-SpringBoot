package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamContextOamContext;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamContextAugmentation4
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamContextAugmentation4   {
  @JsonProperty("oam-context")
  private TapiOamContextOamContext oamContext = null;

  public TapiOamContextAugmentation4 oamContext(TapiOamContextOamContext oamContext) {
    this.oamContext = oamContext;
    return this;
  }

  /**
   * Get oamContext
   * @return oamContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamContextOamContext getOamContext() {
    return oamContext;
  }

  public void setOamContext(TapiOamContextOamContext oamContext) {
    this.oamContext = oamContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamContextAugmentation4 tapiOamContextAugmentation4 = (TapiOamContextAugmentation4) o;
    return Objects.equals(this.oamContext, tapiOamContextAugmentation4.oamContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamContextAugmentation4 {\n");
    
    sb.append("    oamContext: ").append(toIndentedString(oamContext)).append("\n");
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
