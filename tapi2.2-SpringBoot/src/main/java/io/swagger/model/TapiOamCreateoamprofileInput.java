package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiOamPmThresholdData;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamCreateoamprofileInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamCreateoamprofileInput   {
  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("pm-threshold-data")
  @Valid
  private List<TapiOamPmThresholdData> pmThresholdData = null;

  @JsonProperty("uuid")
  private String uuid = null;

  public TapiOamCreateoamprofileInput name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamCreateoamprofileInput addNameItem(TapiCommonNameAndValue nameItem) {
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

  public TapiOamCreateoamprofileInput pmThresholdData(List<TapiOamPmThresholdData> pmThresholdData) {
    this.pmThresholdData = pmThresholdData;
    return this;
  }

  public TapiOamCreateoamprofileInput addPmThresholdDataItem(TapiOamPmThresholdData pmThresholdDataItem) {
    if (this.pmThresholdData == null) {
      this.pmThresholdData = new ArrayList<>();
    }
    this.pmThresholdData.add(pmThresholdDataItem);
    return this;
  }

  /**
   * none
   * @return pmThresholdData
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiOamPmThresholdData> getPmThresholdData() {
    return pmThresholdData;
  }

  public void setPmThresholdData(List<TapiOamPmThresholdData> pmThresholdData) {
    this.pmThresholdData = pmThresholdData;
  }

  public TapiOamCreateoamprofileInput uuid(String uuid) {
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
    TapiOamCreateoamprofileInput tapiOamCreateoamprofileInput = (TapiOamCreateoamprofileInput) o;
    return Objects.equals(this.name, tapiOamCreateoamprofileInput.name) &&
        Objects.equals(this.pmThresholdData, tapiOamCreateoamprofileInput.pmThresholdData) &&
        Objects.equals(this.uuid, tapiOamCreateoamprofileInput.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pmThresholdData, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamCreateoamprofileInput {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pmThresholdData: ").append(toIndentedString(pmThresholdData)).append("\n");
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
