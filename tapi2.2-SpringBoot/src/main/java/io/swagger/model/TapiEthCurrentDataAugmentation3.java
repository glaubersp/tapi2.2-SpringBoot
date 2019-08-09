package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthProActive1LmSourcePerformanceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthCurrentDataAugmentation3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthCurrentDataAugmentation3   {
  @JsonProperty("eth-pro-active-1-lm-source-performance-data")
  private TapiEthEthProActive1LmSourcePerformanceData ethProActive1LmSourcePerformanceData = null;

  public TapiEthCurrentDataAugmentation3 ethProActive1LmSourcePerformanceData(TapiEthEthProActive1LmSourcePerformanceData ethProActive1LmSourcePerformanceData) {
    this.ethProActive1LmSourcePerformanceData = ethProActive1LmSourcePerformanceData;
    return this;
  }

  /**
   * Get ethProActive1LmSourcePerformanceData
   * @return ethProActive1LmSourcePerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActive1LmSourcePerformanceData getEthProActive1LmSourcePerformanceData() {
    return ethProActive1LmSourcePerformanceData;
  }

  public void setEthProActive1LmSourcePerformanceData(TapiEthEthProActive1LmSourcePerformanceData ethProActive1LmSourcePerformanceData) {
    this.ethProActive1LmSourcePerformanceData = ethProActive1LmSourcePerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthCurrentDataAugmentation3 tapiEthCurrentDataAugmentation3 = (TapiEthCurrentDataAugmentation3) o;
    return Objects.equals(this.ethProActive1LmSourcePerformanceData, tapiEthCurrentDataAugmentation3.ethProActive1LmSourcePerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethProActive1LmSourcePerformanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthCurrentDataAugmentation3 {\n");
    
    sb.append("    ethProActive1LmSourcePerformanceData: ").append(toIndentedString(ethProActive1LmSourcePerformanceData)).append("\n");
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
