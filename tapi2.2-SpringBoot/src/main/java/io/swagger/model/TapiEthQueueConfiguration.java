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
 * TapiEthQueueConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthQueueConfiguration   {
  @JsonProperty("queue-threshold")
  private Integer queueThreshold = null;

  @JsonProperty("queue-id")
  private Integer queueId = null;

  @JsonProperty("queue-depth")
  private Integer queueDepth = null;

  public TapiEthQueueConfiguration queueThreshold(Integer queueThreshold) {
    this.queueThreshold = queueThreshold;
    return this;
  }

  /**
   * This attribute defines the threshold of the queue in bytes.
   * @return queueThreshold
  **/
  @ApiModelProperty(value = "This attribute defines the threshold of the queue in bytes.")

  public Integer getQueueThreshold() {
    return queueThreshold;
  }

  public void setQueueThreshold(Integer queueThreshold) {
    this.queueThreshold = queueThreshold;
  }

  public TapiEthQueueConfiguration queueId(Integer queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * This attribute indicates the queue id.
   * @return queueId
  **/
  @ApiModelProperty(value = "This attribute indicates the queue id.")

  public Integer getQueueId() {
    return queueId;
  }

  public void setQueueId(Integer queueId) {
    this.queueId = queueId;
  }

  public TapiEthQueueConfiguration queueDepth(Integer queueDepth) {
    this.queueDepth = queueDepth;
    return this;
  }

  /**
   * This attribute defines the depth of the queue in bytes.
   * @return queueDepth
  **/
  @ApiModelProperty(value = "This attribute defines the depth of the queue in bytes.")

  public Integer getQueueDepth() {
    return queueDepth;
  }

  public void setQueueDepth(Integer queueDepth) {
    this.queueDepth = queueDepth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthQueueConfiguration tapiEthQueueConfiguration = (TapiEthQueueConfiguration) o;
    return Objects.equals(this.queueThreshold, tapiEthQueueConfiguration.queueThreshold) &&
        Objects.equals(this.queueId, tapiEthQueueConfiguration.queueId) &&
        Objects.equals(this.queueDepth, tapiEthQueueConfiguration.queueDepth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueThreshold, queueId, queueDepth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthQueueConfiguration {\n");
    
    sb.append("    queueThreshold: ").append(toIndentedString(queueThreshold)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    queueDepth: ").append(toIndentedString(queueDepth)).append("\n");
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
