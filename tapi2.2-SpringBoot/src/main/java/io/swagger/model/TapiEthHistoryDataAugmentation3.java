package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthProActiveLmPerformanceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthHistoryDataAugmentation3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthHistoryDataAugmentation3   {
  @JsonProperty("eth-pro-active-lm-performance-data")
  private TapiEthEthProActiveLmPerformanceData ethProActiveLmPerformanceData = null;

  public TapiEthHistoryDataAugmentation3 ethProActiveLmPerformanceData(TapiEthEthProActiveLmPerformanceData ethProActiveLmPerformanceData) {
    this.ethProActiveLmPerformanceData = ethProActiveLmPerformanceData;
    return this;
  }

  /**
   * Get ethProActiveLmPerformanceData
   * @return ethProActiveLmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActiveLmPerformanceData getEthProActiveLmPerformanceData() {
    return ethProActiveLmPerformanceData;
  }

  public void setEthProActiveLmPerformanceData(TapiEthEthProActiveLmPerformanceData ethProActiveLmPerformanceData) {
    this.ethProActiveLmPerformanceData = ethProActiveLmPerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthHistoryDataAugmentation3 tapiEthHistoryDataAugmentation3 = (TapiEthHistoryDataAugmentation3) o;
    return Objects.equals(this.ethProActiveLmPerformanceData, tapiEthHistoryDataAugmentation3.ethProActiveLmPerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethProActiveLmPerformanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthHistoryDataAugmentation3 {\n");
    
    sb.append("    ethProActiveLmPerformanceData: ").append(toIndentedString(ethProActiveLmPerformanceData)).append("\n");
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
