package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthCfmLinkTracePac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthLinkTraceJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthLinkTraceJob   {
  @JsonProperty("time-to-live")
  private Integer timeToLive = null;

  @JsonProperty("eth-cfm-link-trace-pac")
  private TapiEthEthCfmLinkTracePac ethCfmLinkTracePac = null;

  @JsonProperty("destination-address")
  private String destinationAddress = null;

  @JsonProperty("priority")
  private Integer priority = 7;

  public TapiEthEthLinkTraceJob timeToLive(Integer timeToLive) {
    this.timeToLive = timeToLive;
    return this;
  }

  /**
   * G.8052: This parameter provides the Time To Live (TTL) parameter of the Link Track protocol.                  The TTL parameter allows the receiver (MIP or MEP) of the LTM frame to determine if the frame can be terminated. TTL is decremented every time the LTM frame is relayed. LTM frame with TTL<=1 is terminated and not relayed.                  IEEE P802.1Qcx/D0.3:                  MEF 38:                  An initial value for the LTM TTL field.
   * @return timeToLive
  **/
  @ApiModelProperty(value = "G.8052: This parameter provides the Time To Live (TTL) parameter of the Link Track protocol.                  The TTL parameter allows the receiver (MIP or MEP) of the LTM frame to determine if the frame can be terminated. TTL is decremented every time the LTM frame is relayed. LTM frame with TTL<=1 is terminated and not relayed.                  IEEE P802.1Qcx/D0.3:                  MEF 38:                  An initial value for the LTM TTL field.")

  public Integer getTimeToLive() {
    return timeToLive;
  }

  public void setTimeToLive(Integer timeToLive) {
    this.timeToLive = timeToLive;
  }

  public TapiEthEthLinkTraceJob ethCfmLinkTracePac(TapiEthEthCfmLinkTracePac ethCfmLinkTracePac) {
    this.ethCfmLinkTracePac = ethCfmLinkTracePac;
    return this;
  }

  /**
   * Get ethCfmLinkTracePac
   * @return ethCfmLinkTracePac
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthCfmLinkTracePac getEthCfmLinkTracePac() {
    return ethCfmLinkTracePac;
  }

  public void setEthCfmLinkTracePac(TapiEthEthCfmLinkTracePac ethCfmLinkTracePac) {
    this.ethCfmLinkTracePac = ethCfmLinkTracePac;
  }

  public TapiEthEthLinkTraceJob destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

  /**
   * G.8052: This parameter provides the destination address, i.e., the MAC Address of the target MEP or MIP.
   * @return destinationAddress
  **/
  @ApiModelProperty(value = "G.8052: This parameter provides the destination address, i.e., the MAC Address of the target MEP or MIP.")

  public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public TapiEthEthLinkTraceJob priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * G.8052: This parameter provides the priority to be used in the LBM frame.                  G.8052: This parameter provides the priority to be used in the TST frame.
   * @return priority
  **/
  @ApiModelProperty(value = "G.8052: This parameter provides the priority to be used in the LBM frame.                  G.8052: This parameter provides the priority to be used in the TST frame.")

  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthLinkTraceJob tapiEthEthLinkTraceJob = (TapiEthEthLinkTraceJob) o;
    return Objects.equals(this.timeToLive, tapiEthEthLinkTraceJob.timeToLive) &&
        Objects.equals(this.ethCfmLinkTracePac, tapiEthEthLinkTraceJob.ethCfmLinkTracePac) &&
        Objects.equals(this.destinationAddress, tapiEthEthLinkTraceJob.destinationAddress) &&
        Objects.equals(this.priority, tapiEthEthLinkTraceJob.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeToLive, ethCfmLinkTracePac, destinationAddress, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthLinkTraceJob {\n");
    
    sb.append("    timeToLive: ").append(toIndentedString(timeToLive)).append("\n");
    sb.append("    ethCfmLinkTracePac: ").append(toIndentedString(ethCfmLinkTracePac)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
