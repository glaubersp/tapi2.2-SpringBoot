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
 * TapiOamMipRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamMipRef extends TapiOamMegRef  {
  @JsonProperty("mip-local-id")
  private String mipLocalId = null;

  public TapiOamMipRef mipLocalId(String mipLocalId) {
    this.mipLocalId = mipLocalId;
    return this;
  }

  /**
   * none
   * @return mipLocalId
  **/
  @ApiModelProperty(value = "none")

  public String getMipLocalId() {
    return mipLocalId;
  }

  public void setMipLocalId(String mipLocalId) {
    this.mipLocalId = mipLocalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamMipRef tapiOamMipRef = (TapiOamMipRef) o;
    return Objects.equals(this.mipLocalId, tapiOamMipRef.mipLocalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mipLocalId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamMipRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mipLocalId: ").append(toIndentedString(mipLocalId)).append("\n");
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
