package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthProActive1DmSourcePerformanceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthCurrentDataAugmentation15
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthCurrentDataAugmentation15   {
  @JsonProperty("eth-pro-active-1-dm-source-performance-data")
  private TapiEthEthProActive1DmSourcePerformanceData ethProActive1DmSourcePerformanceData = null;

  public TapiEthCurrentDataAugmentation15 ethProActive1DmSourcePerformanceData(TapiEthEthProActive1DmSourcePerformanceData ethProActive1DmSourcePerformanceData) {
    this.ethProActive1DmSourcePerformanceData = ethProActive1DmSourcePerformanceData;
    return this;
  }

  /**
   * Get ethProActive1DmSourcePerformanceData
   * @return ethProActive1DmSourcePerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActive1DmSourcePerformanceData getEthProActive1DmSourcePerformanceData() {
    return ethProActive1DmSourcePerformanceData;
  }

  public void setEthProActive1DmSourcePerformanceData(TapiEthEthProActive1DmSourcePerformanceData ethProActive1DmSourcePerformanceData) {
    this.ethProActive1DmSourcePerformanceData = ethProActive1DmSourcePerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthCurrentDataAugmentation15 tapiEthCurrentDataAugmentation15 = (TapiEthCurrentDataAugmentation15) o;
    return Objects.equals(this.ethProActive1DmSourcePerformanceData, tapiEthCurrentDataAugmentation15.ethProActive1DmSourcePerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethProActive1DmSourcePerformanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthCurrentDataAugmentation15 {\n");
    
    sb.append("    ethProActive1DmSourcePerformanceData: ").append(toIndentedString(ethProActive1DmSourcePerformanceData)).append("\n");
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
