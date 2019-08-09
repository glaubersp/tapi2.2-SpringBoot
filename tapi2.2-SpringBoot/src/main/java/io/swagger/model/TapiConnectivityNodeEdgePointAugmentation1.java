package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityNodeEdgePointAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityNodeEdgePointAugmentation1   {
  @JsonProperty("cep-list")
  private TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList cepList = null;

  public TapiConnectivityNodeEdgePointAugmentation1 cepList(TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList cepList) {
    this.cepList = cepList;
    return this;
  }

  /**
   * Get cepList
   * @return cepList
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList getCepList() {
    return cepList;
  }

  public void setCepList(TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList cepList) {
    this.cepList = cepList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityNodeEdgePointAugmentation1 tapiConnectivityNodeEdgePointAugmentation1 = (TapiConnectivityNodeEdgePointAugmentation1) o;
    return Objects.equals(this.cepList, tapiConnectivityNodeEdgePointAugmentation1.cepList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cepList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityNodeEdgePointAugmentation1 {\n");
    
    sb.append("    cepList: ").append(toIndentedString(cepList)).append("\n");
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
