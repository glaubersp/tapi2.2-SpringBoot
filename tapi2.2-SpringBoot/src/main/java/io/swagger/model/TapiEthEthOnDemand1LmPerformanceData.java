package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthStatisticalLmPerformanceParameters;
import io.swagger.model.TapiEthTotalCountersLmPerformanceParameters;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthOnDemand1LmPerformanceData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthOnDemand1LmPerformanceData   {
  @JsonProperty("statistical-near-end-1-lm-parameters")
  private TapiEthStatisticalLmPerformanceParameters statisticalNearEnd1LmParameters = null;

  @JsonProperty("total-counters-near-end-1-lm-parameters")
  private TapiEthTotalCountersLmPerformanceParameters totalCountersNearEnd1LmParameters = null;

  public TapiEthEthOnDemand1LmPerformanceData statisticalNearEnd1LmParameters(TapiEthStatisticalLmPerformanceParameters statisticalNearEnd1LmParameters) {
    this.statisticalNearEnd1LmParameters = statisticalNearEnd1LmParameters;
    return this;
  }

  /**
   * Get statisticalNearEnd1LmParameters
   * @return statisticalNearEnd1LmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthStatisticalLmPerformanceParameters getStatisticalNearEnd1LmParameters() {
    return statisticalNearEnd1LmParameters;
  }

  public void setStatisticalNearEnd1LmParameters(TapiEthStatisticalLmPerformanceParameters statisticalNearEnd1LmParameters) {
    this.statisticalNearEnd1LmParameters = statisticalNearEnd1LmParameters;
  }

  public TapiEthEthOnDemand1LmPerformanceData totalCountersNearEnd1LmParameters(TapiEthTotalCountersLmPerformanceParameters totalCountersNearEnd1LmParameters) {
    this.totalCountersNearEnd1LmParameters = totalCountersNearEnd1LmParameters;
    return this;
  }

  /**
   * Get totalCountersNearEnd1LmParameters
   * @return totalCountersNearEnd1LmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthTotalCountersLmPerformanceParameters getTotalCountersNearEnd1LmParameters() {
    return totalCountersNearEnd1LmParameters;
  }

  public void setTotalCountersNearEnd1LmParameters(TapiEthTotalCountersLmPerformanceParameters totalCountersNearEnd1LmParameters) {
    this.totalCountersNearEnd1LmParameters = totalCountersNearEnd1LmParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOnDemand1LmPerformanceData tapiEthEthOnDemand1LmPerformanceData = (TapiEthEthOnDemand1LmPerformanceData) o;
    return Objects.equals(this.statisticalNearEnd1LmParameters, tapiEthEthOnDemand1LmPerformanceData.statisticalNearEnd1LmParameters) &&
        Objects.equals(this.totalCountersNearEnd1LmParameters, tapiEthEthOnDemand1LmPerformanceData.totalCountersNearEnd1LmParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statisticalNearEnd1LmParameters, totalCountersNearEnd1LmParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOnDemand1LmPerformanceData {\n");
    
    sb.append("    statisticalNearEnd1LmParameters: ").append(toIndentedString(statisticalNearEnd1LmParameters)).append("\n");
    sb.append("    totalCountersNearEnd1LmParameters: ").append(toIndentedString(totalCountersNearEnd1LmParameters)).append("\n");
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
