package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthPriorityConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthPriorityConfiguration   {
  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("queue-id")
  private Integer queueId = null;

  public TapiEthPriorityConfiguration priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * none
   * @return priority
  **/
  @ApiModelProperty(value = "none")

  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TapiEthPriorityConfiguration queueId(Integer queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * none
   * @return queueId
  **/
  @ApiModelProperty(value = "none")

  public Integer getQueueId() {
    return queueId;
  }

  public void setQueueId(Integer queueId) {
    this.queueId = queueId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthPriorityConfiguration tapiEthPriorityConfiguration = (TapiEthPriorityConfiguration) o;
    return Objects.equals(this.priority, tapiEthPriorityConfiguration.priority) &&
        Objects.equals(this.queueId, tapiEthPriorityConfiguration.queueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, queueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthPriorityConfiguration {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
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
