package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOnDemandDmPerformanceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthHistoryDataAugmentation6
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthHistoryDataAugmentation6   {
  @JsonProperty("eth-on-demand-dm-performance-data")
  private TapiEthEthOnDemandDmPerformanceData ethOnDemandDmPerformanceData = null;

  public TapiEthHistoryDataAugmentation6 ethOnDemandDmPerformanceData(TapiEthEthOnDemandDmPerformanceData ethOnDemandDmPerformanceData) {
    this.ethOnDemandDmPerformanceData = ethOnDemandDmPerformanceData;
    return this;
  }

  /**
   * Get ethOnDemandDmPerformanceData
   * @return ethOnDemandDmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemandDmPerformanceData getEthOnDemandDmPerformanceData() {
    return ethOnDemandDmPerformanceData;
  }

  public void setEthOnDemandDmPerformanceData(TapiEthEthOnDemandDmPerformanceData ethOnDemandDmPerformanceData) {
    this.ethOnDemandDmPerformanceData = ethOnDemandDmPerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthHistoryDataAugmentation6 tapiEthHistoryDataAugmentation6 = (TapiEthHistoryDataAugmentation6) o;
    return Objects.equals(this.ethOnDemandDmPerformanceData, tapiEthHistoryDataAugmentation6.ethOnDemandDmPerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemandDmPerformanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthHistoryDataAugmentation6 {\n");
    
    sb.append("    ethOnDemandDmPerformanceData: ").append(toIndentedString(ethOnDemandDmPerformanceData)).append("\n");
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
