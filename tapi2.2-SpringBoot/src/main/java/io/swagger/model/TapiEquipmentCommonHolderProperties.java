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
 * TapiEquipmentCommonHolderProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentCommonHolderProperties   {
  @JsonProperty("holder-location")
  private String holderLocation = null;

  @JsonProperty("is-guided")
  private Boolean isGuided = false;

  @JsonProperty("holder-category")
  private String holderCategory = null;

  public TapiEquipmentCommonHolderProperties holderLocation(String holderLocation) {
    this.holderLocation = holderLocation;
    return this;
  }

  /**
   * The relative position of the holder in the context of its containing equipment along with the position of that containing Equipment (and further recursion).
   * @return holderLocation
  **/
  @ApiModelProperty(value = "The relative position of the holder in the context of its containing equipment along with the position of that containing Equipment (and further recursion).")

  public String getHolderLocation() {
    return holderLocation;
  }

  public void setHolderLocation(String holderLocation) {
    this.holderLocation = holderLocation;
  }

  public TapiEquipmentCommonHolderProperties isGuided(Boolean isGuided) {
    this.isGuided = isGuided;
    return this;
  }

  /**
   * This attribute indicates whether the holder has guides that constrain the position of the equipment in the holder or not.
   * @return isGuided
  **/
  @ApiModelProperty(value = "This attribute indicates whether the holder has guides that constrain the position of the equipment in the holder or not.")

  public Boolean isIsGuided() {
    return isGuided;
  }

  public void setIsGuided(Boolean isGuided) {
    this.isGuided = isGuided;
  }

  public TapiEquipmentCommonHolderProperties holderCategory(String holderCategory) {
    this.holderCategory = holderCategory;
    return this;
  }

  /**
   * The type of holder.
   * @return holderCategory
  **/
  @ApiModelProperty(value = "The type of holder.")

  public String getHolderCategory() {
    return holderCategory;
  }

  public void setHolderCategory(String holderCategory) {
    this.holderCategory = holderCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentCommonHolderProperties tapiEquipmentCommonHolderProperties = (TapiEquipmentCommonHolderProperties) o;
    return Objects.equals(this.holderLocation, tapiEquipmentCommonHolderProperties.holderLocation) &&
        Objects.equals(this.isGuided, tapiEquipmentCommonHolderProperties.isGuided) &&
        Objects.equals(this.holderCategory, tapiEquipmentCommonHolderProperties.holderCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holderLocation, isGuided, holderCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentCommonHolderProperties {\n");
    
    sb.append("    holderLocation: ").append(toIndentedString(holderLocation)).append("\n");
    sb.append("    isGuided: ").append(toIndentedString(isGuided)).append("\n");
    sb.append("    holderCategory: ").append(toIndentedString(holderCategory)).append("\n");
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
