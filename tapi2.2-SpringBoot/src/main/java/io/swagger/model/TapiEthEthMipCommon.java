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
 * TapiEthEthMipCommon
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthMipCommon   {
  @JsonProperty("is-full-mip")
  private Boolean isFullMip = false;

  public TapiEthEthMipCommon isFullMip(Boolean isFullMip) {
    this.isFullMip = isFullMip;
    return this;
  }

  /**
   * This attribute indicates whether the MIP is a full MIP (true) or a down-half MIP (false). Up-half MIP is not foreseen by G.8052
   * @return isFullMip
  **/
  @ApiModelProperty(value = "This attribute indicates whether the MIP is a full MIP (true) or a down-half MIP (false). Up-half MIP is not foreseen by G.8052")

  public Boolean isIsFullMip() {
    return isFullMip;
  }

  public void setIsFullMip(Boolean isFullMip) {
    this.isFullMip = isFullMip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthMipCommon tapiEthEthMipCommon = (TapiEthEthMipCommon) o;
    return Objects.equals(this.isFullMip, tapiEthEthMipCommon.isFullMip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFullMip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthMipCommon {\n");
    
    sb.append("    isFullMip: ").append(toIndentedString(isFullMip)).append("\n");
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
