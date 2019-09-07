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
 * TapiOamMegRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamMegRef   {
  @JsonProperty("meg-uuid")
  private String megUuid = null;

  public TapiOamMegRef megUuid(String megUuid) {
    this.megUuid = megUuid;
    return this;
  }

  /**
   * none
   * @return megUuid
  **/
  @ApiModelProperty(value = "none")

  public String getMegUuid() {
    return megUuid;
  }

  public void setMegUuid(String megUuid) {
    this.megUuid = megUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamMegRef tapiOamMegRef = (TapiOamMegRef) o;
    return Objects.equals(this.megUuid, tapiOamMegRef.megUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(megUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamMegRef {\n");
    
    sb.append("    megUuid: ").append(toIndentedString(megUuid)).append("\n");
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
