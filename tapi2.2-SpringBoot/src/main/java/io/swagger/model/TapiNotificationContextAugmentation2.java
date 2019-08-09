package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiNotificationContextNotificationContext;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiNotificationContextAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiNotificationContextAugmentation2   {
  @JsonProperty("notification-context")
  private TapiNotificationContextNotificationContext notificationContext = null;

  public TapiNotificationContextAugmentation2 notificationContext(TapiNotificationContextNotificationContext notificationContext) {
    this.notificationContext = notificationContext;
    return this;
  }

  /**
   * Get notificationContext
   * @return notificationContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiNotificationContextNotificationContext getNotificationContext() {
    return notificationContext;
  }

  public void setNotificationContext(TapiNotificationContextNotificationContext notificationContext) {
    this.notificationContext = notificationContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationContextAugmentation2 tapiNotificationContextAugmentation2 = (TapiNotificationContextAugmentation2) o;
    return Objects.equals(this.notificationContext, tapiNotificationContextAugmentation2.notificationContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationContextAugmentation2 {\n");
    
    sb.append("    notificationContext: ").append(toIndentedString(notificationContext)).append("\n");
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
