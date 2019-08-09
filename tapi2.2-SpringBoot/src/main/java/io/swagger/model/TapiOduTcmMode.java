package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.odu.TcmMode
 */
public enum TapiOduTcmMode {
  OPERATIONAL("OPERATIONAL"),
    TRANSPARENT("TRANSPARENT"),
    MONITOR("MONITOR");

  private String value;

  TapiOduTcmMode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOduTcmMode fromValue(String text) {
    for (TapiOduTcmMode b : TapiOduTcmMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
