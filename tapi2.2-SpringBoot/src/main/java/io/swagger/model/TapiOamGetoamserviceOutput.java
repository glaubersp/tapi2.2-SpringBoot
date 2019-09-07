package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamGetoamserviceOutputOamService;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamGetoamserviceOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamGetoamserviceOutput   {
  @JsonProperty("oam-service")
  private TapiOamGetoamserviceOutputOamService oamService = null;

  public TapiOamGetoamserviceOutput oamService(TapiOamGetoamserviceOutputOamService oamService) {
    this.oamService = oamService;
    return this;
  }

  /**
   * Get oamService
   * @return oamService
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamGetoamserviceOutputOamService getOamService() {
    return oamService;
  }

  public void setOamService(TapiOamGetoamserviceOutputOamService oamService) {
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
    TapiOamGetoamserviceOutput tapiOamGetoamserviceOutput = (TapiOamGetoamserviceOutput) o;
    return Objects.equals(this.oamService, tapiOamGetoamserviceOutput.oamService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamGetoamserviceOutput {\n");
    
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
