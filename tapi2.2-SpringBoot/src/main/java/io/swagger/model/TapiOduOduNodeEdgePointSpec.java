package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduOduPoolPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduNodeEdgePointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduOduNodeEdgePointSpec   {
  @JsonProperty("odu-pool")
  private TapiOduOduPoolPac oduPool = null;

  public TapiOduOduNodeEdgePointSpec oduPool(TapiOduOduPoolPac oduPool) {
    this.oduPool = oduPool;
    return this;
  }

  /**
   * Get oduPool
   * @return oduPool
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduPoolPac getOduPool() {
    return oduPool;
  }

  public void setOduPool(TapiOduOduPoolPac oduPool) {
    this.oduPool = oduPool;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduNodeEdgePointSpec tapiOduOduNodeEdgePointSpec = (TapiOduOduNodeEdgePointSpec) o;
    return Objects.equals(this.oduPool, tapiOduOduNodeEdgePointSpec.oduPool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduPool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduNodeEdgePointSpec {\n");
    
    sb.append("    oduPool: ").append(toIndentedString(oduPool)).append("\n");
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
