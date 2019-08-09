package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduOduMegSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduMegAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduMegAugmentation2   {
  @JsonProperty("odu-meg-spec")
  private TapiOduOduMegSpec oduMegSpec = null;

  public TapiOduMegAugmentation2 oduMegSpec(TapiOduOduMegSpec oduMegSpec) {
    this.oduMegSpec = oduMegSpec;
    return this;
  }

  /**
   * Get oduMegSpec
   * @return oduMegSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduMegSpec getOduMegSpec() {
    return oduMegSpec;
  }

  public void setOduMegSpec(TapiOduOduMegSpec oduMegSpec) {
    this.oduMegSpec = oduMegSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduMegAugmentation2 tapiOduMegAugmentation2 = (TapiOduMegAugmentation2) o;
    return Objects.equals(this.oduMegSpec, tapiOduMegAugmentation2.oduMegSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduMegSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduMegAugmentation2 {\n");
    
    sb.append("    oduMegSpec: ").append(toIndentedString(oduMegSpec)).append("\n");
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
