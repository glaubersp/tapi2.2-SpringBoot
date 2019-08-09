package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.odu.MappingType
 */
public enum TapiOduMappingType {
  AMP("AMP"),
    BMP("BMP"),
    GFP_F("GFP-F"),
    GMP("GMP"),
    TTP_GFP_BMP("TTP_GFP_BMP"),
    NULL("NULL");

  private String value;

  TapiOduMappingType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOduMappingType fromValue(String text) {
    for (TapiOduMappingType b : TapiOduMappingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
