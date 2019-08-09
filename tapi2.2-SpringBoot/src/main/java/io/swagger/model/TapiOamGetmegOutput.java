package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamGetmegOutputMeg;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamGetmegOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamGetmegOutput   {
  @JsonProperty("meg")
  private TapiOamGetmegOutputMeg meg = null;

  public TapiOamGetmegOutput meg(TapiOamGetmegOutputMeg meg) {
    this.meg = meg;
    return this;
  }

  /**
   * Get meg
   * @return meg
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamGetmegOutputMeg getMeg() {
    return meg;
  }

  public void setMeg(TapiOamGetmegOutputMeg meg) {
    this.meg = meg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamGetmegOutput tapiOamGetmegOutput = (TapiOamGetmegOutput) o;
    return Objects.equals(this.meg, tapiOamGetmegOutput.meg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamGetmegOutput {\n");
    
    sb.append("    meg: ").append(toIndentedString(meg)).append("\n");
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
