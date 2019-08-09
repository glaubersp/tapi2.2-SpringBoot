package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiEquipmentActualHolder;
import io.swagger.model.TapiEquipmentEquipmentRef;
import io.swagger.model.TapiEquipmentExpectedHolder;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentHolder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentHolder extends TapiCommonGlobalClass  {
  @JsonProperty("expected-holder")
  private TapiEquipmentExpectedHolder expectedHolder = null;

  @JsonProperty("actual-holder")
  private TapiEquipmentActualHolder actualHolder = null;

  @JsonProperty("occupying-fru")
  private TapiEquipmentEquipmentRef occupyingFru = null;

  public TapiEquipmentHolder expectedHolder(TapiEquipmentExpectedHolder expectedHolder) {
    this.expectedHolder = expectedHolder;
    return this;
  }

  /**
   * Get expectedHolder
   * @return expectedHolder
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentExpectedHolder getExpectedHolder() {
    return expectedHolder;
  }

  public void setExpectedHolder(TapiEquipmentExpectedHolder expectedHolder) {
    this.expectedHolder = expectedHolder;
  }

  public TapiEquipmentHolder actualHolder(TapiEquipmentActualHolder actualHolder) {
    this.actualHolder = actualHolder;
    return this;
  }

  /**
   * Get actualHolder
   * @return actualHolder
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentActualHolder getActualHolder() {
    return actualHolder;
  }

  public void setActualHolder(TapiEquipmentActualHolder actualHolder) {
    this.actualHolder = actualHolder;
  }

  public TapiEquipmentHolder occupyingFru(TapiEquipmentEquipmentRef occupyingFru) {
    this.occupyingFru = occupyingFru;
    return this;
  }

  /**
   * Get occupyingFru
   * @return occupyingFru
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentEquipmentRef getOccupyingFru() {
    return occupyingFru;
  }

  public void setOccupyingFru(TapiEquipmentEquipmentRef occupyingFru) {
    this.occupyingFru = occupyingFru;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentHolder tapiEquipmentHolder = (TapiEquipmentHolder) o;
    return Objects.equals(this.expectedHolder, tapiEquipmentHolder.expectedHolder) &&
        Objects.equals(this.actualHolder, tapiEquipmentHolder.actualHolder) &&
        Objects.equals(this.occupyingFru, tapiEquipmentHolder.occupyingFru) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedHolder, actualHolder, occupyingFru, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentHolder {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    expectedHolder: ").append(toIndentedString(expectedHolder)).append("\n");
    sb.append("    actualHolder: ").append(toIndentedString(actualHolder)).append("\n");
    sb.append("    occupyingFru: ").append(toIndentedString(occupyingFru)).append("\n");
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
