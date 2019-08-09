package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduOduMepSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduMepAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduMepAugmentation2   {
  @JsonProperty("odu-mep-spec")
  private TapiOduOduMepSpec oduMepSpec = null;

  public TapiOduMepAugmentation2 oduMepSpec(TapiOduOduMepSpec oduMepSpec) {
    this.oduMepSpec = oduMepSpec;
    return this;
  }

  /**
   * Get oduMepSpec
   * @return oduMepSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduMepSpec getOduMepSpec() {
    return oduMepSpec;
  }

  public void setOduMepSpec(TapiOduOduMepSpec oduMepSpec) {
    this.oduMepSpec = oduMepSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduMepAugmentation2 tapiOduMepAugmentation2 = (TapiOduMepAugmentation2) o;
    return Objects.equals(this.oduMepSpec, tapiOduMepAugmentation2.oduMepSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduMepSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduMepAugmentation2 {\n");
    
    sb.append("    oduMepSpec: ").append(toIndentedString(oduMepSpec)).append("\n");
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
