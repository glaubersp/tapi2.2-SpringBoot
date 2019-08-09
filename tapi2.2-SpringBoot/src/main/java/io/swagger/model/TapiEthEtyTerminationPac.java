package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEtyPac;
import io.swagger.model.TapiEthEtyPhyType;
import io.swagger.model.TapiEthEtyTerminationCommonPac;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEtyTerminationPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEtyTerminationPac extends TapiEthEtyPac  {
  @JsonProperty("ety-termination-common-pac")
  private TapiEthEtyTerminationCommonPac etyTerminationCommonPac = null;

  public TapiEthEtyTerminationPac etyTerminationCommonPac(TapiEthEtyTerminationCommonPac etyTerminationCommonPac) {
    this.etyTerminationCommonPac = etyTerminationCommonPac;
    return this;
  }

  /**
   * Get etyTerminationCommonPac
   * @return etyTerminationCommonPac
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEtyTerminationCommonPac getEtyTerminationCommonPac() {
    return etyTerminationCommonPac;
  }

  public void setEtyTerminationCommonPac(TapiEthEtyTerminationCommonPac etyTerminationCommonPac) {
    this.etyTerminationCommonPac = etyTerminationCommonPac;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEtyTerminationPac tapiEthEtyTerminationPac = (TapiEthEtyTerminationPac) o;
    return Objects.equals(this.etyTerminationCommonPac, tapiEthEtyTerminationPac.etyTerminationCommonPac) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etyTerminationCommonPac, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEtyTerminationPac {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    etyTerminationCommonPac: ").append(toIndentedString(etyTerminationCommonPac)).append("\n");
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
