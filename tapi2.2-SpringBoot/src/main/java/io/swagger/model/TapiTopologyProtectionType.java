package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.topology.ProtectionType
 */
public enum TapiTopologyProtectionType {
  NO_PROTECTION("NO_PROTECTION"),
    ONE_PLUS_ONE_PROTECTION("ONE_PLUS_ONE_PROTECTION"),
    ONE_FOR_ONE_PROTECTION("ONE_FOR_ONE_PROTECTION"),
    ONE_FOR_N_PROTECTION("ONE_FOR_N_PROTECTION"),
    M_FOR_N_PROTECTION("M_FOR_N_PROTECTION"),
    ONE_FOR_ONE_BY_N("ONE_FOR_ONE_BY_N");

  private String value;

  TapiTopologyProtectionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiTopologyProtectionType fromValue(String text) {
    for (TapiTopologyProtectionType b : TapiTopologyProtectionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
