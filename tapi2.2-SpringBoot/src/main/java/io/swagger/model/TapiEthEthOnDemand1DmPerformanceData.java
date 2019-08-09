package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthSamplesDmPerformanceParameters;
import io.swagger.model.TapiEthStatisticalDmPerformanceParameters;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthOnDemand1DmPerformanceData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthOnDemand1DmPerformanceData   {
  @JsonProperty("samples-near-end-1-dm-parameters")
  private TapiEthSamplesDmPerformanceParameters samplesNearEnd1DmParameters = null;

  @JsonProperty("statistical-near-end-1-dm-parameters")
  private TapiEthStatisticalDmPerformanceParameters statisticalNearEnd1DmParameters = null;

  public TapiEthEthOnDemand1DmPerformanceData samplesNearEnd1DmParameters(TapiEthSamplesDmPerformanceParameters samplesNearEnd1DmParameters) {
    this.samplesNearEnd1DmParameters = samplesNearEnd1DmParameters;
    return this;
  }

  /**
   * Get samplesNearEnd1DmParameters
   * @return samplesNearEnd1DmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthSamplesDmPerformanceParameters getSamplesNearEnd1DmParameters() {
    return samplesNearEnd1DmParameters;
  }

  public void setSamplesNearEnd1DmParameters(TapiEthSamplesDmPerformanceParameters samplesNearEnd1DmParameters) {
    this.samplesNearEnd1DmParameters = samplesNearEnd1DmParameters;
  }

  public TapiEthEthOnDemand1DmPerformanceData statisticalNearEnd1DmParameters(TapiEthStatisticalDmPerformanceParameters statisticalNearEnd1DmParameters) {
    this.statisticalNearEnd1DmParameters = statisticalNearEnd1DmParameters;
    return this;
  }

  /**
   * Get statisticalNearEnd1DmParameters
   * @return statisticalNearEnd1DmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthStatisticalDmPerformanceParameters getStatisticalNearEnd1DmParameters() {
    return statisticalNearEnd1DmParameters;
  }

  public void setStatisticalNearEnd1DmParameters(TapiEthStatisticalDmPerformanceParameters statisticalNearEnd1DmParameters) {
    this.statisticalNearEnd1DmParameters = statisticalNearEnd1DmParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOnDemand1DmPerformanceData tapiEthEthOnDemand1DmPerformanceData = (TapiEthEthOnDemand1DmPerformanceData) o;
    return Objects.equals(this.samplesNearEnd1DmParameters, tapiEthEthOnDemand1DmPerformanceData.samplesNearEnd1DmParameters) &&
        Objects.equals(this.statisticalNearEnd1DmParameters, tapiEthEthOnDemand1DmPerformanceData.statisticalNearEnd1DmParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(samplesNearEnd1DmParameters, statisticalNearEnd1DmParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOnDemand1DmPerformanceData {\n");
    
    sb.append("    samplesNearEnd1DmParameters: ").append(toIndentedString(samplesNearEnd1DmParameters)).append("\n");
    sb.append("    statisticalNearEnd1DmParameters: ").append(toIndentedString(statisticalNearEnd1DmParameters)).append("\n");
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
