package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEtyPhyType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthServiceIntefacePointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthServiceIntefacePointSpec   {
  @JsonProperty("phy-type")
  private TapiEthEtyPhyType phyType = null;

  @JsonProperty("phy-type-list")
  @Valid
  private List<TapiEthEtyPhyType> phyTypeList = null;

  public TapiEthEthServiceIntefacePointSpec phyType(TapiEthEtyPhyType phyType) {
    this.phyType = phyType;
    return this;
  }

  /**
   * Get phyType
   * @return phyType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEtyPhyType getPhyType() {
    return phyType;
  }

  public void setPhyType(TapiEthEtyPhyType phyType) {
    this.phyType = phyType;
  }

  public TapiEthEthServiceIntefacePointSpec phyTypeList(List<TapiEthEtyPhyType> phyTypeList) {
    this.phyTypeList = phyTypeList;
    return this;
  }

  public TapiEthEthServiceIntefacePointSpec addPhyTypeListItem(TapiEthEtyPhyType phyTypeListItem) {
    if (this.phyTypeList == null) {
      this.phyTypeList = new ArrayList<TapiEthEtyPhyType>();
    }
    this.phyTypeList.add(phyTypeListItem);
    return this;
  }

  /**
   * This attribute identifies the possible PHY types that could be supported at the ETY trail termination. See IEEE 802.3 clause 30.3.2.1.3.
   * @return phyTypeList
  **/
  @ApiModelProperty(value = "This attribute identifies the possible PHY types that could be supported at the ETY trail termination. See IEEE 802.3 clause 30.3.2.1.3.")
  @Valid
  public List<TapiEthEtyPhyType> getPhyTypeList() {
    return phyTypeList;
  }

  public void setPhyTypeList(List<TapiEthEtyPhyType> phyTypeList) {
    this.phyTypeList = phyTypeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthServiceIntefacePointSpec tapiEthEthServiceIntefacePointSpec = (TapiEthEthServiceIntefacePointSpec) o;
    return Objects.equals(this.phyType, tapiEthEthServiceIntefacePointSpec.phyType) &&
        Objects.equals(this.phyTypeList, tapiEthEthServiceIntefacePointSpec.phyTypeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phyType, phyTypeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthServiceIntefacePointSpec {\n");
    
    sb.append("    phyType: ").append(toIndentedString(phyType)).append("\n");
    sb.append("    phyTypeList: ").append(toIndentedString(phyTypeList)).append("\n");
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
