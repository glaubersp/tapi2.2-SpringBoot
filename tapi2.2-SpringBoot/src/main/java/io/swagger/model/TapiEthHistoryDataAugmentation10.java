package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOnDemandLmPerformanceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthHistoryDataAugmentation10
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthHistoryDataAugmentation10   {
  @JsonProperty("eth-on-demand-lm-performance-data")
  private TapiEthEthOnDemandLmPerformanceData ethOnDemandLmPerformanceData = null;

  public TapiEthHistoryDataAugmentation10 ethOnDemandLmPerformanceData(TapiEthEthOnDemandLmPerformanceData ethOnDemandLmPerformanceData) {
    this.ethOnDemandLmPerformanceData = ethOnDemandLmPerformanceData;
    return this;
  }

  /**
   * Get ethOnDemandLmPerformanceData
   * @return ethOnDemandLmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemandLmPerformanceData getEthOnDemandLmPerformanceData() {
    return ethOnDemandLmPerformanceData;
  }

  public void setEthOnDemandLmPerformanceData(TapiEthEthOnDemandLmPerformanceData ethOnDemandLmPerformanceData) {
    this.ethOnDemandLmPerformanceData = ethOnDemandLmPerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthHistoryDataAugmentation10 tapiEthHistoryDataAugmentation10 = (TapiEthHistoryDataAugmentation10) o;
    return Objects.equals(this.ethOnDemandLmPerformanceData, tapiEthHistoryDataAugmentation10.ethOnDemandLmPerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemandLmPerformanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthHistoryDataAugmentation10 {\n");
    
    sb.append("    ethOnDemandLmPerformanceData: ").append(toIndentedString(ethOnDemandLmPerformanceData)).append("\n");
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
