package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamOamServiceRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamOamServicePointRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamOamServicePointRef extends TapiOamOamServiceRef  {
  @JsonProperty("oam-service-point-local-id")
  private String oamServicePointLocalId = null;

  public TapiOamOamServicePointRef oamServicePointLocalId(String oamServicePointLocalId) {
    this.oamServicePointLocalId = oamServicePointLocalId;
    return this;
  }

  /**
   * none
   * @return oamServicePointLocalId
  **/
  @ApiModelProperty(value = "none")

  public String getOamServicePointLocalId() {
    return oamServicePointLocalId;
  }

  public void setOamServicePointLocalId(String oamServicePointLocalId) {
    this.oamServicePointLocalId = oamServicePointLocalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamOamServicePointRef tapiOamOamServicePointRef = (TapiOamOamServicePointRef) o;
    return Objects.equals(this.oamServicePointLocalId, tapiOamOamServicePointRef.oamServicePointLocalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamServicePointLocalId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamOamServicePointRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    oamServicePointLocalId: ").append(toIndentedString(oamServicePointLocalId)).append("\n");
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
