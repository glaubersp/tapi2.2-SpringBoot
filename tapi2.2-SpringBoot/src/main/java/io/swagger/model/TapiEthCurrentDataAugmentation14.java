package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthProActiveDmPerformanceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthCurrentDataAugmentation14
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthCurrentDataAugmentation14   {
  @JsonProperty("eth-pro-active-dm-performance-data")
  private TapiEthEthProActiveDmPerformanceData ethProActiveDmPerformanceData = null;

  public TapiEthCurrentDataAugmentation14 ethProActiveDmPerformanceData(TapiEthEthProActiveDmPerformanceData ethProActiveDmPerformanceData) {
    this.ethProActiveDmPerformanceData = ethProActiveDmPerformanceData;
    return this;
  }

  /**
   * Get ethProActiveDmPerformanceData
   * @return ethProActiveDmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActiveDmPerformanceData getEthProActiveDmPerformanceData() {
    return ethProActiveDmPerformanceData;
  }

  public void setEthProActiveDmPerformanceData(TapiEthEthProActiveDmPerformanceData ethProActiveDmPerformanceData) {
    this.ethProActiveDmPerformanceData = ethProActiveDmPerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthCurrentDataAugmentation14 tapiEthCurrentDataAugmentation14 = (TapiEthCurrentDataAugmentation14) o;
    return Objects.equals(this.ethProActiveDmPerformanceData, tapiEthCurrentDataAugmentation14.ethProActiveDmPerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethProActiveDmPerformanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthCurrentDataAugmentation14 {\n");
    
    sb.append("    ethProActiveDmPerformanceData: ").append(toIndentedString(ethProActiveDmPerformanceData)).append("\n");
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
