package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiNotificationNotificationSubscriptionService;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiNotificationGetnotificationsubscriptionservicedetailsOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiNotificationGetnotificationsubscriptionservicedetailsOutput   {
  @JsonProperty("subscription-service")
  private TapiNotificationNotificationSubscriptionService subscriptionService = null;

  public TapiNotificationGetnotificationsubscriptionservicedetailsOutput subscriptionService(TapiNotificationNotificationSubscriptionService subscriptionService) {
    this.subscriptionService = subscriptionService;
    return this;
  }

  /**
   * Get subscriptionService
   * @return subscriptionService
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiNotificationNotificationSubscriptionService getSubscriptionService() {
    return subscriptionService;
  }

  public void setSubscriptionService(TapiNotificationNotificationSubscriptionService subscriptionService) {
    this.subscriptionService = subscriptionService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationGetnotificationsubscriptionservicedetailsOutput tapiNotificationGetnotificationsubscriptionservicedetailsOutput = (TapiNotificationGetnotificationsubscriptionservicedetailsOutput) o;
    return Objects.equals(this.subscriptionService, tapiNotificationGetnotificationsubscriptionservicedetailsOutput.subscriptionService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationGetnotificationsubscriptionservicedetailsOutput {\n");
    
    sb.append("    subscriptionService: ").append(toIndentedString(subscriptionService)).append("\n");
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
