package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.oam.PerceivedSeverityType
 */
public enum TapiOamPerceivedSeverityType {
  CRITICAL("CRITICAL"),
    MAJOR("MAJOR"),
    MINOR("MINOR"),
    WARNING("WARNING"),
    CLEARED("CLEARED");

  private String value;

  TapiOamPerceivedSeverityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOamPerceivedSeverityType fromValue(String text) {
    for (TapiOamPerceivedSeverityType b : TapiOamPerceivedSeverityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
