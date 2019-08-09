package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamAlarmInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamNotificationAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamNotificationAugmentation2   {
  @JsonProperty("alarm-info")
  private TapiOamAlarmInfo alarmInfo = null;

  public TapiOamNotificationAugmentation2 alarmInfo(TapiOamAlarmInfo alarmInfo) {
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
    TapiOamNotificationAugmentation2 tapiOamNotificationAugmentation2 = (TapiOamNotificationAugmentation2) o;
    return Objects.equals(this.alarmInfo, tapiOamNotificationAugmentation2.alarmInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamNotificationAugmentation2 {\n");
    
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
