package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamOamProfile;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamGetoamprofilelistOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamGetoamprofilelistOutput   {
  @JsonProperty("oam-profile")
  @Valid
  private List<TapiOamOamProfile> oamProfile = null;

  public TapiOamGetoamprofilelistOutput oamProfile(List<TapiOamOamProfile> oamProfile) {
    this.oamProfile = oamProfile;
    return this;
  }

  public TapiOamGetoamprofilelistOutput addOamProfileItem(TapiOamOamProfile oamProfileItem) {
    if (this.oamProfile == null) {
      this.oamProfile = new ArrayList<TapiOamOamProfile>();
    }
    this.oamProfile.add(oamProfileItem);
    return this;
  }

  /**
   * none
   * @return oamProfile
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiOamOamProfile> getOamProfile() {
    return oamProfile;
  }

  public void setOamProfile(List<TapiOamOamProfile> oamProfile) {
    this.oamProfile = oamProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamGetoamprofilelistOutput tapiOamGetoamprofilelistOutput = (TapiOamGetoamprofilelistOutput) o;
    return Objects.equals(this.oamProfile, tapiOamGetoamprofilelistOutput.oamProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamGetoamprofilelistOutput {\n");
    
    sb.append("    oamProfile: ").append(toIndentedString(oamProfile)).append("\n");
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
