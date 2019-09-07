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
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import io.swagger.model.TapiTopologyTopologyNode;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyTopologycontextTopology
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyTopologycontextTopology extends TapiCommonGlobalClass  {
  @JsonProperty("boundary-node-edge-point")
  @Valid
  private List<TapiTopologyNodeEdgePointRef> boundaryNodeEdgePoint = null;

  @JsonProperty("layer-protocol-name")
  @Valid
  private List<TapiCommonLayerProtocolName> layerProtocolName = null;

  @JsonProperty("link")
  @Valid
  private List<TapiTopologyLink> link = null;

  @JsonProperty("node")
  @Valid
  private List<TapiTopologyTopologyNode> node = null;

  public TapiTopologyTopologycontextTopology boundaryNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> boundaryNodeEdgePoint) {
    this.boundaryNodeEdgePoint = boundaryNodeEdgePoint;
    return this;
  }

  public TapiTopologyTopologycontextTopology addBoundaryNodeEdgePointItem(TapiTopologyNodeEdgePointRef boundaryNodeEdgePointItem) {
    if (this.boundaryNodeEdgePoint == null) {
      this.boundaryNodeEdgePoint = new ArrayList<>();
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

  public TapiTopologyTopologycontextTopology layerProtocolName(List<TapiCommonLayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  public TapiTopologyTopologycontextTopology addLayerProtocolNameItem(TapiCommonLayerProtocolName layerProtocolNameItem) {
    if (this.layerProtocolName == null) {
      this.layerProtocolName = new ArrayList<>();
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

  public TapiTopologyTopologycontextTopology link(List<TapiTopologyLink> link) {
    this.link = link;
    return this;
  }

  public TapiTopologyTopologycontextTopology addLinkItem(TapiTopologyLink linkItem) {
    if (this.link == null) {
      this.link = new ArrayList<>();
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

  public TapiTopologyTopologycontextTopology node(List<TapiTopologyTopologyNode> node) {
    this.node = node;
    return this;
  }

  public TapiTopologyTopologycontextTopology addNodeItem(TapiTopologyTopologyNode nodeItem) {
    if (this.node == null) {
      this.node = new ArrayList<>();
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
  public List<TapiTopologyTopologyNode> getNode() {
    return node;
  }

  public void setNode(List<TapiTopologyTopologyNode> node) {
    this.node = node;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyTopologycontextTopology tapiTopologyTopologycontextTopology = (TapiTopologyTopologycontextTopology) o;
    return Objects.equals(this.boundaryNodeEdgePoint, tapiTopologyTopologycontextTopology.boundaryNodeEdgePoint) &&
        Objects.equals(this.layerProtocolName, tapiTopologyTopologycontextTopology.layerProtocolName) &&
        Objects.equals(this.link, tapiTopologyTopologycontextTopology.link) &&
        Objects.equals(this.node, tapiTopologyTopologycontextTopology.node) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundaryNodeEdgePoint, layerProtocolName, link, node, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyTopologycontextTopology {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    boundaryNodeEdgePoint: ").append(toIndentedString(boundaryNodeEdgePoint)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
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
