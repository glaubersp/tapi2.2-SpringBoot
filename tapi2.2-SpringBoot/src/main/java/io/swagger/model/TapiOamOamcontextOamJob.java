package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdminStatePac;
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
import io.swagger.model.TapiEthOamJobAugmentation1;
import io.swagger.model.TapiEthOamJobAugmentation2;
import io.swagger.model.TapiEthOamJobAugmentation3;
import io.swagger.model.TapiEthOamJobAugmentation4;
import io.swagger.model.TapiEthOamJobAugmentation5;
import io.swagger.model.TapiEthOamJobAugmentation6;
import io.swagger.model.TapiEthOamJobAugmentation7;
import io.swagger.model.TapiOamOamProfileRef;
import io.swagger.model.TapiOamOamServicePointRef;
import io.swagger.model.TapiOamOamjobCurrentData;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamOamcontextOamJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamOamcontextOamJob extends TapiCommonAdminStatePac  {
  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("eth-link-trace-job")
  private TapiEthEthLinkTraceJob ethLinkTraceJob = null;

  @JsonProperty("eth-pro-active-dual-ended-measurement-job")
  private TapiEthEthProActiveDualEndedMeasurementJob ethProActiveDualEndedMeasurementJob = null;

  @JsonProperty("eth-pro-active-single-ended-measurement-job")
  private TapiEthEthProActiveSingleEndedMeasurementJob ethProActiveSingleEndedMeasurementJob = null;

  @JsonProperty("eth-test-job")
  private TapiEthEthTestJob ethTestJob = null;

  @JsonProperty("eth-on-demand-single-ended-measurement-job")
  private TapiEthEthOnDemandSingleEndedMeasurementJob ethOnDemandSingleEndedMeasurementJob = null;

  @JsonProperty("eth-loopback-job")
  private TapiEthEthLoopbackJob ethLoopbackJob = null;

  @JsonProperty("eth-on-demand-dual-ended-measurement-job")
  private TapiEthEthOnDemandDualEndedMeasurementJob ethOnDemandDualEndedMeasurementJob = null;

  @JsonProperty("schedule")
  private TapiCommonTimeRange schedule = null;

  @JsonProperty("oam-profile")
  private TapiOamOamProfileRef oamProfile = null;

  @JsonProperty("creation-time")
  private String creationTime = null;

  @JsonProperty("oam-job-type")
  private String oamJobType = null;

  @JsonProperty("oam-service-point")
  @Valid
  private List<TapiOamOamServicePointRef> oamServicePoint = null;

  @JsonProperty("current-data")
  @Valid
  private List<TapiOamOamjobCurrentData> currentData = null;

  public TapiOamOamcontextOamJob name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamOamcontextOamJob addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. This value is unique in some namespace but may change during the life of the entity.                  A name carries no semantics with respect to the purpose of the entity.
   * @return name
  **/
  @ApiModelProperty(value = "List of names. This value is unique in some namespace but may change during the life of the entity.                  A name carries no semantics with respect to the purpose of the entity.")
  @Valid
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiOamOamcontextOamJob uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                  An UUID carries no semantics with respect to the purpose or state of the entity.                  UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                  Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                   Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                  An UUID carries no semantics with respect to the purpose or state of the entity.                  UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                  Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                   Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TapiOamOamcontextOamJob ethLinkTraceJob(TapiEthEthLinkTraceJob ethLinkTraceJob) {
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

  public TapiOamOamcontextOamJob ethProActiveDualEndedMeasurementJob(TapiEthEthProActiveDualEndedMeasurementJob ethProActiveDualEndedMeasurementJob) {
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

  public TapiOamOamcontextOamJob ethProActiveSingleEndedMeasurementJob(TapiEthEthProActiveSingleEndedMeasurementJob ethProActiveSingleEndedMeasurementJob) {
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

  public TapiOamOamcontextOamJob ethTestJob(TapiEthEthTestJob ethTestJob) {
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

  public TapiOamOamcontextOamJob ethOnDemandSingleEndedMeasurementJob(TapiEthEthOnDemandSingleEndedMeasurementJob ethOnDemandSingleEndedMeasurementJob) {
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

  public TapiOamOamcontextOamJob ethLoopbackJob(TapiEthEthLoopbackJob ethLoopbackJob) {
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

  public TapiOamOamcontextOamJob ethOnDemandDualEndedMeasurementJob(TapiEthEthOnDemandDualEndedMeasurementJob ethOnDemandDualEndedMeasurementJob) {
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

  public TapiOamOamcontextOamJob schedule(TapiCommonTimeRange schedule) {
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

  public TapiOamOamcontextOamJob oamProfile(TapiOamOamProfileRef oamProfile) {
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

  public TapiOamOamcontextOamJob creationTime(String creationTime) {
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

  public TapiOamOamcontextOamJob oamJobType(String oamJobType) {
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

  public TapiOamOamcontextOamJob oamServicePoint(List<TapiOamOamServicePointRef> oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
    return this;
  }

  public TapiOamOamcontextOamJob addOamServicePointItem(TapiOamOamServicePointRef oamServicePointItem) {
    if (this.oamServicePoint == null) {
      this.oamServicePoint = new ArrayList<TapiOamOamServicePointRef>();
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

  public TapiOamOamcontextOamJob currentData(List<TapiOamOamjobCurrentData> currentData) {
    this.currentData = currentData;
    return this;
  }

  public TapiOamOamcontextOamJob addCurrentDataItem(TapiOamOamjobCurrentData currentDataItem) {
    if (this.currentData == null) {
      this.currentData = new ArrayList<TapiOamOamjobCurrentData>();
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
  public List<TapiOamOamjobCurrentData> getCurrentData() {
    return currentData;
  }

  public void setCurrentData(List<TapiOamOamjobCurrentData> currentData) {
    this.currentData = currentData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamOamcontextOamJob tapiOamOamcontextOamJob = (TapiOamOamcontextOamJob) o;
    return Objects.equals(this.name, tapiOamOamcontextOamJob.name) &&
        Objects.equals(this.uuid, tapiOamOamcontextOamJob.uuid) &&
        Objects.equals(this.ethLinkTraceJob, tapiOamOamcontextOamJob.ethLinkTraceJob) &&
        Objects.equals(this.ethProActiveDualEndedMeasurementJob, tapiOamOamcontextOamJob.ethProActiveDualEndedMeasurementJob) &&
        Objects.equals(this.ethProActiveSingleEndedMeasurementJob, tapiOamOamcontextOamJob.ethProActiveSingleEndedMeasurementJob) &&
        Objects.equals(this.ethTestJob, tapiOamOamcontextOamJob.ethTestJob) &&
        Objects.equals(this.ethOnDemandSingleEndedMeasurementJob, tapiOamOamcontextOamJob.ethOnDemandSingleEndedMeasurementJob) &&
        Objects.equals(this.ethLoopbackJob, tapiOamOamcontextOamJob.ethLoopbackJob) &&
        Objects.equals(this.ethOnDemandDualEndedMeasurementJob, tapiOamOamcontextOamJob.ethOnDemandDualEndedMeasurementJob) &&
        Objects.equals(this.schedule, tapiOamOamcontextOamJob.schedule) &&
        Objects.equals(this.oamProfile, tapiOamOamcontextOamJob.oamProfile) &&
        Objects.equals(this.creationTime, tapiOamOamcontextOamJob.creationTime) &&
        Objects.equals(this.oamJobType, tapiOamOamcontextOamJob.oamJobType) &&
        Objects.equals(this.oamServicePoint, tapiOamOamcontextOamJob.oamServicePoint) &&
        Objects.equals(this.currentData, tapiOamOamcontextOamJob.currentData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, ethLinkTraceJob, ethProActiveDualEndedMeasurementJob, ethProActiveSingleEndedMeasurementJob, ethTestJob, ethOnDemandSingleEndedMeasurementJob, ethLoopbackJob, ethOnDemandDualEndedMeasurementJob, schedule, oamProfile, creationTime, oamJobType, oamServicePoint, currentData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamOamcontextOamJob {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    ethLinkTraceJob: ").append(toIndentedString(ethLinkTraceJob)).append("\n");
    sb.append("    ethProActiveDualEndedMeasurementJob: ").append(toIndentedString(ethProActiveDualEndedMeasurementJob)).append("\n");
    sb.append("    ethProActiveSingleEndedMeasurementJob: ").append(toIndentedString(ethProActiveSingleEndedMeasurementJob)).append("\n");
    sb.append("    ethTestJob: ").append(toIndentedString(ethTestJob)).append("\n");
    sb.append("    ethOnDemandSingleEndedMeasurementJob: ").append(toIndentedString(ethOnDemandSingleEndedMeasurementJob)).append("\n");
    sb.append("    ethLoopbackJob: ").append(toIndentedString(ethLoopbackJob)).append("\n");
    sb.append("    ethOnDemandDualEndedMeasurementJob: ").append(toIndentedString(ethOnDemandDualEndedMeasurementJob)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    oamProfile: ").append(toIndentedString(oamProfile)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    oamJobType: ").append(toIndentedString(oamJobType)).append("\n");
    sb.append("    oamServicePoint: ").append(toIndentedString(oamServicePoint)).append("\n");
    sb.append("    currentData: ").append(toIndentedString(currentData)).append("\n");
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
