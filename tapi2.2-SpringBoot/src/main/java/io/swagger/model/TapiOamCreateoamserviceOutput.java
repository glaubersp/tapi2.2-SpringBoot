package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamCreateoamserviceOutputOamService;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamCreateoamserviceOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamCreateoamserviceOutput   {
  @JsonProperty("oam-service")
  private TapiOamCreateoamserviceOutputOamService oamService = null;

  public TapiOamCreateoamserviceOutput oamService(TapiOamCreateoamserviceOutputOamService oamService) {
    this.oamService = oamService;
    return this;
  }

  /**
   * Get oamService
   * @return oamService
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamCreateoamserviceOutputOamService getOamService() {
    return oamService;
  }

  public void setOamService(TapiOamCreateoamserviceOutputOamService oamService) {
    this.oamService = oamService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamCreateoamserviceOutput tapiOamCreateoamserviceOutput = (TapiOamCreateoamserviceOutput) o;
    return Objects.equals(this.oamService, tapiOamCreateoamserviceOutput.oamService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamCreateoamserviceOutput {\n");
    
    sb.append("    oamService: ").append(toIndentedString(oamService)).append("\n");
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
