package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthLldpChassisIdSubtype;
import io.swagger.model.TapiEthLldpPortIdSubtype;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthCfmLinkTraceResultData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthCfmLinkTraceResultData   {
  @JsonProperty("egress-action-field")
  private String egressActionField = null;

  @JsonProperty("receive-order")
  private Integer receiveOrder = null;

  @JsonProperty("seq-number")
  private Integer seqNumber = null;

  @JsonProperty("ingress-port-id")
  private TapiEthLldpPortIdSubtype ingressPortId = null;

  @JsonProperty("organization-specific-tlv")
  private String organizationSpecificTlv = null;

  @JsonProperty("ingress-action-field")
  private String ingressActionField = null;

  @JsonProperty("chassis-id")
  private TapiEthLldpChassisIdSubtype chassisId = null;

  @JsonProperty("forwarded")
  private Boolean forwarded = false;

  @JsonProperty("terminal-mep")
  private Boolean terminalMep = false;

  @JsonProperty("ingress-mac")
  private String ingressMac = null;

  @JsonProperty("egress-port-id")
  private TapiEthLldpPortIdSubtype egressPortId = null;

  @JsonProperty("egress-mac")
  private String egressMac = null;

  @JsonProperty("next-egress-identifier")
  private String nextEgressIdentifier = null;

  @JsonProperty("last-egress-identifier")
  private String lastEgressIdentifier = null;

  @JsonProperty("relay-action-field")
  private String relayActionField = null;

  @JsonProperty("reply-ttl")
  private Integer replyTtl = null;

  public TapiEthEthCfmLinkTraceResultData egressActionField(String egressActionField) {
    this.egressActionField = egressActionField;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  An enumerated value indicating the value returned in the Egress Action field.                  IEEE P802.1Qcx/D0.3:                  The value EGRESS-NO-TLV indicates that no Reply Egress TLV was returned in the LTM.
   * @return egressActionField
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  An enumerated value indicating the value returned in the Egress Action field.                  IEEE P802.1Qcx/D0.3:                  The value EGRESS-NO-TLV indicates that no Reply Egress TLV was returned in the LTM.")

  public String getEgressActionField() {
    return egressActionField;
  }

  public void setEgressActionField(String egressActionField) {
    this.egressActionField = egressActionField;
  }

  public TapiEthEthCfmLinkTraceResultData receiveOrder(Integer receiveOrder) {
    this.receiveOrder = receiveOrder;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  type uint32 range '1..4294967295'                  An index to distinguish among multiple LTRs with the same LTR Transaction Identifier field value.                  Assigned sequentially from 1, in the order that the Linktrace Initiator received the LTRs.
   * @return receiveOrder
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  type uint32 range '1..4294967295'                  An index to distinguish among multiple LTRs with the same LTR Transaction Identifier field value.                  Assigned sequentially from 1, in the order that the Linktrace Initiator received the LTRs.")

  public Integer getReceiveOrder() {
    return receiveOrder;
  }

  public void setReceiveOrder(Integer receiveOrder) {
    this.receiveOrder = receiveOrder;
  }

  public TapiEthEthCfmLinkTraceResultData seqNumber(Integer seqNumber) {
    this.seqNumber = seqNumber;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  type uint32 range '0..4294967295'                  Transaction identifier returned by a previous transmit linktrace message command, indicating which LTMs response is going to be returned.                  MEF 38:                  The LTM Transaction Identifier to which the LTR entries will be attached.
   * @return seqNumber
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  type uint32 range '0..4294967295'                  Transaction identifier returned by a previous transmit linktrace message command, indicating which LTMs response is going to be returned.                  MEF 38:                  The LTM Transaction Identifier to which the LTR entries will be attached.")

  public Integer getSeqNumber() {
    return seqNumber;
  }

  public void setSeqNumber(Integer seqNumber) {
    this.seqNumber = seqNumber;
  }

  public TapiEthEthCfmLinkTraceResultData ingressPortId(TapiEthLldpPortIdSubtype ingressPortId) {
    this.ingressPortId = ingressPortId;
    return this;
  }

  /**
   * Get ingressPortId
   * @return ingressPortId
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthLldpPortIdSubtype getIngressPortId() {
    return ingressPortId;
  }

  public void setIngressPortId(TapiEthLldpPortIdSubtype ingressPortId) {
    this.ingressPortId = ingressPortId;
  }

  public TapiEthEthCfmLinkTraceResultData organizationSpecificTlv(String organizationSpecificTlv) {
    this.organizationSpecificTlv = organizationSpecificTlv;
    return this;
  }

  /**
   * String length '0 | 4..1500';                  All Organization specific TLVs returned in the LTR, if any. Includes all octets including and following the TLV Length field of each TLV, concatenated together.
   * @return organizationSpecificTlv
  **/
  @ApiModelProperty(value = "String length '0 | 4..1500';                  All Organization specific TLVs returned in the LTR, if any. Includes all octets including and following the TLV Length field of each TLV, concatenated together.")

  public String getOrganizationSpecificTlv() {
    return organizationSpecificTlv;
  }

  public void setOrganizationSpecificTlv(String organizationSpecificTlv) {
    this.organizationSpecificTlv = organizationSpecificTlv;
  }

  public TapiEthEthCfmLinkTraceResultData ingressActionField(String ingressActionField) {
    this.ingressActionField = ingressActionField;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  The value returned in the Ingress Action Field of the LTM.                  IEEE P802.1Qcx/D0.3:                  The value INGRESS-NO-TLV indicates that no Reply Ingress TLV was returned in the LTM.                  
   * @return ingressActionField
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  The value returned in the Ingress Action Field of the LTM.                  IEEE P802.1Qcx/D0.3:                  The value INGRESS-NO-TLV indicates that no Reply Ingress TLV was returned in the LTM.                  ")

  public String getIngressActionField() {
    return ingressActionField;
  }

  public void setIngressActionField(String ingressActionField) {
    this.ingressActionField = ingressActionField;
  }

  public TapiEthEthCfmLinkTraceResultData chassisId(TapiEthLldpChassisIdSubtype chassisId) {
    this.chassisId = chassisId;
    return this;
  }

  /**
   * Get chassisId
   * @return chassisId
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthLldpChassisIdSubtype getChassisId() {
    return chassisId;
  }

  public void setChassisId(TapiEthLldpChassisIdSubtype chassisId) {
    this.chassisId = chassisId;
  }

  public TapiEthEthCfmLinkTraceResultData forwarded(Boolean forwarded) {
    this.forwarded = forwarded;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  Indicates if a LTM was forwarded by the responding MP, as returned in the FwdYes flag of the flags field.
   * @return forwarded
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  Indicates if a LTM was forwarded by the responding MP, as returned in the FwdYes flag of the flags field.")

  public Boolean isForwarded() {
    return forwarded;
  }

  public void setForwarded(Boolean forwarded) {
    this.forwarded = forwarded;
  }

  public TapiEthEthCfmLinkTraceResultData terminalMep(Boolean terminalMep) {
    this.terminalMep = terminalMep;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  A Boolean value stating whether the forwarded LTM reached a MEP enclosing its MA, as returned in the Terminal MEP flag of the Flags field.
   * @return terminalMep
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  A Boolean value stating whether the forwarded LTM reached a MEP enclosing its MA, as returned in the Terminal MEP flag of the Flags field.")

  public Boolean isTerminalMep() {
    return terminalMep;
  }

  public void setTerminalMep(Boolean terminalMep) {
    this.terminalMep = terminalMep;
  }

  public TapiEthEthCfmLinkTraceResultData ingressMac(String ingressMac) {
    this.ingressMac = ingressMac;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  MAC address returned in the ingress MAC address field.                  IEEE P802.1Qcx/D0.3:                  If the ingressActionField attribute contains the value INGRESS-NO-TLV, then the contents of this attribute is meaningless.
   * @return ingressMac
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  MAC address returned in the ingress MAC address field.                  IEEE P802.1Qcx/D0.3:                  If the ingressActionField attribute contains the value INGRESS-NO-TLV, then the contents of this attribute is meaningless.")

  public String getIngressMac() {
    return ingressMac;
  }

  public void setIngressMac(String ingressMac) {
    this.ingressMac = ingressMac;
  }

  public TapiEthEthCfmLinkTraceResultData egressPortId(TapiEthLldpPortIdSubtype egressPortId) {
    this.egressPortId = egressPortId;
    return this;
  }

  /**
   * Get egressPortId
   * @return egressPortId
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthLldpPortIdSubtype getEgressPortId() {
    return egressPortId;
  }

  public void setEgressPortId(TapiEthLldpPortIdSubtype egressPortId) {
    this.egressPortId = egressPortId;
  }

  public TapiEthEthCfmLinkTraceResultData egressMac(String egressMac) {
    this.egressMac = egressMac;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  MAC address returned in the egress MAC address field.                  IEEE P802.1Qcx/D0.3:                  If the egressActionField contains the value EGRESS-NO-TLV, then the contents of this attribute are meaningless.
   * @return egressMac
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  MAC address returned in the egress MAC address field.                  IEEE P802.1Qcx/D0.3:                  If the egressActionField contains the value EGRESS-NO-TLV, then the contents of this attribute are meaningless.")

  public String getEgressMac() {
    return egressMac;
  }

  public void setEgressMac(String egressMac) {
    this.egressMac = egressMac;
  }

  public TapiEthEthCfmLinkTraceResultData nextEgressIdentifier(String nextEgressIdentifier) {
    this.nextEgressIdentifier = nextEgressIdentifier;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  String length '8'                  An octet field holding the Next Egress Identifier returned in the LTR Egress Identifier TLV of the LTR.                  The Next Egress Identifier Identifies the Linktrace Responder that transmitted this LTR, and can forward the LTM to the next hop.                  This is the same value as the Egress Identifier TLV of the forwarded LTM, if any.                  If the FwdYes bit of the Flags field is false, the contents of this field are undefined, i.e., any value can be transmitted, and the field is ignored by the receiver.
   * @return nextEgressIdentifier
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  String length '8'                  An octet field holding the Next Egress Identifier returned in the LTR Egress Identifier TLV of the LTR.                  The Next Egress Identifier Identifies the Linktrace Responder that transmitted this LTR, and can forward the LTM to the next hop.                  This is the same value as the Egress Identifier TLV of the forwarded LTM, if any.                  If the FwdYes bit of the Flags field is false, the contents of this field are undefined, i.e., any value can be transmitted, and the field is ignored by the receiver.")

  public String getNextEgressIdentifier() {
    return nextEgressIdentifier;
  }

  public void setNextEgressIdentifier(String nextEgressIdentifier) {
    this.nextEgressIdentifier = nextEgressIdentifier;
  }

  public TapiEthEthCfmLinkTraceResultData lastEgressIdentifier(String lastEgressIdentifier) {
    this.lastEgressIdentifier = lastEgressIdentifier;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  String length '8'                  An octet field holding the Last Egress Identifier returned in the LTR Egress Identifier TLV of the LTR.                  The Last Egress Identifier identifies the MEP Linktrace Initiator that originated, or the Linktrace Responder that forwarded, the LTM to which this LTR is the response.                  This is the same value as the Egress Identifier TLV of that LTM.
   * @return lastEgressIdentifier
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  String length '8'                  An octet field holding the Last Egress Identifier returned in the LTR Egress Identifier TLV of the LTR.                  The Last Egress Identifier identifies the MEP Linktrace Initiator that originated, or the Linktrace Responder that forwarded, the LTM to which this LTR is the response.                  This is the same value as the Egress Identifier TLV of that LTM.")

  public String getLastEgressIdentifier() {
    return lastEgressIdentifier;
  }

  public void setLastEgressIdentifier(String lastEgressIdentifier) {
    this.lastEgressIdentifier = lastEgressIdentifier;
  }

  public TapiEthEthCfmLinkTraceResultData relayActionField(String relayActionField) {
    this.relayActionField = relayActionField;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  An enumerated value indicating the value returned in the Relay Action field.                  
   * @return relayActionField
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  An enumerated value indicating the value returned in the Relay Action field.                  ")

  public String getRelayActionField() {
    return relayActionField;
  }

  public void setRelayActionField(String relayActionField) {
    this.relayActionField = relayActionField;
  }

  public TapiEthEthCfmLinkTraceResultData replyTtl(Integer replyTtl) {
    this.replyTtl = replyTtl;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  TTL field value for a returned LTR.                  Range '0..255'
   * @return replyTtl
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  TTL field value for a returned LTR.                  Range '0..255'")

  public Integer getReplyTtl() {
    return replyTtl;
  }

  public void setReplyTtl(Integer replyTtl) {
    this.replyTtl = replyTtl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthCfmLinkTraceResultData tapiEthEthCfmLinkTraceResultData = (TapiEthEthCfmLinkTraceResultData) o;
    return Objects.equals(this.egressActionField, tapiEthEthCfmLinkTraceResultData.egressActionField) &&
        Objects.equals(this.receiveOrder, tapiEthEthCfmLinkTraceResultData.receiveOrder) &&
        Objects.equals(this.seqNumber, tapiEthEthCfmLinkTraceResultData.seqNumber) &&
        Objects.equals(this.ingressPortId, tapiEthEthCfmLinkTraceResultData.ingressPortId) &&
        Objects.equals(this.organizationSpecificTlv, tapiEthEthCfmLinkTraceResultData.organizationSpecificTlv) &&
        Objects.equals(this.ingressActionField, tapiEthEthCfmLinkTraceResultData.ingressActionField) &&
        Objects.equals(this.chassisId, tapiEthEthCfmLinkTraceResultData.chassisId) &&
        Objects.equals(this.forwarded, tapiEthEthCfmLinkTraceResultData.forwarded) &&
        Objects.equals(this.terminalMep, tapiEthEthCfmLinkTraceResultData.terminalMep) &&
        Objects.equals(this.ingressMac, tapiEthEthCfmLinkTraceResultData.ingressMac) &&
        Objects.equals(this.egressPortId, tapiEthEthCfmLinkTraceResultData.egressPortId) &&
        Objects.equals(this.egressMac, tapiEthEthCfmLinkTraceResultData.egressMac) &&
        Objects.equals(this.nextEgressIdentifier, tapiEthEthCfmLinkTraceResultData.nextEgressIdentifier) &&
        Objects.equals(this.lastEgressIdentifier, tapiEthEthCfmLinkTraceResultData.lastEgressIdentifier) &&
        Objects.equals(this.relayActionField, tapiEthEthCfmLinkTraceResultData.relayActionField) &&
        Objects.equals(this.replyTtl, tapiEthEthCfmLinkTraceResultData.replyTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(egressActionField, receiveOrder, seqNumber, ingressPortId, organizationSpecificTlv, ingressActionField, chassisId, forwarded, terminalMep, ingressMac, egressPortId, egressMac, nextEgressIdentifier, lastEgressIdentifier, relayActionField, replyTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthCfmLinkTraceResultData {\n");
    
    sb.append("    egressActionField: ").append(toIndentedString(egressActionField)).append("\n");
    sb.append("    receiveOrder: ").append(toIndentedString(receiveOrder)).append("\n");
    sb.append("    seqNumber: ").append(toIndentedString(seqNumber)).append("\n");
    sb.append("    ingressPortId: ").append(toIndentedString(ingressPortId)).append("\n");
    sb.append("    organizationSpecificTlv: ").append(toIndentedString(organizationSpecificTlv)).append("\n");
    sb.append("    ingressActionField: ").append(toIndentedString(ingressActionField)).append("\n");
    sb.append("    chassisId: ").append(toIndentedString(chassisId)).append("\n");
    sb.append("    forwarded: ").append(toIndentedString(forwarded)).append("\n");
    sb.append("    terminalMep: ").append(toIndentedString(terminalMep)).append("\n");
    sb.append("    ingressMac: ").append(toIndentedString(ingressMac)).append("\n");
    sb.append("    egressPortId: ").append(toIndentedString(egressPortId)).append("\n");
    sb.append("    egressMac: ").append(toIndentedString(egressMac)).append("\n");
    sb.append("    nextEgressIdentifier: ").append(toIndentedString(nextEgressIdentifier)).append("\n");
    sb.append("    lastEgressIdentifier: ").append(toIndentedString(lastEgressIdentifier)).append("\n");
    sb.append("    relayActionField: ").append(toIndentedString(relayActionField)).append("\n");
    sb.append("    replyTtl: ").append(toIndentedString(replyTtl)).append("\n");
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
