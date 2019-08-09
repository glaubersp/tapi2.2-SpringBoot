package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOnDemand1DmPerformanceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthHistoryDataAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthHistoryDataAugmentation1   {
  @JsonProperty("eth-on-demand-1-dm-performance-data")
  private TapiEthEthOnDemand1DmPerformanceData ethOnDemand1DmPerformanceData = null;

  public TapiEthHistoryDataAugmentation1 ethOnDemand1DmPerformanceData(TapiEthEthOnDemand1DmPerformanceData ethOnDemand1DmPerformanceData) {
    this.ethOnDemand1DmPerformanceData = ethOnDemand1DmPerformanceData;
    return this;
  }

  /**
   * Get ethOnDemand1DmPerformanceData
   * @return ethOnDemand1DmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemand1DmPerformanceData getEthOnDemand1DmPerformanceData() {
    return ethOnDemand1DmPerformanceData;
  }

  public void setEthOnDemand1DmPerformanceData(TapiEthEthOnDemand1DmPerformanceData ethOnDemand1DmPerformanceData) {
    this.ethOnDemand1DmPerformanceData = ethOnDemand1DmPerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthHistoryDataAugmentation1 tapiEthHistoryDataAugmentation1 = (TapiEthHistoryDataAugmentation1) o;
    return Objects.equals(this.ethOnDemand1DmPerformanceData, tapiEthHistoryDataAugmentation1.ethOnDemand1DmPerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemand1DmPerformanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthHistoryDataAugmentation1 {\n");
    
    sb.append("    ethOnDemand1DmPerformanceData: ").append(toIndentedString(ethOnDemand1DmPerformanceData)).append("\n");
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
