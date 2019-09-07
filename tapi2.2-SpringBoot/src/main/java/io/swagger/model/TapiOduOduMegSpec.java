package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduMegSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOduOduMegSpec   {
  @JsonProperty("meg-level")
  private Integer megLevel = null;

  public TapiOduOduMegSpec megLevel(Integer megLevel) {
    this.megLevel = megLevel;
    return this;
  }

  /**
   * none
   * @return megLevel
  **/
  @ApiModelProperty(value = "none")

  public Integer getMegLevel() {
    return megLevel;
  }

  public void setMegLevel(Integer megLevel) {
    this.megLevel = megLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduMegSpec tapiOduOduMegSpec = (TapiOduOduMegSpec) o;
    return Objects.equals(this.megLevel, tapiOduOduMegSpec.megLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(megLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduMegSpec {\n");
    
    sb.append("    megLevel: ").append(toIndentedString(megLevel)).append("\n");
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
