package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonTimeRange;
import io.swagger.model.TapiConnectivityConnectivityServiceRef;
import io.swagger.model.TapiConnectivityServiceType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityConnectivityConstraint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityConnectivityConstraint   {
  @JsonProperty("schedule")
  private TapiCommonTimeRange schedule = null;

  @JsonProperty("requested-capacity")
  private TapiCommonCapacity requestedCapacity = null;

  @JsonProperty("diversity-exclusion")
  @Valid
  private List<TapiConnectivityConnectivityServiceRef> diversityExclusion = null;

  @JsonProperty("service-level")
  private String serviceLevel = null;

  @JsonProperty("service-type")
  private TapiConnectivityServiceType serviceType = null;

  @JsonProperty("coroute-inclusion")
  private TapiConnectivityConnectivityServiceRef corouteInclusion = null;

  public TapiConnectivityConnectivityConstraint schedule(TapiCommonTimeRange schedule) {
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

  public TapiConnectivityConnectivityConstraint requestedCapacity(TapiCommonCapacity requestedCapacity) {
    this.requestedCapacity = requestedCapacity;
    return this;
  }

  /**
   * Get requestedCapacity
   * @return requestedCapacity
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonCapacity getRequestedCapacity() {
    return requestedCapacity;
  }

  public void setRequestedCapacity(TapiCommonCapacity requestedCapacity) {
    this.requestedCapacity = requestedCapacity;
  }

  public TapiConnectivityConnectivityConstraint diversityExclusion(List<TapiConnectivityConnectivityServiceRef> diversityExclusion) {
    this.diversityExclusion = diversityExclusion;
    return this;
  }

  public TapiConnectivityConnectivityConstraint addDiversityExclusionItem(TapiConnectivityConnectivityServiceRef diversityExclusionItem) {
    if (this.diversityExclusion == null) {
      this.diversityExclusion = new ArrayList<TapiConnectivityConnectivityServiceRef>();
    }
    this.diversityExclusion.add(diversityExclusionItem);
    return this;
  }

  /**
   * none
   * @return diversityExclusion
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivityConnectivityServiceRef> getDiversityExclusion() {
    return diversityExclusion;
  }

  public void setDiversityExclusion(List<TapiConnectivityConnectivityServiceRef> diversityExclusion) {
    this.diversityExclusion = diversityExclusion;
  }

  public TapiConnectivityConnectivityConstraint serviceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

  /**
   * An abstract value the meaning of which is mutually agreed – typically represents metrics such as - Class of service, priority, resiliency, availability                  Class of Service Name.
   * @return serviceLevel
  **/
  @ApiModelProperty(value = "An abstract value the meaning of which is mutually agreed – typically represents metrics such as - Class of service, priority, resiliency, availability                  Class of Service Name.")

  public String getServiceLevel() {
    return serviceLevel;
  }

  public void setServiceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  public TapiConnectivityConnectivityConstraint serviceType(TapiConnectivityServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(TapiConnectivityServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public TapiConnectivityConnectivityConstraint corouteInclusion(TapiConnectivityConnectivityServiceRef corouteInclusion) {
    this.corouteInclusion = corouteInclusion;
    return this;
  }

  /**
   * Get corouteInclusion
   * @return corouteInclusion
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityConnectivityServiceRef getCorouteInclusion() {
    return corouteInclusion;
  }

  public void setCorouteInclusion(TapiConnectivityConnectivityServiceRef corouteInclusion) {
    this.corouteInclusion = corouteInclusion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityConnectivityConstraint tapiConnectivityConnectivityConstraint = (TapiConnectivityConnectivityConstraint) o;
    return Objects.equals(this.schedule, tapiConnectivityConnectivityConstraint.schedule) &&
        Objects.equals(this.requestedCapacity, tapiConnectivityConnectivityConstraint.requestedCapacity) &&
        Objects.equals(this.diversityExclusion, tapiConnectivityConnectivityConstraint.diversityExclusion) &&
        Objects.equals(this.serviceLevel, tapiConnectivityConnectivityConstraint.serviceLevel) &&
        Objects.equals(this.serviceType, tapiConnectivityConnectivityConstraint.serviceType) &&
        Objects.equals(this.corouteInclusion, tapiConnectivityConnectivityConstraint.corouteInclusion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule, requestedCapacity, diversityExclusion, serviceLevel, serviceType, corouteInclusion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityConnectivityConstraint {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    requestedCapacity: ").append(toIndentedString(requestedCapacity)).append("\n");
    sb.append("    diversityExclusion: ").append(toIndentedString(diversityExclusion)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    corouteInclusion: ").append(toIndentedString(corouteInclusion)).append("\n");
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
