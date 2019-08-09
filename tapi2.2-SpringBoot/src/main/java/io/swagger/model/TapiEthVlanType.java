package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.eth.VlanType
 */
public enum TapiEthVlanType {
  C_TAG("C_Tag"),
    S_TAG("S_Tag"),
    I_TAG("I_Tag");

  private String value;

  TapiEthVlanType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiEthVlanType fromValue(String text) {
    for (TapiEthVlanType b : TapiEthVlanType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
