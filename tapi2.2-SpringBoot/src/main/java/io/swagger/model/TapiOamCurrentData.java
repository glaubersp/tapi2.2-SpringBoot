package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonTimeInterval;
import io.swagger.model.TapiOamHistoryData;
import io.swagger.model.TapiOamPmDataPac;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamCurrentData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamCurrentData extends TapiCommonLocalClass  {
  @JsonProperty("elapsed-time")
  private TapiCommonTimeInterval elapsedTime = null;

  @JsonProperty("history-data")
  @Valid
  private List<TapiOamHistoryData> historyData = null;

  @JsonProperty("period-start-time")
  private String periodStartTime = null;

  @JsonProperty("pm-data-pac")
  private TapiOamPmDataPac pmDataPac = null;

  public TapiOamCurrentData elapsedTime(TapiCommonTimeInterval elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

  /**
   * Get elapsedTime
   * @return elapsedTime
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonTimeInterval getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(TapiCommonTimeInterval elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public TapiOamCurrentData historyData(List<TapiOamHistoryData> historyData) {
    this.historyData = historyData;
    return this;
  }

  public TapiOamCurrentData addHistoryDataItem(TapiOamHistoryData historyDataItem) {
    if (this.historyData == null) {
      this.historyData = new ArrayList<>();
    }
    this.historyData.add(historyDataItem);
    return this;
  }

  /**
   * in case of 24hr Current Data, at least 1 History Data.                  In case of 15min Current Data, at least 16 History Data.                  In case of <15min, the number of History Data shall be able to cover a span of 4 hours.
   * @return historyData
  **/
  @ApiModelProperty(value = "in case of 24hr Current Data, at least 1 History Data.                  In case of 15min Current Data, at least 16 History Data.                  In case of <15min, the number of History Data shall be able to cover a span of 4 hours.")
  @Valid
  public List<TapiOamHistoryData> getHistoryData() {
    return historyData;
  }

  public void setHistoryData(List<TapiOamHistoryData> historyData) {
    this.historyData = historyData;
  }

  public TapiOamCurrentData periodStartTime(String periodStartTime) {
    this.periodStartTime = periodStartTime;
    return this;
  }

  /**
   * This attribute indicates the start of the current monitoring interval.                  The value is bound to the quarter of an hour in case of a 15 minute interval and bound to the hour in case of a 24 hour interval.
   * @return periodStartTime
  **/
  @ApiModelProperty(value = "This attribute indicates the start of the current monitoring interval.                  The value is bound to the quarter of an hour in case of a 15 minute interval and bound to the hour in case of a 24 hour interval.")

  public String getPeriodStartTime() {
    return periodStartTime;
  }

  public void setPeriodStartTime(String periodStartTime) {
    this.periodStartTime = periodStartTime;
  }

  public TapiOamCurrentData pmDataPac(TapiOamPmDataPac pmDataPac) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamCurrentData tapiOamCurrentData = (TapiOamCurrentData) o;
    return Objects.equals(this.elapsedTime, tapiOamCurrentData.elapsedTime) &&
        Objects.equals(this.historyData, tapiOamCurrentData.historyData) &&
        Objects.equals(this.periodStartTime, tapiOamCurrentData.periodStartTime) &&
        Objects.equals(this.pmDataPac, tapiOamCurrentData.pmDataPac) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elapsedTime, historyData, periodStartTime, pmDataPac, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamCurrentData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    historyData: ").append(toIndentedString(historyData)).append("\n");
    sb.append("    periodStartTime: ").append(toIndentedString(periodStartTime)).append("\n");
    sb.append("    pmDataPac: ").append(toIndentedString(pmDataPac)).append("\n");
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
