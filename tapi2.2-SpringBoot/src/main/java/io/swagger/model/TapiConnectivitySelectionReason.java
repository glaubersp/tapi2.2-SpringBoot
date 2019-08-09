package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.connectivity.SelectionReason
 */
public enum TapiConnectivitySelectionReason {
  LOCKOUT("LOCKOUT"),
    NORMAL("NORMAL"),
    MANUAL("MANUAL"),
    FORCED("FORCED"),
    WAIT_TO_REVERT("WAIT_TO_REVERT"),
    SIGNAL_DEGRADE("SIGNAL_DEGRADE"),
    SIGNAL_FAIL("SIGNAL_FAIL");

  private String value;

  TapiConnectivitySelectionReason(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiConnectivitySelectionReason fromValue(String text) {
    for (TapiConnectivitySelectionReason b : TapiConnectivitySelectionReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
