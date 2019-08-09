package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiConnectivityContextConnectivityContext;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityContextAugmentation5
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityContextAugmentation5   {
  @JsonProperty("connectivity-context")
  private TapiConnectivityContextConnectivityContext connectivityContext = null;

  public TapiConnectivityContextAugmentation5 connectivityContext(TapiConnectivityContextConnectivityContext connectivityContext) {
    this.connectivityContext = connectivityContext;
    return this;
  }

  /**
   * Get connectivityContext
   * @return connectivityContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityContextConnectivityContext getConnectivityContext() {
    return connectivityContext;
  }

  public void setConnectivityContext(TapiConnectivityContextConnectivityContext connectivityContext) {
    this.connectivityContext = connectivityContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityContextAugmentation5 tapiConnectivityContextAugmentation5 = (TapiConnectivityContextAugmentation5) o;
    return Objects.equals(this.connectivityContext, tapiConnectivityContextAugmentation5.connectivityContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityContextAugmentation5 {\n");
    
    sb.append("    connectivityContext: ").append(toIndentedString(connectivityContext)).append("\n");
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
