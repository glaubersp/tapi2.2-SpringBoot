package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiOamCreateoamserviceInputOamServicePoint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamUpdateoamserviceInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamUpdateoamserviceInput   {
  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("oam-service-point")
  @Valid
  private List<TapiOamCreateoamserviceInputOamServicePoint> oamServicePoint = null;

  @JsonProperty("state")
  private TapiCommonAdministrativeState state = null;

  @JsonProperty("uuid")
  private String uuid = null;

  public TapiOamUpdateoamserviceInput name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamUpdateoamserviceInput addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
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

  public TapiOamUpdateoamserviceInput oamServicePoint(List<TapiOamCreateoamserviceInputOamServicePoint> oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
    return this;
  }

  public TapiOamUpdateoamserviceInput addOamServicePointItem(TapiOamCreateoamserviceInputOamServicePoint oamServicePointItem) {
    if (this.oamServicePoint == null) {
      this.oamServicePoint = new ArrayList<TapiOamCreateoamserviceInputOamServicePoint>();
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
  public List<TapiOamCreateoamserviceInputOamServicePoint> getOamServicePoint() {
    return oamServicePoint;
  }

  public void setOamServicePoint(List<TapiOamCreateoamserviceInputOamServicePoint> oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
  }

  public TapiOamUpdateoamserviceInput state(TapiCommonAdministrativeState state) {
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

  public TapiOamUpdateoamserviceInput uuid(String uuid) {
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
    TapiOamUpdateoamserviceInput tapiOamUpdateoamserviceInput = (TapiOamUpdateoamserviceInput) o;
    return Objects.equals(this.name, tapiOamUpdateoamserviceInput.name) &&
        Objects.equals(this.oamServicePoint, tapiOamUpdateoamserviceInput.oamServicePoint) &&
        Objects.equals(this.state, tapiOamUpdateoamserviceInput.state) &&
        Objects.equals(this.uuid, tapiOamUpdateoamserviceInput.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, oamServicePoint, state, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamUpdateoamserviceInput {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oamServicePoint: ").append(toIndentedString(oamServicePoint)).append("\n");
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
