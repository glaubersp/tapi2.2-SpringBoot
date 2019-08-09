package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.common.TimeUnit
 */
public enum TapiCommonTimeUnit {
  YEARS("YEARS"),
    MONTHS("MONTHS"),
    DAYS("DAYS"),
    HOURS("HOURS"),
    MINUTES("MINUTES"),
    SECONDS("SECONDS"),
    MILLISECONDS("MILLISECONDS"),
    MICROSECONDS("MICROSECONDS"),
    NANOSECONDS("NANOSECONDS"),
    PICOSECONDS("PICOSECONDS");

  private String value;

  TapiCommonTimeUnit(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiCommonTimeUnit fromValue(String text) {
    for (TapiCommonTimeUnit b : TapiCommonTimeUnit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
