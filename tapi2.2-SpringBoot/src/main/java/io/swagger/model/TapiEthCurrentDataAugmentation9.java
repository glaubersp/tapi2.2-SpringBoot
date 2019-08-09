package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthProActive1LmPerformanceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthCurrentDataAugmentation9
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthCurrentDataAugmentation9   {
  @JsonProperty("eth-pro-active-1-lm-performance-data")
  private TapiEthEthProActive1LmPerformanceData ethProActive1LmPerformanceData = null;

  public TapiEthCurrentDataAugmentation9 ethProActive1LmPerformanceData(TapiEthEthProActive1LmPerformanceData ethProActive1LmPerformanceData) {
    this.ethProActive1LmPerformanceData = ethProActive1LmPerformanceData;
    return this;
  }

  /**
   * Get ethProActive1LmPerformanceData
   * @return ethProActive1LmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActive1LmPerformanceData getEthProActive1LmPerformanceData() {
    return ethProActive1LmPerformanceData;
  }

  public void setEthProActive1LmPerformanceData(TapiEthEthProActive1LmPerformanceData ethProActive1LmPerformanceData) {
    this.ethProActive1LmPerformanceData = ethProActive1LmPerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthCurrentDataAugmentation9 tapiEthCurrentDataAugmentation9 = (TapiEthCurrentDataAugmentation9) o;
    return Objects.equals(this.ethProActive1LmPerformanceData, tapiEthCurrentDataAugmentation9.ethProActive1LmPerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethProActive1LmPerformanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthCurrentDataAugmentation9 {\n");
    
    sb.append("    ethProActive1LmPerformanceData: ").append(toIndentedString(ethProActive1LmPerformanceData)).append("\n");
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
