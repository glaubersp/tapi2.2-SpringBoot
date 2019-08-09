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
 * TapiTopologyNepLayerProtocolCapability
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiTopologyNepLayerProtocolCapability   {
  @JsonProperty("layer-protocol-qualifier")
  private String layerProtocolQualifier = null;

  @JsonProperty("number-of-cep-instances")
  private Integer numberOfCepInstances = null;

  public TapiTopologyNepLayerProtocolCapability layerProtocolQualifier(String layerProtocolQualifier) {
    this.layerProtocolQualifier = layerProtocolQualifier;
    return this;
  }

  /**
   * none
   * @return layerProtocolQualifier
  **/
  @ApiModelProperty(value = "none")

  public String getLayerProtocolQualifier() {
    return layerProtocolQualifier;
  }

  public void setLayerProtocolQualifier(String layerProtocolQualifier) {
    this.layerProtocolQualifier = layerProtocolQualifier;
  }

  public TapiTopologyNepLayerProtocolCapability numberOfCepInstances(Integer numberOfCepInstances) {
    this.numberOfCepInstances = numberOfCepInstances;
    return this;
  }

  /**
   * none
   * @return numberOfCepInstances
  **/
  @ApiModelProperty(value = "none")

  public Integer getNumberOfCepInstances() {
    return numberOfCepInstances;
  }

  public void setNumberOfCepInstances(Integer numberOfCepInstances) {
    this.numberOfCepInstances = numberOfCepInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyNepLayerProtocolCapability tapiTopologyNepLayerProtocolCapability = (TapiTopologyNepLayerProtocolCapability) o;
    return Objects.equals(this.layerProtocolQualifier, tapiTopologyNepLayerProtocolCapability.layerProtocolQualifier) &&
        Objects.equals(this.numberOfCepInstances, tapiTopologyNepLayerProtocolCapability.numberOfCepInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layerProtocolQualifier, numberOfCepInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyNepLayerProtocolCapability {\n");
    
    sb.append("    layerProtocolQualifier: ").append(toIndentedString(layerProtocolQualifier)).append("\n");
    sb.append("    numberOfCepInstances: ").append(toIndentedString(numberOfCepInstances)).append("\n");
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
