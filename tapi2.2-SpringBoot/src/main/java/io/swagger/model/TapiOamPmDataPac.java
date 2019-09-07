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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamPmDataPac   {
  @JsonProperty("granularity-period")
  private TapiCommonTimePeriod granularityPeriod = null;

  @JsonProperty("suspect-interval-flag")
  private Boolean suspectIntervalFlag = false;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamPmDataPac tapiOamPmDataPac = (TapiOamPmDataPac) o;
    return Objects.equals(this.granularityPeriod, tapiOamPmDataPac.granularityPeriod) &&
        Objects.equals(this.suspectIntervalFlag, tapiOamPmDataPac.suspectIntervalFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularityPeriod, suspectIntervalFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamPmDataPac {\n");
    
    sb.append("    granularityPeriod: ").append(toIndentedString(granularityPeriod)).append("\n");
    sb.append("    suspectIntervalFlag: ").append(toIndentedString(suspectIntervalFlag)).append("\n");
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
