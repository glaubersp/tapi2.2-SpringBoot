package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonTimePeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamPmDataPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamPmDataPac   {
  @JsonProperty("suspect-interval-flag")
  private Boolean suspectIntervalFlag = false;

  @JsonProperty("granularity-period")
  private TapiCommonTimePeriod granularityPeriod = null;

  public TapiOamPmDataPac suspectIntervalFlag(Boolean suspectIntervalFlag) {
    this.suspectIntervalFlag = suspectIntervalFlag;
    return this;
  }

  /**
   * This attribute is used to indicate that the performance data for the current period may not be reliable. Some reasons for this to occur are:                  – Suspect data were detected by the actual resource doing data collection.                  – Transition of the administrativeState attribute to/from the 'lock' state.                  – Transition of the operationalState to/from the 'disabled' state.                  – Scheduler setting that inhibits the collection function.                  – The performance counters were reset during the interval.                  – The currentData (or subclass) object instance was created during the monitoring period.
   * @return suspectIntervalFlag
  **/
  @ApiModelProperty(value = "This attribute is used to indicate that the performance data for the current period may not be reliable. Some reasons for this to occur are:                  – Suspect data were detected by the actual resource doing data collection.                  – Transition of the administrativeState attribute to/from the 'lock' state.                  – Transition of the operationalState to/from the 'disabled' state.                  – Scheduler setting that inhibits the collection function.                  – The performance counters were reset during the interval.                  – The currentData (or subclass) object instance was created during the monitoring period.")

  public Boolean isSuspectIntervalFlag() {
    return suspectIntervalFlag;
  }

  public void setSuspectIntervalFlag(Boolean suspectIntervalFlag) {
    this.suspectIntervalFlag = suspectIntervalFlag;
  }

  public TapiOamPmDataPac granularityPeriod(TapiCommonTimePeriod granularityPeriod) {
    this.granularityPeriod = granularityPeriod;
    return this;
  }

  /**
   * Get granularityPeriod
   * @return granularityPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonTimePeriod getGranularityPeriod() {
    return granularityPeriod;
  }

  public void setGranularityPeriod(TapiCommonTimePeriod granularityPeriod) {
    this.granularityPeriod = granularityPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamPmDataPac tapiOamPmDataPac = (TapiOamPmDataPac) o;
    return Objects.equals(this.suspectIntervalFlag, tapiOamPmDataPac.suspectIntervalFlag) &&
        Objects.equals(this.granularityPeriod, tapiOamPmDataPac.granularityPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suspectIntervalFlag, granularityPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamPmDataPac {\n");
    
    sb.append("    suspectIntervalFlag: ").append(toIndentedString(suspectIntervalFlag)).append("\n");
    sb.append("    granularityPeriod: ").append(toIndentedString(granularityPeriod)).append("\n");
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
