package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamPerceivedSeverityType;
import io.swagger.model.TapiOamServiceAffecting;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamAlarmInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamAlarmInfo   {
  @JsonProperty("perceived-severity")
  private TapiOamPerceivedSeverityType perceivedSeverity = null;

  @JsonProperty("probable-cause")
  private String probableCause = null;

  @JsonProperty("service-affecting")
  private TapiOamServiceAffecting serviceAffecting = null;

  @JsonProperty("is-transient")
  private Boolean isTransient = false;

  public TapiOamAlarmInfo perceivedSeverity(TapiOamPerceivedSeverityType perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
    return this;
  }

  /**
   * Get perceivedSeverity
   * @return perceivedSeverity
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamPerceivedSeverityType getPerceivedSeverity() {
    return perceivedSeverity;
  }

  public void setPerceivedSeverity(TapiOamPerceivedSeverityType perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
  }

  public TapiOamAlarmInfo probableCause(String probableCause) {
    this.probableCause = probableCause;
    return this;
  }

  /**
   * none
   * @return probableCause
  **/
  @ApiModelProperty(value = "none")

  public String getProbableCause() {
    return probableCause;
  }

  public void setProbableCause(String probableCause) {
    this.probableCause = probableCause;
  }

  public TapiOamAlarmInfo serviceAffecting(TapiOamServiceAffecting serviceAffecting) {
    this.serviceAffecting = serviceAffecting;
    return this;
  }

  /**
   * Get serviceAffecting
   * @return serviceAffecting
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamServiceAffecting getServiceAffecting() {
    return serviceAffecting;
  }

  public void setServiceAffecting(TapiOamServiceAffecting serviceAffecting) {
    this.serviceAffecting = serviceAffecting;
  }

  public TapiOamAlarmInfo isTransient(Boolean isTransient) {
    this.isTransient = isTransient;
    return this;
  }

  /**
   * none
   * @return isTransient
  **/
  @ApiModelProperty(value = "none")

  public Boolean isIsTransient() {
    return isTransient;
  }

  public void setIsTransient(Boolean isTransient) {
    this.isTransient = isTransient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamAlarmInfo tapiOamAlarmInfo = (TapiOamAlarmInfo) o;
    return Objects.equals(this.perceivedSeverity, tapiOamAlarmInfo.perceivedSeverity) &&
        Objects.equals(this.probableCause, tapiOamAlarmInfo.probableCause) &&
        Objects.equals(this.serviceAffecting, tapiOamAlarmInfo.serviceAffecting) &&
        Objects.equals(this.isTransient, tapiOamAlarmInfo.isTransient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perceivedSeverity, probableCause, serviceAffecting, isTransient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamAlarmInfo {\n");
    
    sb.append("    perceivedSeverity: ").append(toIndentedString(perceivedSeverity)).append("\n");
    sb.append("    probableCause: ").append(toIndentedString(probableCause)).append("\n");
    sb.append("    serviceAffecting: ").append(toIndentedString(serviceAffecting)).append("\n");
    sb.append("    isTransient: ").append(toIndentedString(isTransient)).append("\n");
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
