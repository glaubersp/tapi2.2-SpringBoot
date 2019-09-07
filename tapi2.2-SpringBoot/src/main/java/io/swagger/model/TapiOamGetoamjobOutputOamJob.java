package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonTimeRange;
import io.swagger.model.TapiEthEthLinkTraceJob;
import io.swagger.model.TapiEthEthLoopbackJob;
import io.swagger.model.TapiEthEthOnDemandDualEndedMeasurementJob;
import io.swagger.model.TapiEthEthOnDemandSingleEndedMeasurementJob;
import io.swagger.model.TapiEthEthProActiveDualEndedMeasurementJob;
import io.swagger.model.TapiEthEthProActiveSingleEndedMeasurementJob;
import io.swagger.model.TapiEthEthTestJob;
import io.swagger.model.TapiOamCurrentData;
import io.swagger.model.TapiOamOamProfileRef;
import io.swagger.model.TapiOamOamServicePointRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamGetoamjobOutputOamJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamGetoamjobOutputOamJob extends TapiCommonGlobalClass  {
  @JsonProperty("administrative-state")
  private TapiCommonAdministrativeState administrativeState = null;

  @JsonProperty("creation-time")
  private String creationTime = null;

  @JsonProperty("current-data")
  @Valid
  private List<TapiOamCurrentData> currentData = null;

  @JsonProperty("eth-link-trace-job")
  private TapiEthEthLinkTraceJob ethLinkTraceJob = null;

  @JsonProperty("eth-loopback-job")
  private TapiEthEthLoopbackJob ethLoopbackJob = null;

  @JsonProperty("eth-on-demand-dual-ended-measurement-job")
  private TapiEthEthOnDemandDualEndedMeasurementJob ethOnDemandDualEndedMeasurementJob = null;

  @JsonProperty("eth-on-demand-single-ended-measurement-job")
  private TapiEthEthOnDemandSingleEndedMeasurementJob ethOnDemandSingleEndedMeasurementJob = null;

  @JsonProperty("eth-pro-active-dual-ended-measurement-job")
  private TapiEthEthProActiveDualEndedMeasurementJob ethProActiveDualEndedMeasurementJob = null;

  @JsonProperty("eth-pro-active-single-ended-measurement-job")
  private TapiEthEthProActiveSingleEndedMeasurementJob ethProActiveSingleEndedMeasurementJob = null;

  @JsonProperty("eth-test-job")
  private TapiEthEthTestJob ethTestJob = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("oam-job-type")
  private String oamJobType = null;

  @JsonProperty("oam-profile")
  private TapiOamOamProfileRef oamProfile = null;

  @JsonProperty("oam-service-point")
  @Valid
  private List<TapiOamOamServicePointRef> oamServicePoint = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("schedule")
  private TapiCommonTimeRange schedule = null;

  public TapiOamGetoamjobOutputOamJob administrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
    return this;
  }

  /**
   * Get administrativeState
   * @return administrativeState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonAdministrativeState getAdministrativeState() {
    return administrativeState;
  }

  public void setAdministrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
  }

  public TapiOamGetoamjobOutputOamJob creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * none
   * @return creationTime
  **/
  @ApiModelProperty(value = "none")

  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public TapiOamGetoamjobOutputOamJob currentData(List<TapiOamCurrentData> currentData) {
    this.currentData = currentData;
    return this;
  }

  public TapiOamGetoamjobOutputOamJob addCurrentDataItem(TapiOamCurrentData currentDataItem) {
    if (this.currentData == null) {
      this.currentData = new ArrayList<>();
    }
    this.currentData.add(currentDataItem);
    return this;
  }

  /**
   * Granularity period of the CurrentData identifies the specific CurrentData instance in the scope of this OamJob.                  For example, typically at least                  one 15min and                  one 24hr;                  optionally one additional configurable (< 15min)
   * @return currentData
  **/
  @ApiModelProperty(value = "Granularity period of the CurrentData identifies the specific CurrentData instance in the scope of this OamJob.                  For example, typically at least                  one 15min and                  one 24hr;                  optionally one additional configurable (< 15min)")
  @Valid
  public List<TapiOamCurrentData> getCurrentData() {
    return currentData;
  }

  public void setCurrentData(List<TapiOamCurrentData> currentData) {
    this.currentData = currentData;
  }

  public TapiOamGetoamjobOutputOamJob ethLinkTraceJob(TapiEthEthLinkTraceJob ethLinkTraceJob) {
    this.ethLinkTraceJob = ethLinkTraceJob;
    return this;
  }

  /**
   * Get ethLinkTraceJob
   * @return ethLinkTraceJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthLinkTraceJob getEthLinkTraceJob() {
    return ethLinkTraceJob;
  }

  public void setEthLinkTraceJob(TapiEthEthLinkTraceJob ethLinkTraceJob) {
    this.ethLinkTraceJob = ethLinkTraceJob;
  }

  public TapiOamGetoamjobOutputOamJob ethLoopbackJob(TapiEthEthLoopbackJob ethLoopbackJob) {
    this.ethLoopbackJob = ethLoopbackJob;
    return this;
  }

  /**
   * Get ethLoopbackJob
   * @return ethLoopbackJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthLoopbackJob getEthLoopbackJob() {
    return ethLoopbackJob;
  }

  public void setEthLoopbackJob(TapiEthEthLoopbackJob ethLoopbackJob) {
    this.ethLoopbackJob = ethLoopbackJob;
  }

  public TapiOamGetoamjobOutputOamJob ethOnDemandDualEndedMeasurementJob(TapiEthEthOnDemandDualEndedMeasurementJob ethOnDemandDualEndedMeasurementJob) {
    this.ethOnDemandDualEndedMeasurementJob = ethOnDemandDualEndedMeasurementJob;
    return this;
  }

  /**
   * Get ethOnDemandDualEndedMeasurementJob
   * @return ethOnDemandDualEndedMeasurementJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemandDualEndedMeasurementJob getEthOnDemandDualEndedMeasurementJob() {
    return ethOnDemandDualEndedMeasurementJob;
  }

  public void setEthOnDemandDualEndedMeasurementJob(TapiEthEthOnDemandDualEndedMeasurementJob ethOnDemandDualEndedMeasurementJob) {
    this.ethOnDemandDualEndedMeasurementJob = ethOnDemandDualEndedMeasurementJob;
  }

  public TapiOamGetoamjobOutputOamJob ethOnDemandSingleEndedMeasurementJob(TapiEthEthOnDemandSingleEndedMeasurementJob ethOnDemandSingleEndedMeasurementJob) {
    this.ethOnDemandSingleEndedMeasurementJob = ethOnDemandSingleEndedMeasurementJob;
    return this;
  }

  /**
   * Get ethOnDemandSingleEndedMeasurementJob
   * @return ethOnDemandSingleEndedMeasurementJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemandSingleEndedMeasurementJob getEthOnDemandSingleEndedMeasurementJob() {
    return ethOnDemandSingleEndedMeasurementJob;
  }

  public void setEthOnDemandSingleEndedMeasurementJob(TapiEthEthOnDemandSingleEndedMeasurementJob ethOnDemandSingleEndedMeasurementJob) {
    this.ethOnDemandSingleEndedMeasurementJob = ethOnDemandSingleEndedMeasurementJob;
  }

  public TapiOamGetoamjobOutputOamJob ethProActiveDualEndedMeasurementJob(TapiEthEthProActiveDualEndedMeasurementJob ethProActiveDualEndedMeasurementJob) {
    this.ethProActiveDualEndedMeasurementJob = ethProActiveDualEndedMeasurementJob;
    return this;
  }

  /**
   * Get ethProActiveDualEndedMeasurementJob
   * @return ethProActiveDualEndedMeasurementJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActiveDualEndedMeasurementJob getEthProActiveDualEndedMeasurementJob() {
    return ethProActiveDualEndedMeasurementJob;
  }

  public void setEthProActiveDualEndedMeasurementJob(TapiEthEthProActiveDualEndedMeasurementJob ethProActiveDualEndedMeasurementJob) {
    this.ethProActiveDualEndedMeasurementJob = ethProActiveDualEndedMeasurementJob;
  }

  public TapiOamGetoamjobOutputOamJob ethProActiveSingleEndedMeasurementJob(TapiEthEthProActiveSingleEndedMeasurementJob ethProActiveSingleEndedMeasurementJob) {
    this.ethProActiveSingleEndedMeasurementJob = ethProActiveSingleEndedMeasurementJob;
    return this;
  }

  /**
   * Get ethProActiveSingleEndedMeasurementJob
   * @return ethProActiveSingleEndedMeasurementJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActiveSingleEndedMeasurementJob getEthProActiveSingleEndedMeasurementJob() {
    return ethProActiveSingleEndedMeasurementJob;
  }

  public void setEthProActiveSingleEndedMeasurementJob(TapiEthEthProActiveSingleEndedMeasurementJob ethProActiveSingleEndedMeasurementJob) {
    this.ethProActiveSingleEndedMeasurementJob = ethProActiveSingleEndedMeasurementJob;
  }

  public TapiOamGetoamjobOutputOamJob ethTestJob(TapiEthEthTestJob ethTestJob) {
    this.ethTestJob = ethTestJob;
    return this;
  }

  /**
   * Get ethTestJob
   * @return ethTestJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthTestJob getEthTestJob() {
    return ethTestJob;
  }

  public void setEthTestJob(TapiEthEthTestJob ethTestJob) {
    this.ethTestJob = ethTestJob;
  }

  public TapiOamGetoamjobOutputOamJob lifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * Get lifecycleState
   * @return lifecycleState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonLifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
  }

  public TapiOamGetoamjobOutputOamJob oamJobType(String oamJobType) {
    this.oamJobType = oamJobType;
    return this;
  }

  /**
   * none
   * @return oamJobType
  **/
  @ApiModelProperty(value = "none")

  public String getOamJobType() {
    return oamJobType;
  }

  public void setOamJobType(String oamJobType) {
    this.oamJobType = oamJobType;
  }

  public TapiOamGetoamjobOutputOamJob oamProfile(TapiOamOamProfileRef oamProfile) {
    this.oamProfile = oamProfile;
    return this;
  }

  /**
   * Get oamProfile
   * @return oamProfile
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamOamProfileRef getOamProfile() {
    return oamProfile;
  }

  public void setOamProfile(TapiOamOamProfileRef oamProfile) {
    this.oamProfile = oamProfile;
  }

  public TapiOamGetoamjobOutputOamJob oamServicePoint(List<TapiOamOamServicePointRef> oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
    return this;
  }

  public TapiOamGetoamjobOutputOamJob addOamServicePointItem(TapiOamOamServicePointRef oamServicePointItem) {
    if (this.oamServicePoint == null) {
      this.oamServicePoint = new ArrayList<>();
    }
    this.oamServicePoint.add(oamServicePointItem);
    return this;
  }

  /**
   * none
   * @return oamServicePoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiOamOamServicePointRef> getOamServicePoint() {
    return oamServicePoint;
  }

  public void setOamServicePoint(List<TapiOamOamServicePointRef> oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
  }

  public TapiOamGetoamjobOutputOamJob operationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  /**
   * Get operationalState
   * @return operationalState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonOperationalState getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
  }

  public TapiOamGetoamjobOutputOamJob schedule(TapiCommonTimeRange schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonTimeRange getSchedule() {
    return schedule;
  }

  public void setSchedule(TapiCommonTimeRange schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamGetoamjobOutputOamJob tapiOamGetoamjobOutputOamJob = (TapiOamGetoamjobOutputOamJob) o;
    return Objects.equals(this.administrativeState, tapiOamGetoamjobOutputOamJob.administrativeState) &&
        Objects.equals(this.creationTime, tapiOamGetoamjobOutputOamJob.creationTime) &&
        Objects.equals(this.currentData, tapiOamGetoamjobOutputOamJob.currentData) &&
        Objects.equals(this.ethLinkTraceJob, tapiOamGetoamjobOutputOamJob.ethLinkTraceJob) &&
        Objects.equals(this.ethLoopbackJob, tapiOamGetoamjobOutputOamJob.ethLoopbackJob) &&
        Objects.equals(this.ethOnDemandDualEndedMeasurementJob, tapiOamGetoamjobOutputOamJob.ethOnDemandDualEndedMeasurementJob) &&
        Objects.equals(this.ethOnDemandSingleEndedMeasurementJob, tapiOamGetoamjobOutputOamJob.ethOnDemandSingleEndedMeasurementJob) &&
        Objects.equals(this.ethProActiveDualEndedMeasurementJob, tapiOamGetoamjobOutputOamJob.ethProActiveDualEndedMeasurementJob) &&
        Objects.equals(this.ethProActiveSingleEndedMeasurementJob, tapiOamGetoamjobOutputOamJob.ethProActiveSingleEndedMeasurementJob) &&
        Objects.equals(this.ethTestJob, tapiOamGetoamjobOutputOamJob.ethTestJob) &&
        Objects.equals(this.lifecycleState, tapiOamGetoamjobOutputOamJob.lifecycleState) &&
        Objects.equals(this.oamJobType, tapiOamGetoamjobOutputOamJob.oamJobType) &&
        Objects.equals(this.oamProfile, tapiOamGetoamjobOutputOamJob.oamProfile) &&
        Objects.equals(this.oamServicePoint, tapiOamGetoamjobOutputOamJob.oamServicePoint) &&
        Objects.equals(this.operationalState, tapiOamGetoamjobOutputOamJob.operationalState) &&
        Objects.equals(this.schedule, tapiOamGetoamjobOutputOamJob.schedule) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeState, creationTime, currentData, ethLinkTraceJob, ethLoopbackJob, ethOnDemandDualEndedMeasurementJob, ethOnDemandSingleEndedMeasurementJob, ethProActiveDualEndedMeasurementJob, ethProActiveSingleEndedMeasurementJob, ethTestJob, lifecycleState, oamJobType, oamProfile, oamServicePoint, operationalState, schedule, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamGetoamjobOutputOamJob {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    currentData: ").append(toIndentedString(currentData)).append("\n");
    sb.append("    ethLinkTraceJob: ").append(toIndentedString(ethLinkTraceJob)).append("\n");
    sb.append("    ethLoopbackJob: ").append(toIndentedString(ethLoopbackJob)).append("\n");
    sb.append("    ethOnDemandDualEndedMeasurementJob: ").append(toIndentedString(ethOnDemandDualEndedMeasurementJob)).append("\n");
    sb.append("    ethOnDemandSingleEndedMeasurementJob: ").append(toIndentedString(ethOnDemandSingleEndedMeasurementJob)).append("\n");
    sb.append("    ethProActiveDualEndedMeasurementJob: ").append(toIndentedString(ethProActiveDualEndedMeasurementJob)).append("\n");
    sb.append("    ethProActiveSingleEndedMeasurementJob: ").append(toIndentedString(ethProActiveSingleEndedMeasurementJob)).append("\n");
    sb.append("    ethTestJob: ").append(toIndentedString(ethTestJob)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    oamJobType: ").append(toIndentedString(oamJobType)).append("\n");
    sb.append("    oamProfile: ").append(toIndentedString(oamProfile)).append("\n");
    sb.append("    oamServicePoint: ").append(toIndentedString(oamServicePoint)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
