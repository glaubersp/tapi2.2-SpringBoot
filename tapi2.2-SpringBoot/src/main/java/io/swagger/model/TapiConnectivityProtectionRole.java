package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.connectivity.ProtectionRole
 */
public enum TapiConnectivityProtectionRole {
  WORK("WORK"),
    PROTECT("PROTECT"),
    PROTECTED("PROTECTED"),
    NA("NA"),
    WORK_RESTORE("WORK_RESTORE"),
    PROTECT_RESTORE("PROTECT_RESTORE");

  private String value;

  TapiConnectivityProtectionRole(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiConnectivityProtectionRole fromValue(String text) {
    for (TapiConnectivityProtectionRole b : TapiConnectivityProtectionRole.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
