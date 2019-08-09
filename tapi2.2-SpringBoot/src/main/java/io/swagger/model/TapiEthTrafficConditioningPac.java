package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthPriorityConfiguration;
import io.swagger.model.TapiEthTrafficConditioningConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthTrafficConditioningPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthTrafficConditioningPac   {
  @JsonProperty("codirectional")
  private Boolean codirectional = false;

  @JsonProperty("prio-config-list")
  @Valid
  private List<TapiEthPriorityConfiguration> prioConfigList = null;

  @JsonProperty("cond-config-list")
  @Valid
  private List<TapiEthTrafficConditioningConfiguration> condConfigList = null;

  public TapiEthTrafficConditioningPac codirectional(Boolean codirectional) {
    this.codirectional = codirectional;
    return this;
  }

  /**
   * This attribute indicates the direction of the conditioner. The value of true means that the conditioner (modeled as a TCS Sink according to G.8021) is associated with the sink part of the containing CTP. The value of false means that the conditioner (modeled as a TCS Sink according to G.8021) is associated with the source part of the containing CTP.
   * @return codirectional
  **/
  @ApiModelProperty(value = "This attribute indicates the direction of the conditioner. The value of true means that the conditioner (modeled as a TCS Sink according to G.8021) is associated with the sink part of the containing CTP. The value of false means that the conditioner (modeled as a TCS Sink according to G.8021) is associated with the source part of the containing CTP.")

  public Boolean isCodirectional() {
    return codirectional;
  }

  public void setCodirectional(Boolean codirectional) {
    this.codirectional = codirectional;
  }

  public TapiEthTrafficConditioningPac prioConfigList(List<TapiEthPriorityConfiguration> prioConfigList) {
    this.prioConfigList = prioConfigList;
    return this;
  }

  public TapiEthTrafficConditioningPac addPrioConfigListItem(TapiEthPriorityConfiguration prioConfigListItem) {
    if (this.prioConfigList == null) {
      this.prioConfigList = new ArrayList<TapiEthPriorityConfiguration>();
    }
    this.prioConfigList.add(prioConfigListItem);
    return this;
  }

  /**
   * This attribute indicates the Priority Splitter function for the mapping of the Ethernet frame priority (ETH_CI_P) values to the output queue.
   * @return prioConfigList
  **/
  @ApiModelProperty(value = "This attribute indicates the Priority Splitter function for the mapping of the Ethernet frame priority (ETH_CI_P) values to the output queue.")
  @Valid
  public List<TapiEthPriorityConfiguration> getPrioConfigList() {
    return prioConfigList;
  }

  public void setPrioConfigList(List<TapiEthPriorityConfiguration> prioConfigList) {
    this.prioConfigList = prioConfigList;
  }

  public TapiEthTrafficConditioningPac condConfigList(List<TapiEthTrafficConditioningConfiguration> condConfigList) {
    this.condConfigList = condConfigList;
    return this;
  }

  public TapiEthTrafficConditioningPac addCondConfigListItem(TapiEthTrafficConditioningConfiguration condConfigListItem) {
    if (this.condConfigList == null) {
      this.condConfigList = new ArrayList<TapiEthTrafficConditioningConfiguration>();
    }
    this.condConfigList.add(condConfigListItem);
    return this;
  }

  /**
   * This attribute indicates for the conditioner process the conditioning parameters:                  - Queue ID: Indicates the Queue ID                  - Committed Information Rate (CIR): number of bits per second                  - Committed Burst Size (CBS): number of bytes                  - Excess Information Rate (EIR): number of bits per second                  - Excess Burst Size (EBS): number of bytes                  - Coupling flag (CF): 0 or 1                  - Color mode (CM): color-blind and color-aware.
   * @return condConfigList
  **/
  @ApiModelProperty(value = "This attribute indicates for the conditioner process the conditioning parameters:                  - Queue ID: Indicates the Queue ID                  - Committed Information Rate (CIR): number of bits per second                  - Committed Burst Size (CBS): number of bytes                  - Excess Information Rate (EIR): number of bits per second                  - Excess Burst Size (EBS): number of bytes                  - Coupling flag (CF): 0 or 1                  - Color mode (CM): color-blind and color-aware.")
  @Valid
  public List<TapiEthTrafficConditioningConfiguration> getCondConfigList() {
    return condConfigList;
  }

  public void setCondConfigList(List<TapiEthTrafficConditioningConfiguration> condConfigList) {
    this.condConfigList = condConfigList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthTrafficConditioningPac tapiEthTrafficConditioningPac = (TapiEthTrafficConditioningPac) o;
    return Objects.equals(this.codirectional, tapiEthTrafficConditioningPac.codirectional) &&
        Objects.equals(this.prioConfigList, tapiEthTrafficConditioningPac.prioConfigList) &&
        Objects.equals(this.condConfigList, tapiEthTrafficConditioningPac.condConfigList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codirectional, prioConfigList, condConfigList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthTrafficConditioningPac {\n");
    
    sb.append("    codirectional: ").append(toIndentedString(codirectional)).append("\n");
    sb.append("    prioConfigList: ").append(toIndentedString(prioConfigList)).append("\n");
    sb.append("    condConfigList: ").append(toIndentedString(condConfigList)).append("\n");
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
