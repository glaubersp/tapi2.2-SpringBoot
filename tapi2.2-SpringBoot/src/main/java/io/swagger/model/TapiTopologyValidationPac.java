package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiTopologyValidationMechanism;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyValidationPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiTopologyValidationPac   {
  @JsonProperty("validation-mechanism")
  @Valid
  private List<TapiTopologyValidationMechanism> validationMechanism = null;

  public TapiTopologyValidationPac validationMechanism(List<TapiTopologyValidationMechanism> validationMechanism) {
    this.validationMechanism = validationMechanism;
    return this;
  }

  public TapiTopologyValidationPac addValidationMechanismItem(TapiTopologyValidationMechanism validationMechanismItem) {
    if (this.validationMechanism == null) {
      this.validationMechanism = new ArrayList<TapiTopologyValidationMechanism>();
    }
    this.validationMechanism.add(validationMechanismItem);
    return this;
  }

  /**
   * Provides details of the specific validation mechanism(s) used to confirm the presence of an intended topologicalEntity.
   * @return validationMechanism
  **/
  @ApiModelProperty(value = "Provides details of the specific validation mechanism(s) used to confirm the presence of an intended topologicalEntity.")
  @Valid
  public List<TapiTopologyValidationMechanism> getValidationMechanism() {
    return validationMechanism;
  }

  public void setValidationMechanism(List<TapiTopologyValidationMechanism> validationMechanism) {
    this.validationMechanism = validationMechanism;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyValidationPac tapiTopologyValidationPac = (TapiTopologyValidationPac) o;
    return Objects.equals(this.validationMechanism, tapiTopologyValidationPac.validationMechanism);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationMechanism);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyValidationPac {\n");
    
    sb.append("    validationMechanism: ").append(toIndentedString(validationMechanism)).append("\n");
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
