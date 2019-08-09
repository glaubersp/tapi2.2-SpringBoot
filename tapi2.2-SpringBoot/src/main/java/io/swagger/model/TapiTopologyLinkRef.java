package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiTopologyTopologyRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyLinkRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiTopologyLinkRef extends TapiTopologyTopologyRef  {
  @JsonProperty("link-uuid")
  private String linkUuid = null;

  public TapiTopologyLinkRef linkUuid(String linkUuid) {
    this.linkUuid = linkUuid;
    return this;
  }

  /**
   * none
   * @return linkUuid
  **/
  @ApiModelProperty(value = "none")

  public String getLinkUuid() {
    return linkUuid;
  }

  public void setLinkUuid(String linkUuid) {
    this.linkUuid = linkUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyLinkRef tapiTopologyLinkRef = (TapiTopologyLinkRef) o;
    return Objects.equals(this.linkUuid, tapiTopologyLinkRef.linkUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyLinkRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    linkUuid: ").append(toIndentedString(linkUuid)).append("\n");
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
