package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthBandwidthReport;
import io.swagger.model.TapiEthOamPeriod;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthMepSink
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthMepSink   {
  @JsonProperty("ais-period")
  private TapiEthOamPeriod aisPeriod = null;

  @JsonProperty("ais-priority")
  private Integer aisPriority = 7;

  @JsonProperty("bandwidth-report")
  private TapiEthBandwidthReport bandwidthReport = null;

  @JsonProperty("is-csf-rdi-fdi-enabled")
  private Boolean isCsfRdiFdiEnabled = true;

  @JsonProperty("is-csf-reported")
  private Boolean isCsfReported = true;

  @JsonProperty("lm-deg-thr")
  private Integer lmDegThr = 30;

  @JsonProperty("lm-degm")
  private Integer lmDegm = 10;

  @JsonProperty("lm-m")
  private Integer lmM = 10;

  @JsonProperty("lm-tf-min")
  private Integer lmTfMin = null;

  @JsonProperty("peer-mep-identifier")
  @Valid
  private List<Integer> peerMepIdentifier = null;

  @JsonProperty("unexpected-ltr-received")
  private Integer unexpectedLtrReceived = null;

  public TapiEthEthMepSink aisPeriod(TapiEthOamPeriod aisPeriod) {
    this.aisPeriod = aisPeriod;
    return this;
  }

  /**
   * Get aisPeriod
   * @return aisPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthOamPeriod getAisPeriod() {
    return aisPeriod;
  }

  public void setAisPeriod(TapiEthOamPeriod aisPeriod) {
    this.aisPeriod = aisPeriod;
  }

  public TapiEthEthMepSink aisPriority(Integer aisPriority) {
    this.aisPriority = aisPriority;
    return this;
  }

  /**
   * This attribute models the MI_AIS_Pri signal defined in G.8021 and configured as specified in G8051. It is the priority at which the AIS messages should be sent.
   * @return aisPriority
  **/
  @ApiModelProperty(value = "This attribute models the MI_AIS_Pri signal defined in G.8021 and configured as specified in G8051. It is the priority at which the AIS messages should be sent.")

  public Integer getAisPriority() {
    return aisPriority;
  }

  public void setAisPriority(Integer aisPriority) {
    this.aisPriority = aisPriority;
  }

  public TapiEthEthMepSink bandwidthReport(TapiEthBandwidthReport bandwidthReport) {
    this.bandwidthReport = bandwidthReport;
    return this;
  }

  /**
   * Get bandwidthReport
   * @return bandwidthReport
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthBandwidthReport getBandwidthReport() {
    return bandwidthReport;
  }

  public void setBandwidthReport(TapiEthBandwidthReport bandwidthReport) {
    this.bandwidthReport = bandwidthReport;
  }

  public TapiEthEthMepSink isCsfRdiFdiEnabled(Boolean isCsfRdiFdiEnabled) {
    this.isCsfRdiFdiEnabled = isCsfRdiFdiEnabled;
    return this;
  }

  /**
   * This attribute models the MI_CSFrdifdiEnable signal defined in G.8021 and configured as specified in G8051.                  aSSFrdi  dCSF-RDI and MI_CSFrdifdiEnable                  aSSFfdi  dCSF-FDI and MI_CSFrdifdiEnable
   * @return isCsfRdiFdiEnabled
  **/
  @ApiModelProperty(value = "This attribute models the MI_CSFrdifdiEnable signal defined in G.8021 and configured as specified in G8051.                  aSSFrdi  dCSF-RDI and MI_CSFrdifdiEnable                  aSSFfdi  dCSF-FDI and MI_CSFrdifdiEnable")

  public Boolean isIsCsfRdiFdiEnabled() {
    return isCsfRdiFdiEnabled;
  }

  public void setIsCsfRdiFdiEnabled(Boolean isCsfRdiFdiEnabled) {
    this.isCsfRdiFdiEnabled = isCsfRdiFdiEnabled;
  }

  public TapiEthEthMepSink isCsfReported(Boolean isCsfReported) {
    this.isCsfReported = isCsfReported;
    return this;
  }

  /**
   * This attribute models the MI_CSF_Reported signal defined in G.8021 and configured as specified in G8051. It configures whether the secondary failure CSF should be reported or not.
   * @return isCsfReported
  **/
  @ApiModelProperty(value = "This attribute models the MI_CSF_Reported signal defined in G.8021 and configured as specified in G8051. It configures whether the secondary failure CSF should be reported or not.")

  public Boolean isIsCsfReported() {
    return isCsfReported;
  }

  public void setIsCsfReported(Boolean isCsfReported) {
    this.isCsfReported = isCsfReported;
  }

  public TapiEthEthMepSink lmDegThr(Integer lmDegThr) {
    this.lmDegThr = lmDegThr;
    return this;
  }

  /**
   * This attribute defines the threshold for declaring a 'bad second'. See also section 'Degraded signal defect (dDEG)' in G.8021.
   * @return lmDegThr
  **/
  @ApiModelProperty(value = "This attribute defines the threshold for declaring a 'bad second'. See also section 'Degraded signal defect (dDEG)' in G.8021.")

  public Integer getLmDegThr() {
    return lmDegThr;
  }

  public void setLmDegThr(Integer lmDegThr) {
    this.lmDegThr = lmDegThr;
  }

  public TapiEthEthMepSink lmDegm(Integer lmDegm) {
    this.lmDegm = lmDegm;
    return this;
  }

  /**
   * This attribute defines the number of consecutive bad seconds necessary for the 'degraded' detection. See also section 'Degraded signal defect (dDEG)' in G.8021.
   * @return lmDegm
  **/
  @ApiModelProperty(value = "This attribute defines the number of consecutive bad seconds necessary for the 'degraded' detection. See also section 'Degraded signal defect (dDEG)' in G.8021.")

  public Integer getLmDegm() {
    return lmDegm;
  }

  public void setLmDegm(Integer lmDegm) {
    this.lmDegm = lmDegm;
  }

  public TapiEthEthMepSink lmM(Integer lmM) {
    this.lmM = lmM;
    return this;
  }

  /**
   * This attribute defines the number of consecutive good seconds necessary for the clearing of 'degraded'. See also section 'Degraded signal defect (dDEG)' in G.8021.
   * @return lmM
  **/
  @ApiModelProperty(value = "This attribute defines the number of consecutive good seconds necessary for the clearing of 'degraded'. See also section 'Degraded signal defect (dDEG)' in G.8021.")

  public Integer getLmM() {
    return lmM;
  }

  public void setLmM(Integer lmM) {
    this.lmM = lmM;
  }

  public TapiEthEthMepSink lmTfMin(Integer lmTfMin) {
    this.lmTfMin = lmTfMin;
    return this;
  }

  /**
   * This attribute defines the necessary number of transmitted frames to enable the detection of 'bad seconds'. See also section 'Degraded signal defect (dDEG)' in G.8021.
   * @return lmTfMin
  **/
  @ApiModelProperty(value = "This attribute defines the necessary number of transmitted frames to enable the detection of 'bad seconds'. See also section 'Degraded signal defect (dDEG)' in G.8021.")

  public Integer getLmTfMin() {
    return lmTfMin;
  }

  public void setLmTfMin(Integer lmTfMin) {
    this.lmTfMin = lmTfMin;
  }

  public TapiEthEthMepSink peerMepIdentifier(List<Integer> peerMepIdentifier) {
    this.peerMepIdentifier = peerMepIdentifier;
    return this;
  }

  public TapiEthEthMepSink addPeerMepIdentifierItem(Integer peerMepIdentifierItem) {
    if (this.peerMepIdentifier == null) {
      this.peerMepIdentifier = new ArrayList<>();
    }
    this.peerMepIdentifier.add(peerMepIdentifierItem);
    return this;
  }

  /**
   * G.8052:                  This attribute models the MI_PeerMEP_ID[i] signal defined in G.8021 and configured as specified in G.8051. It provides the identifiers of the MEPs which are peer to the subject MEP.
   * @return peerMepIdentifier
  **/
  @ApiModelProperty(value = "G.8052:                  This attribute models the MI_PeerMEP_ID[i] signal defined in G.8021 and configured as specified in G.8051. It provides the identifiers of the MEPs which are peer to the subject MEP.")

  public List<Integer> getPeerMepIdentifier() {
    return peerMepIdentifier;
  }

  public void setPeerMepIdentifier(List<Integer> peerMepIdentifier) {
    this.peerMepIdentifier = peerMepIdentifier;
  }

  public TapiEthEthMepSink unexpectedLtrReceived(Integer unexpectedLtrReceived) {
    this.unexpectedLtrReceived = unexpectedLtrReceived;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  The total number of unexpected LTRs received.
   * @return unexpectedLtrReceived
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  The total number of unexpected LTRs received.")

  public Integer getUnexpectedLtrReceived() {
    return unexpectedLtrReceived;
  }

  public void setUnexpectedLtrReceived(Integer unexpectedLtrReceived) {
    this.unexpectedLtrReceived = unexpectedLtrReceived;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthMepSink tapiEthEthMepSink = (TapiEthEthMepSink) o;
    return Objects.equals(this.aisPeriod, tapiEthEthMepSink.aisPeriod) &&
        Objects.equals(this.aisPriority, tapiEthEthMepSink.aisPriority) &&
        Objects.equals(this.bandwidthReport, tapiEthEthMepSink.bandwidthReport) &&
        Objects.equals(this.isCsfRdiFdiEnabled, tapiEthEthMepSink.isCsfRdiFdiEnabled) &&
        Objects.equals(this.isCsfReported, tapiEthEthMepSink.isCsfReported) &&
        Objects.equals(this.lmDegThr, tapiEthEthMepSink.lmDegThr) &&
        Objects.equals(this.lmDegm, tapiEthEthMepSink.lmDegm) &&
        Objects.equals(this.lmM, tapiEthEthMepSink.lmM) &&
        Objects.equals(this.lmTfMin, tapiEthEthMepSink.lmTfMin) &&
        Objects.equals(this.peerMepIdentifier, tapiEthEthMepSink.peerMepIdentifier) &&
        Objects.equals(this.unexpectedLtrReceived, tapiEthEthMepSink.unexpectedLtrReceived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aisPeriod, aisPriority, bandwidthReport, isCsfRdiFdiEnabled, isCsfReported, lmDegThr, lmDegm, lmM, lmTfMin, peerMepIdentifier, unexpectedLtrReceived);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthMepSink {\n");
    
    sb.append("    aisPeriod: ").append(toIndentedString(aisPeriod)).append("\n");
    sb.append("    aisPriority: ").append(toIndentedString(aisPriority)).append("\n");
    sb.append("    bandwidthReport: ").append(toIndentedString(bandwidthReport)).append("\n");
    sb.append("    isCsfRdiFdiEnabled: ").append(toIndentedString(isCsfRdiFdiEnabled)).append("\n");
    sb.append("    isCsfReported: ").append(toIndentedString(isCsfReported)).append("\n");
    sb.append("    lmDegThr: ").append(toIndentedString(lmDegThr)).append("\n");
    sb.append("    lmDegm: ").append(toIndentedString(lmDegm)).append("\n");
    sb.append("    lmM: ").append(toIndentedString(lmM)).append("\n");
    sb.append("    lmTfMin: ").append(toIndentedString(lmTfMin)).append("\n");
    sb.append("    peerMepIdentifier: ").append(toIndentedString(peerMepIdentifier)).append("\n");
    sb.append("    unexpectedLtrReceived: ").append(toIndentedString(unexpectedLtrReceived)).append("\n");
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
