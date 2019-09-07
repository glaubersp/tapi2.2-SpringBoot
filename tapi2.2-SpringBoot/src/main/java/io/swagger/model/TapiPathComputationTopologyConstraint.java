package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPathComputationTopologyConstraint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPathComputationTopologyConstraint extends TapiCommonLocalClass  {
  @JsonProperty("avoid-topology")
  private String avoidTopology = null;

  @JsonProperty("constraint-weight")
  private Integer constraintWeight = null;

  @JsonProperty("exclude-link")
  private String excludeLink = null;

  @JsonProperty("exclude-node")
  private String excludeNode = null;

  @JsonProperty("exclude-node-edge-point")
  private String excludeNodeEdgePoint = null;

  @JsonProperty("exclude-path")
  private String excludePath = null;

  @JsonProperty("include-link")
  private String includeLink = null;

  @JsonProperty("include-node")
  private String includeNode = null;

  @JsonProperty("include-node-edge-point")
  private String includeNodeEdgePoint = null;

  @JsonProperty("include-path")
  private String includePath = null;

  @JsonProperty("include-topology")
  private String includeTopology = null;

  @JsonProperty("preferred-transport-layer")
  private TapiCommonLayerProtocolName preferredTransportLayer = null;

  public TapiPathComputationTopologyConstraint avoidTopology(String avoidTopology) {
    this.avoidTopology = avoidTopology;
    return this;
  }

  /**
   * none
   * @return avoidTopology
  **/
  @ApiModelProperty(value = "none")

  public String getAvoidTopology() {
    return avoidTopology;
  }

  public void setAvoidTopology(String avoidTopology) {
    this.avoidTopology = avoidTopology;
  }

  public TapiPathComputationTopologyConstraint constraintWeight(Integer constraintWeight) {
    this.constraintWeight = constraintWeight;
    return this;
  }

  /**
   * Zero and positive values: zero means 'strongly required to be included', +1 means 'less strongly required to be included', etc.                  For example the work/intended route will be calculated considering the topologies which weights are lowest (but not negative).                  Negative values: -1 means 'strongly required to be excluded', -2 means 'less strongly required to be excluded', etc.
   * @return constraintWeight
  **/
  @ApiModelProperty(value = "Zero and positive values: zero means 'strongly required to be included', +1 means 'less strongly required to be included', etc.                  For example the work/intended route will be calculated considering the topologies which weights are lowest (but not negative).                  Negative values: -1 means 'strongly required to be excluded', -2 means 'less strongly required to be excluded', etc.")

  public Integer getConstraintWeight() {
    return constraintWeight;
  }

  public void setConstraintWeight(Integer constraintWeight) {
    this.constraintWeight = constraintWeight;
  }

  public TapiPathComputationTopologyConstraint excludeLink(String excludeLink) {
    this.excludeLink = excludeLink;
    return this;
  }

  /**
   * none
   * @return excludeLink
  **/
  @ApiModelProperty(value = "none")

  public String getExcludeLink() {
    return excludeLink;
  }

  public void setExcludeLink(String excludeLink) {
    this.excludeLink = excludeLink;
  }

  public TapiPathComputationTopologyConstraint excludeNode(String excludeNode) {
    this.excludeNode = excludeNode;
    return this;
  }

  /**
   * none
   * @return excludeNode
  **/
  @ApiModelProperty(value = "none")

  public String getExcludeNode() {
    return excludeNode;
  }

  public void setExcludeNode(String excludeNode) {
    this.excludeNode = excludeNode;
  }

  public TapiPathComputationTopologyConstraint excludeNodeEdgePoint(String excludeNodeEdgePoint) {
    this.excludeNodeEdgePoint = excludeNodeEdgePoint;
    return this;
  }

  /**
   * none
   * @return excludeNodeEdgePoint
  **/
  @ApiModelProperty(value = "none")

  public String getExcludeNodeEdgePoint() {
    return excludeNodeEdgePoint;
  }

  public void setExcludeNodeEdgePoint(String excludeNodeEdgePoint) {
    this.excludeNodeEdgePoint = excludeNodeEdgePoint;
  }

  public TapiPathComputationTopologyConstraint excludePath(String excludePath) {
    this.excludePath = excludePath;
    return this;
  }

  /**
   * none
   * @return excludePath
  **/
  @ApiModelProperty(value = "none")

  public String getExcludePath() {
    return excludePath;
  }

  public void setExcludePath(String excludePath) {
    this.excludePath = excludePath;
  }

  public TapiPathComputationTopologyConstraint includeLink(String includeLink) {
    this.includeLink = includeLink;
    return this;
  }

  /**
   * This is a loose constraint - that is it is unordered and could be a partial list 
   * @return includeLink
  **/
  @ApiModelProperty(value = "This is a loose constraint - that is it is unordered and could be a partial list ")

  public String getIncludeLink() {
    return includeLink;
  }

  public void setIncludeLink(String includeLink) {
    this.includeLink = includeLink;
  }

  public TapiPathComputationTopologyConstraint includeNode(String includeNode) {
    this.includeNode = includeNode;
    return this;
  }

  /**
   * This is a loose constraint - that is it is unordered and could be a partial list
   * @return includeNode
  **/
  @ApiModelProperty(value = "This is a loose constraint - that is it is unordered and could be a partial list")

  public String getIncludeNode() {
    return includeNode;
  }

  public void setIncludeNode(String includeNode) {
    this.includeNode = includeNode;
  }

  public TapiPathComputationTopologyConstraint includeNodeEdgePoint(String includeNodeEdgePoint) {
    this.includeNodeEdgePoint = includeNodeEdgePoint;
    return this;
  }

  /**
   * none
   * @return includeNodeEdgePoint
  **/
  @ApiModelProperty(value = "none")

  public String getIncludeNodeEdgePoint() {
    return includeNodeEdgePoint;
  }

  public void setIncludeNodeEdgePoint(String includeNodeEdgePoint) {
    this.includeNodeEdgePoint = includeNodeEdgePoint;
  }

  public TapiPathComputationTopologyConstraint includePath(String includePath) {
    this.includePath = includePath;
    return this;
  }

  /**
   * none
   * @return includePath
  **/
  @ApiModelProperty(value = "none")

  public String getIncludePath() {
    return includePath;
  }

  public void setIncludePath(String includePath) {
    this.includePath = includePath;
  }

  public TapiPathComputationTopologyConstraint includeTopology(String includeTopology) {
    this.includeTopology = includeTopology;
    return this;
  }

  /**
   * none
   * @return includeTopology
  **/
  @ApiModelProperty(value = "none")

  public String getIncludeTopology() {
    return includeTopology;
  }

  public void setIncludeTopology(String includeTopology) {
    this.includeTopology = includeTopology;
  }

  public TapiPathComputationTopologyConstraint preferredTransportLayer(TapiCommonLayerProtocolName preferredTransportLayer) {
    this.preferredTransportLayer = preferredTransportLayer;
    return this;
  }

  /**
   * Get preferredTransportLayer
   * @return preferredTransportLayer
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonLayerProtocolName getPreferredTransportLayer() {
    return preferredTransportLayer;
  }

  public void setPreferredTransportLayer(TapiCommonLayerProtocolName preferredTransportLayer) {
    this.preferredTransportLayer = preferredTransportLayer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPathComputationTopologyConstraint tapiPathComputationTopologyConstraint = (TapiPathComputationTopologyConstraint) o;
    return Objects.equals(this.avoidTopology, tapiPathComputationTopologyConstraint.avoidTopology) &&
        Objects.equals(this.constraintWeight, tapiPathComputationTopologyConstraint.constraintWeight) &&
        Objects.equals(this.excludeLink, tapiPathComputationTopologyConstraint.excludeLink) &&
        Objects.equals(this.excludeNode, tapiPathComputationTopologyConstraint.excludeNode) &&
        Objects.equals(this.excludeNodeEdgePoint, tapiPathComputationTopologyConstraint.excludeNodeEdgePoint) &&
        Objects.equals(this.excludePath, tapiPathComputationTopologyConstraint.excludePath) &&
        Objects.equals(this.includeLink, tapiPathComputationTopologyConstraint.includeLink) &&
        Objects.equals(this.includeNode, tapiPathComputationTopologyConstraint.includeNode) &&
        Objects.equals(this.includeNodeEdgePoint, tapiPathComputationTopologyConstraint.includeNodeEdgePoint) &&
        Objects.equals(this.includePath, tapiPathComputationTopologyConstraint.includePath) &&
        Objects.equals(this.includeTopology, tapiPathComputationTopologyConstraint.includeTopology) &&
        Objects.equals(this.preferredTransportLayer, tapiPathComputationTopologyConstraint.preferredTransportLayer) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avoidTopology, constraintWeight, excludeLink, excludeNode, excludeNodeEdgePoint, excludePath, includeLink, includeNode, includeNodeEdgePoint, includePath, includeTopology, preferredTransportLayer, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPathComputationTopologyConstraint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    avoidTopology: ").append(toIndentedString(avoidTopology)).append("\n");
    sb.append("    constraintWeight: ").append(toIndentedString(constraintWeight)).append("\n");
    sb.append("    excludeLink: ").append(toIndentedString(excludeLink)).append("\n");
    sb.append("    excludeNode: ").append(toIndentedString(excludeNode)).append("\n");
    sb.append("    excludeNodeEdgePoint: ").append(toIndentedString(excludeNodeEdgePoint)).append("\n");
    sb.append("    excludePath: ").append(toIndentedString(excludePath)).append("\n");
    sb.append("    includeLink: ").append(toIndentedString(includeLink)).append("\n");
    sb.append("    includeNode: ").append(toIndentedString(includeNode)).append("\n");
    sb.append("    includeNodeEdgePoint: ").append(toIndentedString(includeNodeEdgePoint)).append("\n");
    sb.append("    includePath: ").append(toIndentedString(includePath)).append("\n");
    sb.append("    includeTopology: ").append(toIndentedString(includeTopology)).append("\n");
    sb.append("    preferredTransportLayer: ").append(toIndentedString(preferredTransportLayer)).append("\n");
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
