package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthStatisticalDmPerformanceParameters;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthProActive1DmPerformanceData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthProActive1DmPerformanceData   {
  @JsonProperty("statistical-near-end-1-dm-parameters")
  private TapiEthStatisticalDmPerformanceParameters statisticalNearEnd1DmParameters = null;

  public TapiEthEthProActive1DmPerformanceData statisticalNearEnd1DmParameters(TapiEthStatisticalDmPerformanceParameters statisticalNearEnd1DmParameters) {
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
    TapiEthEthProActive1DmPerformanceData tapiEthEthProActive1DmPerformanceData = (TapiEthEthProActive1DmPerformanceData) o;
    return Objects.equals(this.statisticalNearEnd1DmParameters, tapiEthEthProActive1DmPerformanceData.statisticalNearEnd1DmParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statisticalNearEnd1DmParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthProActive1DmPerformanceData {\n");
    
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
