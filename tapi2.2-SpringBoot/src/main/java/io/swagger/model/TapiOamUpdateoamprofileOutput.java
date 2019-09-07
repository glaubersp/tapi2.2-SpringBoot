package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamOamProfile;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamUpdateoamprofileOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamUpdateoamprofileOutput   {
  @JsonProperty("oam-profile")
  private TapiOamOamProfile oamProfile = null;

  public TapiOamUpdateoamprofileOutput oamProfile(TapiOamOamProfile oamProfile) {
    this.oamProfile = oamProfile;
    return this;
  }

  /**
   * Get oamProfile
   * @return oamProfile
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamOamProfile getOamProfile() {
    return oamProfile;
  }

  public void setOamProfile(TapiOamOamProfile oamProfile) {
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
    TapiOamUpdateoamprofileOutput tapiOamUpdateoamprofileOutput = (TapiOamUpdateoamprofileOutput) o;
    return Objects.equals(this.oamProfile, tapiOamUpdateoamprofileOutput.oamProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamUpdateoamprofileOutput {\n");
    
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
