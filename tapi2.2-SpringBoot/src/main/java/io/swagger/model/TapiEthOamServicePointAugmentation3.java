package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOamService;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthOamServicePointAugmentation3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthOamServicePointAugmentation3   {
  @JsonProperty("eth-oam-service")
  private TapiEthEthOamService ethOamService = null;

  public TapiEthOamServicePointAugmentation3 ethOamService(TapiEthEthOamService ethOamService) {
    this.ethOamService = ethOamService;
    return this;
  }

  /**
   * Get ethOamService
   * @return ethOamService
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOamService getEthOamService() {
    return ethOamService;
  }

  public void setEthOamService(TapiEthEthOamService ethOamService) {
    this.ethOamService = ethOamService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthOamServicePointAugmentation3 tapiEthOamServicePointAugmentation3 = (TapiEthOamServicePointAugmentation3) o;
    return Objects.equals(this.ethOamService, tapiEthOamServicePointAugmentation3.ethOamService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOamService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthOamServicePointAugmentation3 {\n");
    
    sb.append("    ethOamService: ").append(toIndentedString(ethOamService)).append("\n");
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
