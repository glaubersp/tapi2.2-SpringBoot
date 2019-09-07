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
 * TapiEthLinkTraceResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthLinkTraceResult   {
  @JsonProperty("data-tlv-length")
  private Integer dataTlvLength = null;

  @JsonProperty("source-address")
  private String sourceAddress = null;

  @JsonProperty("time-to-live")
  private Integer timeToLive = null;

  public TapiEthLinkTraceResult dataTlvLength(Integer dataTlvLength) {
    this.dataTlvLength = dataTlvLength;
    return this;
  }

  /**
   * G.8052: This attribute contains the length (in number of octets) of the Data TLV of an individual LTR frame result.
   * @return dataTlvLength
  **/
  @ApiModelProperty(value = "G.8052: This attribute contains the length (in number of octets) of the Data TLV of an individual LTR frame result.")

  public Integer getDataTlvLength() {
    return dataTlvLength;
  }

  public void setDataTlvLength(Integer dataTlvLength) {
    this.dataTlvLength = dataTlvLength;
  }

  public TapiEthLinkTraceResult sourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
    return this;
  }

  /**
   * G.8052: This attribute contains the source MAC Address of an individual LTR frame result.
   * @return sourceAddress
  **/
  @ApiModelProperty(value = "G.8052: This attribute contains the source MAC Address of an individual LTR frame result.")

  public String getSourceAddress() {
    return sourceAddress;
  }

  public void setSourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
  }

  public TapiEthLinkTraceResult timeToLive(Integer timeToLive) {
    this.timeToLive = timeToLive;
    return this;
  }

  /**
   * G.8052: This attribute contains the Time To Live (TTL) value of an individual LTR frame result.
   * @return timeToLive
  **/
  @ApiModelProperty(value = "G.8052: This attribute contains the Time To Live (TTL) value of an individual LTR frame result.")

  public Integer getTimeToLive() {
    return timeToLive;
  }

  public void setTimeToLive(Integer timeToLive) {
    this.timeToLive = timeToLive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthLinkTraceResult tapiEthLinkTraceResult = (TapiEthLinkTraceResult) o;
    return Objects.equals(this.dataTlvLength, tapiEthLinkTraceResult.dataTlvLength) &&
        Objects.equals(this.sourceAddress, tapiEthLinkTraceResult.sourceAddress) &&
        Objects.equals(this.timeToLive, tapiEthLinkTraceResult.timeToLive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTlvLength, sourceAddress, timeToLive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthLinkTraceResult {\n");
    
    sb.append("    dataTlvLength: ").append(toIndentedString(dataTlvLength)).append("\n");
    sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
    sb.append("    timeToLive: ").append(toIndentedString(timeToLive)).append("\n");
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
