package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiNotificationNotification;
import io.swagger.model.TapiNotificationNotificationChannel;
import io.swagger.model.TapiNotificationSubscriptionFilter;
import io.swagger.model.TapiNotificationSubscriptionState;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiNotificationNotificationSubscriptionService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiNotificationNotificationSubscriptionService extends TapiCommonGlobalClass  {
  @JsonProperty("notification")
  @Valid
  private List<TapiNotificationNotification> notification = null;

  @JsonProperty("notification-channel")
  private TapiNotificationNotificationChannel notificationChannel = null;

  @JsonProperty("subscription-filter")
  private TapiNotificationSubscriptionFilter subscriptionFilter = null;

  @JsonProperty("subscription-state")
  private TapiNotificationSubscriptionState subscriptionState = null;

  @JsonProperty("supported-notification-types")
  @Valid
  private List<String> supportedNotificationTypes = null;

  @JsonProperty("supported-object-types")
  @Valid
  private List<String> supportedObjectTypes = null;

  public TapiNotificationNotificationSubscriptionService notification(List<TapiNotificationNotification> notification) {
    this.notification = notification;
    return this;
  }

  public TapiNotificationNotificationSubscriptionService addNotificationItem(TapiNotificationNotification notificationItem) {
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
  public List<TapiNotificationNotification> getNotification() {
    return notification;
  }

  public void setNotification(List<TapiNotificationNotification> notification) {
    this.notification = notification;
  }

  public TapiNotificationNotificationSubscriptionService notificationChannel(TapiNotificationNotificationChannel notificationChannel) {
    this.notificationChannel = notificationChannel;
    return this;
  }

  /**
   * Get notificationChannel
   * @return notificationChannel
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiNotificationNotificationChannel getNotificationChannel() {
    return notificationChannel;
  }

  public void setNotificationChannel(TapiNotificationNotificationChannel notificationChannel) {
    this.notificationChannel = notificationChannel;
  }

  public TapiNotificationNotificationSubscriptionService subscriptionFilter(TapiNotificationSubscriptionFilter subscriptionFilter) {
    this.subscriptionFilter = subscriptionFilter;
    return this;
  }

  /**
   * Get subscriptionFilter
   * @return subscriptionFilter
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiNotificationSubscriptionFilter getSubscriptionFilter() {
    return subscriptionFilter;
  }

  public void setSubscriptionFilter(TapiNotificationSubscriptionFilter subscriptionFilter) {
    this.subscriptionFilter = subscriptionFilter;
  }

  public TapiNotificationNotificationSubscriptionService subscriptionState(TapiNotificationSubscriptionState subscriptionState) {
    this.subscriptionState = subscriptionState;
    return this;
  }

  /**
   * Get subscriptionState
   * @return subscriptionState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiNotificationSubscriptionState getSubscriptionState() {
    return subscriptionState;
  }

  public void setSubscriptionState(TapiNotificationSubscriptionState subscriptionState) {
    this.subscriptionState = subscriptionState;
  }

  public TapiNotificationNotificationSubscriptionService supportedNotificationTypes(List<String> supportedNotificationTypes) {
    this.supportedNotificationTypes = supportedNotificationTypes;
    return this;
  }

  public TapiNotificationNotificationSubscriptionService addSupportedNotificationTypesItem(String supportedNotificationTypesItem) {
    if (this.supportedNotificationTypes == null) {
      this.supportedNotificationTypes = new ArrayList<>();
    }
    this.supportedNotificationTypes.add(supportedNotificationTypesItem);
    return this;
  }

  /**
   * none
   * @return supportedNotificationTypes
  **/
  @ApiModelProperty(value = "none")

  public List<String> getSupportedNotificationTypes() {
    return supportedNotificationTypes;
  }

  public void setSupportedNotificationTypes(List<String> supportedNotificationTypes) {
    this.supportedNotificationTypes = supportedNotificationTypes;
  }

  public TapiNotificationNotificationSubscriptionService supportedObjectTypes(List<String> supportedObjectTypes) {
    this.supportedObjectTypes = supportedObjectTypes;
    return this;
  }

  public TapiNotificationNotificationSubscriptionService addSupportedObjectTypesItem(String supportedObjectTypesItem) {
    if (this.supportedObjectTypes == null) {
      this.supportedObjectTypes = new ArrayList<>();
    }
    this.supportedObjectTypes.add(supportedObjectTypesItem);
    return this;
  }

  /**
   * none
   * @return supportedObjectTypes
  **/
  @ApiModelProperty(value = "none")

  public List<String> getSupportedObjectTypes() {
    return supportedObjectTypes;
  }

  public void setSupportedObjectTypes(List<String> supportedObjectTypes) {
    this.supportedObjectTypes = supportedObjectTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationNotificationSubscriptionService tapiNotificationNotificationSubscriptionService = (TapiNotificationNotificationSubscriptionService) o;
    return Objects.equals(this.notification, tapiNotificationNotificationSubscriptionService.notification) &&
        Objects.equals(this.notificationChannel, tapiNotificationNotificationSubscriptionService.notificationChannel) &&
        Objects.equals(this.subscriptionFilter, tapiNotificationNotificationSubscriptionService.subscriptionFilter) &&
        Objects.equals(this.subscriptionState, tapiNotificationNotificationSubscriptionService.subscriptionState) &&
        Objects.equals(this.supportedNotificationTypes, tapiNotificationNotificationSubscriptionService.supportedNotificationTypes) &&
        Objects.equals(this.supportedObjectTypes, tapiNotificationNotificationSubscriptionService.supportedObjectTypes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notification, notificationChannel, subscriptionFilter, subscriptionState, supportedNotificationTypes, supportedObjectTypes, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationNotificationSubscriptionService {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    notificationChannel: ").append(toIndentedString(notificationChannel)).append("\n");
    sb.append("    subscriptionFilter: ").append(toIndentedString(subscriptionFilter)).append("\n");
    sb.append("    subscriptionState: ").append(toIndentedString(subscriptionState)).append("\n");
    sb.append("    supportedNotificationTypes: ").append(toIndentedString(supportedNotificationTypes)).append("\n");
    sb.append("    supportedObjectTypes: ").append(toIndentedString(supportedObjectTypes)).append("\n");
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
