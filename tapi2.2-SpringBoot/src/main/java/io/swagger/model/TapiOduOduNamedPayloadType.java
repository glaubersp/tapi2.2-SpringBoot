package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.odu.OduNamedPayloadType
 */
public enum TapiOduOduNamedPayloadType {
  UNKNOWN("UNKNOWN"),
    UNINTERPRETABLE("UNINTERPRETABLE");

  private String value;

  TapiOduOduNamedPayloadType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOduOduNamedPayloadType fromValue(String text) {
    for (TapiOduOduNamedPayloadType b : TapiOduOduNamedPayloadType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
