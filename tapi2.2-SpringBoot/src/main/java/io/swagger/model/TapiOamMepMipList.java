package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamMepRef;
import io.swagger.model.TapiOamMipRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamMepMipList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamMepMipList   {
  @JsonProperty("mip")
  @Valid
  private List<TapiOamMipRef> mip = null;

  @JsonProperty("mep")
  @Valid
  private List<TapiOamMepRef> mep = null;

  public TapiOamMepMipList mip(List<TapiOamMipRef> mip) {
    this.mip = mip;
    return this;
  }

  public TapiOamMepMipList addMipItem(TapiOamMipRef mipItem) {
    if (this.mip == null) {
      this.mip = new ArrayList<TapiOamMipRef>();
    }
    this.mip.add(mipItem);
    return this;
  }

  /**
   * none
   * @return mip
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiOamMipRef> getMip() {
    return mip;
  }

  public void setMip(List<TapiOamMipRef> mip) {
    this.mip = mip;
  }

  public TapiOamMepMipList mep(List<TapiOamMepRef> mep) {
    this.mep = mep;
    return this;
  }

  public TapiOamMepMipList addMepItem(TapiOamMepRef mepItem) {
    if (this.mep == null) {
      this.mep = new ArrayList<TapiOamMepRef>();
    }
    this.mep.add(mepItem);
    return this;
  }

  /**
   * none
   * @return mep
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiOamMepRef> getMep() {
    return mep;
  }

  public void setMep(List<TapiOamMepRef> mep) {
    this.mep = mep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamMepMipList tapiOamMepMipList = (TapiOamMepMipList) o;
    return Objects.equals(this.mip, tapiOamMepMipList.mip) &&
        Objects.equals(this.mep, tapiOamMepMipList.mep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mip, mep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamMepMipList {\n");
    
    sb.append("    mip: ").append(toIndentedString(mip)).append("\n");
    sb.append("    mep: ").append(toIndentedString(mep)).append("\n");
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
