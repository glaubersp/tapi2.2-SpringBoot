package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthSamplesDmPerformanceParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthSamplesDmPerformanceParameters   {
  @JsonProperty("frame-delay-list")
  @Valid
  private List<Integer> frameDelayList = null;

  @JsonProperty("frame-delay-variation-list")
  @Valid
  private List<Integer> frameDelayVariationList = null;

  @JsonProperty("number-of-samples")
  private Integer numberOfSamples = null;

  public TapiEthSamplesDmPerformanceParameters frameDelayList(List<Integer> frameDelayList) {
    this.frameDelayList = frameDelayList;
    return this;
  }

  public TapiEthSamplesDmPerformanceParameters addFrameDelayListItem(Integer frameDelayListItem) {
    if (this.frameDelayList == null) {
      this.frameDelayList = new ArrayList<>();
    }
    this.frameDelayList.add(frameDelayListItem);
    return this;
  }

  /**
   * This attribute contains the frame delays measured in ns (nano second, 1x10e-9 seconds). The multiplicity is defined by the numberOfSamples attribute.
   * @return frameDelayList
  **/
  @ApiModelProperty(value = "This attribute contains the frame delays measured in ns (nano second, 1x10e-9 seconds). The multiplicity is defined by the numberOfSamples attribute.")

  public List<Integer> getFrameDelayList() {
    return frameDelayList;
  }

  public void setFrameDelayList(List<Integer> frameDelayList) {
    this.frameDelayList = frameDelayList;
  }

  public TapiEthSamplesDmPerformanceParameters frameDelayVariationList(List<Integer> frameDelayVariationList) {
    this.frameDelayVariationList = frameDelayVariationList;
    return this;
  }

  public TapiEthSamplesDmPerformanceParameters addFrameDelayVariationListItem(Integer frameDelayVariationListItem) {
    if (this.frameDelayVariationList == null) {
      this.frameDelayVariationList = new ArrayList<>();
    }
    this.frameDelayVariationList.add(frameDelayVariationListItem);
    return this;
  }

  /**
   * This attribute contains the frame delay variations measured in ns (nano second).  The multiplicity is defined by (numberOfSamples - 1, for numberOfSamples > 0).
   * @return frameDelayVariationList
  **/
  @ApiModelProperty(value = "This attribute contains the frame delay variations measured in ns (nano second).  The multiplicity is defined by (numberOfSamples - 1, for numberOfSamples > 0).")

  public List<Integer> getFrameDelayVariationList() {
    return frameDelayVariationList;
  }

  public void setFrameDelayVariationList(List<Integer> frameDelayVariationList) {
    this.frameDelayVariationList = frameDelayVariationList;
  }

  public TapiEthSamplesDmPerformanceParameters numberOfSamples(Integer numberOfSamples) {
    this.numberOfSamples = numberOfSamples;
    return this;
  }

  /**
   * This attribute contains the number of received DM frames (successful samples) used for this frame delay measurement.                  range of type : non-negative
   * @return numberOfSamples
  **/
  @ApiModelProperty(value = "This attribute contains the number of received DM frames (successful samples) used for this frame delay measurement.                  range of type : non-negative")

  public Integer getNumberOfSamples() {
    return numberOfSamples;
  }

  public void setNumberOfSamples(Integer numberOfSamples) {
    this.numberOfSamples = numberOfSamples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthSamplesDmPerformanceParameters tapiEthSamplesDmPerformanceParameters = (TapiEthSamplesDmPerformanceParameters) o;
    return Objects.equals(this.frameDelayList, tapiEthSamplesDmPerformanceParameters.frameDelayList) &&
        Objects.equals(this.frameDelayVariationList, tapiEthSamplesDmPerformanceParameters.frameDelayVariationList) &&
        Objects.equals(this.numberOfSamples, tapiEthSamplesDmPerformanceParameters.numberOfSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameDelayList, frameDelayVariationList, numberOfSamples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthSamplesDmPerformanceParameters {\n");
    
    sb.append("    frameDelayList: ").append(toIndentedString(frameDelayList)).append("\n");
    sb.append("    frameDelayVariationList: ").append(toIndentedString(frameDelayVariationList)).append("\n");
    sb.append("    numberOfSamples: ").append(toIndentedString(numberOfSamples)).append("\n");
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
