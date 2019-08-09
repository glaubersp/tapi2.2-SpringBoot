package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthProActive1DmPerformanceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthHistoryDataAugmentation5
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthHistoryDataAugmentation5   {
  @JsonProperty("eth-pro-active-1-dm-performance-data")
  private TapiEthEthProActive1DmPerformanceData ethProActive1DmPerformanceData = null;

  public TapiEthHistoryDataAugmentation5 ethProActive1DmPerformanceData(TapiEthEthProActive1DmPerformanceData ethProActive1DmPerformanceData) {
    this.ethProActive1DmPerformanceData = ethProActive1DmPerformanceData;
    return this;
  }

  /**
   * Get ethProActive1DmPerformanceData
   * @return ethProActive1DmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActive1DmPerformanceData getEthProActive1DmPerformanceData() {
    return ethProActive1DmPerformanceData;
  }

  public void setEthProActive1DmPerformanceData(TapiEthEthProActive1DmPerformanceData ethProActive1DmPerformanceData) {
    this.ethProActive1DmPerformanceData = ethProActive1DmPerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthHistoryDataAugmentation5 tapiEthHistoryDataAugmentation5 = (TapiEthHistoryDataAugmentation5) o;
    return Objects.equals(this.ethProActive1DmPerformanceData, tapiEthHistoryDataAugmentation5.ethProActive1DmPerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethProActive1DmPerformanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthHistoryDataAugmentation5 {\n");
    
    sb.append("    ethProActive1DmPerformanceData: ").append(toIndentedString(ethProActive1DmPerformanceData)).append("\n");
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
