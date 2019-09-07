package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonTimeRange;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkConstraint;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkServiceEndPoint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiVirtualNetworkCreatevirtualnetworkserviceInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiVirtualNetworkCreatevirtualnetworkserviceInput   {
  @JsonProperty("end-point")
  @Valid
  private List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> endPoint = null;

  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("schedule")
  private TapiCommonTimeRange schedule = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vnw-constraint")
  private TapiVirtualNetworkVirtualNetworkConstraint vnwConstraint = null;

  public TapiVirtualNetworkCreatevirtualnetworkserviceInput endPoint(List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public TapiVirtualNetworkCreatevirtualnetworkserviceInput addEndPointItem(TapiVirtualNetworkVirtualNetworkServiceEndPoint endPointItem) {
    if (this.endPoint == null) {
      this.endPoint = new ArrayList<>();
    }
    this.endPoint.add(endPointItem);
    return this;
  }

  /**
   * none
   * @return endPoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> endPoint) {
    this.endPoint = endPoint;
  }

  public TapiVirtualNetworkCreatevirtualnetworkserviceInput name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiVirtualNetworkCreatevirtualnetworkserviceInput addNameItem(TapiCommonNameAndValue nameItem) {
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

  public TapiVirtualNetworkCreatevirtualnetworkserviceInput schedule(TapiCommonTimeRange schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonTimeRange getSchedule() {
    return schedule;
  }

  public void setSchedule(TapiCommonTimeRange schedule) {
    this.schedule = schedule;
  }

  public TapiVirtualNetworkCreatevirtualnetworkserviceInput uuid(String uuid) {
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

  public TapiVirtualNetworkCreatevirtualnetworkserviceInput vnwConstraint(TapiVirtualNetworkVirtualNetworkConstraint vnwConstraint) {
    this.vnwConstraint = vnwConstraint;
    return this;
  }

  /**
   * Get vnwConstraint
   * @return vnwConstraint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiVirtualNetworkVirtualNetworkConstraint getVnwConstraint() {
    return vnwConstraint;
  }

  public void setVnwConstraint(TapiVirtualNetworkVirtualNetworkConstraint vnwConstraint) {
    this.vnwConstraint = vnwConstraint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkCreatevirtualnetworkserviceInput tapiVirtualNetworkCreatevirtualnetworkserviceInput = (TapiVirtualNetworkCreatevirtualnetworkserviceInput) o;
    return Objects.equals(this.endPoint, tapiVirtualNetworkCreatevirtualnetworkserviceInput.endPoint) &&
        Objects.equals(this.name, tapiVirtualNetworkCreatevirtualnetworkserviceInput.name) &&
        Objects.equals(this.schedule, tapiVirtualNetworkCreatevirtualnetworkserviceInput.schedule) &&
        Objects.equals(this.uuid, tapiVirtualNetworkCreatevirtualnetworkserviceInput.uuid) &&
        Objects.equals(this.vnwConstraint, tapiVirtualNetworkCreatevirtualnetworkserviceInput.vnwConstraint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPoint, name, schedule, uuid, vnwConstraint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkCreatevirtualnetworkserviceInput {\n");
    
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vnwConstraint: ").append(toIndentedString(vnwConstraint)).append("\n");
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
