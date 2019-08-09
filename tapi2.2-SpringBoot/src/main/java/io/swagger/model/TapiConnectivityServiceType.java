package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.connectivity.ServiceType
 */
public enum TapiConnectivityServiceType {
  POINT_TO_POINT_CONNECTIVITY("POINT_TO_POINT_CONNECTIVITY"),
    POINT_TO_MULTIPOINT_CONNECTIVITY("POINT_TO_MULTIPOINT_CONNECTIVITY"),
    MULTIPOINT_CONNECTIVITY("MULTIPOINT_CONNECTIVITY"),
    ROOTED_MULTIPOINT_CONNECTIVITY("ROOTED_MULTIPOINT_CONNECTIVITY");

  private String value;

  TapiConnectivityServiceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiConnectivityServiceType fromValue(String text) {
    for (TapiConnectivityServiceType b : TapiConnectivityServiceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
