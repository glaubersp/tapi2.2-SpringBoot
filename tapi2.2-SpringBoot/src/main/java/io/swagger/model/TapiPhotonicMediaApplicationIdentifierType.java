package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.photonic.media.ApplicationIdentifierType
 */
public enum TapiPhotonicMediaApplicationIdentifierType {
  PROPRIETARY("PROPRIETARY"),
    ITUT_G959_1("ITUT_G959_1"),
    ITUT_G698_1("ITUT_G698_1"),
    ITUT_G698_2("ITUT_G698_2"),
    ITUT_G696_1("ITUT_G696_1"),
    ITUT_G695("ITUT_G695");

  private String value;

  TapiPhotonicMediaApplicationIdentifierType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiPhotonicMediaApplicationIdentifierType fromValue(String text) {
    for (TapiPhotonicMediaApplicationIdentifierType b : TapiPhotonicMediaApplicationIdentifierType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
