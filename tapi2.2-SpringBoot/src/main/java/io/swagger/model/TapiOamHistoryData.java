package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiOamPmDataPac;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamHistoryData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamHistoryData extends TapiCommonLocalClass  {
  @JsonProperty("period-start-time")
  private String periodStartTime = null;

  @JsonProperty("pm-data-pac")
  private TapiOamPmDataPac pmDataPac = null;

  @JsonProperty("period-end-time")
  private String periodEndTime = null;

  public TapiOamHistoryData periodStartTime(String periodStartTime) {
    this.periodStartTime = periodStartTime;
    return this;
  }

  /**
   * This attribute indicates the start of the monitoring interval.                  The value is bound to the quarter of an hour in case of a 15 minute interval and bound to the hour in case of a 24 hour interval.
   * @return periodStartTime
  **/
  @ApiModelProperty(value = "This attribute indicates the start of the monitoring interval.                  The value is bound to the quarter of an hour in case of a 15 minute interval and bound to the hour in case of a 24 hour interval.")

  public String getPeriodStartTime() {
    return periodStartTime;
  }

  public void setPeriodStartTime(String periodStartTime) {
    this.periodStartTime = periodStartTime;
  }

  public TapiOamHistoryData pmDataPac(TapiOamPmDataPac pmDataPac) {
    this.pmDataPac = pmDataPac;
    return this;
  }

  /**
   * Get pmDataPac
   * @return pmDataPac
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamPmDataPac getPmDataPac() {
    return pmDataPac;
  }

  public void setPmDataPac(TapiOamPmDataPac pmDataPac) {
    this.pmDataPac = pmDataPac;
  }

  public TapiOamHistoryData periodEndTime(String periodEndTime) {
    this.periodEndTime = periodEndTime;
    return this;
  }

  /**
   * none
   * @return periodEndTime
  **/
  @ApiModelProperty(value = "none")

  public String getPeriodEndTime() {
    return periodEndTime;
  }

  public void setPeriodEndTime(String periodEndTime) {
    this.periodEndTime = periodEndTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamHistoryData tapiOamHistoryData = (TapiOamHistoryData) o;
    return Objects.equals(this.periodStartTime, tapiOamHistoryData.periodStartTime) &&
        Objects.equals(this.pmDataPac, tapiOamHistoryData.pmDataPac) &&
        Objects.equals(this.periodEndTime, tapiOamHistoryData.periodEndTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodStartTime, pmDataPac, periodEndTime, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamHistoryData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    periodStartTime: ").append(toIndentedString(periodStartTime)).append("\n");
    sb.append("    pmDataPac: ").append(toIndentedString(pmDataPac)).append("\n");
    sb.append("    periodEndTime: ").append(toIndentedString(periodEndTime)).append("\n");
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
