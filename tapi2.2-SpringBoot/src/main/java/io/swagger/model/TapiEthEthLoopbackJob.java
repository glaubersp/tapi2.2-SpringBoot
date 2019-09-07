package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOamTestLoopbackCommonPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthLoopbackJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthLoopbackJob   {
  @JsonProperty("eth-oam-test-loopback-common-pac")
  private TapiEthEthOamTestLoopbackCommonPac ethOamTestLoopbackCommonPac = null;

  @JsonProperty("lbm-data-tlv")
  private String lbmDataTlv = null;

  @JsonProperty("number")
  private Integer number = null;

  public TapiEthEthLoopbackJob ethOamTestLoopbackCommonPac(TapiEthEthOamTestLoopbackCommonPac ethOamTestLoopbackCommonPac) {
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

  public TapiEthEthLoopbackJob lbmDataTlv(String lbmDataTlv) {
    this.lbmDataTlv = lbmDataTlv;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  String length '1..1480'                  The loopback message Data TLV type.                  MEF 38:                  An arbitrary amount of data to be included in a Data TLV.
   * @return lbmDataTlv
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  String length '1..1480'                  The loopback message Data TLV type.                  MEF 38:                  An arbitrary amount of data to be included in a Data TLV.")

  public String getLbmDataTlv() {
    return lbmDataTlv;
  }

  public void setLbmDataTlv(String lbmDataTlv) {
    this.lbmDataTlv = lbmDataTlv;
  }

  public TapiEthEthLoopbackJob number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * G.8052: This parameter specifies how many LB messages to be sent for the LB_Series process.
   * @return number
  **/
  @ApiModelProperty(value = "G.8052: This parameter specifies how many LB messages to be sent for the LB_Series process.")

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthLoopbackJob tapiEthEthLoopbackJob = (TapiEthEthLoopbackJob) o;
    return Objects.equals(this.ethOamTestLoopbackCommonPac, tapiEthEthLoopbackJob.ethOamTestLoopbackCommonPac) &&
        Objects.equals(this.lbmDataTlv, tapiEthEthLoopbackJob.lbmDataTlv) &&
        Objects.equals(this.number, tapiEthEthLoopbackJob.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOamTestLoopbackCommonPac, lbmDataTlv, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthLoopbackJob {\n");
    
    sb.append("    ethOamTestLoopbackCommonPac: ").append(toIndentedString(ethOamTestLoopbackCommonPac)).append("\n");
    sb.append("    lbmDataTlv: ").append(toIndentedString(lbmDataTlv)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
