package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.connectivity.SelectionControl
 */
public enum TapiConnectivitySelectionControl {
  LOCK_OUT("LOCK_OUT"),
    NORMAL("NORMAL"),
    MANUAL("MANUAL"),
    FORCED("FORCED");

  private String value;

  TapiConnectivitySelectionControl(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiConnectivitySelectionControl fromValue(String text) {
    for (TapiConnectivitySelectionControl b : TapiConnectivitySelectionControl.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
