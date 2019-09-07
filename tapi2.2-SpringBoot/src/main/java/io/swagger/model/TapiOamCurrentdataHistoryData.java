package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiEthEthOnDemand1DmPerformanceData;
import io.swagger.model.TapiEthEthOnDemand1DmSourcePerformanceData;
import io.swagger.model.TapiEthEthOnDemand1LmPerformanceData;
import io.swagger.model.TapiEthEthOnDemand1LmSourcePerformanceData;
import io.swagger.model.TapiEthEthOnDemandDmPerformanceData;
import io.swagger.model.TapiEthEthOnDemandLmPerformanceData;
import io.swagger.model.TapiEthEthProActive1DmPerformanceData;
import io.swagger.model.TapiEthEthProActive1DmSourcePerformanceData;
import io.swagger.model.TapiEthEthProActive1LmPerformanceData;
import io.swagger.model.TapiEthEthProActive1LmSourcePerformanceData;
import io.swagger.model.TapiEthEthProActiveDmPerformanceData;
import io.swagger.model.TapiEthEthProActiveLmPerformanceData;
import io.swagger.model.TapiOamPmDataPac;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamCurrentdataHistoryData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamCurrentdataHistoryData extends TapiCommonLocalClass  {
  @JsonProperty("eth-on-demand-1-dm-performance-data")
  private TapiEthEthOnDemand1DmPerformanceData ethOnDemand1DmPerformanceData = null;

  @JsonProperty("eth-on-demand-1-dm-source-performance-data")
  private TapiEthEthOnDemand1DmSourcePerformanceData ethOnDemand1DmSourcePerformanceData = null;

  @JsonProperty("eth-on-demand-1-lm-performance-data")
  private TapiEthEthOnDemand1LmPerformanceData ethOnDemand1LmPerformanceData = null;

  @JsonProperty("eth-on-demand-1-lm-source-performance-data")
  private TapiEthEthOnDemand1LmSourcePerformanceData ethOnDemand1LmSourcePerformanceData = null;

  @JsonProperty("eth-on-demand-dm-performance-data")
  private TapiEthEthOnDemandDmPerformanceData ethOnDemandDmPerformanceData = null;

  @JsonProperty("eth-on-demand-lm-performance-data")
  private TapiEthEthOnDemandLmPerformanceData ethOnDemandLmPerformanceData = null;

  @JsonProperty("eth-pro-active-1-dm-performance-data")
  private TapiEthEthProActive1DmPerformanceData ethProActive1DmPerformanceData = null;

  @JsonProperty("eth-pro-active-1-dm-source-performance-data")
  private TapiEthEthProActive1DmSourcePerformanceData ethProActive1DmSourcePerformanceData = null;

  @JsonProperty("eth-pro-active-1-lm-performance-data")
  private TapiEthEthProActive1LmPerformanceData ethProActive1LmPerformanceData = null;

  @JsonProperty("eth-pro-active-1-lm-source-performance-data")
  private TapiEthEthProActive1LmSourcePerformanceData ethProActive1LmSourcePerformanceData = null;

  @JsonProperty("eth-pro-active-dm-performance-data")
  private TapiEthEthProActiveDmPerformanceData ethProActiveDmPerformanceData = null;

  @JsonProperty("eth-pro-active-lm-performance-data")
  private TapiEthEthProActiveLmPerformanceData ethProActiveLmPerformanceData = null;

  @JsonProperty("period-end-time")
  private String periodEndTime = null;

  @JsonProperty("period-start-time")
  private String periodStartTime = null;

  @JsonProperty("pm-data-pac")
  private TapiOamPmDataPac pmDataPac = null;

  public TapiOamCurrentdataHistoryData ethOnDemand1DmPerformanceData(TapiEthEthOnDemand1DmPerformanceData ethOnDemand1DmPerformanceData) {
    this.ethOnDemand1DmPerformanceData = ethOnDemand1DmPerformanceData;
    return this;
  }

  /**
   * Get ethOnDemand1DmPerformanceData
   * @return ethOnDemand1DmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemand1DmPerformanceData getEthOnDemand1DmPerformanceData() {
    return ethOnDemand1DmPerformanceData;
  }

  public void setEthOnDemand1DmPerformanceData(TapiEthEthOnDemand1DmPerformanceData ethOnDemand1DmPerformanceData) {
    this.ethOnDemand1DmPerformanceData = ethOnDemand1DmPerformanceData;
  }

  public TapiOamCurrentdataHistoryData ethOnDemand1DmSourcePerformanceData(TapiEthEthOnDemand1DmSourcePerformanceData ethOnDemand1DmSourcePerformanceData) {
    this.ethOnDemand1DmSourcePerformanceData = ethOnDemand1DmSourcePerformanceData;
    return this;
  }

  /**
   * Get ethOnDemand1DmSourcePerformanceData
   * @return ethOnDemand1DmSourcePerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemand1DmSourcePerformanceData getEthOnDemand1DmSourcePerformanceData() {
    return ethOnDemand1DmSourcePerformanceData;
  }

  public void setEthOnDemand1DmSourcePerformanceData(TapiEthEthOnDemand1DmSourcePerformanceData ethOnDemand1DmSourcePerformanceData) {
    this.ethOnDemand1DmSourcePerformanceData = ethOnDemand1DmSourcePerformanceData;
  }

  public TapiOamCurrentdataHistoryData ethOnDemand1LmPerformanceData(TapiEthEthOnDemand1LmPerformanceData ethOnDemand1LmPerformanceData) {
    this.ethOnDemand1LmPerformanceData = ethOnDemand1LmPerformanceData;
    return this;
  }

  /**
   * Get ethOnDemand1LmPerformanceData
   * @return ethOnDemand1LmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemand1LmPerformanceData getEthOnDemand1LmPerformanceData() {
    return ethOnDemand1LmPerformanceData;
  }

  public void setEthOnDemand1LmPerformanceData(TapiEthEthOnDemand1LmPerformanceData ethOnDemand1LmPerformanceData) {
    this.ethOnDemand1LmPerformanceData = ethOnDemand1LmPerformanceData;
  }

  public TapiOamCurrentdataHistoryData ethOnDemand1LmSourcePerformanceData(TapiEthEthOnDemand1LmSourcePerformanceData ethOnDemand1LmSourcePerformanceData) {
    this.ethOnDemand1LmSourcePerformanceData = ethOnDemand1LmSourcePerformanceData;
    return this;
  }

  /**
   * Get ethOnDemand1LmSourcePerformanceData
   * @return ethOnDemand1LmSourcePerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemand1LmSourcePerformanceData getEthOnDemand1LmSourcePerformanceData() {
    return ethOnDemand1LmSourcePerformanceData;
  }

  public void setEthOnDemand1LmSourcePerformanceData(TapiEthEthOnDemand1LmSourcePerformanceData ethOnDemand1LmSourcePerformanceData) {
    this.ethOnDemand1LmSourcePerformanceData = ethOnDemand1LmSourcePerformanceData;
  }

  public TapiOamCurrentdataHistoryData ethOnDemandDmPerformanceData(TapiEthEthOnDemandDmPerformanceData ethOnDemandDmPerformanceData) {
    this.ethOnDemandDmPerformanceData = ethOnDemandDmPerformanceData;
    return this;
  }

  /**
   * Get ethOnDemandDmPerformanceData
   * @return ethOnDemandDmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemandDmPerformanceData getEthOnDemandDmPerformanceData() {
    return ethOnDemandDmPerformanceData;
  }

  public void setEthOnDemandDmPerformanceData(TapiEthEthOnDemandDmPerformanceData ethOnDemandDmPerformanceData) {
    this.ethOnDemandDmPerformanceData = ethOnDemandDmPerformanceData;
  }

  public TapiOamCurrentdataHistoryData ethOnDemandLmPerformanceData(TapiEthEthOnDemandLmPerformanceData ethOnDemandLmPerformanceData) {
    this.ethOnDemandLmPerformanceData = ethOnDemandLmPerformanceData;
    return this;
  }

  /**
   * Get ethOnDemandLmPerformanceData
   * @return ethOnDemandLmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOnDemandLmPerformanceData getEthOnDemandLmPerformanceData() {
    return ethOnDemandLmPerformanceData;
  }

  public void setEthOnDemandLmPerformanceData(TapiEthEthOnDemandLmPerformanceData ethOnDemandLmPerformanceData) {
    this.ethOnDemandLmPerformanceData = ethOnDemandLmPerformanceData;
  }

  public TapiOamCurrentdataHistoryData ethProActive1DmPerformanceData(TapiEthEthProActive1DmPerformanceData ethProActive1DmPerformanceData) {
    this.ethProActive1DmPerformanceData = ethProActive1DmPerformanceData;
    return this;
  }

  /**
   * Get ethProActive1DmPerformanceData
   * @return ethProActive1DmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActive1DmPerformanceData getEthProActive1DmPerformanceData() {
    return ethProActive1DmPerformanceData;
  }

  public void setEthProActive1DmPerformanceData(TapiEthEthProActive1DmPerformanceData ethProActive1DmPerformanceData) {
    this.ethProActive1DmPerformanceData = ethProActive1DmPerformanceData;
  }

  public TapiOamCurrentdataHistoryData ethProActive1DmSourcePerformanceData(TapiEthEthProActive1DmSourcePerformanceData ethProActive1DmSourcePerformanceData) {
    this.ethProActive1DmSourcePerformanceData = ethProActive1DmSourcePerformanceData;
    return this;
  }

  /**
   * Get ethProActive1DmSourcePerformanceData
   * @return ethProActive1DmSourcePerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActive1DmSourcePerformanceData getEthProActive1DmSourcePerformanceData() {
    return ethProActive1DmSourcePerformanceData;
  }

  public void setEthProActive1DmSourcePerformanceData(TapiEthEthProActive1DmSourcePerformanceData ethProActive1DmSourcePerformanceData) {
    this.ethProActive1DmSourcePerformanceData = ethProActive1DmSourcePerformanceData;
  }

  public TapiOamCurrentdataHistoryData ethProActive1LmPerformanceData(TapiEthEthProActive1LmPerformanceData ethProActive1LmPerformanceData) {
    this.ethProActive1LmPerformanceData = ethProActive1LmPerformanceData;
    return this;
  }

  /**
   * Get ethProActive1LmPerformanceData
   * @return ethProActive1LmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActive1LmPerformanceData getEthProActive1LmPerformanceData() {
    return ethProActive1LmPerformanceData;
  }

  public void setEthProActive1LmPerformanceData(TapiEthEthProActive1LmPerformanceData ethProActive1LmPerformanceData) {
    this.ethProActive1LmPerformanceData = ethProActive1LmPerformanceData;
  }

  public TapiOamCurrentdataHistoryData ethProActive1LmSourcePerformanceData(TapiEthEthProActive1LmSourcePerformanceData ethProActive1LmSourcePerformanceData) {
    this.ethProActive1LmSourcePerformanceData = ethProActive1LmSourcePerformanceData;
    return this;
  }

  /**
   * Get ethProActive1LmSourcePerformanceData
   * @return ethProActive1LmSourcePerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActive1LmSourcePerformanceData getEthProActive1LmSourcePerformanceData() {
    return ethProActive1LmSourcePerformanceData;
  }

  public void setEthProActive1LmSourcePerformanceData(TapiEthEthProActive1LmSourcePerformanceData ethProActive1LmSourcePerformanceData) {
    this.ethProActive1LmSourcePerformanceData = ethProActive1LmSourcePerformanceData;
  }

  public TapiOamCurrentdataHistoryData ethProActiveDmPerformanceData(TapiEthEthProActiveDmPerformanceData ethProActiveDmPerformanceData) {
    this.ethProActiveDmPerformanceData = ethProActiveDmPerformanceData;
    return this;
  }

  /**
   * Get ethProActiveDmPerformanceData
   * @return ethProActiveDmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActiveDmPerformanceData getEthProActiveDmPerformanceData() {
    return ethProActiveDmPerformanceData;
  }

  public void setEthProActiveDmPerformanceData(TapiEthEthProActiveDmPerformanceData ethProActiveDmPerformanceData) {
    this.ethProActiveDmPerformanceData = ethProActiveDmPerformanceData;
  }

  public TapiOamCurrentdataHistoryData ethProActiveLmPerformanceData(TapiEthEthProActiveLmPerformanceData ethProActiveLmPerformanceData) {
    this.ethProActiveLmPerformanceData = ethProActiveLmPerformanceData;
    return this;
  }

  /**
   * Get ethProActiveLmPerformanceData
   * @return ethProActiveLmPerformanceData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthProActiveLmPerformanceData getEthProActiveLmPerformanceData() {
    return ethProActiveLmPerformanceData;
  }

  public void setEthProActiveLmPerformanceData(TapiEthEthProActiveLmPerformanceData ethProActiveLmPerformanceData) {
    this.ethProActiveLmPerformanceData = ethProActiveLmPerformanceData;
  }

  public TapiOamCurrentdataHistoryData periodEndTime(String periodEndTime) {
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

  public TapiOamCurrentdataHistoryData periodStartTime(String periodStartTime) {
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

  public TapiOamCurrentdataHistoryData pmDataPac(TapiOamPmDataPac pmDataPac) {
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
    TapiOamCurrentdataHistoryData tapiOamCurrentdataHistoryData = (TapiOamCurrentdataHistoryData) o;
    return Objects.equals(this.ethOnDemand1DmPerformanceData, tapiOamCurrentdataHistoryData.ethOnDemand1DmPerformanceData) &&
        Objects.equals(this.ethOnDemand1DmSourcePerformanceData, tapiOamCurrentdataHistoryData.ethOnDemand1DmSourcePerformanceData) &&
        Objects.equals(this.ethOnDemand1LmPerformanceData, tapiOamCurrentdataHistoryData.ethOnDemand1LmPerformanceData) &&
        Objects.equals(this.ethOnDemand1LmSourcePerformanceData, tapiOamCurrentdataHistoryData.ethOnDemand1LmSourcePerformanceData) &&
        Objects.equals(this.ethOnDemandDmPerformanceData, tapiOamCurrentdataHistoryData.ethOnDemandDmPerformanceData) &&
        Objects.equals(this.ethOnDemandLmPerformanceData, tapiOamCurrentdataHistoryData.ethOnDemandLmPerformanceData) &&
        Objects.equals(this.ethProActive1DmPerformanceData, tapiOamCurrentdataHistoryData.ethProActive1DmPerformanceData) &&
        Objects.equals(this.ethProActive1DmSourcePerformanceData, tapiOamCurrentdataHistoryData.ethProActive1DmSourcePerformanceData) &&
        Objects.equals(this.ethProActive1LmPerformanceData, tapiOamCurrentdataHistoryData.ethProActive1LmPerformanceData) &&
        Objects.equals(this.ethProActive1LmSourcePerformanceData, tapiOamCurrentdataHistoryData.ethProActive1LmSourcePerformanceData) &&
        Objects.equals(this.ethProActiveDmPerformanceData, tapiOamCurrentdataHistoryData.ethProActiveDmPerformanceData) &&
        Objects.equals(this.ethProActiveLmPerformanceData, tapiOamCurrentdataHistoryData.ethProActiveLmPerformanceData) &&
        Objects.equals(this.periodEndTime, tapiOamCurrentdataHistoryData.periodEndTime) &&
        Objects.equals(this.periodStartTime, tapiOamCurrentdataHistoryData.periodStartTime) &&
        Objects.equals(this.pmDataPac, tapiOamCurrentdataHistoryData.pmDataPac) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemand1DmPerformanceData, ethOnDemand1DmSourcePerformanceData, ethOnDemand1LmPerformanceData, ethOnDemand1LmSourcePerformanceData, ethOnDemandDmPerformanceData, ethOnDemandLmPerformanceData, ethProActive1DmPerformanceData, ethProActive1DmSourcePerformanceData, ethProActive1LmPerformanceData, ethProActive1LmSourcePerformanceData, ethProActiveDmPerformanceData, ethProActiveLmPerformanceData, periodEndTime, periodStartTime, pmDataPac, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamCurrentdataHistoryData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ethOnDemand1DmPerformanceData: ").append(toIndentedString(ethOnDemand1DmPerformanceData)).append("\n");
    sb.append("    ethOnDemand1DmSourcePerformanceData: ").append(toIndentedString(ethOnDemand1DmSourcePerformanceData)).append("\n");
    sb.append("    ethOnDemand1LmPerformanceData: ").append(toIndentedString(ethOnDemand1LmPerformanceData)).append("\n");
    sb.append("    ethOnDemand1LmSourcePerformanceData: ").append(toIndentedString(ethOnDemand1LmSourcePerformanceData)).append("\n");
    sb.append("    ethOnDemandDmPerformanceData: ").append(toIndentedString(ethOnDemandDmPerformanceData)).append("\n");
    sb.append("    ethOnDemandLmPerformanceData: ").append(toIndentedString(ethOnDemandLmPerformanceData)).append("\n");
    sb.append("    ethProActive1DmPerformanceData: ").append(toIndentedString(ethProActive1DmPerformanceData)).append("\n");
    sb.append("    ethProActive1DmSourcePerformanceData: ").append(toIndentedString(ethProActive1DmSourcePerformanceData)).append("\n");
    sb.append("    ethProActive1LmPerformanceData: ").append(toIndentedString(ethProActive1LmPerformanceData)).append("\n");
    sb.append("    ethProActive1LmSourcePerformanceData: ").append(toIndentedString(ethProActive1LmSourcePerformanceData)).append("\n");
    sb.append("    ethProActiveDmPerformanceData: ").append(toIndentedString(ethProActiveDmPerformanceData)).append("\n");
    sb.append("    ethProActiveLmPerformanceData: ").append(toIndentedString(ethProActiveLmPerformanceData)).append("\n");
    sb.append("    periodEndTime: ").append(toIndentedString(periodEndTime)).append("\n");
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
