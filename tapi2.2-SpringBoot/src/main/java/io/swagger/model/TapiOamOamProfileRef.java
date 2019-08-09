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
 * TapiOamOamProfileRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamOamProfileRef   {
  @JsonProperty("oam-profile-uuid")
  private String oamProfileUuid = null;

  public TapiOamOamProfileRef oamProfileUuid(String oamProfileUuid) {
    this.oamProfileUuid = oamProfileUuid;
    return this;
  }

  /**
   * none
   * @return oamProfileUuid
  **/
  @ApiModelProperty(value = "none")

  public String getOamProfileUuid() {
    return oamProfileUuid;
  }

  public void setOamProfileUuid(String oamProfileUuid) {
    this.oamProfileUuid = oamProfileUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamOamProfileRef tapiOamOamProfileRef = (TapiOamOamProfileRef) o;
    return Objects.equals(this.oamProfileUuid, tapiOamOamProfileRef.oamProfileUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamProfileUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamOamProfileRef {\n");
    
    sb.append("    oamProfileUuid: ").append(toIndentedString(oamProfileUuid)).append("\n");
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
