package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOnDemand1DmSourcePerformanceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthCurrentDataAugmentation7
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthCurrentDataAugmentation7   {
  @JsonProperty("eth-on-demand-1-dm-source-performance-data")
  private TapiEthEthOnDemand1DmSourcePerformanceData ethOnDemand1DmSourcePerformanceData = null;

  public TapiEthCurrentDataAugmentation7 ethOnDemand1DmSourcePerformanceData(TapiEthEthOnDemand1DmSourcePerformanceData ethOnDemand1DmSourcePerformanceData) {
    this.ethOnDemand1DmSourcePerformanceData = ethOnDemand1DmSourcePerformanceData;
    return this;
  }

  /**
   * Get ethOnDemand1DmSourcePerformanceData
   * @return ethOnDemand1DmSourcePerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemand1DmSourcePerformanceData getEthOnDemand1DmSourcePerformanceData() {
    return ethOnDemand1DmSourcePerformanceData;
  }

  public void setEthOnDemand1DmSourcePerformanceData(TapiEthEthOnDemand1DmSourcePerformanceData ethOnDemand1DmSourcePerformanceData) {
    this.ethOnDemand1DmSourcePerformanceData = ethOnDemand1DmSourcePerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthCurrentDataAugmentation7 tapiEthCurrentDataAugmentation7 = (TapiEthCurrentDataAugmentation7) o;
    return Objects.equals(this.ethOnDemand1DmSourcePerformanceData, tapiEthCurrentDataAugmentation7.ethOnDemand1DmSourcePerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemand1DmSourcePerformanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthCurrentDataAugmentation7 {\n");
    
    sb.append("    ethOnDemand1DmSourcePerformanceData: ").append(toIndentedString(ethOnDemand1DmSourcePerformanceData)).append("\n");
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
