package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiEquipmentActualEquipment;
import io.swagger.model.TapiEquipmentExpectedEquipment;
import io.swagger.model.TapiEquipmentHolder;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentEquipment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentEquipment extends TapiCommonGlobalClass  {
  @JsonProperty("contained-holder")
  @Valid
  private List<TapiEquipmentHolder> containedHolder = null;

  @JsonProperty("actual-equipment")
  private TapiEquipmentActualEquipment actualEquipment = null;

  @JsonProperty("is-expected-actual-mismatch")
  private Boolean isExpectedActualMismatch = false;

  @JsonProperty("geographical-location")
  private String geographicalLocation = null;

  @JsonProperty("expected-equipment")
  @Valid
  private List<TapiEquipmentExpectedEquipment> expectedEquipment = null;

  @JsonProperty("equipment-location")
  private String equipmentLocation = null;

  @JsonProperty("category")
  private String category = null;

  public TapiEquipmentEquipment containedHolder(List<TapiEquipmentHolder> containedHolder) {
    this.containedHolder = containedHolder;
    return this;
  }

  public TapiEquipmentEquipment addContainedHolderItem(TapiEquipmentHolder containedHolderItem) {
    if (this.containedHolder == null) {
      this.containedHolder = new ArrayList<TapiEquipmentHolder>();
    }
    this.containedHolder.add(containedHolderItem);
    return this;
  }

  /**
   * References the Holder in an Equipment that is available to take other Equipments.                  For example:                  - Slot in a sub-rack                  - Slot in a Field Replaceable Unit that can take a small form-factor pluggable.
   * @return containedHolder
  **/
  @ApiModelProperty(value = "References the Holder in an Equipment that is available to take other Equipments.                  For example:                  - Slot in a sub-rack                  - Slot in a Field Replaceable Unit that can take a small form-factor pluggable.")
  @Valid
  public List<TapiEquipmentHolder> getContainedHolder() {
    return containedHolder;
  }

  public void setContainedHolder(List<TapiEquipmentHolder> containedHolder) {
    this.containedHolder = containedHolder;
  }

  public TapiEquipmentEquipment actualEquipment(TapiEquipmentActualEquipment actualEquipment) {
    this.actualEquipment = actualEquipment;
    return this;
  }

  /**
   * Get actualEquipment
   * @return actualEquipment
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentActualEquipment getActualEquipment() {
    return actualEquipment;
  }

  public void setActualEquipment(TapiEquipmentActualEquipment actualEquipment) {
    this.actualEquipment = actualEquipment;
  }

  public TapiEquipmentEquipment isExpectedActualMismatch(Boolean isExpectedActualMismatch) {
    this.isExpectedActualMismatch = isExpectedActualMismatch;
    return this;
  }

  /**
   * none
   * @return isExpectedActualMismatch
  **/
  @ApiModelProperty(value = "none")

  public Boolean isIsExpectedActualMismatch() {
    return isExpectedActualMismatch;
  }

  public void setIsExpectedActualMismatch(Boolean isExpectedActualMismatch) {
    this.isExpectedActualMismatch = isExpectedActualMismatch;
  }

  public TapiEquipmentEquipment geographicalLocation(String geographicalLocation) {
    this.geographicalLocation = geographicalLocation;
    return this;
  }

  /**
   * none
   * @return geographicalLocation
  **/
  @ApiModelProperty(value = "none")

  public String getGeographicalLocation() {
    return geographicalLocation;
  }

  public void setGeographicalLocation(String geographicalLocation) {
    this.geographicalLocation = geographicalLocation;
  }

  public TapiEquipmentEquipment expectedEquipment(List<TapiEquipmentExpectedEquipment> expectedEquipment) {
    this.expectedEquipment = expectedEquipment;
    return this;
  }

  public TapiEquipmentEquipment addExpectedEquipmentItem(TapiEquipmentExpectedEquipment expectedEquipmentItem) {
    if (this.expectedEquipment == null) {
      this.expectedEquipment = new ArrayList<TapiEquipmentExpectedEquipment>();
    }
    this.expectedEquipment.add(expectedEquipmentItem);
    return this;
  }

  /**
   * none
   * @return expectedEquipment
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEquipmentExpectedEquipment> getExpectedEquipment() {
    return expectedEquipment;
  }

  public void setExpectedEquipment(List<TapiEquipmentExpectedEquipment> expectedEquipment) {
    this.expectedEquipment = expectedEquipment;
  }

  public TapiEquipmentEquipment equipmentLocation(String equipmentLocation) {
    this.equipmentLocation = equipmentLocation;
    return this;
  }

  /**
   * none
   * @return equipmentLocation
  **/
  @ApiModelProperty(value = "none")

  public String getEquipmentLocation() {
    return equipmentLocation;
  }

  public void setEquipmentLocation(String equipmentLocation) {
    this.equipmentLocation = equipmentLocation;
  }

  public TapiEquipmentEquipment category(String category) {
    this.category = category;
    return this;
  }

  /**
   * This attribute provides the identifier for the form of equipments regarded as having particular shared characteristics.
   * @return category
  **/
  @ApiModelProperty(value = "This attribute provides the identifier for the form of equipments regarded as having particular shared characteristics.")

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentEquipment tapiEquipmentEquipment = (TapiEquipmentEquipment) o;
    return Objects.equals(this.containedHolder, tapiEquipmentEquipment.containedHolder) &&
        Objects.equals(this.actualEquipment, tapiEquipmentEquipment.actualEquipment) &&
        Objects.equals(this.isExpectedActualMismatch, tapiEquipmentEquipment.isExpectedActualMismatch) &&
        Objects.equals(this.geographicalLocation, tapiEquipmentEquipment.geographicalLocation) &&
        Objects.equals(this.expectedEquipment, tapiEquipmentEquipment.expectedEquipment) &&
        Objects.equals(this.equipmentLocation, tapiEquipmentEquipment.equipmentLocation) &&
        Objects.equals(this.category, tapiEquipmentEquipment.category) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containedHolder, actualEquipment, isExpectedActualMismatch, geographicalLocation, expectedEquipment, equipmentLocation, category, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentEquipment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    containedHolder: ").append(toIndentedString(containedHolder)).append("\n");
    sb.append("    actualEquipment: ").append(toIndentedString(actualEquipment)).append("\n");
    sb.append("    isExpectedActualMismatch: ").append(toIndentedString(isExpectedActualMismatch)).append("\n");
    sb.append("    geographicalLocation: ").append(toIndentedString(geographicalLocation)).append("\n");
    sb.append("    expectedEquipment: ").append(toIndentedString(expectedEquipment)).append("\n");
    sb.append("    equipmentLocation: ").append(toIndentedString(equipmentLocation)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
