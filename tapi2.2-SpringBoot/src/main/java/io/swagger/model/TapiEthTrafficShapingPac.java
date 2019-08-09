package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthPriorityConfiguration;
import io.swagger.model.TapiEthQueueConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthTrafficShapingPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthTrafficShapingPac   {
  @JsonProperty("codirectional")
  private Boolean codirectional = false;

  @JsonProperty("sched-config")
  private String schedConfig = null;

  @JsonProperty("queue-config-list")
  @Valid
  private List<TapiEthQueueConfiguration> queueConfigList = null;

  @JsonProperty("prio-config-list")
  @Valid
  private List<TapiEthPriorityConfiguration> prioConfigList = null;

  public TapiEthTrafficShapingPac codirectional(Boolean codirectional) {
    this.codirectional = codirectional;
    return this;
  }

  /**
   * This attribute indicates the direction of the shaping function. The value of true means that the shaping (modeled as a TCS Source according to G.8021) is associated with the source part of the containing CTP. The value of false means that the shaping (modeled as a TCS Source according to G.8021) is associated with the sink part of the containing CTP.
   * @return codirectional
  **/
  @ApiModelProperty(value = "This attribute indicates the direction of the shaping function. The value of true means that the shaping (modeled as a TCS Source according to G.8021) is associated with the source part of the containing CTP. The value of false means that the shaping (modeled as a TCS Source according to G.8021) is associated with the sink part of the containing CTP.")

  public Boolean isCodirectional() {
    return codirectional;
  }

  public void setCodirectional(Boolean codirectional) {
    this.codirectional = codirectional;
  }

  public TapiEthTrafficShapingPac schedConfig(String schedConfig) {
    this.schedConfig = schedConfig;
    return this;
  }

  /**
   * This attribute configures the scheduler process. The value of this attribute is for further study because it is for further study in G.8021.                  Scheduler is a pointer to a Scheduler object, which is to be defined in the future (because in G.8021, this is FFS).                  Note that the only significance of the GTCS function defined in G.8021 is the use of a common scheduler for shaping. Given that, G.8052 models the common scheduler feature by having a common value for this attribute.
   * @return schedConfig
  **/
  @ApiModelProperty(value = "This attribute configures the scheduler process. The value of this attribute is for further study because it is for further study in G.8021.                  Scheduler is a pointer to a Scheduler object, which is to be defined in the future (because in G.8021, this is FFS).                  Note that the only significance of the GTCS function defined in G.8021 is the use of a common scheduler for shaping. Given that, G.8052 models the common scheduler feature by having a common value for this attribute.")

  public String getSchedConfig() {
    return schedConfig;
  }

  public void setSchedConfig(String schedConfig) {
    this.schedConfig = schedConfig;
  }

  public TapiEthTrafficShapingPac queueConfigList(List<TapiEthQueueConfiguration> queueConfigList) {
    this.queueConfigList = queueConfigList;
    return this;
  }

  public TapiEthTrafficShapingPac addQueueConfigListItem(TapiEthQueueConfiguration queueConfigListItem) {
    if (this.queueConfigList == null) {
      this.queueConfigList = new ArrayList<TapiEthQueueConfiguration>();
    }
    this.queueConfigList.add(queueConfigListItem);
    return this;
  }

  /**
   * This attribute configures the Queue depth and Dropping threshold parameters of the Queue process. The Queue depth sets the maximum size of the queue in bytes. An incoming ETH_CI traffic unit is dropped if there is insufficient space in the queue to hold the whole unit. The Dropping threshold sets the threshold of the queue. If the queue is filled beyond this threshold, incoming ETH_CI traffic units accompanied by the ETH_CI_DE signal set are dropped.
   * @return queueConfigList
  **/
  @ApiModelProperty(value = "This attribute configures the Queue depth and Dropping threshold parameters of the Queue process. The Queue depth sets the maximum size of the queue in bytes. An incoming ETH_CI traffic unit is dropped if there is insufficient space in the queue to hold the whole unit. The Dropping threshold sets the threshold of the queue. If the queue is filled beyond this threshold, incoming ETH_CI traffic units accompanied by the ETH_CI_DE signal set are dropped.")
  @Valid
  public List<TapiEthQueueConfiguration> getQueueConfigList() {
    return queueConfigList;
  }

  public void setQueueConfigList(List<TapiEthQueueConfiguration> queueConfigList) {
    this.queueConfigList = queueConfigList;
  }

  public TapiEthTrafficShapingPac prioConfigList(List<TapiEthPriorityConfiguration> prioConfigList) {
    this.prioConfigList = prioConfigList;
    return this;
  }

  public TapiEthTrafficShapingPac addPrioConfigListItem(TapiEthPriorityConfiguration prioConfigListItem) {
    if (this.prioConfigList == null) {
      this.prioConfigList = new ArrayList<TapiEthPriorityConfiguration>();
    }
    this.prioConfigList.add(prioConfigListItem);
    return this;
  }

  /**
   * This attribute configures the Priority Splitter function for the mapping of the Ethernet frame priority (ETH_CI_P) values to the output queue.
   * @return prioConfigList
  **/
  @ApiModelProperty(value = "This attribute configures the Priority Splitter function for the mapping of the Ethernet frame priority (ETH_CI_P) values to the output queue.")
  @Valid
  public List<TapiEthPriorityConfiguration> getPrioConfigList() {
    return prioConfigList;
  }

  public void setPrioConfigList(List<TapiEthPriorityConfiguration> prioConfigList) {
    this.prioConfigList = prioConfigList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthTrafficShapingPac tapiEthTrafficShapingPac = (TapiEthTrafficShapingPac) o;
    return Objects.equals(this.codirectional, tapiEthTrafficShapingPac.codirectional) &&
        Objects.equals(this.schedConfig, tapiEthTrafficShapingPac.schedConfig) &&
        Objects.equals(this.queueConfigList, tapiEthTrafficShapingPac.queueConfigList) &&
        Objects.equals(this.prioConfigList, tapiEthTrafficShapingPac.prioConfigList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codirectional, schedConfig, queueConfigList, prioConfigList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthTrafficShapingPac {\n");
    
    sb.append("    codirectional: ").append(toIndentedString(codirectional)).append("\n");
    sb.append("    schedConfig: ").append(toIndentedString(schedConfig)).append("\n");
    sb.append("    queueConfigList: ").append(toIndentedString(queueConfigList)).append("\n");
    sb.append("    prioConfigList: ").append(toIndentedString(prioConfigList)).append("\n");
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
