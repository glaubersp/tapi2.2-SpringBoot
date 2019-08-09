package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdminStatePac;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiEthEthOamService;
import io.swagger.model.TapiEthOamServiceAugmentation1;
import io.swagger.model.TapiOamMegRef;
import io.swagger.model.TapiOamOamserviceOamServicePoint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamGetoamservicelistOutputOamService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamGetoamservicelistOutputOamService extends TapiCommonAdminStatePac  {
  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("eth-oam-service")
  private TapiEthEthOamService ethOamService = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("oam-service-point")
  @Valid
  private List<TapiOamOamserviceOamServicePoint> oamServicePoint = null;

  @JsonProperty("meg")
  private TapiOamMegRef meg = null;

  public TapiOamGetoamservicelistOutputOamService name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamGetoamservicelistOutputOamService addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. This value is unique in some namespace but may change during the life of the entity.                  A name carries no semantics with respect to the purpose of the entity.
   * @return name
  **/
  @ApiModelProperty(value = "List of names. This value is unique in some namespace but may change during the life of the entity.                  A name carries no semantics with respect to the purpose of the entity.")
  @Valid
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiOamGetoamservicelistOutputOamService uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                  An UUID carries no semantics with respect to the purpose or state of the entity.                  UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                  Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                   Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                  An UUID carries no semantics with respect to the purpose or state of the entity.                  UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                  Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                   Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TapiOamGetoamservicelistOutputOamService ethOamService(TapiEthEthOamService ethOamService) {
    this.ethOamService = ethOamService;
    return this;
  }

  /**
   * Get ethOamService
   * @return ethOamService
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOamService getEthOamService() {
    return ethOamService;
  }

  public void setEthOamService(TapiEthEthOamService ethOamService) {
    this.ethOamService = ethOamService;
  }

  public TapiOamGetoamservicelistOutputOamService layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiOamGetoamservicelistOutputOamService oamServicePoint(List<TapiOamOamserviceOamServicePoint> oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
    return this;
  }

  public TapiOamGetoamservicelistOutputOamService addOamServicePointItem(TapiOamOamserviceOamServicePoint oamServicePointItem) {
    if (this.oamServicePoint == null) {
      this.oamServicePoint = new ArrayList<TapiOamOamserviceOamServicePoint>();
    }
    this.oamServicePoint.add(oamServicePointItem);
    return this;
  }

  /**
   * none
   * @return oamServicePoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiOamOamserviceOamServicePoint> getOamServicePoint() {
    return oamServicePoint;
  }

  public void setOamServicePoint(List<TapiOamOamserviceOamServicePoint> oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
  }

  public TapiOamGetoamservicelistOutputOamService meg(TapiOamMegRef meg) {
    this.meg = meg;
    return this;
  }

  /**
   * Get meg
   * @return meg
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamMegRef getMeg() {
    return meg;
  }

  public void setMeg(TapiOamMegRef meg) {
    this.meg = meg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamGetoamservicelistOutputOamService tapiOamGetoamservicelistOutputOamService = (TapiOamGetoamservicelistOutputOamService) o;
    return Objects.equals(this.name, tapiOamGetoamservicelistOutputOamService.name) &&
        Objects.equals(this.uuid, tapiOamGetoamservicelistOutputOamService.uuid) &&
        Objects.equals(this.ethOamService, tapiOamGetoamservicelistOutputOamService.ethOamService) &&
        Objects.equals(this.layerProtocolName, tapiOamGetoamservicelistOutputOamService.layerProtocolName) &&
        Objects.equals(this.oamServicePoint, tapiOamGetoamservicelistOutputOamService.oamServicePoint) &&
        Objects.equals(this.meg, tapiOamGetoamservicelistOutputOamService.meg) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, ethOamService, layerProtocolName, oamServicePoint, meg, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamGetoamservicelistOutputOamService {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    ethOamService: ").append(toIndentedString(ethOamService)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    oamServicePoint: ").append(toIndentedString(oamServicePoint)).append("\n");
    sb.append("    meg: ").append(toIndentedString(meg)).append("\n");
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
