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
 * TapiPathComputationPathRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPathComputationPathRef   {
  @JsonProperty("path-uuid")
  private String pathUuid = null;

  public TapiPathComputationPathRef pathUuid(String pathUuid) {
    this.pathUuid = pathUuid;
    return this;
  }

  /**
   * none
   * @return pathUuid
  **/
  @ApiModelProperty(value = "none")

  public String getPathUuid() {
    return pathUuid;
  }

  public void setPathUuid(String pathUuid) {
    this.pathUuid = pathUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPathComputationPathRef tapiPathComputationPathRef = (TapiPathComputationPathRef) o;
    return Objects.equals(this.pathUuid, tapiPathComputationPathRef.pathUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPathComputationPathRef {\n");
    
    sb.append("    pathUuid: ").append(toIndentedString(pathUuid)).append("\n");
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
