package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamGetoamservicelistOutputOamService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamGetoamservicelistOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamGetoamservicelistOutput   {
  @JsonProperty("oam-service")
  @Valid
  private List<TapiOamGetoamservicelistOutputOamService> oamService = null;

  public TapiOamGetoamservicelistOutput oamService(List<TapiOamGetoamservicelistOutputOamService> oamService) {
    this.oamService = oamService;
    return this;
  }

  public TapiOamGetoamservicelistOutput addOamServiceItem(TapiOamGetoamservicelistOutputOamService oamServiceItem) {
    if (this.oamService == null) {
      this.oamService = new ArrayList<TapiOamGetoamservicelistOutputOamService>();
    }
    this.oamService.add(oamServiceItem);
    return this;
  }

  /**
   * none
   * @return oamService
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiOamGetoamservicelistOutputOamService> getOamService() {
    return oamService;
  }

  public void setOamService(List<TapiOamGetoamservicelistOutputOamService> oamService) {
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
    TapiOamGetoamservicelistOutput tapiOamGetoamservicelistOutput = (TapiOamGetoamservicelistOutput) o;
    return Objects.equals(this.oamService, tapiOamGetoamservicelistOutput.oamService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamGetoamservicelistOutput {\n");
    
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
