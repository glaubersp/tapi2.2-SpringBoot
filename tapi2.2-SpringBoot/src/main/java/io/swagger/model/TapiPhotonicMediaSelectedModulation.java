package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.photonic.media.SelectedModulation
 */
public enum TapiPhotonicMediaSelectedModulation {
  RZ("RZ"),
    NRZ("NRZ"),
    BPSK("BPSK"),
    DPSK("DPSK"),
    QPSK("QPSK"),
    _8QAM("8QAM"),
    _16QAM("16QAM"),
    PAM4("PAM4"),
    PAM8("PAM8"),
    UNDEFINED("UNDEFINED");

  private String value;

  TapiPhotonicMediaSelectedModulation(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiPhotonicMediaSelectedModulation fromValue(String text) {
    for (TapiPhotonicMediaSelectedModulation b : TapiPhotonicMediaSelectedModulation.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
