package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonDirectiveValue;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPathComputationPathOptimizationConstraint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPathComputationPathOptimizationConstraint extends TapiCommonLocalClass  {
  @JsonProperty("traffic-interruption")
  private TapiCommonDirectiveValue trafficInterruption = null;

  public TapiPathComputationPathOptimizationConstraint trafficInterruption(TapiCommonDirectiveValue trafficInterruption) {
    this.trafficInterruption = trafficInterruption;
    return this;
  }

  /**
   * Get trafficInterruption
   * @return trafficInterruption
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonDirectiveValue getTrafficInterruption() {
    return trafficInterruption;
  }

  public void setTrafficInterruption(TapiCommonDirectiveValue trafficInterruption) {
    this.trafficInterruption = trafficInterruption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPathComputationPathOptimizationConstraint tapiPathComputationPathOptimizationConstraint = (TapiPathComputationPathOptimizationConstraint) o;
    return Objects.equals(this.trafficInterruption, tapiPathComputationPathOptimizationConstraint.trafficInterruption) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trafficInterruption, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPathComputationPathOptimizationConstraint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    trafficInterruption: ").append(toIndentedString(trafficInterruption)).append("\n");
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
