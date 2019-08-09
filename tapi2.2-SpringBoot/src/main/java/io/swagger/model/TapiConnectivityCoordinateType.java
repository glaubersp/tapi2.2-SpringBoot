package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.connectivity.CoordinateType
 */
public enum TapiConnectivityCoordinateType {
  NO_COORDINATE("NO_COORDINATE"),
    HOLD_OFF_TIME("HOLD_OFF_TIME"),
    WAIT_FOR_NOTIFICATION("WAIT_FOR_NOTIFICATION");

  private String value;

  TapiConnectivityCoordinateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiConnectivityCoordinateType fromValue(String text) {
    for (TapiConnectivityCoordinateType b : TapiConnectivityCoordinateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
