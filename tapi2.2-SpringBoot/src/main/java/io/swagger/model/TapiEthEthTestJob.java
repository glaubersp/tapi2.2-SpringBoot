package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOamTestLoopbackCommonPac;
import io.swagger.model.TapiEthEthTestJobSinkPoint;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthTestJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthTestJob   {
  @JsonProperty("destination-address")
  private String destinationAddress = null;

  @JsonProperty("eth-oam-test-loopback-common-pac")
  private TapiEthEthOamTestLoopbackCommonPac ethOamTestLoopbackCommonPac = null;

  @JsonProperty("eth-test-job-sink-point")
  private TapiEthEthTestJobSinkPoint ethTestJobSinkPoint = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("test-pattern")
  private String testPattern = null;

  public TapiEthEthTestJob destinationAddress(String destinationAddress) {
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

  public TapiEthEthTestJob ethOamTestLoopbackCommonPac(TapiEthEthOamTestLoopbackCommonPac ethOamTestLoopbackCommonPac) {
    this.ethOamTestLoopbackCommonPac = ethOamTestLoopbackCommonPac;
    return this;
  }

  /**
   * Get ethOamTestLoopbackCommonPac
   * @return ethOamTestLoopbackCommonPac
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOamTestLoopbackCommonPac getEthOamTestLoopbackCommonPac() {
    return ethOamTestLoopbackCommonPac;
  }

  public void setEthOamTestLoopbackCommonPac(TapiEthEthOamTestLoopbackCommonPac ethOamTestLoopbackCommonPac) {
    this.ethOamTestLoopbackCommonPac = ethOamTestLoopbackCommonPac;
  }

  public TapiEthEthTestJob ethTestJobSinkPoint(TapiEthEthTestJobSinkPoint ethTestJobSinkPoint) {
    this.ethTestJobSinkPoint = ethTestJobSinkPoint;
    return this;
  }

  /**
   * Get ethTestJobSinkPoint
   * @return ethTestJobSinkPoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthTestJobSinkPoint getEthTestJobSinkPoint() {
    return ethTestJobSinkPoint;
  }

  public void setEthTestJobSinkPoint(TapiEthEthTestJobSinkPoint ethTestJobSinkPoint) {
    this.ethTestJobSinkPoint = ethTestJobSinkPoint;
  }

  public TapiEthEthTestJob number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * This parameter specifies how many TST messages to be sent.
   * @return number
  **/
  @ApiModelProperty(value = "This parameter specifies how many TST messages to be sent.")

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public TapiEthEthTestJob testPattern(String testPattern) {
    this.testPattern = testPattern;
    return this;
  }

  /**
   * G.8052: This parameter provides the test pattern to be used in the optional Data TLV.                  Examples of test patterns include pseudo-random bit sequence (PRBS) 2^31-1 as specified in clause 5.8 of [ITU-T O.150], all '0' pattern, etc.
   * @return testPattern
  **/
  @ApiModelProperty(value = "G.8052: This parameter provides the test pattern to be used in the optional Data TLV.                  Examples of test patterns include pseudo-random bit sequence (PRBS) 2^31-1 as specified in clause 5.8 of [ITU-T O.150], all '0' pattern, etc.")

  public String getTestPattern() {
    return testPattern;
  }

  public void setTestPattern(String testPattern) {
    this.testPattern = testPattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthTestJob tapiEthEthTestJob = (TapiEthEthTestJob) o;
    return Objects.equals(this.destinationAddress, tapiEthEthTestJob.destinationAddress) &&
        Objects.equals(this.ethOamTestLoopbackCommonPac, tapiEthEthTestJob.ethOamTestLoopbackCommonPac) &&
        Objects.equals(this.ethTestJobSinkPoint, tapiEthEthTestJob.ethTestJobSinkPoint) &&
        Objects.equals(this.number, tapiEthEthTestJob.number) &&
        Objects.equals(this.testPattern, tapiEthEthTestJob.testPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationAddress, ethOamTestLoopbackCommonPac, ethTestJobSinkPoint, number, testPattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthTestJob {\n");
    
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    ethOamTestLoopbackCommonPac: ").append(toIndentedString(ethOamTestLoopbackCommonPac)).append("\n");
    sb.append("    ethTestJobSinkPoint: ").append(toIndentedString(ethTestJobSinkPoint)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    testPattern: ").append(toIndentedString(testPattern)).append("\n");
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
