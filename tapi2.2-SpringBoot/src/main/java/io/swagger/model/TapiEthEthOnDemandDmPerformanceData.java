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
 * TapiEthEthOnDemandDmPerformanceData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthOnDemandDmPerformanceData   {
  @JsonProperty("samples-far-end-dm-parameters")
  private TapiEthSamplesDmPerformanceParameters samplesFarEndDmParameters = null;

  @JsonProperty("samples-near-end-dm-parameters")
  private TapiEthSamplesDmPerformanceParameters samplesNearEndDmParameters = null;

  @JsonProperty("statistical-bi-dir-dm-parameters")
  private TapiEthStatisticalDmPerformanceParameters statisticalBiDirDmParameters = null;

  @JsonProperty("statistical-far-end-dm-parameters")
  private TapiEthStatisticalDmPerformanceParameters statisticalFarEndDmParameters = null;

  @JsonProperty("statistical-near-end-dm-parameters")
  private TapiEthStatisticalDmPerformanceParameters statisticalNearEndDmParameters = null;

  public TapiEthEthOnDemandDmPerformanceData samplesFarEndDmParameters(TapiEthSamplesDmPerformanceParameters samplesFarEndDmParameters) {
    this.samplesFarEndDmParameters = samplesFarEndDmParameters;
    return this;
  }

  /**
   * Get samplesFarEndDmParameters
   * @return samplesFarEndDmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthSamplesDmPerformanceParameters getSamplesFarEndDmParameters() {
    return samplesFarEndDmParameters;
  }

  public void setSamplesFarEndDmParameters(TapiEthSamplesDmPerformanceParameters samplesFarEndDmParameters) {
    this.samplesFarEndDmParameters = samplesFarEndDmParameters;
  }

  public TapiEthEthOnDemandDmPerformanceData samplesNearEndDmParameters(TapiEthSamplesDmPerformanceParameters samplesNearEndDmParameters) {
    this.samplesNearEndDmParameters = samplesNearEndDmParameters;
    return this;
  }

  /**
   * Get samplesNearEndDmParameters
   * @return samplesNearEndDmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthSamplesDmPerformanceParameters getSamplesNearEndDmParameters() {
    return samplesNearEndDmParameters;
  }

  public void setSamplesNearEndDmParameters(TapiEthSamplesDmPerformanceParameters samplesNearEndDmParameters) {
    this.samplesNearEndDmParameters = samplesNearEndDmParameters;
  }

  public TapiEthEthOnDemandDmPerformanceData statisticalBiDirDmParameters(TapiEthStatisticalDmPerformanceParameters statisticalBiDirDmParameters) {
    this.statisticalBiDirDmParameters = statisticalBiDirDmParameters;
    return this;
  }

  /**
   * Get statisticalBiDirDmParameters
   * @return statisticalBiDirDmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthStatisticalDmPerformanceParameters getStatisticalBiDirDmParameters() {
    return statisticalBiDirDmParameters;
  }

  public void setStatisticalBiDirDmParameters(TapiEthStatisticalDmPerformanceParameters statisticalBiDirDmParameters) {
    this.statisticalBiDirDmParameters = statisticalBiDirDmParameters;
  }

  public TapiEthEthOnDemandDmPerformanceData statisticalFarEndDmParameters(TapiEthStatisticalDmPerformanceParameters statisticalFarEndDmParameters) {
    this.statisticalFarEndDmParameters = statisticalFarEndDmParameters;
    return this;
  }

  /**
   * Get statisticalFarEndDmParameters
   * @return statisticalFarEndDmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthStatisticalDmPerformanceParameters getStatisticalFarEndDmParameters() {
    return statisticalFarEndDmParameters;
  }

  public void setStatisticalFarEndDmParameters(TapiEthStatisticalDmPerformanceParameters statisticalFarEndDmParameters) {
    this.statisticalFarEndDmParameters = statisticalFarEndDmParameters;
  }

  public TapiEthEthOnDemandDmPerformanceData statisticalNearEndDmParameters(TapiEthStatisticalDmPerformanceParameters statisticalNearEndDmParameters) {
    this.statisticalNearEndDmParameters = statisticalNearEndDmParameters;
    return this;
  }

  /**
   * Get statisticalNearEndDmParameters
   * @return statisticalNearEndDmParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthStatisticalDmPerformanceParameters getStatisticalNearEndDmParameters() {
    return statisticalNearEndDmParameters;
  }

  public void setStatisticalNearEndDmParameters(TapiEthStatisticalDmPerformanceParameters statisticalNearEndDmParameters) {
    this.statisticalNearEndDmParameters = statisticalNearEndDmParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOnDemandDmPerformanceData tapiEthEthOnDemandDmPerformanceData = (TapiEthEthOnDemandDmPerformanceData) o;
    return Objects.equals(this.samplesFarEndDmParameters, tapiEthEthOnDemandDmPerformanceData.samplesFarEndDmParameters) &&
        Objects.equals(this.samplesNearEndDmParameters, tapiEthEthOnDemandDmPerformanceData.samplesNearEndDmParameters) &&
        Objects.equals(this.statisticalBiDirDmParameters, tapiEthEthOnDemandDmPerformanceData.statisticalBiDirDmParameters) &&
        Objects.equals(this.statisticalFarEndDmParameters, tapiEthEthOnDemandDmPerformanceData.statisticalFarEndDmParameters) &&
        Objects.equals(this.statisticalNearEndDmParameters, tapiEthEthOnDemandDmPerformanceData.statisticalNearEndDmParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(samplesFarEndDmParameters, samplesNearEndDmParameters, statisticalBiDirDmParameters, statisticalFarEndDmParameters, statisticalNearEndDmParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOnDemandDmPerformanceData {\n");
    
    sb.append("    samplesFarEndDmParameters: ").append(toIndentedString(samplesFarEndDmParameters)).append("\n");
    sb.append("    samplesNearEndDmParameters: ").append(toIndentedString(samplesNearEndDmParameters)).append("\n");
    sb.append("    statisticalBiDirDmParameters: ").append(toIndentedString(statisticalBiDirDmParameters)).append("\n");
    sb.append("    statisticalFarEndDmParameters: ").append(toIndentedString(statisticalFarEndDmParameters)).append("\n");
    sb.append("    statisticalNearEndDmParameters: ").append(toIndentedString(statisticalNearEndDmParameters)).append("\n");
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
