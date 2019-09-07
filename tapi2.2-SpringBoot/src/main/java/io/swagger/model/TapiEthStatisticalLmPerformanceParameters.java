package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthStatisticalLmPerformanceParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthStatisticalLmPerformanceParameters   {
  @JsonProperty("average-frame-loss-ratio")
  private String averageFrameLossRatio = null;

  @JsonProperty("hli-count")
  private Integer hliCount = null;

  @JsonProperty("maximum-frame-loss-ratio")
  private String maximumFrameLossRatio = null;

  @JsonProperty("minimum-frame-loss-ratio")
  private String minimumFrameLossRatio = null;

  @JsonProperty("unavailable-intervals")
  private Integer unavailableIntervals = null;

  public TapiEthStatisticalLmPerformanceParameters averageFrameLossRatio(String averageFrameLossRatio) {
    this.averageFrameLossRatio = averageFrameLossRatio;
    return this;
  }

  /**
   * This attribute contains the average frame loss ratio calculated over a period of time.
   * @return averageFrameLossRatio
  **/
  @ApiModelProperty(value = "This attribute contains the average frame loss ratio calculated over a period of time.")

  public String getAverageFrameLossRatio() {
    return averageFrameLossRatio;
  }

  public void setAverageFrameLossRatio(String averageFrameLossRatio) {
    this.averageFrameLossRatio = averageFrameLossRatio;
  }

  public TapiEthStatisticalLmPerformanceParameters hliCount(Integer hliCount) {
    this.hliCount = hliCount;
    return this;
  }

  /**
   * A generalized SES.                  MEF 10.3: The Resiliency attributes are similar to the definitions of Severely Errored Seconds (SES) and Consecutive SES in section 9 and Annex B (respectively) of Y.1563 [6], when delta-t = 1 second.                  MEF 35.1: Count of High Loss Intervals during the Measurement Interval.                  range of type : 0..900 for 15min interval or 0..86400 for 24 hr interval.
   * @return hliCount
  **/
  @ApiModelProperty(value = "A generalized SES.                  MEF 10.3: The Resiliency attributes are similar to the definitions of Severely Errored Seconds (SES) and Consecutive SES in section 9 and Annex B (respectively) of Y.1563 [6], when delta-t = 1 second.                  MEF 35.1: Count of High Loss Intervals during the Measurement Interval.                  range of type : 0..900 for 15min interval or 0..86400 for 24 hr interval.")

  public Integer getHliCount() {
    return hliCount;
  }

  public void setHliCount(Integer hliCount) {
    this.hliCount = hliCount;
  }

  public TapiEthStatisticalLmPerformanceParameters maximumFrameLossRatio(String maximumFrameLossRatio) {
    this.maximumFrameLossRatio = maximumFrameLossRatio;
    return this;
  }

  /**
   * This attribute contains the maximum frame loss ratio calculated over a period of time.
   * @return maximumFrameLossRatio
  **/
  @ApiModelProperty(value = "This attribute contains the maximum frame loss ratio calculated over a period of time.")

  public String getMaximumFrameLossRatio() {
    return maximumFrameLossRatio;
  }

  public void setMaximumFrameLossRatio(String maximumFrameLossRatio) {
    this.maximumFrameLossRatio = maximumFrameLossRatio;
  }

  public TapiEthStatisticalLmPerformanceParameters minimumFrameLossRatio(String minimumFrameLossRatio) {
    this.minimumFrameLossRatio = minimumFrameLossRatio;
    return this;
  }

  /**
   * This attribute contains the minimum frame loss ratio calculated over a period of time.
   * @return minimumFrameLossRatio
  **/
  @ApiModelProperty(value = "This attribute contains the minimum frame loss ratio calculated over a period of time.")

  public String getMinimumFrameLossRatio() {
    return minimumFrameLossRatio;
  }

  public void setMinimumFrameLossRatio(String minimumFrameLossRatio) {
    this.minimumFrameLossRatio = minimumFrameLossRatio;
  }

  public TapiEthStatisticalLmPerformanceParameters unavailableIntervals(Integer unavailableIntervals) {
    this.unavailableIntervals = unavailableIntervals;
    return this;
  }

  /**
   * A generalized UAS.                  MEF 35.1: A 32-bit counter reflecting the number of delta-t intervals evaluated as Unavailable (i.e., for which A<Controller, Responder>(delta-t) = 0).                  range of type : 0..900 for 15min interval or 0..86400 for 24 hr interval.
   * @return unavailableIntervals
  **/
  @ApiModelProperty(value = "A generalized UAS.                  MEF 35.1: A 32-bit counter reflecting the number of delta-t intervals evaluated as Unavailable (i.e., for which A<Controller, Responder>(delta-t) = 0).                  range of type : 0..900 for 15min interval or 0..86400 for 24 hr interval.")

  public Integer getUnavailableIntervals() {
    return unavailableIntervals;
  }

  public void setUnavailableIntervals(Integer unavailableIntervals) {
    this.unavailableIntervals = unavailableIntervals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthStatisticalLmPerformanceParameters tapiEthStatisticalLmPerformanceParameters = (TapiEthStatisticalLmPerformanceParameters) o;
    return Objects.equals(this.averageFrameLossRatio, tapiEthStatisticalLmPerformanceParameters.averageFrameLossRatio) &&
        Objects.equals(this.hliCount, tapiEthStatisticalLmPerformanceParameters.hliCount) &&
        Objects.equals(this.maximumFrameLossRatio, tapiEthStatisticalLmPerformanceParameters.maximumFrameLossRatio) &&
        Objects.equals(this.minimumFrameLossRatio, tapiEthStatisticalLmPerformanceParameters.minimumFrameLossRatio) &&
        Objects.equals(this.unavailableIntervals, tapiEthStatisticalLmPerformanceParameters.unavailableIntervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageFrameLossRatio, hliCount, maximumFrameLossRatio, minimumFrameLossRatio, unavailableIntervals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthStatisticalLmPerformanceParameters {\n");
    
    sb.append("    averageFrameLossRatio: ").append(toIndentedString(averageFrameLossRatio)).append("\n");
    sb.append("    hliCount: ").append(toIndentedString(hliCount)).append("\n");
    sb.append("    maximumFrameLossRatio: ").append(toIndentedString(maximumFrameLossRatio)).append("\n");
    sb.append("    minimumFrameLossRatio: ").append(toIndentedString(minimumFrameLossRatio)).append("\n");
    sb.append("    unavailableIntervals: ").append(toIndentedString(unavailableIntervals)).append("\n");
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
