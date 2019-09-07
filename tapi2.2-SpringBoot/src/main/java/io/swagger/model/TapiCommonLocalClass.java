package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonNameAndValue;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiCommonLocalClass
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiCommonLocalClass   {
  @JsonProperty("local-id")
  private String localId = null;

  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  public TapiCommonLocalClass localId(String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * none
   * @return localId
  **/
  @ApiModelProperty(value = "none")

  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public TapiCommonLocalClass name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiCommonLocalClass addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonLocalClass tapiCommonLocalClass = (TapiCommonLocalClass) o;
    return Objects.equals(this.localId, tapiCommonLocalClass.localId) &&
        Objects.equals(this.name, tapiCommonLocalClass.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonLocalClass {\n");
    
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
