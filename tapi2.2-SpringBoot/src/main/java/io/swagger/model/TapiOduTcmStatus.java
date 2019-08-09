package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.odu.TcmStatus
 */
public enum TapiOduTcmStatus {
  NO_SOURCE_TC("NO_SOURCE_TC"),
    IN_USE_WITHOUT_IAE("IN_USE_WITHOUT_IAE"),
    IN_USE_WITH_IAE("IN_USE_WITH_IAE"),
    RESERVED_1("RESERVED_1"),
    RESERVED_2("RESERVED_2"),
    LCK("LCK"),
    OCI("OCI"),
    AIS("AIS");

  private String value;

  TapiOduTcmStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOduTcmStatus fromValue(String text) {
    for (TapiOduTcmStatus b : TapiOduTcmStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
