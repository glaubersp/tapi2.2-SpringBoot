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
 * TapiOduUasChoice
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOduUasChoice   {
  @JsonProperty("bidirectional")
  private Boolean bidirectional = true;

  @JsonProperty("fuas")
  private Integer fuas = null;

  @JsonProperty("nuas")
  private Integer nuas = null;

  @JsonProperty("uas")
  private Integer uas = null;

  public TapiOduUasChoice bidirectional(Boolean bidirectional) {
    this.bidirectional = bidirectional;
    return this;
  }

  /**
   * none
   * @return bidirectional
  **/
  @ApiModelProperty(value = "none")

  public Boolean isBidirectional() {
    return bidirectional;
  }

  public void setBidirectional(Boolean bidirectional) {
    this.bidirectional = bidirectional;
  }

  public TapiOduUasChoice fuas(Integer fuas) {
    this.fuas = fuas;
    return this;
  }

  /**
   * none
   * @return fuas
  **/
  @ApiModelProperty(value = "none")

  public Integer getFuas() {
    return fuas;
  }

  public void setFuas(Integer fuas) {
    this.fuas = fuas;
  }

  public TapiOduUasChoice nuas(Integer nuas) {
    this.nuas = nuas;
    return this;
  }

  /**
   * none
   * @return nuas
  **/
  @ApiModelProperty(value = "none")

  public Integer getNuas() {
    return nuas;
  }

  public void setNuas(Integer nuas) {
    this.nuas = nuas;
  }

  public TapiOduUasChoice uas(Integer uas) {
    this.uas = uas;
    return this;
  }

  /**
   * none
   * @return uas
  **/
  @ApiModelProperty(value = "none")

  public Integer getUas() {
    return uas;
  }

  public void setUas(Integer uas) {
    this.uas = uas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduUasChoice tapiOduUasChoice = (TapiOduUasChoice) o;
    return Objects.equals(this.bidirectional, tapiOduUasChoice.bidirectional) &&
        Objects.equals(this.fuas, tapiOduUasChoice.fuas) &&
        Objects.equals(this.nuas, tapiOduUasChoice.nuas) &&
        Objects.equals(this.uas, tapiOduUasChoice.uas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidirectional, fuas, nuas, uas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduUasChoice {\n");
    
    sb.append("    bidirectional: ").append(toIndentedString(bidirectional)).append("\n");
    sb.append("    fuas: ").append(toIndentedString(fuas)).append("\n");
    sb.append("    nuas: ").append(toIndentedString(nuas)).append("\n");
    sb.append("    uas: ").append(toIndentedString(uas)).append("\n");
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
