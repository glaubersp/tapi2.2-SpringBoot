package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiNotificationNameAndValueChange;
import io.swagger.model.TapiNotificationNotification;
import io.swagger.model.TapiNotificationSourceIndicator;
import io.swagger.model.TapiOamAlarmInfo;
import io.swagger.model.TapiOamNotificationAugmentation1;
import io.swagger.model.TapiOamNotificationAugmentation2;
import io.swagger.model.TapiOamTcaInfo;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiNotificationNotificationcontextNotification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiNotificationNotificationcontextNotification extends TapiNotificationNotification  {
  @JsonProperty("tca-info")
  private TapiOamTcaInfo tcaInfo = null;

  @JsonProperty("alarm-info")
  private TapiOamAlarmInfo alarmInfo = null;

  public TapiNotificationNotificationcontextNotification tcaInfo(TapiOamTcaInfo tcaInfo) {
    this.tcaInfo = tcaInfo;
    return this;
  }

  /**
   * Get tcaInfo
   * @return tcaInfo
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamTcaInfo getTcaInfo() {
    return tcaInfo;
  }

  public void setTcaInfo(TapiOamTcaInfo tcaInfo) {
    this.tcaInfo = tcaInfo;
  }

  public TapiNotificationNotificationcontextNotification alarmInfo(TapiOamAlarmInfo alarmInfo) {
    this.alarmInfo = alarmInfo;
    return this;
  }

  /**
   * Get alarmInfo
   * @return alarmInfo
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamAlarmInfo getAlarmInfo() {
    return alarmInfo;
  }

  public void setAlarmInfo(TapiOamAlarmInfo alarmInfo) {
    this.alarmInfo = alarmInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationNotificationcontextNotification tapiNotificationNotificationcontextNotification = (TapiNotificationNotificationcontextNotification) o;
    return Objects.equals(this.tcaInfo, tapiNotificationNotificationcontextNotification.tcaInfo) &&
        Objects.equals(this.alarmInfo, tapiNotificationNotificationcontextNotification.alarmInfo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tcaInfo, alarmInfo, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationNotificationcontextNotification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tcaInfo: ").append(toIndentedString(tcaInfo)).append("\n");
    sb.append("    alarmInfo: ").append(toIndentedString(alarmInfo)).append("\n");
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
