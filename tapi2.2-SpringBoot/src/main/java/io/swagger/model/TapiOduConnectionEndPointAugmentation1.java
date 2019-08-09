package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduOduConnectionEndPointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduConnectionEndPointAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduConnectionEndPointAugmentation1   {
  @JsonProperty("odu-connection-end-point-spec")
  private TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec = null;

  public TapiOduConnectionEndPointAugmentation1 oduConnectionEndPointSpec(TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec) {
    this.oduConnectionEndPointSpec = oduConnectionEndPointSpec;
    return this;
  }

  /**
   * Get oduConnectionEndPointSpec
   * @return oduConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduConnectionEndPointSpec getOduConnectionEndPointSpec() {
    return oduConnectionEndPointSpec;
  }

  public void setOduConnectionEndPointSpec(TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec) {
    this.oduConnectionEndPointSpec = oduConnectionEndPointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduConnectionEndPointAugmentation1 tapiOduConnectionEndPointAugmentation1 = (TapiOduConnectionEndPointAugmentation1) o;
    return Objects.equals(this.oduConnectionEndPointSpec, tapiOduConnectionEndPointAugmentation1.oduConnectionEndPointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduConnectionEndPointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduConnectionEndPointAugmentation1 {\n");
    
    sb.append("    oduConnectionEndPointSpec: ").append(toIndentedString(oduConnectionEndPointSpec)).append("\n");
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
