package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.oam.ServiceAffecting
 */
public enum TapiOamServiceAffecting {
  SERVICE_AFFECTING("SERVICE_AFFECTING"),
    NOT_SERVICE_AFFECTING("NOT_SERVICE_AFFECTING"),
    UNKNOWN("UNKNOWN");

  private String value;

  TapiOamServiceAffecting(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOamServiceAffecting fromValue(String text) {
    for (TapiOamServiceAffecting b : TapiOamServiceAffecting.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
