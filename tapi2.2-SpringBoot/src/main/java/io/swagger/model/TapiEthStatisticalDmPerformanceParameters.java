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
 * TapiEthStatisticalDmPerformanceParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthStatisticalDmPerformanceParameters   {
  @JsonProperty("average-frame-delay")
  private Integer averageFrameDelay = null;

  @JsonProperty("average-frame-delay-variation")
  private Integer averageFrameDelayVariation = null;

  @JsonProperty("average-inter-frame-delay-variation")
  private Integer averageInterFrameDelayVariation = null;

  @JsonProperty("maximum-frame-delay")
  private Integer maximumFrameDelay = null;

  @JsonProperty("maximum-frame-delay-variation")
  private Integer maximumFrameDelayVariation = null;

  @JsonProperty("maximum-inter-frame-delay-variation")
  private Integer maximumInterFrameDelayVariation = null;

  @JsonProperty("minimum-frame-delay")
  private Integer minimumFrameDelay = null;

  @JsonProperty("minimum-frame-delay-variation")
  private Integer minimumFrameDelayVariation = null;

  @JsonProperty("minimum-inter-frame-delay-variation")
  private Integer minimumInterFrameDelayVariation = null;

  public TapiEthStatisticalDmPerformanceParameters averageFrameDelay(Integer averageFrameDelay) {
    this.averageFrameDelay = averageFrameDelay;
    return this;
  }

  /**
   * This attribute contains the average frame delay observed over the monitored period. It is measured in units of ns (nano second, 1x10e-9 seconds).
   * @return averageFrameDelay
  **/
  @ApiModelProperty(value = "This attribute contains the average frame delay observed over the monitored period. It is measured in units of ns (nano second, 1x10e-9 seconds).")

  public Integer getAverageFrameDelay() {
    return averageFrameDelay;
  }

  public void setAverageFrameDelay(Integer averageFrameDelay) {
    this.averageFrameDelay = averageFrameDelay;
  }

  public TapiEthStatisticalDmPerformanceParameters averageFrameDelayVariation(Integer averageFrameDelayVariation) {
    this.averageFrameDelayVariation = averageFrameDelayVariation;
    return this;
  }

  /**
   * This attribute contains the average frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  Y.1563:                  The 2-point frame delay variation (vk) for an Ethernet frame k between SRC and DST is the difference between the absolute Ethernet frame transfer delay (xk) of frame k and a defined reference Ethernet frame transfer delay, d1,2, between those same MPs:  vk = xk – d1,2.
   * @return averageFrameDelayVariation
  **/
  @ApiModelProperty(value = "This attribute contains the average frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  Y.1563:                  The 2-point frame delay variation (vk) for an Ethernet frame k between SRC and DST is the difference between the absolute Ethernet frame transfer delay (xk) of frame k and a defined reference Ethernet frame transfer delay, d1,2, between those same MPs:  vk = xk – d1,2.")

  public Integer getAverageFrameDelayVariation() {
    return averageFrameDelayVariation;
  }

  public void setAverageFrameDelayVariation(Integer averageFrameDelayVariation) {
    this.averageFrameDelayVariation = averageFrameDelayVariation;
  }

  public TapiEthStatisticalDmPerformanceParameters averageInterFrameDelayVariation(Integer averageInterFrameDelayVariation) {
    this.averageInterFrameDelayVariation = averageInterFrameDelayVariation;
    return this;
  }

  /**
   * This attribute contains the average frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  G.8013/Y.1731:                  Frame delay variation is a measure of the variations in the frame delay between a pair of service frames
   * @return averageInterFrameDelayVariation
  **/
  @ApiModelProperty(value = "This attribute contains the average frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  G.8013/Y.1731:                  Frame delay variation is a measure of the variations in the frame delay between a pair of service frames")

  public Integer getAverageInterFrameDelayVariation() {
    return averageInterFrameDelayVariation;
  }

  public void setAverageInterFrameDelayVariation(Integer averageInterFrameDelayVariation) {
    this.averageInterFrameDelayVariation = averageInterFrameDelayVariation;
  }

  public TapiEthStatisticalDmPerformanceParameters maximumFrameDelay(Integer maximumFrameDelay) {
    this.maximumFrameDelay = maximumFrameDelay;
    return this;
  }

  /**
   * This attribute contains the maximum frame delay observed over the monitored period. It is measured in units of ns (nano second, 1x10e-9 seconds).
   * @return maximumFrameDelay
  **/
  @ApiModelProperty(value = "This attribute contains the maximum frame delay observed over the monitored period. It is measured in units of ns (nano second, 1x10e-9 seconds).")

  public Integer getMaximumFrameDelay() {
    return maximumFrameDelay;
  }

  public void setMaximumFrameDelay(Integer maximumFrameDelay) {
    this.maximumFrameDelay = maximumFrameDelay;
  }

  public TapiEthStatisticalDmPerformanceParameters maximumFrameDelayVariation(Integer maximumFrameDelayVariation) {
    this.maximumFrameDelayVariation = maximumFrameDelayVariation;
    return this;
  }

  /**
   * This attribute contains the maximum frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  Y.1563:                  The 2-point frame delay variation (vk) for an Ethernet frame k between SRC and DST is the difference between the absolute Ethernet frame transfer delay (xk) of frame k and a defined reference Ethernet frame transfer delay, d1,2, between those same MPs:  vk = xk – d1,2.
   * @return maximumFrameDelayVariation
  **/
  @ApiModelProperty(value = "This attribute contains the maximum frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  Y.1563:                  The 2-point frame delay variation (vk) for an Ethernet frame k between SRC and DST is the difference between the absolute Ethernet frame transfer delay (xk) of frame k and a defined reference Ethernet frame transfer delay, d1,2, between those same MPs:  vk = xk – d1,2.")

  public Integer getMaximumFrameDelayVariation() {
    return maximumFrameDelayVariation;
  }

  public void setMaximumFrameDelayVariation(Integer maximumFrameDelayVariation) {
    this.maximumFrameDelayVariation = maximumFrameDelayVariation;
  }

  public TapiEthStatisticalDmPerformanceParameters maximumInterFrameDelayVariation(Integer maximumInterFrameDelayVariation) {
    this.maximumInterFrameDelayVariation = maximumInterFrameDelayVariation;
    return this;
  }

  /**
   * This attribute contains the maximum frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  G.8013/Y.1731:                  Frame delay variation is a measure of the variations in the frame delay between a pair of service frames
   * @return maximumInterFrameDelayVariation
  **/
  @ApiModelProperty(value = "This attribute contains the maximum frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  G.8013/Y.1731:                  Frame delay variation is a measure of the variations in the frame delay between a pair of service frames")

  public Integer getMaximumInterFrameDelayVariation() {
    return maximumInterFrameDelayVariation;
  }

  public void setMaximumInterFrameDelayVariation(Integer maximumInterFrameDelayVariation) {
    this.maximumInterFrameDelayVariation = maximumInterFrameDelayVariation;
  }

  public TapiEthStatisticalDmPerformanceParameters minimumFrameDelay(Integer minimumFrameDelay) {
    this.minimumFrameDelay = minimumFrameDelay;
    return this;
  }

  /**
   * This attribute contains the minimum frame delay observed over the monitored period. It is measured in units of ns (nano second, 1x10e-9 seconds).
   * @return minimumFrameDelay
  **/
  @ApiModelProperty(value = "This attribute contains the minimum frame delay observed over the monitored period. It is measured in units of ns (nano second, 1x10e-9 seconds).")

  public Integer getMinimumFrameDelay() {
    return minimumFrameDelay;
  }

  public void setMinimumFrameDelay(Integer minimumFrameDelay) {
    this.minimumFrameDelay = minimumFrameDelay;
  }

  public TapiEthStatisticalDmPerformanceParameters minimumFrameDelayVariation(Integer minimumFrameDelayVariation) {
    this.minimumFrameDelayVariation = minimumFrameDelayVariation;
    return this;
  }

  /**
   * This attribute contains the minimum frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  Y.1563:                  The 2-point frame delay variation (vk) for an Ethernet frame k between SRC and DST is the difference between the absolute Ethernet frame transfer delay (xk) of frame k and a defined reference Ethernet frame transfer delay, d1,2, between those same MPs:  vk = xk – d1,2.
   * @return minimumFrameDelayVariation
  **/
  @ApiModelProperty(value = "This attribute contains the minimum frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  Y.1563:                  The 2-point frame delay variation (vk) for an Ethernet frame k between SRC and DST is the difference between the absolute Ethernet frame transfer delay (xk) of frame k and a defined reference Ethernet frame transfer delay, d1,2, between those same MPs:  vk = xk – d1,2.")

  public Integer getMinimumFrameDelayVariation() {
    return minimumFrameDelayVariation;
  }

  public void setMinimumFrameDelayVariation(Integer minimumFrameDelayVariation) {
    this.minimumFrameDelayVariation = minimumFrameDelayVariation;
  }

  public TapiEthStatisticalDmPerformanceParameters minimumInterFrameDelayVariation(Integer minimumInterFrameDelayVariation) {
    this.minimumInterFrameDelayVariation = minimumInterFrameDelayVariation;
    return this;
  }

  /**
   * This attribute contains the minimum frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  G.8013/Y.1731:                  Frame delay variation is a measure of the variations in the frame delay between a pair of service frames
   * @return minimumInterFrameDelayVariation
  **/
  @ApiModelProperty(value = "This attribute contains the minimum frame delay variation measured in units of ns (nano second, 1x10e-9 seconds).                  G.8013/Y.1731:                  Frame delay variation is a measure of the variations in the frame delay between a pair of service frames")

  public Integer getMinimumInterFrameDelayVariation() {
    return minimumInterFrameDelayVariation;
  }

  public void setMinimumInterFrameDelayVariation(Integer minimumInterFrameDelayVariation) {
    this.minimumInterFrameDelayVariation = minimumInterFrameDelayVariation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthStatisticalDmPerformanceParameters tapiEthStatisticalDmPerformanceParameters = (TapiEthStatisticalDmPerformanceParameters) o;
    return Objects.equals(this.averageFrameDelay, tapiEthStatisticalDmPerformanceParameters.averageFrameDelay) &&
        Objects.equals(this.averageFrameDelayVariation, tapiEthStatisticalDmPerformanceParameters.averageFrameDelayVariation) &&
        Objects.equals(this.averageInterFrameDelayVariation, tapiEthStatisticalDmPerformanceParameters.averageInterFrameDelayVariation) &&
        Objects.equals(this.maximumFrameDelay, tapiEthStatisticalDmPerformanceParameters.maximumFrameDelay) &&
        Objects.equals(this.maximumFrameDelayVariation, tapiEthStatisticalDmPerformanceParameters.maximumFrameDelayVariation) &&
        Objects.equals(this.maximumInterFrameDelayVariation, tapiEthStatisticalDmPerformanceParameters.maximumInterFrameDelayVariation) &&
        Objects.equals(this.minimumFrameDelay, tapiEthStatisticalDmPerformanceParameters.minimumFrameDelay) &&
        Objects.equals(this.minimumFrameDelayVariation, tapiEthStatisticalDmPerformanceParameters.minimumFrameDelayVariation) &&
        Objects.equals(this.minimumInterFrameDelayVariation, tapiEthStatisticalDmPerformanceParameters.minimumInterFrameDelayVariation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageFrameDelay, averageFrameDelayVariation, averageInterFrameDelayVariation, maximumFrameDelay, maximumFrameDelayVariation, maximumInterFrameDelayVariation, minimumFrameDelay, minimumFrameDelayVariation, minimumInterFrameDelayVariation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthStatisticalDmPerformanceParameters {\n");
    
    sb.append("    averageFrameDelay: ").append(toIndentedString(averageFrameDelay)).append("\n");
    sb.append("    averageFrameDelayVariation: ").append(toIndentedString(averageFrameDelayVariation)).append("\n");
    sb.append("    averageInterFrameDelayVariation: ").append(toIndentedString(averageInterFrameDelayVariation)).append("\n");
    sb.append("    maximumFrameDelay: ").append(toIndentedString(maximumFrameDelay)).append("\n");
    sb.append("    maximumFrameDelayVariation: ").append(toIndentedString(maximumFrameDelayVariation)).append("\n");
    sb.append("    maximumInterFrameDelayVariation: ").append(toIndentedString(maximumInterFrameDelayVariation)).append("\n");
    sb.append("    minimumFrameDelay: ").append(toIndentedString(minimumFrameDelay)).append("\n");
    sb.append("    minimumFrameDelayVariation: ").append(toIndentedString(minimumFrameDelayVariation)).append("\n");
    sb.append("    minimumInterFrameDelayVariation: ").append(toIndentedString(minimumInterFrameDelayVariation)).append("\n");
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
