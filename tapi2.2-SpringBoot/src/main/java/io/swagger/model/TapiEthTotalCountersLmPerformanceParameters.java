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
 * TapiEthTotalCountersLmPerformanceParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthTotalCountersLmPerformanceParameters   {
  @JsonProperty("total-frame-loss-ratio")
  private String totalFrameLossRatio = null;

  @JsonProperty("total-lost-frames")
  private Integer totalLostFrames = null;

  @JsonProperty("total-transmitted-frames")
  private Integer totalTransmittedFrames = null;

  public TapiEthTotalCountersLmPerformanceParameters totalFrameLossRatio(String totalFrameLossRatio) {
    this.totalFrameLossRatio = totalFrameLossRatio;
    return this;
  }

  /**
   * This attribute contains the frame loss ratio (number of lost frames divided by the number of total frames (N_LF / N_TF)).                  The accuracy of the value is for further study.
   * @return totalFrameLossRatio
  **/
  @ApiModelProperty(value = "This attribute contains the frame loss ratio (number of lost frames divided by the number of total frames (N_LF / N_TF)).                  The accuracy of the value is for further study.")

  public String getTotalFrameLossRatio() {
    return totalFrameLossRatio;
  }

  public void setTotalFrameLossRatio(String totalFrameLossRatio) {
    this.totalFrameLossRatio = totalFrameLossRatio;
  }

  public TapiEthTotalCountersLmPerformanceParameters totalLostFrames(Integer totalLostFrames) {
    this.totalLostFrames = totalLostFrames;
    return this;
  }

  /**
   * This attribute contains the total number of frames lost.
   * @return totalLostFrames
  **/
  @ApiModelProperty(value = "This attribute contains the total number of frames lost.")

  public Integer getTotalLostFrames() {
    return totalLostFrames;
  }

  public void setTotalLostFrames(Integer totalLostFrames) {
    this.totalLostFrames = totalLostFrames;
  }

  public TapiEthTotalCountersLmPerformanceParameters totalTransmittedFrames(Integer totalTransmittedFrames) {
    this.totalTransmittedFrames = totalTransmittedFrames;
    return this;
  }

  /**
   * This attribute contains the total number of frames transmitted.
   * @return totalTransmittedFrames
  **/
  @ApiModelProperty(value = "This attribute contains the total number of frames transmitted.")

  public Integer getTotalTransmittedFrames() {
    return totalTransmittedFrames;
  }

  public void setTotalTransmittedFrames(Integer totalTransmittedFrames) {
    this.totalTransmittedFrames = totalTransmittedFrames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthTotalCountersLmPerformanceParameters tapiEthTotalCountersLmPerformanceParameters = (TapiEthTotalCountersLmPerformanceParameters) o;
    return Objects.equals(this.totalFrameLossRatio, tapiEthTotalCountersLmPerformanceParameters.totalFrameLossRatio) &&
        Objects.equals(this.totalLostFrames, tapiEthTotalCountersLmPerformanceParameters.totalLostFrames) &&
        Objects.equals(this.totalTransmittedFrames, tapiEthTotalCountersLmPerformanceParameters.totalTransmittedFrames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalFrameLossRatio, totalLostFrames, totalTransmittedFrames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthTotalCountersLmPerformanceParameters {\n");
    
    sb.append("    totalFrameLossRatio: ").append(toIndentedString(totalFrameLossRatio)).append("\n");
    sb.append("    totalLostFrames: ").append(toIndentedString(totalLostFrames)).append("\n");
    sb.append("    totalTransmittedFrames: ").append(toIndentedString(totalTransmittedFrames)).append("\n");
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
