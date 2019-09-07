package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonNameAndValue;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamCreateoamservicepointInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamCreateoamservicepointInput   {
  @JsonProperty("connectivity-service-end-point-id")
  private String connectivityServiceEndPointId = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("oam-service-id")
  private String oamServiceId = null;

  @JsonProperty("service-interface-point-id")
  private String serviceInterfacePointId = null;

  @JsonProperty("state")
  private TapiCommonAdministrativeState state = null;

  @JsonProperty("uuid")
  private String uuid = null;

  public TapiOamCreateoamservicepointInput connectivityServiceEndPointId(String connectivityServiceEndPointId) {
    this.connectivityServiceEndPointId = connectivityServiceEndPointId;
    return this;
  }

  /**
   * UUID of the CSEP to be monitored: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return connectivityServiceEndPointId
  **/
  @ApiModelProperty(value = "UUID of the CSEP to be monitored: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")

  public String getConnectivityServiceEndPointId() {
    return connectivityServiceEndPointId;
  }

  public void setConnectivityServiceEndPointId(String connectivityServiceEndPointId) {
    this.connectivityServiceEndPointId = connectivityServiceEndPointId;
  }

  public TapiOamCreateoamservicepointInput layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  /**
   * Get layerProtocolName
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonLayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiOamCreateoamservicepointInput name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamCreateoamservicepointInput addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. This value is unique in some namespace but may change during the life of the entity.                      A name carries no semantics with respect to the purpose of the entity.
   * @return name
  **/
  @ApiModelProperty(value = "List of names. This value is unique in some namespace but may change during the life of the entity.                      A name carries no semantics with respect to the purpose of the entity.")
  @Valid
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiOamCreateoamservicepointInput oamServiceId(String oamServiceId) {
    this.oamServiceId = oamServiceId;
    return this;
  }

  /**
   * UUID of the parent OamService: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return oamServiceId
  **/
  @ApiModelProperty(value = "UUID of the parent OamService: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")

  public String getOamServiceId() {
    return oamServiceId;
  }

  public void setOamServiceId(String oamServiceId) {
    this.oamServiceId = oamServiceId;
  }

  public TapiOamCreateoamservicepointInput serviceInterfacePointId(String serviceInterfacePointId) {
    this.serviceInterfacePointId = serviceInterfacePointId;
    return this;
  }

  /**
   * UUID of the associated SIP to be monitored: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return serviceInterfacePointId
  **/
  @ApiModelProperty(value = "UUID of the associated SIP to be monitored: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")

  public String getServiceInterfacePointId() {
    return serviceInterfacePointId;
  }

  public void setServiceInterfacePointId(String serviceInterfacePointId) {
    this.serviceInterfacePointId = serviceInterfacePointId;
  }

  public TapiOamCreateoamservicepointInput state(TapiCommonAdministrativeState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonAdministrativeState getState() {
    return state;
  }

  public void setState(TapiCommonAdministrativeState state) {
    this.state = state;
  }

  public TapiOamCreateoamservicepointInput uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamCreateoamservicepointInput tapiOamCreateoamservicepointInput = (TapiOamCreateoamservicepointInput) o;
    return Objects.equals(this.connectivityServiceEndPointId, tapiOamCreateoamservicepointInput.connectivityServiceEndPointId) &&
        Objects.equals(this.layerProtocolName, tapiOamCreateoamservicepointInput.layerProtocolName) &&
        Objects.equals(this.name, tapiOamCreateoamservicepointInput.name) &&
        Objects.equals(this.oamServiceId, tapiOamCreateoamservicepointInput.oamServiceId) &&
        Objects.equals(this.serviceInterfacePointId, tapiOamCreateoamservicepointInput.serviceInterfacePointId) &&
        Objects.equals(this.state, tapiOamCreateoamservicepointInput.state) &&
        Objects.equals(this.uuid, tapiOamCreateoamservicepointInput.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityServiceEndPointId, layerProtocolName, name, oamServiceId, serviceInterfacePointId, state, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamCreateoamservicepointInput {\n");
    
    sb.append("    connectivityServiceEndPointId: ").append(toIndentedString(connectivityServiceEndPointId)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oamServiceId: ").append(toIndentedString(oamServiceId)).append("\n");
    sb.append("    serviceInterfacePointId: ").append(toIndentedString(serviceInterfacePointId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
