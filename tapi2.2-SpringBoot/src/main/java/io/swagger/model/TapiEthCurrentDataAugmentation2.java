package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOnDemand1LmSourcePerformanceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthCurrentDataAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthCurrentDataAugmentation2   {
  @JsonProperty("eth-on-demand-1-lm-source-performance-data")
  private TapiEthEthOnDemand1LmSourcePerformanceData ethOnDemand1LmSourcePerformanceData = null;

  public TapiEthCurrentDataAugmentation2 ethOnDemand1LmSourcePerformanceData(TapiEthEthOnDemand1LmSourcePerformanceData ethOnDemand1LmSourcePerformanceData) {
    this.ethOnDemand1LmSourcePerformanceData = ethOnDemand1LmSourcePerformanceData;
    return this;
  }

  /**
   * Get ethOnDemand1LmSourcePerformanceData
   * @return ethOnDemand1LmSourcePerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemand1LmSourcePerformanceData getEthOnDemand1LmSourcePerformanceData() {
    return ethOnDemand1LmSourcePerformanceData;
  }

  public void setEthOnDemand1LmSourcePerformanceData(TapiEthEthOnDemand1LmSourcePerformanceData ethOnDemand1LmSourcePerformanceData) {
    this.ethOnDemand1LmSourcePerformanceData = ethOnDemand1LmSourcePerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthCurrentDataAugmentation2 tapiEthCurrentDataAugmentation2 = (TapiEthCurrentDataAugmentation2) o;
    return Objects.equals(this.ethOnDemand1LmSourcePerformanceData, tapiEthCurrentDataAugmentation2.ethOnDemand1LmSourcePerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemand1LmSourcePerformanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthCurrentDataAugmentation2 {\n");
    
    sb.append("    ethOnDemand1LmSourcePerformanceData: ").append(toIndentedString(ethOnDemand1LmSourcePerformanceData)).append("\n");
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
