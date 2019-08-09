package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduOduNodeEdgePointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduNodeEdgePointAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduNodeEdgePointAugmentation2   {
  @JsonProperty("odu-node-edge-point-spec")
  private TapiOduOduNodeEdgePointSpec oduNodeEdgePointSpec = null;

  public TapiOduNodeEdgePointAugmentation2 oduNodeEdgePointSpec(TapiOduOduNodeEdgePointSpec oduNodeEdgePointSpec) {
    this.oduNodeEdgePointSpec = oduNodeEdgePointSpec;
    return this;
  }

  /**
   * Get oduNodeEdgePointSpec
   * @return oduNodeEdgePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduNodeEdgePointSpec getOduNodeEdgePointSpec() {
    return oduNodeEdgePointSpec;
  }

  public void setOduNodeEdgePointSpec(TapiOduOduNodeEdgePointSpec oduNodeEdgePointSpec) {
    this.oduNodeEdgePointSpec = oduNodeEdgePointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduNodeEdgePointAugmentation2 tapiOduNodeEdgePointAugmentation2 = (TapiOduNodeEdgePointAugmentation2) o;
    return Objects.equals(this.oduNodeEdgePointSpec, tapiOduNodeEdgePointAugmentation2.oduNodeEdgePointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduNodeEdgePointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduNodeEdgePointAugmentation2 {\n");
    
    sb.append("    oduNodeEdgePointSpec: ").append(toIndentedString(oduNodeEdgePointSpec)).append("\n");
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
