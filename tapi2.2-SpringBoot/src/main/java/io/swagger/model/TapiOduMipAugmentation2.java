package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduOduMipSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduMipAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduMipAugmentation2   {
  @JsonProperty("odu-mip-spec")
  private TapiOduOduMipSpec oduMipSpec = null;

  public TapiOduMipAugmentation2 oduMipSpec(TapiOduOduMipSpec oduMipSpec) {
    this.oduMipSpec = oduMipSpec;
    return this;
  }

  /**
   * Get oduMipSpec
   * @return oduMipSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduMipSpec getOduMipSpec() {
    return oduMipSpec;
  }

  public void setOduMipSpec(TapiOduOduMipSpec oduMipSpec) {
    this.oduMipSpec = oduMipSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduMipAugmentation2 tapiOduMipAugmentation2 = (TapiOduMipAugmentation2) o;
    return Objects.equals(this.oduMipSpec, tapiOduMipAugmentation2.oduMipSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduMipSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduMipAugmentation2 {\n");
    
    sb.append("    oduMipSpec: ").append(toIndentedString(oduMipSpec)).append("\n");
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
