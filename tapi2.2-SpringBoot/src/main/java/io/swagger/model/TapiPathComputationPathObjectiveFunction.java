package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonDirectiveValue;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPathComputationPathObjectiveFunction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPathComputationPathObjectiveFunction extends TapiCommonLocalClass  {
  @JsonProperty("bandwidth-optimization")
  private TapiCommonDirectiveValue bandwidthOptimization = null;

  @JsonProperty("concurrent-paths")
  private TapiCommonDirectiveValue concurrentPaths = null;

  @JsonProperty("cost-optimization")
  private TapiCommonDirectiveValue costOptimization = null;

  @JsonProperty("link-utilization")
  private TapiCommonDirectiveValue linkUtilization = null;

  @JsonProperty("resource-sharing")
  private TapiCommonDirectiveValue resourceSharing = null;

  public TapiPathComputationPathObjectiveFunction bandwidthOptimization(TapiCommonDirectiveValue bandwidthOptimization) {
    this.bandwidthOptimization = bandwidthOptimization;
    return this;
  }

  /**
   * Get bandwidthOptimization
   * @return bandwidthOptimization
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonDirectiveValue getBandwidthOptimization() {
    return bandwidthOptimization;
  }

  public void setBandwidthOptimization(TapiCommonDirectiveValue bandwidthOptimization) {
    this.bandwidthOptimization = bandwidthOptimization;
  }

  public TapiPathComputationPathObjectiveFunction concurrentPaths(TapiCommonDirectiveValue concurrentPaths) {
    this.concurrentPaths = concurrentPaths;
    return this;
  }

  /**
   * Get concurrentPaths
   * @return concurrentPaths
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonDirectiveValue getConcurrentPaths() {
    return concurrentPaths;
  }

  public void setConcurrentPaths(TapiCommonDirectiveValue concurrentPaths) {
    this.concurrentPaths = concurrentPaths;
  }

  public TapiPathComputationPathObjectiveFunction costOptimization(TapiCommonDirectiveValue costOptimization) {
    this.costOptimization = costOptimization;
    return this;
  }

  /**
   * Get costOptimization
   * @return costOptimization
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonDirectiveValue getCostOptimization() {
    return costOptimization;
  }

  public void setCostOptimization(TapiCommonDirectiveValue costOptimization) {
    this.costOptimization = costOptimization;
  }

  public TapiPathComputationPathObjectiveFunction linkUtilization(TapiCommonDirectiveValue linkUtilization) {
    this.linkUtilization = linkUtilization;
    return this;
  }

  /**
   * Get linkUtilization
   * @return linkUtilization
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonDirectiveValue getLinkUtilization() {
    return linkUtilization;
  }

  public void setLinkUtilization(TapiCommonDirectiveValue linkUtilization) {
    this.linkUtilization = linkUtilization;
  }

  public TapiPathComputationPathObjectiveFunction resourceSharing(TapiCommonDirectiveValue resourceSharing) {
    this.resourceSharing = resourceSharing;
    return this;
  }

  /**
   * Get resourceSharing
   * @return resourceSharing
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonDirectiveValue getResourceSharing() {
    return resourceSharing;
  }

  public void setResourceSharing(TapiCommonDirectiveValue resourceSharing) {
    this.resourceSharing = resourceSharing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPathComputationPathObjectiveFunction tapiPathComputationPathObjectiveFunction = (TapiPathComputationPathObjectiveFunction) o;
    return Objects.equals(this.bandwidthOptimization, tapiPathComputationPathObjectiveFunction.bandwidthOptimization) &&
        Objects.equals(this.concurrentPaths, tapiPathComputationPathObjectiveFunction.concurrentPaths) &&
        Objects.equals(this.costOptimization, tapiPathComputationPathObjectiveFunction.costOptimization) &&
        Objects.equals(this.linkUtilization, tapiPathComputationPathObjectiveFunction.linkUtilization) &&
        Objects.equals(this.resourceSharing, tapiPathComputationPathObjectiveFunction.resourceSharing) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthOptimization, concurrentPaths, costOptimization, linkUtilization, resourceSharing, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPathComputationPathObjectiveFunction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bandwidthOptimization: ").append(toIndentedString(bandwidthOptimization)).append("\n");
    sb.append("    concurrentPaths: ").append(toIndentedString(concurrentPaths)).append("\n");
    sb.append("    costOptimization: ").append(toIndentedString(costOptimization)).append("\n");
    sb.append("    linkUtilization: ").append(toIndentedString(linkUtilization)).append("\n");
    sb.append("    resourceSharing: ").append(toIndentedString(resourceSharing)).append("\n");
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
