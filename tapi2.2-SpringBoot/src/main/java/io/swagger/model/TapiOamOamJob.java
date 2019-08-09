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
import io.swagger.model.TapiOamCurrentData;
import io.swagger.model.TapiOamOamProfileRef;
import io.swagger.model.TapiOamOamServicePointRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamOamJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamOamJob extends TapiCommonAdminStatePac  {
  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

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
  private List<TapiOamCurrentData> currentData = null;

  public TapiOamOamJob name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamOamJob addNameItem(TapiCommonNameAndValue nameItem) {
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

  public TapiOamOamJob uuid(String uuid) {
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

  public TapiOamOamJob schedule(TapiCommonTimeRange schedule) {
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

  public TapiOamOamJob oamProfile(TapiOamOamProfileRef oamProfile) {
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

  public TapiOamOamJob creationTime(String creationTime) {
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

  public TapiOamOamJob oamJobType(String oamJobType) {
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

  public TapiOamOamJob oamServicePoint(List<TapiOamOamServicePointRef> oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
    return this;
  }

  public TapiOamOamJob addOamServicePointItem(TapiOamOamServicePointRef oamServicePointItem) {
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

  public TapiOamOamJob currentData(List<TapiOamCurrentData> currentData) {
    this.currentData = currentData;
    return this;
  }

  public TapiOamOamJob addCurrentDataItem(TapiOamCurrentData currentDataItem) {
    if (this.currentData == null) {
      this.currentData = new ArrayList<TapiOamCurrentData>();
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamOamJob tapiOamOamJob = (TapiOamOamJob) o;
    return Objects.equals(this.name, tapiOamOamJob.name) &&
        Objects.equals(this.uuid, tapiOamOamJob.uuid) &&
        Objects.equals(this.schedule, tapiOamOamJob.schedule) &&
        Objects.equals(this.oamProfile, tapiOamOamJob.oamProfile) &&
        Objects.equals(this.creationTime, tapiOamOamJob.creationTime) &&
        Objects.equals(this.oamJobType, tapiOamOamJob.oamJobType) &&
        Objects.equals(this.oamServicePoint, tapiOamOamJob.oamServicePoint) &&
        Objects.equals(this.currentData, tapiOamOamJob.currentData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, schedule, oamProfile, creationTime, oamJobType, oamServicePoint, currentData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamOamJob {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
