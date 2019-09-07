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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamMepMipList   {
  @JsonProperty("mep")
  @Valid
  private List<TapiOamMepRef> mep = null;

  @JsonProperty("mip")
  @Valid
  private List<TapiOamMipRef> mip = null;

  public TapiOamMepMipList mep(List<TapiOamMepRef> mep) {
    this.mep = mep;
    return this;
  }

  public TapiOamMepMipList addMepItem(TapiOamMepRef mepItem) {
    if (this.mep == null) {
      this.mep = new ArrayList<>();
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

  public TapiOamMepMipList mip(List<TapiOamMipRef> mip) {
    this.mip = mip;
    return this;
  }

  public TapiOamMepMipList addMipItem(TapiOamMipRef mipItem) {
    if (this.mip == null) {
      this.mip = new ArrayList<>();
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamMepMipList tapiOamMepMipList = (TapiOamMepMipList) o;
    return Objects.equals(this.mep, tapiOamMepMipList.mep) &&
        Objects.equals(this.mip, tapiOamMepMipList.mip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mep, mip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamMepMipList {\n");
    
    sb.append("    mep: ").append(toIndentedString(mep)).append("\n");
    sb.append("    mip: ").append(toIndentedString(mip)).append("\n");
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
