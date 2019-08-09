package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.topology.ForwardingRule
 */
public enum TapiTopologyForwardingRule {
  MAY_FORWARD_ACROSS_GROUP("MAY_FORWARD_ACROSS_GROUP"),
    MUST_FORWARD_ACROSS_GROUP("MUST_FORWARD_ACROSS_GROUP"),
    CANNOT_FORWARD_ACROSS_GROUP("CANNOT_FORWARD_ACROSS_GROUP"),
    NO_STATEMENT_ON_FORWARDING("NO_STATEMENT_ON_FORWARDING");

  private String value;

  TapiTopologyForwardingRule(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiTopologyForwardingRule fromValue(String text) {
    for (TapiTopologyForwardingRule b : TapiTopologyForwardingRule.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
