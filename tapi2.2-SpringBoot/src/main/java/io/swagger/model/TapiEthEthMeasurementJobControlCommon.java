package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthRepetitionPeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthMeasurementJobControlCommon
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthMeasurementJobControlCommon   {
  @JsonProperty("flr-availability-delta-time")
  private Integer flrAvailabilityDeltaTime = 1;

  @JsonProperty("time-of-the-day-alignment")
  private Boolean timeOfTheDayAlignment = true;

  @JsonProperty("test-identifier")
  private Integer testIdentifier = null;

  @JsonProperty("repetition-period")
  private TapiEthRepetitionPeriod repetitionPeriod = null;

  @JsonProperty("offset-from-time-of-the-day")
  private Integer offsetFromTimeOfTheDay = null;

  @JsonProperty("flr-availability-threshold")
  private String flrAvailabilityThreshold = "0.1";

  @JsonProperty("priority")
  private Integer priority = 7;

  @JsonProperty("flr-availability-samples")
  private Integer flrAvailabilitySamples = 10;

  @JsonProperty("message-period")
  private Integer messagePeriod = 1000;

  @JsonProperty("measurement-interval")
  private Integer measurementInterval = null;

  public TapiEthEthMeasurementJobControlCommon flrAvailabilityDeltaTime(Integer flrAvailabilityDeltaTime) {
    this.flrAvailabilityDeltaTime = flrAvailabilityDeltaTime;
    return this;
  }

  /**
   * Time length over which each Availability Frame Loss Ratio value is calculated.                  MEF 35.1:                  [R78]/[CR58] [O8] A SOAM PM Implementation MUST support a configurable parameter for the length of time over which each Availability flr value is calculated, with a range of 1s – 300s.  This parameter is equivalent to delta-t as specified by MEF 10.3.                  [R79]/[CR59] [O8] The length of time over which each Availability flr value is calculated (delta-t) MUST be an integer multiple of the interval between each SLM/1SL frame transmission.                  [D31]/[CD16] [O8] The default length of time over which each Availability flr value is calculated SHOULD be 1s.
   * @return flrAvailabilityDeltaTime
  **/
  @ApiModelProperty(value = "Time length over which each Availability Frame Loss Ratio value is calculated.                  MEF 35.1:                  [R78]/[CR58] [O8] A SOAM PM Implementation MUST support a configurable parameter for the length of time over which each Availability flr value is calculated, with a range of 1s – 300s.  This parameter is equivalent to delta-t as specified by MEF 10.3.                  [R79]/[CR59] [O8] The length of time over which each Availability flr value is calculated (delta-t) MUST be an integer multiple of the interval between each SLM/1SL frame transmission.                  [D31]/[CD16] [O8] The default length of time over which each Availability flr value is calculated SHOULD be 1s.")

  public Integer getFlrAvailabilityDeltaTime() {
    return flrAvailabilityDeltaTime;
  }

  public void setFlrAvailabilityDeltaTime(Integer flrAvailabilityDeltaTime) {
    this.flrAvailabilityDeltaTime = flrAvailabilityDeltaTime;
  }

  public TapiEthEthMeasurementJobControlCommon timeOfTheDayAlignment(Boolean timeOfTheDayAlignment) {
    this.timeOfTheDayAlignment = timeOfTheDayAlignment;
    return this;
  }

  /**
   * MEF 35.1:                  [D7] A SOAM PM Implementation SHOULD allow for no alignment to the time-of-day clock.
   * @return timeOfTheDayAlignment
  **/
  @ApiModelProperty(value = "MEF 35.1:                  [D7] A SOAM PM Implementation SHOULD allow for no alignment to the time-of-day clock.")

  public Boolean isTimeOfTheDayAlignment() {
    return timeOfTheDayAlignment;
  }

  public void setTimeOfTheDayAlignment(Boolean timeOfTheDayAlignment) {
    this.timeOfTheDayAlignment = timeOfTheDayAlignment;
  }

  public TapiEthEthMeasurementJobControlCommon testIdentifier(Integer testIdentifier) {
    this.testIdentifier = testIdentifier;
    return this;
  }

  /**
   * This attribute is used to distinguish each measurement session if multiple measurement sessions are simultaneously activated towards a peer MEP including concurrent on-demand and proactive tests.                  It must be unique at least within the context of any measurement type for the MEG and initiating MEP.                  Note: The attribute is not used in case of 2-way loss measurement.                  range of type : 0..(2^32) - 1
   * @return testIdentifier
  **/
  @ApiModelProperty(value = "This attribute is used to distinguish each measurement session if multiple measurement sessions are simultaneously activated towards a peer MEP including concurrent on-demand and proactive tests.                  It must be unique at least within the context of any measurement type for the MEG and initiating MEP.                  Note: The attribute is not used in case of 2-way loss measurement.                  range of type : 0..(2^32) - 1")

  public Integer getTestIdentifier() {
    return testIdentifier;
  }

  public void setTestIdentifier(Integer testIdentifier) {
    this.testIdentifier = testIdentifier;
  }

  public TapiEthEthMeasurementJobControlCommon repetitionPeriod(TapiEthRepetitionPeriod repetitionPeriod) {
    this.repetitionPeriod = repetitionPeriod;
    return this;
  }

  /**
   * Get repetitionPeriod
   * @return repetitionPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthRepetitionPeriod getRepetitionPeriod() {
    return repetitionPeriod;
  }

  public void setRepetitionPeriod(TapiEthRepetitionPeriod repetitionPeriod) {
    this.repetitionPeriod = repetitionPeriod;
  }

  public TapiEthEthMeasurementJobControlCommon offsetFromTimeOfTheDay(Integer offsetFromTimeOfTheDay) {
    this.offsetFromTimeOfTheDay = offsetFromTimeOfTheDay;
    return this;
  }

  /**
   * MEF 35.1:                  [D8] A SOAM PM Implementation SHOULD support a configurable (in minutes) offset from ToD time for alignment of the start of Measurement Intervals other than the first Measurement Interval.
   * @return offsetFromTimeOfTheDay
  **/
  @ApiModelProperty(value = "MEF 35.1:                  [D8] A SOAM PM Implementation SHOULD support a configurable (in minutes) offset from ToD time for alignment of the start of Measurement Intervals other than the first Measurement Interval.")

  public Integer getOffsetFromTimeOfTheDay() {
    return offsetFromTimeOfTheDay;
  }

  public void setOffsetFromTimeOfTheDay(Integer offsetFromTimeOfTheDay) {
    this.offsetFromTimeOfTheDay = offsetFromTimeOfTheDay;
  }

  public TapiEthEthMeasurementJobControlCommon flrAvailabilityThreshold(String flrAvailabilityThreshold) {
    this.flrAvailabilityThreshold = flrAvailabilityThreshold;
    return this;
  }

  /**
   * Frame loss ratio threshold to be used in evaluating the Available/Unavailable state of each time interval (as specified by Availability Delta Time).                  MEF 35.1:                  [R81]/[CR61] A SOAM PM Implementation MUST support a configurable Availability frame loss ratio threshold to be used in evaluating the Available/Unavailable state of each delta-t interval per MEF 10.3                  [R82]/[CR62] The Availability frame loss ratio threshold range of 0.00 through 1.00 MUST be supported in increments of 0.01.                  [D33]/[CD18] [O8] The default Availability frame loss ratio threshold SHOULD be 0.1.
   * @return flrAvailabilityThreshold
  **/
  @ApiModelProperty(value = "Frame loss ratio threshold to be used in evaluating the Available/Unavailable state of each time interval (as specified by Availability Delta Time).                  MEF 35.1:                  [R81]/[CR61] A SOAM PM Implementation MUST support a configurable Availability frame loss ratio threshold to be used in evaluating the Available/Unavailable state of each delta-t interval per MEF 10.3                  [R82]/[CR62] The Availability frame loss ratio threshold range of 0.00 through 1.00 MUST be supported in increments of 0.01.                  [D33]/[CD18] [O8] The default Availability frame loss ratio threshold SHOULD be 0.1.")

  public String getFlrAvailabilityThreshold() {
    return flrAvailabilityThreshold;
  }

  public void setFlrAvailabilityThreshold(String flrAvailabilityThreshold) {
    this.flrAvailabilityThreshold = flrAvailabilityThreshold;
  }

  public TapiEthEthMeasurementJobControlCommon priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * This attribute contains the priority value on which the MEP performs the measurement.                  When the measurement is enabled, the MEP should use this value to encode the priority of generated measurement frames (OAM PDU frames.).                  The EMF usese this value to assign the P parameter of the measurement operation.
   * @return priority
  **/
  @ApiModelProperty(value = "This attribute contains the priority value on which the MEP performs the measurement.                  When the measurement is enabled, the MEP should use this value to encode the priority of generated measurement frames (OAM PDU frames.).                  The EMF usese this value to assign the P parameter of the measurement operation.")

  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TapiEthEthMeasurementJobControlCommon flrAvailabilitySamples(Integer flrAvailabilitySamples) {
    this.flrAvailabilitySamples = flrAvailabilitySamples;
    return this;
  }

  /**
   * Number of consecutive Availability Frame Loss Ratio measurements to be used to determine Available/Unavailable state transitions.                  MEF 35.1:                  [R80]/[CR60] [O8] The number range of 1 through 10 MUST be supported for the configurable number of consecutive Availability flr measurements to be used to determine Available/Unavailable state transitions.                  This parameter is equivalent to the Availability parameter of n as specified by MEF 10.3.                  [D32]/[CD17] [O8] The default number of n for Availability SHOULD be 10.
   * @return flrAvailabilitySamples
  **/
  @ApiModelProperty(value = "Number of consecutive Availability Frame Loss Ratio measurements to be used to determine Available/Unavailable state transitions.                  MEF 35.1:                  [R80]/[CR60] [O8] The number range of 1 through 10 MUST be supported for the configurable number of consecutive Availability flr measurements to be used to determine Available/Unavailable state transitions.                  This parameter is equivalent to the Availability parameter of n as specified by MEF 10.3.                  [D32]/[CD17] [O8] The default number of n for Availability SHOULD be 10.")

  public Integer getFlrAvailabilitySamples() {
    return flrAvailabilitySamples;
  }

  public void setFlrAvailabilitySamples(Integer flrAvailabilitySamples) {
    this.flrAvailabilitySamples = flrAvailabilitySamples;
  }

  public TapiEthEthMeasurementJobControlCommon messagePeriod(Integer messagePeriod) {
    this.messagePeriod = messagePeriod;
    return this;
  }

  /**
   * This attribute indicates the period (frequency) of the measurement frame transmission.                  Note that the value 0 means that only one OAM message per measurement interval is generated.                  Unit is milliseconds.                  range of type : 100ms, 1s, 10s
   * @return messagePeriod
  **/
  @ApiModelProperty(value = "This attribute indicates the period (frequency) of the measurement frame transmission.                  Note that the value 0 means that only one OAM message per measurement interval is generated.                  Unit is milliseconds.                  range of type : 100ms, 1s, 10s")

  public Integer getMessagePeriod() {
    return messagePeriod;
  }

  public void setMessagePeriod(Integer messagePeriod) {
    this.messagePeriod = messagePeriod;
  }

  public TapiEthEthMeasurementJobControlCommon measurementInterval(Integer measurementInterval) {
    this.measurementInterval = measurementInterval;
    return this;
  }

  /**
   * This attribute contains the discrete non overlapping periods of time (in seconds) during which measurements are performed                  (i.e., OAM messages are generated) and reports are gathered at the end of the measurement intervals.                  Note that the value 0 means a degenerated measurement interval with a single OAM message and the report is sent as immediately as possible.
   * @return measurementInterval
  **/
  @ApiModelProperty(value = "This attribute contains the discrete non overlapping periods of time (in seconds) during which measurements are performed                  (i.e., OAM messages are generated) and reports are gathered at the end of the measurement intervals.                  Note that the value 0 means a degenerated measurement interval with a single OAM message and the report is sent as immediately as possible.")

  public Integer getMeasurementInterval() {
    return measurementInterval;
  }

  public void setMeasurementInterval(Integer measurementInterval) {
    this.measurementInterval = measurementInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthMeasurementJobControlCommon tapiEthEthMeasurementJobControlCommon = (TapiEthEthMeasurementJobControlCommon) o;
    return Objects.equals(this.flrAvailabilityDeltaTime, tapiEthEthMeasurementJobControlCommon.flrAvailabilityDeltaTime) &&
        Objects.equals(this.timeOfTheDayAlignment, tapiEthEthMeasurementJobControlCommon.timeOfTheDayAlignment) &&
        Objects.equals(this.testIdentifier, tapiEthEthMeasurementJobControlCommon.testIdentifier) &&
        Objects.equals(this.repetitionPeriod, tapiEthEthMeasurementJobControlCommon.repetitionPeriod) &&
        Objects.equals(this.offsetFromTimeOfTheDay, tapiEthEthMeasurementJobControlCommon.offsetFromTimeOfTheDay) &&
        Objects.equals(this.flrAvailabilityThreshold, tapiEthEthMeasurementJobControlCommon.flrAvailabilityThreshold) &&
        Objects.equals(this.priority, tapiEthEthMeasurementJobControlCommon.priority) &&
        Objects.equals(this.flrAvailabilitySamples, tapiEthEthMeasurementJobControlCommon.flrAvailabilitySamples) &&
        Objects.equals(this.messagePeriod, tapiEthEthMeasurementJobControlCommon.messagePeriod) &&
        Objects.equals(this.measurementInterval, tapiEthEthMeasurementJobControlCommon.measurementInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flrAvailabilityDeltaTime, timeOfTheDayAlignment, testIdentifier, repetitionPeriod, offsetFromTimeOfTheDay, flrAvailabilityThreshold, priority, flrAvailabilitySamples, messagePeriod, measurementInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthMeasurementJobControlCommon {\n");
    
    sb.append("    flrAvailabilityDeltaTime: ").append(toIndentedString(flrAvailabilityDeltaTime)).append("\n");
    sb.append("    timeOfTheDayAlignment: ").append(toIndentedString(timeOfTheDayAlignment)).append("\n");
    sb.append("    testIdentifier: ").append(toIndentedString(testIdentifier)).append("\n");
    sb.append("    repetitionPeriod: ").append(toIndentedString(repetitionPeriod)).append("\n");
    sb.append("    offsetFromTimeOfTheDay: ").append(toIndentedString(offsetFromTimeOfTheDay)).append("\n");
    sb.append("    flrAvailabilityThreshold: ").append(toIndentedString(flrAvailabilityThreshold)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    flrAvailabilitySamples: ").append(toIndentedString(flrAvailabilitySamples)).append("\n");
    sb.append("    messagePeriod: ").append(toIndentedString(messagePeriod)).append("\n");
    sb.append("    measurementInterval: ").append(toIndentedString(measurementInterval)).append("\n");
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
