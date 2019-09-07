package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduOduNamedPayloadType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduPayloadType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOduOduPayloadType   {
  @JsonProperty("hex-payload-type")
  private Integer hexPayloadType = null;

  @JsonProperty("named-payload-type")
  private TapiOduOduNamedPayloadType namedPayloadType = null;

  public TapiOduOduPayloadType hexPayloadType(Integer hexPayloadType) {
    this.hexPayloadType = hexPayloadType;
    return this;
  }

  /**
   * none
   * @return hexPayloadType
  **/
  @ApiModelProperty(value = "none")

  public Integer getHexPayloadType() {
    return hexPayloadType;
  }

  public void setHexPayloadType(Integer hexPayloadType) {
    this.hexPayloadType = hexPayloadType;
  }

  public TapiOduOduPayloadType namedPayloadType(TapiOduOduNamedPayloadType namedPayloadType) {
    this.namedPayloadType = namedPayloadType;
    return this;
  }

  /**
   * Get namedPayloadType
   * @return namedPayloadType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduNamedPayloadType getNamedPayloadType() {
    return namedPayloadType;
  }

  public void setNamedPayloadType(TapiOduOduNamedPayloadType namedPayloadType) {
    this.namedPayloadType = namedPayloadType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduPayloadType tapiOduOduPayloadType = (TapiOduOduPayloadType) o;
    return Objects.equals(this.hexPayloadType, tapiOduOduPayloadType.hexPayloadType) &&
        Objects.equals(this.namedPayloadType, tapiOduOduPayloadType.namedPayloadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hexPayloadType, namedPayloadType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduPayloadType {\n");
    
    sb.append("    hexPayloadType: ").append(toIndentedString(hexPayloadType)).append("\n");
    sb.append("    namedPayloadType: ").append(toIndentedString(namedPayloadType)).append("\n");
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
