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
 * TapiCommonTimeRange
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiCommonTimeRange   {
  @JsonProperty("end-time")
  private String endTime = null;

  @JsonProperty("start-time")
  private String startTime = null;

  public TapiCommonTimeRange endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * none
   * @return endTime
  **/
  @ApiModelProperty(value = "none")

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public TapiCommonTimeRange startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * none
   * @return startTime
  **/
  @ApiModelProperty(value = "none")

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonTimeRange tapiCommonTimeRange = (TapiCommonTimeRange) o;
    return Objects.equals(this.endTime, tapiCommonTimeRange.endTime) &&
        Objects.equals(this.startTime, tapiCommonTimeRange.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonTimeRange {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
