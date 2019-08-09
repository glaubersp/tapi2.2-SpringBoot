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
 * TapiEthEthOnDemandLmPerformanceData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthOnDemandLmPerformanceData   {
  @JsonProperty("bidir-unavailable-intervals")
  private Integer bidirUnavailableIntervals = null;

  @JsonProperty("statistical-far-end-lm-parameters")
  private TapiEthStatisticalLmPerformanceParameters statisticalFarEndLmParameters = null;

  @JsonProperty("statistical-near-end-lm-parameters")
  private TapiEthStatisticalLmPerformanceParameters statisticalNearEndLmParameters = null;

  @JsonProperty("total-counters-near-end-lm-parameters")
  private TapiEthTotalCountersLmPerformanceParameters totalCountersNearEndLmParameters = null;

  @JsonProperty("total-counters-far-end-lm-parameters")
  private TapiEthTotalCountersLmPerformanceParameters totalCountersFarEndLmParameters = null;

  public TapiEthEthOnDemandLmPerformanceData bidirUnavailableIntervals(Integer bidirUnavailableIntervals) {
    this.bidirUnavailableIntervals = bidirUnavailableIntervals;
    return this;
  }

  /**
   * A generalized (bidirectional) UAS.                  MEF 35.1: A 32-bit counter reflecting the number of delta-t intervals evaluated as Unavailable (i.e., for which A<Controller, Responder>(delta-t) = 0).                  
   * @return bidirUnavailableIntervals
  **/
  @ApiModelProperty(value = "A generalized (bidirectional) UAS.                  MEF 35.1: A 32-bit counter reflecting the number of delta-t intervals evaluated as Unavailable (i.e., for which A<Controller, Responder>(delta-t) = 0).                  ")

  public Integer getBidirUnavailableIntervals() {
    return bidirUnavailableIntervals;
  }

  public void setBidirUnavailableIntervals(Integer bidirUnavailableIntervals) {
    this.bidirUnavailableIntervals = bidirUnavailableIntervals;
  }

  public TapiEthEthOnDemandLmPerformanceData statisticalFarEndLmParameters(TapiEthStatisticalLmPerformanceParameters statisticalFarEndLmParameters) {
    this.statisticalFarEndLmParameters = statisticalFarEndLmParameters;
    return this;
  }

  /**
   * Get statisticalFarEndLmParameters
   * @return statisticalFarEndLmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthStatisticalLmPerformanceParameters getStatisticalFarEndLmParameters() {
    return statisticalFarEndLmParameters;
  }

  public void setStatisticalFarEndLmParameters(TapiEthStatisticalLmPerformanceParameters statisticalFarEndLmParameters) {
    this.statisticalFarEndLmParameters = statisticalFarEndLmParameters;
  }

  public TapiEthEthOnDemandLmPerformanceData statisticalNearEndLmParameters(TapiEthStatisticalLmPerformanceParameters statisticalNearEndLmParameters) {
    this.statisticalNearEndLmParameters = statisticalNearEndLmParameters;
    return this;
  }

  /**
   * Get statisticalNearEndLmParameters
   * @return statisticalNearEndLmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthStatisticalLmPerformanceParameters getStatisticalNearEndLmParameters() {
    return statisticalNearEndLmParameters;
  }

  public void setStatisticalNearEndLmParameters(TapiEthStatisticalLmPerformanceParameters statisticalNearEndLmParameters) {
    this.statisticalNearEndLmParameters = statisticalNearEndLmParameters;
  }

  public TapiEthEthOnDemandLmPerformanceData totalCountersNearEndLmParameters(TapiEthTotalCountersLmPerformanceParameters totalCountersNearEndLmParameters) {
    this.totalCountersNearEndLmParameters = totalCountersNearEndLmParameters;
    return this;
  }

  /**
   * Get totalCountersNearEndLmParameters
   * @return totalCountersNearEndLmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthTotalCountersLmPerformanceParameters getTotalCountersNearEndLmParameters() {
    return totalCountersNearEndLmParameters;
  }

  public void setTotalCountersNearEndLmParameters(TapiEthTotalCountersLmPerformanceParameters totalCountersNearEndLmParameters) {
    this.totalCountersNearEndLmParameters = totalCountersNearEndLmParameters;
  }

  public TapiEthEthOnDemandLmPerformanceData totalCountersFarEndLmParameters(TapiEthTotalCountersLmPerformanceParameters totalCountersFarEndLmParameters) {
    this.totalCountersFarEndLmParameters = totalCountersFarEndLmParameters;
    return this;
  }

  /**
   * Get totalCountersFarEndLmParameters
   * @return totalCountersFarEndLmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthTotalCountersLmPerformanceParameters getTotalCountersFarEndLmParameters() {
    return totalCountersFarEndLmParameters;
  }

  public void setTotalCountersFarEndLmParameters(TapiEthTotalCountersLmPerformanceParameters totalCountersFarEndLmParameters) {
    this.totalCountersFarEndLmParameters = totalCountersFarEndLmParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOnDemandLmPerformanceData tapiEthEthOnDemandLmPerformanceData = (TapiEthEthOnDemandLmPerformanceData) o;
    return Objects.equals(this.bidirUnavailableIntervals, tapiEthEthOnDemandLmPerformanceData.bidirUnavailableIntervals) &&
        Objects.equals(this.statisticalFarEndLmParameters, tapiEthEthOnDemandLmPerformanceData.statisticalFarEndLmParameters) &&
        Objects.equals(this.statisticalNearEndLmParameters, tapiEthEthOnDemandLmPerformanceData.statisticalNearEndLmParameters) &&
        Objects.equals(this.totalCountersNearEndLmParameters, tapiEthEthOnDemandLmPerformanceData.totalCountersNearEndLmParameters) &&
        Objects.equals(this.totalCountersFarEndLmParameters, tapiEthEthOnDemandLmPerformanceData.totalCountersFarEndLmParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidirUnavailableIntervals, statisticalFarEndLmParameters, statisticalNearEndLmParameters, totalCountersNearEndLmParameters, totalCountersFarEndLmParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOnDemandLmPerformanceData {\n");
    
    sb.append("    bidirUnavailableIntervals: ").append(toIndentedString(bidirUnavailableIntervals)).append("\n");
    sb.append("    statisticalFarEndLmParameters: ").append(toIndentedString(statisticalFarEndLmParameters)).append("\n");
    sb.append("    statisticalNearEndLmParameters: ").append(toIndentedString(statisticalNearEndLmParameters)).append("\n");
    sb.append("    totalCountersNearEndLmParameters: ").append(toIndentedString(totalCountersNearEndLmParameters)).append("\n");
    sb.append("    totalCountersFarEndLmParameters: ").append(toIndentedString(totalCountersFarEndLmParameters)).append("\n");
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
