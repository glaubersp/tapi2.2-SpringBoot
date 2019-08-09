package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.connectivity.ReversionMode
 */
public enum TapiConnectivityReversionMode {
  REVERTIVE("REVERTIVE"),
    NON_REVERTIVE("NON-REVERTIVE");

  private String value;

  TapiConnectivityReversionMode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiConnectivityReversionMode fromValue(String text) {
    for (TapiConnectivityReversionMode b : TapiConnectivityReversionMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
