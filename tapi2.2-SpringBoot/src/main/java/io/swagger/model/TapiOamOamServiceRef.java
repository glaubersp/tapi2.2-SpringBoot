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
 * TapiOamOamServiceRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamOamServiceRef   {
  @JsonProperty("oam-service-uuid")
  private String oamServiceUuid = null;

  public TapiOamOamServiceRef oamServiceUuid(String oamServiceUuid) {
    this.oamServiceUuid = oamServiceUuid;
    return this;
  }

  /**
   * none
   * @return oamServiceUuid
  **/
  @ApiModelProperty(value = "none")

  public String getOamServiceUuid() {
    return oamServiceUuid;
  }

  public void setOamServiceUuid(String oamServiceUuid) {
    this.oamServiceUuid = oamServiceUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamOamServiceRef tapiOamOamServiceRef = (TapiOamOamServiceRef) o;
    return Objects.equals(this.oamServiceUuid, tapiOamOamServiceRef.oamServiceUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamServiceUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamOamServiceRef {\n");
    
    sb.append("    oamServiceUuid: ").append(toIndentedString(oamServiceUuid)).append("\n");
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
