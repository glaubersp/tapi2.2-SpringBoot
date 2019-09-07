package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonTimeRange;
import io.swagger.model.TapiEthEthLinkTraceJob;
import io.swagger.model.TapiEthEthLoopbackJob;
import io.swagger.model.TapiEthEthOnDemandDualEndedMeasurementJob;
import io.swagger.model.TapiEthEthOnDemandSingleEndedMeasurementJob;
import io.swagger.model.TapiEthEthProActiveDualEndedMeasurementJob;
import io.swagger.model.TapiEthEthProActiveSingleEndedMeasurementJob;
import io.swagger.model.TapiEthEthTestJob;
import io.swagger.model.TapiEthInputAugmentation2;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamUpdateoamjobInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamUpdateoamjobInput extends TapiEthInputAugmentation2  {
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

  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("oam-profile-id")
  private String oamProfileId = null;

  @JsonProperty("schedule")
  private TapiCommonTimeRange schedule = null;

  @JsonProperty("state")
  private TapiCommonAdministrativeState state = null;

  @JsonProperty("uuid")
  private String uuid = null;

  public TapiOamUpdateoamjobInput ethLoopbackJob(TapiEthEthLoopbackJob ethLoopbackJob) {
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

  public TapiOamUpdateoamjobInput ethOnDemandDualEndedMeasurementJob(TapiEthEthOnDemandDualEndedMeasurementJob ethOnDemandDualEndedMeasurementJob) {
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

  public TapiOamUpdateoamjobInput ethOnDemandSingleEndedMeasurementJob(TapiEthEthOnDemandSingleEndedMeasurementJob ethOnDemandSingleEndedMeasurementJob) {
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

  public TapiOamUpdateoamjobInput ethProActiveDualEndedMeasurementJob(TapiEthEthProActiveDualEndedMeasurementJob ethProActiveDualEndedMeasurementJob) {
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

  public TapiOamUpdateoamjobInput ethProActiveSingleEndedMeasurementJob(TapiEthEthProActiveSingleEndedMeasurementJob ethProActiveSingleEndedMeasurementJob) {
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

  public TapiOamUpdateoamjobInput ethTestJob(TapiEthEthTestJob ethTestJob) {
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

  public TapiOamUpdateoamjobInput name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamUpdateoamjobInput addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. This value is unique in some namespace but may change during the life of the entity.                      A name carries no semantics with respect to the purpose of the entity.
   * @return name
  **/
  @ApiModelProperty(value = "List of names. This value is unique in some namespace but may change during the life of the entity.                      A name carries no semantics with respect to the purpose of the entity.")
  @Valid
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiOamUpdateoamjobInput oamProfileId(String oamProfileId) {
    this.oamProfileId = oamProfileId;
    return this;
  }

  /**
   * UUID of the OamProfile to be applied: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return oamProfileId
  **/
  @ApiModelProperty(value = "UUID of the OamProfile to be applied: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")

  public String getOamProfileId() {
    return oamProfileId;
  }

  public void setOamProfileId(String oamProfileId) {
    this.oamProfileId = oamProfileId;
  }

  public TapiOamUpdateoamjobInput schedule(TapiCommonTimeRange schedule) {
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

  public TapiOamUpdateoamjobInput state(TapiCommonAdministrativeState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonAdministrativeState getState() {
    return state;
  }

  public void setState(TapiCommonAdministrativeState state) {
    this.state = state;
  }

  public TapiOamUpdateoamjobInput uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamUpdateoamjobInput tapiOamUpdateoamjobInput = (TapiOamUpdateoamjobInput) o;
    return Objects.equals(this.ethLoopbackJob, tapiOamUpdateoamjobInput.ethLoopbackJob) &&
        Objects.equals(this.ethOnDemandDualEndedMeasurementJob, tapiOamUpdateoamjobInput.ethOnDemandDualEndedMeasurementJob) &&
        Objects.equals(this.ethOnDemandSingleEndedMeasurementJob, tapiOamUpdateoamjobInput.ethOnDemandSingleEndedMeasurementJob) &&
        Objects.equals(this.ethProActiveDualEndedMeasurementJob, tapiOamUpdateoamjobInput.ethProActiveDualEndedMeasurementJob) &&
        Objects.equals(this.ethProActiveSingleEndedMeasurementJob, tapiOamUpdateoamjobInput.ethProActiveSingleEndedMeasurementJob) &&
        Objects.equals(this.ethTestJob, tapiOamUpdateoamjobInput.ethTestJob) &&
        Objects.equals(this.name, tapiOamUpdateoamjobInput.name) &&
        Objects.equals(this.oamProfileId, tapiOamUpdateoamjobInput.oamProfileId) &&
        Objects.equals(this.schedule, tapiOamUpdateoamjobInput.schedule) &&
        Objects.equals(this.state, tapiOamUpdateoamjobInput.state) &&
        Objects.equals(this.uuid, tapiOamUpdateoamjobInput.uuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethLoopbackJob, ethOnDemandDualEndedMeasurementJob, ethOnDemandSingleEndedMeasurementJob, ethProActiveDualEndedMeasurementJob, ethProActiveSingleEndedMeasurementJob, ethTestJob, name, oamProfileId, schedule, state, uuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamUpdateoamjobInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ethLoopbackJob: ").append(toIndentedString(ethLoopbackJob)).append("\n");
    sb.append("    ethOnDemandDualEndedMeasurementJob: ").append(toIndentedString(ethOnDemandDualEndedMeasurementJob)).append("\n");
    sb.append("    ethOnDemandSingleEndedMeasurementJob: ").append(toIndentedString(ethOnDemandSingleEndedMeasurementJob)).append("\n");
    sb.append("    ethProActiveDualEndedMeasurementJob: ").append(toIndentedString(ethProActiveDualEndedMeasurementJob)).append("\n");
    sb.append("    ethProActiveSingleEndedMeasurementJob: ").append(toIndentedString(ethProActiveSingleEndedMeasurementJob)).append("\n");
    sb.append("    ethTestJob: ").append(toIndentedString(ethTestJob)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oamProfileId: ").append(toIndentedString(oamProfileId)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
