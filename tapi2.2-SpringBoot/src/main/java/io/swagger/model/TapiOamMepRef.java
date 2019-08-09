package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamMegRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamMepRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamMepRef extends TapiOamMegRef  {
  @JsonProperty("mep-local-id")
  private String mepLocalId = null;

  public TapiOamMepRef mepLocalId(String mepLocalId) {
    this.mepLocalId = mepLocalId;
    return this;
  }

  /**
   * none
   * @return mepLocalId
  **/
  @ApiModelProperty(value = "none")

  public String getMepLocalId() {
    return mepLocalId;
  }

  public void setMepLocalId(String mepLocalId) {
    this.mepLocalId = mepLocalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamMepRef tapiOamMepRef = (TapiOamMepRef) o;
    return Objects.equals(this.mepLocalId, tapiOamMepRef.mepLocalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mepLocalId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamMepRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mepLocalId: ").append(toIndentedString(mepLocalId)).append("\n");
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
