package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiNotificationNotificationcontextNotification;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiNotificationGetnotificationlistOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiNotificationGetnotificationlistOutput   {
  @JsonProperty("notification")
  @Valid
  private List<TapiNotificationNotificationcontextNotification> notification = null;

  public TapiNotificationGetnotificationlistOutput notification(List<TapiNotificationNotificationcontextNotification> notification) {
    this.notification = notification;
    return this;
  }

  public TapiNotificationGetnotificationlistOutput addNotificationItem(TapiNotificationNotificationcontextNotification notificationItem) {
    if (this.notification == null) {
      this.notification = new ArrayList<>();
    }
    this.notification.add(notificationItem);
    return this;
  }

  /**
   * none
   * @return notification
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiNotificationNotificationcontextNotification> getNotification() {
    return notification;
  }

  public void setNotification(List<TapiNotificationNotificationcontextNotification> notification) {
    this.notification = notification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationGetnotificationlistOutput tapiNotificationGetnotificationlistOutput = (TapiNotificationGetnotificationlistOutput) o;
    return Objects.equals(this.notification, tapiNotificationGetnotificationlistOutput.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationGetnotificationlistOutput {\n");
    
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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
