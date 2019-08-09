package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthTestResultData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthCurrentDataAugmentation10
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthCurrentDataAugmentation10   {
  @JsonProperty("eth-test-result-data")
  private TapiEthEthTestResultData ethTestResultData = null;

  public TapiEthCurrentDataAugmentation10 ethTestResultData(TapiEthEthTestResultData ethTestResultData) {
    this.ethTestResultData = ethTestResultData;
    return this;
  }

  /**
   * Get ethTestResultData
   * @return ethTestResultData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthTestResultData getEthTestResultData() {
    return ethTestResultData;
  }

  public void setEthTestResultData(TapiEthEthTestResultData ethTestResultData) {
    this.ethTestResultData = ethTestResultData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthCurrentDataAugmentation10 tapiEthCurrentDataAugmentation10 = (TapiEthCurrentDataAugmentation10) o;
    return Objects.equals(this.ethTestResultData, tapiEthCurrentDataAugmentation10.ethTestResultData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethTestResultData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthCurrentDataAugmentation10 {\n");
    
    sb.append("    ethTestResultData: ").append(toIndentedString(ethTestResultData)).append("\n");
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
