package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaApplicationIdentifierType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaApplicationIdentifier
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaApplicationIdentifier   {
  @JsonProperty("application-identifier-type")
  private TapiPhotonicMediaApplicationIdentifierType applicationIdentifierType = null;

  @JsonProperty("application-code")
  private String applicationCode = null;

  public TapiPhotonicMediaApplicationIdentifier applicationIdentifierType(TapiPhotonicMediaApplicationIdentifierType applicationIdentifierType) {
    this.applicationIdentifierType = applicationIdentifierType;
    return this;
  }

  /**
   * Get applicationIdentifierType
   * @return applicationIdentifierType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaApplicationIdentifierType getApplicationIdentifierType() {
    return applicationIdentifierType;
  }

  public void setApplicationIdentifierType(TapiPhotonicMediaApplicationIdentifierType applicationIdentifierType) {
    this.applicationIdentifierType = applicationIdentifierType;
  }

  public TapiPhotonicMediaApplicationIdentifier applicationCode(String applicationCode) {
    this.applicationCode = applicationCode;
    return this;
  }

  /**
   * none
   * @return applicationCode
  **/
  @ApiModelProperty(value = "none")

  public String getApplicationCode() {
    return applicationCode;
  }

  public void setApplicationCode(String applicationCode) {
    this.applicationCode = applicationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaApplicationIdentifier tapiPhotonicMediaApplicationIdentifier = (TapiPhotonicMediaApplicationIdentifier) o;
    return Objects.equals(this.applicationIdentifierType, tapiPhotonicMediaApplicationIdentifier.applicationIdentifierType) &&
        Objects.equals(this.applicationCode, tapiPhotonicMediaApplicationIdentifier.applicationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationIdentifierType, applicationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaApplicationIdentifier {\n");
    
    sb.append("    applicationIdentifierType: ").append(toIndentedString(applicationIdentifierType)).append("\n");
    sb.append("    applicationCode: ").append(toIndentedString(applicationCode)).append("\n");
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
