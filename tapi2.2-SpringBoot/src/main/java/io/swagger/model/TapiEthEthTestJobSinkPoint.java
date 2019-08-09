package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthTestJobSinkPoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthTestJobSinkPoint   {
  @JsonProperty("source-address")
  private String sourceAddress = null;

  public TapiEthEthTestJobSinkPoint sourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
    return this;
  }

  /**
   * This attribute contains the MAC address of the peer MEP.
   * @return sourceAddress
  **/
  @ApiModelProperty(value = "This attribute contains the MAC address of the peer MEP.")

  public String getSourceAddress() {
    return sourceAddress;
  }

  public void setSourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthTestJobSinkPoint tapiEthEthTestJobSinkPoint = (TapiEthEthTestJobSinkPoint) o;
    return Objects.equals(this.sourceAddress, tapiEthEthTestJobSinkPoint.sourceAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthTestJobSinkPoint {\n");
    
    sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
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
