package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.eth.EtyPhyType
 */
public enum TapiEthEtyPhyType {
  OTHER("OTHER"),
    UNKNOWN("UNKNOWN"),
    NONE("NONE"),
    _2BASE_TL("2BASE_TL"),
    _10MBIT_S("10MBIT_S"),
    _10PASS_TS("10PASS_TS"),
    _100BASE_T4("100BASE_T4"),
    _100BASE_X("100BASE_X"),
    _100BASE_T2("100BASE_T2"),
    _1000BASE_X("1000BASE_X"),
    _1000BASE_T("1000BASE_T"),
    _10GBASE_X("10GBASE-X"),
    _10GBASE_R("10GBASE_R"),
    _10GBASE_W("10GBASE_W");

  private String value;

  TapiEthEtyPhyType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiEthEtyPhyType fromValue(String text) {
    for (TapiEthEtyPhyType b : TapiEthEtyPhyType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
