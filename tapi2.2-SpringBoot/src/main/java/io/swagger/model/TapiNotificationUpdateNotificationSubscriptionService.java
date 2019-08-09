package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiNotificationUpdatenotificationsubscriptionserviceOutput;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiNotificationUpdateNotificationSubscriptionService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiNotificationUpdateNotificationSubscriptionService   {
  @JsonProperty("output")
  private TapiNotificationUpdatenotificationsubscriptionserviceOutput output = null;

  public TapiNotificationUpdateNotificationSubscriptionService output(TapiNotificationUpdatenotificationsubscriptionserviceOutput output) {
    this.output = output;
    return this;
  }

  /**
   * Get output
   * @return output
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiNotificationUpdatenotificationsubscriptionserviceOutput getOutput() {
    return output;
  }

  public void setOutput(TapiNotificationUpdatenotificationsubscriptionserviceOutput output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationUpdateNotificationSubscriptionService tapiNotificationUpdateNotificationSubscriptionService = (TapiNotificationUpdateNotificationSubscriptionService) o;
    return Objects.equals(this.output, tapiNotificationUpdateNotificationSubscriptionService.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationUpdateNotificationSubscriptionService {\n");
    
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
