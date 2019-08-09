package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiTopologyLink;
import io.swagger.model.TapiTopologyNode;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyTopology
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiTopologyTopology extends TapiCommonGlobalClass  {
  @JsonProperty("layer-protocol-name")
  @Valid
  private List<TapiCommonLayerProtocolName> layerProtocolName = null;

  @JsonProperty("link")
  @Valid
  private List<TapiTopologyLink> link = null;

  @JsonProperty("node")
  @Valid
  private List<TapiTopologyNode> node = null;

  @JsonProperty("boundary-node-edge-point")
  @Valid
  private List<TapiTopologyNodeEdgePointRef> boundaryNodeEdgePoint = null;

  public TapiTopologyTopology layerProtocolName(List<TapiCommonLayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  public TapiTopologyTopology addLayerProtocolNameItem(TapiCommonLayerProtocolName layerProtocolNameItem) {
    if (this.layerProtocolName == null) {
      this.layerProtocolName = new ArrayList<TapiCommonLayerProtocolName>();
    }
    this.layerProtocolName.add(layerProtocolNameItem);
    return this;
  }

  /**
   * none
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiCommonLayerProtocolName> getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(List<TapiCommonLayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiTopologyTopology link(List<TapiTopologyLink> link) {
    this.link = link;
    return this;
  }

  public TapiTopologyTopology addLinkItem(TapiTopologyLink linkItem) {
    if (this.link == null) {
      this.link = new ArrayList<TapiTopologyLink>();
    }
    this.link.add(linkItem);
    return this;
  }

  /**
   * none
   * @return link
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyLink> getLink() {
    return link;
  }

  public void setLink(List<TapiTopologyLink> link) {
    this.link = link;
  }

  public TapiTopologyTopology node(List<TapiTopologyNode> node) {
    this.node = node;
    return this;
  }

  public TapiTopologyTopology addNodeItem(TapiTopologyNode nodeItem) {
    if (this.node == null) {
      this.node = new ArrayList<TapiTopologyNode>();
    }
    this.node.add(nodeItem);
    return this;
  }

  /**
   * none
   * @return node
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyNode> getNode() {
    return node;
  }

  public void setNode(List<TapiTopologyNode> node) {
    this.node = node;
  }

  public TapiTopologyTopology boundaryNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> boundaryNodeEdgePoint) {
    this.boundaryNodeEdgePoint = boundaryNodeEdgePoint;
    return this;
  }

  public TapiTopologyTopology addBoundaryNodeEdgePointItem(TapiTopologyNodeEdgePointRef boundaryNodeEdgePointItem) {
    if (this.boundaryNodeEdgePoint == null) {
      this.boundaryNodeEdgePoint = new ArrayList<TapiTopologyNodeEdgePointRef>();
    }
    this.boundaryNodeEdgePoint.add(boundaryNodeEdgePointItem);
    return this;
  }

  /**
   * none
   * @return boundaryNodeEdgePoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyNodeEdgePointRef> getBoundaryNodeEdgePoint() {
    return boundaryNodeEdgePoint;
  }

  public void setBoundaryNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> boundaryNodeEdgePoint) {
    this.boundaryNodeEdgePoint = boundaryNodeEdgePoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyTopology tapiTopologyTopology = (TapiTopologyTopology) o;
    return Objects.equals(this.layerProtocolName, tapiTopologyTopology.layerProtocolName) &&
        Objects.equals(this.link, tapiTopologyTopology.link) &&
        Objects.equals(this.node, tapiTopologyTopology.node) &&
        Objects.equals(this.boundaryNodeEdgePoint, tapiTopologyTopology.boundaryNodeEdgePoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layerProtocolName, link, node, boundaryNodeEdgePoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyTopology {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    boundaryNodeEdgePoint: ").append(toIndentedString(boundaryNodeEdgePoint)).append("\n");
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
