package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthControlFrameFilter;
import io.swagger.model.TapiEthCsfConfig;
import io.swagger.model.TapiEthTrafficConditioningPac;
import io.swagger.model.TapiEthTrafficShapingPac;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthCtpCommonPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthCtpCommonPac   {
  @JsonProperty("auxiliary-function-position-sequence")
  @Valid
  private List<Integer> auxiliaryFunctionPositionSequence = null;

  @JsonProperty("collector-max-delay")
  private Integer collectorMaxDelay = null;

  @JsonProperty("csf-config")
  private TapiEthCsfConfig csfConfig = null;

  @JsonProperty("csf-rdi-fdi-enable")
  private Boolean csfRdiFdiEnable = false;

  @JsonProperty("csf-report")
  private Boolean csfReport = false;

  @JsonProperty("filter-config")
  private TapiEthControlFrameFilter filterConfig = null;

  @JsonProperty("filter-config-snk")
  @Valid
  private List<String> filterConfigSnk = null;

  @JsonProperty("is-ssf-reported")
  private Boolean isSsfReported = false;

  @JsonProperty("mac-length")
  private Integer macLength = 2000;

  @JsonProperty("pll-thr")
  private Integer pllThr = null;

  @JsonProperty("traffic-conditioning-pac")
  private TapiEthTrafficConditioningPac trafficConditioningPac = null;

  @JsonProperty("traffic-shaping-pac")
  private TapiEthTrafficShapingPac trafficShapingPac = null;

  @JsonProperty("vlan-config")
  private Integer vlanConfig = null;

  public TapiEthEthCtpCommonPac auxiliaryFunctionPositionSequence(List<Integer> auxiliaryFunctionPositionSequence) {
    this.auxiliaryFunctionPositionSequence = auxiliaryFunctionPositionSequence;
    return this;
  }

  public TapiEthEthCtpCommonPac addAuxiliaryFunctionPositionSequenceItem(Integer auxiliaryFunctionPositionSequenceItem) {
    if (this.auxiliaryFunctionPositionSequence == null) {
      this.auxiliaryFunctionPositionSequence = new ArrayList<>();
    }
    this.auxiliaryFunctionPositionSequence.add(auxiliaryFunctionPositionSequenceItem);
    return this;
  }

  /**
   * This attribute indicates the positions (i.e., the relative order) of all the MEP, MIP, and TCS objects which are associated with the CTP.
   * @return auxiliaryFunctionPositionSequence
  **/
  @ApiModelProperty(value = "This attribute indicates the positions (i.e., the relative order) of all the MEP, MIP, and TCS objects which are associated with the CTP.")

  public List<Integer> getAuxiliaryFunctionPositionSequence() {
    return auxiliaryFunctionPositionSequence;
  }

  public void setAuxiliaryFunctionPositionSequence(List<Integer> auxiliaryFunctionPositionSequence) {
    this.auxiliaryFunctionPositionSequence = auxiliaryFunctionPositionSequence;
  }

  public TapiEthEthCtpCommonPac collectorMaxDelay(Integer collectorMaxDelay) {
    this.collectorMaxDelay = collectorMaxDelay;
    return this;
  }

  /**
   * See 802.1AX:                  The value of this attribute defines the maximum delay, in tens of microseconds, that may be imposed by the Frame Collector between receiving a frame from an Aggregator Parser, and either delivering the frame to its MAC Client or discarding the frame (see IEEE 802.1AX clause 5.2.3.1.1).                  range of type : 16-bit
   * @return collectorMaxDelay
  **/
  @ApiModelProperty(value = "See 802.1AX:                  The value of this attribute defines the maximum delay, in tens of microseconds, that may be imposed by the Frame Collector between receiving a frame from an Aggregator Parser, and either delivering the frame to its MAC Client or discarding the frame (see IEEE 802.1AX clause 5.2.3.1.1).                  range of type : 16-bit")

  public Integer getCollectorMaxDelay() {
    return collectorMaxDelay;
  }

  public void setCollectorMaxDelay(Integer collectorMaxDelay) {
    this.collectorMaxDelay = collectorMaxDelay;
  }

  public TapiEthEthCtpCommonPac csfConfig(TapiEthCsfConfig csfConfig) {
    this.csfConfig = csfConfig;
    return this;
  }

  /**
   * Get csfConfig
   * @return csfConfig
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthCsfConfig getCsfConfig() {
    return csfConfig;
  }

  public void setCsfConfig(TapiEthCsfConfig csfConfig) {
    this.csfConfig = csfConfig;
  }

  public TapiEthEthCtpCommonPac csfRdiFdiEnable(Boolean csfRdiFdiEnable) {
    this.csfRdiFdiEnable = csfRdiFdiEnable;
    return this;
  }

  /**
   * This attribute models the MI_CSFrdifdiEnable information defined in G.8021.
   * @return csfRdiFdiEnable
  **/
  @ApiModelProperty(value = "This attribute models the MI_CSFrdifdiEnable information defined in G.8021.")

  public Boolean isCsfRdiFdiEnable() {
    return csfRdiFdiEnable;
  }

  public void setCsfRdiFdiEnable(Boolean csfRdiFdiEnable) {
    this.csfRdiFdiEnable = csfRdiFdiEnable;
  }

  public TapiEthEthCtpCommonPac csfReport(Boolean csfReport) {
    this.csfReport = csfReport;
    return this;
  }

  /**
   * This attribute models the MI_CSF_Reported information defined in G.8021.                  range of type : true, false
   * @return csfReport
  **/
  @ApiModelProperty(value = "This attribute models the MI_CSF_Reported information defined in G.8021.                  range of type : true, false")

  public Boolean isCsfReport() {
    return csfReport;
  }

  public void setCsfReport(Boolean csfReport) {
    this.csfReport = csfReport;
  }

  public TapiEthEthCtpCommonPac filterConfig(TapiEthControlFrameFilter filterConfig) {
    this.filterConfig = filterConfig;
    return this;
  }

  /**
   * Get filterConfig
   * @return filterConfig
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthControlFrameFilter getFilterConfig() {
    return filterConfig;
  }

  public void setFilterConfig(TapiEthControlFrameFilter filterConfig) {
    this.filterConfig = filterConfig;
  }

  public TapiEthEthCtpCommonPac filterConfigSnk(List<String> filterConfigSnk) {
    this.filterConfigSnk = filterConfigSnk;
    return this;
  }

  public TapiEthEthCtpCommonPac addFilterConfigSnkItem(String filterConfigSnkItem) {
    if (this.filterConfigSnk == null) {
      this.filterConfigSnk = new ArrayList<>();
    }
    this.filterConfigSnk.add(filterConfigSnkItem);
    return this;
  }

  /**
   * This attribute models the FilteConfig MI defined in 8.3/G.8021. It indicates the configured filter action for each of the 33 group MAC addresses for control frames. The 33 MAC addresses are:                  01-80-C2-00-00-10,                   01-80-C2-00-00-00 to 01-80-C2-00-00-0F, and                   01-80-C2-00-00-20 to 01-80-C2-00-00-2F.                  The filter action is Pass or Block.                   If the destination address of the incoming ETH_CI_D matches one of the above addresses, the filter process shall perform the corresponding configured filter action.                   If none of the above addresses match, the ETH_CI_D is passed.
   * @return filterConfigSnk
  **/
  @ApiModelProperty(value = "This attribute models the FilteConfig MI defined in 8.3/G.8021. It indicates the configured filter action for each of the 33 group MAC addresses for control frames. The 33 MAC addresses are:                  01-80-C2-00-00-10,                   01-80-C2-00-00-00 to 01-80-C2-00-00-0F, and                   01-80-C2-00-00-20 to 01-80-C2-00-00-2F.                  The filter action is Pass or Block.                   If the destination address of the incoming ETH_CI_D matches one of the above addresses, the filter process shall perform the corresponding configured filter action.                   If none of the above addresses match, the ETH_CI_D is passed.")

  public List<String> getFilterConfigSnk() {
    return filterConfigSnk;
  }

  public void setFilterConfigSnk(List<String> filterConfigSnk) {
    this.filterConfigSnk = filterConfigSnk;
  }

  public TapiEthEthCtpCommonPac isSsfReported(Boolean isSsfReported) {
    this.isSsfReported = isSsfReported;
    return this;
  }

  /**
   * This attribute provisions whether the SSF defect should be reported as fault cause or not.                  It models the ETH-LAG_FT_Sk_MI_SSF_Reported defined in G.8021.
   * @return isSsfReported
  **/
  @ApiModelProperty(value = "This attribute provisions whether the SSF defect should be reported as fault cause or not.                  It models the ETH-LAG_FT_Sk_MI_SSF_Reported defined in G.8021.")

  public Boolean isIsSsfReported() {
    return isSsfReported;
  }

  public void setIsSsfReported(Boolean isSsfReported) {
    this.isSsfReported = isSsfReported;
  }

  public TapiEthEthCtpCommonPac macLength(Integer macLength) {
    this.macLength = macLength;
    return this;
  }

  /**
   * This attribute models the MAC_Lenght MI defined in 8.6/G.8021 for the MAC Length Check process. It indicates the allowed maximum frame length in bytes.                  range of type : 1518, 1522, 2000
   * @return macLength
  **/
  @ApiModelProperty(value = "This attribute models the MAC_Lenght MI defined in 8.6/G.8021 for the MAC Length Check process. It indicates the allowed maximum frame length in bytes.                  range of type : 1518, 1522, 2000")

  public Integer getMacLength() {
    return macLength;
  }

  public void setMacLength(Integer macLength) {
    this.macLength = macLength;
  }

  public TapiEthEthCtpCommonPac pllThr(Integer pllThr) {
    this.pllThr = pllThr;
    return this;
  }

  /**
   * This attribute provisions the threshold for the number of active ports. If the number of active ports is more than zero but less than the provisioned threshold, a cPLL (Partial Link Loss) is raised. See section 9.7.1.2 of G.8021.                  range of type : 0..number of ports
   * @return pllThr
  **/
  @ApiModelProperty(value = "This attribute provisions the threshold for the number of active ports. If the number of active ports is more than zero but less than the provisioned threshold, a cPLL (Partial Link Loss) is raised. See section 9.7.1.2 of G.8021.                  range of type : 0..number of ports")

  public Integer getPllThr() {
    return pllThr;
  }

  public void setPllThr(Integer pllThr) {
    this.pllThr = pllThr;
  }

  public TapiEthEthCtpCommonPac trafficConditioningPac(TapiEthTrafficConditioningPac trafficConditioningPac) {
    this.trafficConditioningPac = trafficConditioningPac;
    return this;
  }

  /**
   * Get trafficConditioningPac
   * @return trafficConditioningPac
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthTrafficConditioningPac getTrafficConditioningPac() {
    return trafficConditioningPac;
  }

  public void setTrafficConditioningPac(TapiEthTrafficConditioningPac trafficConditioningPac) {
    this.trafficConditioningPac = trafficConditioningPac;
  }

  public TapiEthEthCtpCommonPac trafficShapingPac(TapiEthTrafficShapingPac trafficShapingPac) {
    this.trafficShapingPac = trafficShapingPac;
    return this;
  }

  /**
   * Get trafficShapingPac
   * @return trafficShapingPac
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthTrafficShapingPac getTrafficShapingPac() {
    return trafficShapingPac;
  }

  public void setTrafficShapingPac(TapiEthTrafficShapingPac trafficShapingPac) {
    this.trafficShapingPac = trafficShapingPac;
  }

  public TapiEthEthCtpCommonPac vlanConfig(Integer vlanConfig) {
    this.vlanConfig = vlanConfig;
    return this;
  }

  /**
   * This attribute models the ETHx/ETH-m_A_So_MI_Vlan_Config information defined in G.8021.                  range of type : -1, 0, 1..4094
   * @return vlanConfig
  **/
  @ApiModelProperty(value = "This attribute models the ETHx/ETH-m_A_So_MI_Vlan_Config information defined in G.8021.                  range of type : -1, 0, 1..4094")

  public Integer getVlanConfig() {
    return vlanConfig;
  }

  public void setVlanConfig(Integer vlanConfig) {
    this.vlanConfig = vlanConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthCtpCommonPac tapiEthEthCtpCommonPac = (TapiEthEthCtpCommonPac) o;
    return Objects.equals(this.auxiliaryFunctionPositionSequence, tapiEthEthCtpCommonPac.auxiliaryFunctionPositionSequence) &&
        Objects.equals(this.collectorMaxDelay, tapiEthEthCtpCommonPac.collectorMaxDelay) &&
        Objects.equals(this.csfConfig, tapiEthEthCtpCommonPac.csfConfig) &&
        Objects.equals(this.csfRdiFdiEnable, tapiEthEthCtpCommonPac.csfRdiFdiEnable) &&
        Objects.equals(this.csfReport, tapiEthEthCtpCommonPac.csfReport) &&
        Objects.equals(this.filterConfig, tapiEthEthCtpCommonPac.filterConfig) &&
        Objects.equals(this.filterConfigSnk, tapiEthEthCtpCommonPac.filterConfigSnk) &&
        Objects.equals(this.isSsfReported, tapiEthEthCtpCommonPac.isSsfReported) &&
        Objects.equals(this.macLength, tapiEthEthCtpCommonPac.macLength) &&
        Objects.equals(this.pllThr, tapiEthEthCtpCommonPac.pllThr) &&
        Objects.equals(this.trafficConditioningPac, tapiEthEthCtpCommonPac.trafficConditioningPac) &&
        Objects.equals(this.trafficShapingPac, tapiEthEthCtpCommonPac.trafficShapingPac) &&
        Objects.equals(this.vlanConfig, tapiEthEthCtpCommonPac.vlanConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxiliaryFunctionPositionSequence, collectorMaxDelay, csfConfig, csfRdiFdiEnable, csfReport, filterConfig, filterConfigSnk, isSsfReported, macLength, pllThr, trafficConditioningPac, trafficShapingPac, vlanConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthCtpCommonPac {\n");
    
    sb.append("    auxiliaryFunctionPositionSequence: ").append(toIndentedString(auxiliaryFunctionPositionSequence)).append("\n");
    sb.append("    collectorMaxDelay: ").append(toIndentedString(collectorMaxDelay)).append("\n");
    sb.append("    csfConfig: ").append(toIndentedString(csfConfig)).append("\n");
    sb.append("    csfRdiFdiEnable: ").append(toIndentedString(csfRdiFdiEnable)).append("\n");
    sb.append("    csfReport: ").append(toIndentedString(csfReport)).append("\n");
    sb.append("    filterConfig: ").append(toIndentedString(filterConfig)).append("\n");
    sb.append("    filterConfigSnk: ").append(toIndentedString(filterConfigSnk)).append("\n");
    sb.append("    isSsfReported: ").append(toIndentedString(isSsfReported)).append("\n");
    sb.append("    macLength: ").append(toIndentedString(macLength)).append("\n");
    sb.append("    pllThr: ").append(toIndentedString(pllThr)).append("\n");
    sb.append("    trafficConditioningPac: ").append(toIndentedString(trafficConditioningPac)).append("\n");
    sb.append("    trafficShapingPac: ").append(toIndentedString(trafficShapingPac)).append("\n");
    sb.append("    vlanConfig: ").append(toIndentedString(vlanConfig)).append("\n");
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
