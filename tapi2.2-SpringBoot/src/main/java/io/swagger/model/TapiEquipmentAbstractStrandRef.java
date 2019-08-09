package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentPhysicalSpanRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentAbstractStrandRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentAbstractStrandRef extends TapiEquipmentPhysicalSpanRef  {
  @JsonProperty("abstract-strand-local-id")
  private String abstractStrandLocalId = null;

  public TapiEquipmentAbstractStrandRef abstractStrandLocalId(String abstractStrandLocalId) {
    this.abstractStrandLocalId = abstractStrandLocalId;
    return this;
  }

  /**
   * none
   * @return abstractStrandLocalId
  **/
  @ApiModelProperty(value = "none")

  public String getAbstractStrandLocalId() {
    return abstractStrandLocalId;
  }

  public void setAbstractStrandLocalId(String abstractStrandLocalId) {
    this.abstractStrandLocalId = abstractStrandLocalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentAbstractStrandRef tapiEquipmentAbstractStrandRef = (TapiEquipmentAbstractStrandRef) o;
    return Objects.equals(this.abstractStrandLocalId, tapiEquipmentAbstractStrandRef.abstractStrandLocalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractStrandLocalId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentAbstractStrandRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    abstractStrandLocalId: ").append(toIndentedString(abstractStrandLocalId)).append("\n");
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
