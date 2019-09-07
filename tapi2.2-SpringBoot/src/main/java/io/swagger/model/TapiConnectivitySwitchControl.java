package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiConnectivityCoordinateType;
import io.swagger.model.TapiConnectivityReversionMode;
import io.swagger.model.TapiConnectivitySelectionControl;
import io.swagger.model.TapiConnectivitySwitch;
import io.swagger.model.TapiConnectivitySwitchControlRef;
import io.swagger.model.TapiTopologyProtectionType;
import io.swagger.model.TapiTopologyRestorationPolicy;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivitySwitchControl
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivitySwitchControl extends TapiCommonGlobalClass  {
  @JsonProperty("fault-condition-determination")
  private String faultConditionDetermination = null;

  @JsonProperty("hold-off-time")
  private Integer holdOffTime = null;

  @JsonProperty("is-coordinated-switching-both-ends")
  private Boolean isCoordinatedSwitchingBothEnds = false;

  @JsonProperty("is-frozen")
  private Boolean isFrozen = false;

  @JsonProperty("is-lock-out")
  private Boolean isLockOut = false;

  @JsonProperty("max-switch-times")
  private Integer maxSwitchTimes = null;

  @JsonProperty("preferred-restoration-layer")
  @Valid
  private List<TapiCommonLayerProtocolName> preferredRestorationLayer = null;

  @JsonProperty("protection-type")
  private TapiTopologyProtectionType protectionType = null;

  @JsonProperty("restoration-coordinate-type")
  private TapiConnectivityCoordinateType restorationCoordinateType = null;

  @JsonProperty("restoration-policy")
  private TapiTopologyRestorationPolicy restorationPolicy = null;

  @JsonProperty("restore-priority")
  private Integer restorePriority = null;

  @JsonProperty("reversion-mode")
  private TapiConnectivityReversionMode reversionMode = null;

  @JsonProperty("selection-control")
  private TapiConnectivitySelectionControl selectionControl = null;

  @JsonProperty("sub-switch-control")
  @Valid
  private List<TapiConnectivitySwitchControlRef> subSwitchControl = null;

  @JsonProperty("switch")
  @Valid
  private List<TapiConnectivitySwitch> _switch = null;

  @JsonProperty("wait-to-revert-time")
  private Integer waitToRevertTime = 15;

  public TapiConnectivitySwitchControl faultConditionDetermination(String faultConditionDetermination) {
    this.faultConditionDetermination = faultConditionDetermination;
    return this;
  }

  /**
   * none
   * @return faultConditionDetermination
  **/
  @ApiModelProperty(value = "none")

  public String getFaultConditionDetermination() {
    return faultConditionDetermination;
  }

  public void setFaultConditionDetermination(String faultConditionDetermination) {
    this.faultConditionDetermination = faultConditionDetermination;
  }

  public TapiConnectivitySwitchControl holdOffTime(Integer holdOffTime) {
    this.holdOffTime = holdOffTime;
    return this;
  }

  /**
   * This attribute indicates the time, in milliseconds, between declaration of signal degrade or signal fail, and the initialization of the protection switching algorithm.
   * @return holdOffTime
  **/
  @ApiModelProperty(value = "This attribute indicates the time, in milliseconds, between declaration of signal degrade or signal fail, and the initialization of the protection switching algorithm.")

  public Integer getHoldOffTime() {
    return holdOffTime;
  }

  public void setHoldOffTime(Integer holdOffTime) {
    this.holdOffTime = holdOffTime;
  }

  public TapiConnectivitySwitchControl isCoordinatedSwitchingBothEnds(Boolean isCoordinatedSwitchingBothEnds) {
    this.isCoordinatedSwitchingBothEnds = isCoordinatedSwitchingBothEnds;
    return this;
  }

  /**
   * Is operating such that switching at both ends of each flow acorss the FC is coordinated at both ingress and egress ends.
   * @return isCoordinatedSwitchingBothEnds
  **/
  @ApiModelProperty(value = "Is operating such that switching at both ends of each flow acorss the FC is coordinated at both ingress and egress ends.")

  public Boolean isIsCoordinatedSwitchingBothEnds() {
    return isCoordinatedSwitchingBothEnds;
  }

  public void setIsCoordinatedSwitchingBothEnds(Boolean isCoordinatedSwitchingBothEnds) {
    this.isCoordinatedSwitchingBothEnds = isCoordinatedSwitchingBothEnds;
  }

  public TapiConnectivitySwitchControl isFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
    return this;
  }

  /**
   * Temporarily prevents any switch action to be taken and, as such, freezes the current state.                   Until the freeze is cleared, additional near-end external commands are rejected and fault condition changes and received APS messages are ignored.                  All administrative controls of any aspect of protection are rejected.
   * @return isFrozen
  **/
  @ApiModelProperty(value = "Temporarily prevents any switch action to be taken and, as such, freezes the current state.                   Until the freeze is cleared, additional near-end external commands are rejected and fault condition changes and received APS messages are ignored.                  All administrative controls of any aspect of protection are rejected.")

  public Boolean isIsFrozen() {
    return isFrozen;
  }

  public void setIsFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
  }

  public TapiConnectivitySwitchControl isLockOut(Boolean isLockOut) {
    this.isLockOut = isLockOut;
    return this;
  }

  /**
   * The resource is configured to temporarily not be available for use in the protection scheme(s) it is part of.                  This overrides all other protection control states including forced.                  If the item is locked out then it cannot be used under any circumstances.                  Note: Only relevant when part of a protection scheme.
   * @return isLockOut
  **/
  @ApiModelProperty(value = "The resource is configured to temporarily not be available for use in the protection scheme(s) it is part of.                  This overrides all other protection control states including forced.                  If the item is locked out then it cannot be used under any circumstances.                  Note: Only relevant when part of a protection scheme.")

  public Boolean isIsLockOut() {
    return isLockOut;
  }

  public void setIsLockOut(Boolean isLockOut) {
    this.isLockOut = isLockOut;
  }

  public TapiConnectivitySwitchControl maxSwitchTimes(Integer maxSwitchTimes) {
    this.maxSwitchTimes = maxSwitchTimes;
    return this;
  }

  /**
   * Used to limit the maximum swtich times. When work fault disappears , and traffic return to the original work path, switch counter reset.
   * @return maxSwitchTimes
  **/
  @ApiModelProperty(value = "Used to limit the maximum swtich times. When work fault disappears , and traffic return to the original work path, switch counter reset.")

  public Integer getMaxSwitchTimes() {
    return maxSwitchTimes;
  }

  public void setMaxSwitchTimes(Integer maxSwitchTimes) {
    this.maxSwitchTimes = maxSwitchTimes;
  }

  public TapiConnectivitySwitchControl preferredRestorationLayer(List<TapiCommonLayerProtocolName> preferredRestorationLayer) {
    this.preferredRestorationLayer = preferredRestorationLayer;
    return this;
  }

  public TapiConnectivitySwitchControl addPreferredRestorationLayerItem(TapiCommonLayerProtocolName preferredRestorationLayerItem) {
    if (this.preferredRestorationLayer == null) {
      this.preferredRestorationLayer = new ArrayList<>();
    }
    this.preferredRestorationLayer.add(preferredRestorationLayerItem);
    return this;
  }

  /**
   * Indicate which layer this resilience parameters package configured for.
   * @return preferredRestorationLayer
  **/
  @ApiModelProperty(value = "Indicate which layer this resilience parameters package configured for.")
  @Valid
  public List<TapiCommonLayerProtocolName> getPreferredRestorationLayer() {
    return preferredRestorationLayer;
  }

  public void setPreferredRestorationLayer(List<TapiCommonLayerProtocolName> preferredRestorationLayer) {
    this.preferredRestorationLayer = preferredRestorationLayer;
  }

  public TapiConnectivitySwitchControl protectionType(TapiTopologyProtectionType protectionType) {
    this.protectionType = protectionType;
    return this;
  }

  /**
   * Get protectionType
   * @return protectionType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyProtectionType getProtectionType() {
    return protectionType;
  }

  public void setProtectionType(TapiTopologyProtectionType protectionType) {
    this.protectionType = protectionType;
  }

  public TapiConnectivitySwitchControl restorationCoordinateType(TapiConnectivityCoordinateType restorationCoordinateType) {
    this.restorationCoordinateType = restorationCoordinateType;
    return this;
  }

  /**
   * Get restorationCoordinateType
   * @return restorationCoordinateType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityCoordinateType getRestorationCoordinateType() {
    return restorationCoordinateType;
  }

  public void setRestorationCoordinateType(TapiConnectivityCoordinateType restorationCoordinateType) {
    this.restorationCoordinateType = restorationCoordinateType;
  }

  public TapiConnectivitySwitchControl restorationPolicy(TapiTopologyRestorationPolicy restorationPolicy) {
    this.restorationPolicy = restorationPolicy;
    return this;
  }

  /**
   * Get restorationPolicy
   * @return restorationPolicy
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyRestorationPolicy getRestorationPolicy() {
    return restorationPolicy;
  }

  public void setRestorationPolicy(TapiTopologyRestorationPolicy restorationPolicy) {
    this.restorationPolicy = restorationPolicy;
  }

  public TapiConnectivitySwitchControl restorePriority(Integer restorePriority) {
    this.restorePriority = restorePriority;
    return this;
  }

  /**
   * none
   * @return restorePriority
  **/
  @ApiModelProperty(value = "none")

  public Integer getRestorePriority() {
    return restorePriority;
  }

  public void setRestorePriority(Integer restorePriority) {
    this.restorePriority = restorePriority;
  }

  public TapiConnectivitySwitchControl reversionMode(TapiConnectivityReversionMode reversionMode) {
    this.reversionMode = reversionMode;
    return this;
  }

  /**
   * Get reversionMode
   * @return reversionMode
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityReversionMode getReversionMode() {
    return reversionMode;
  }

  public void setReversionMode(TapiConnectivityReversionMode reversionMode) {
    this.reversionMode = reversionMode;
  }

  public TapiConnectivitySwitchControl selectionControl(TapiConnectivitySelectionControl selectionControl) {
    this.selectionControl = selectionControl;
    return this;
  }

  /**
   * Get selectionControl
   * @return selectionControl
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivitySelectionControl getSelectionControl() {
    return selectionControl;
  }

  public void setSelectionControl(TapiConnectivitySelectionControl selectionControl) {
    this.selectionControl = selectionControl;
  }

  public TapiConnectivitySwitchControl subSwitchControl(List<TapiConnectivitySwitchControlRef> subSwitchControl) {
    this.subSwitchControl = subSwitchControl;
    return this;
  }

  public TapiConnectivitySwitchControl addSubSwitchControlItem(TapiConnectivitySwitchControlRef subSwitchControlItem) {
    if (this.subSwitchControl == null) {
      this.subSwitchControl = new ArrayList<>();
    }
    this.subSwitchControl.add(subSwitchControlItem);
    return this;
  }

  /**
   * none
   * @return subSwitchControl
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivitySwitchControlRef> getSubSwitchControl() {
    return subSwitchControl;
  }

  public void setSubSwitchControl(List<TapiConnectivitySwitchControlRef> subSwitchControl) {
    this.subSwitchControl = subSwitchControl;
  }

  public TapiConnectivitySwitchControl _switch(List<TapiConnectivitySwitch> _switch) {
    this._switch = _switch;
    return this;
  }

  public TapiConnectivitySwitchControl addSwitchItem(TapiConnectivitySwitch _switchItem) {
    if (this._switch == null) {
      this._switch = new ArrayList<>();
    }
    this._switch.add(_switchItem);
    return this;
  }

  /**
   * none
   * @return _switch
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivitySwitch> getSwitch() {
    return _switch;
  }

  public void setSwitch(List<TapiConnectivitySwitch> _switch) {
    this._switch = _switch;
  }

  public TapiConnectivitySwitchControl waitToRevertTime(Integer waitToRevertTime) {
    this.waitToRevertTime = waitToRevertTime;
    return this;
  }

  /**
   * If the protection system is revertive, this attribute specifies the time, in minutes, to wait after a fault clears on a higher priority (preferred) resource before reverting to the preferred resource.
   * @return waitToRevertTime
  **/
  @ApiModelProperty(value = "If the protection system is revertive, this attribute specifies the time, in minutes, to wait after a fault clears on a higher priority (preferred) resource before reverting to the preferred resource.")

  public Integer getWaitToRevertTime() {
    return waitToRevertTime;
  }

  public void setWaitToRevertTime(Integer waitToRevertTime) {
    this.waitToRevertTime = waitToRevertTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivitySwitchControl tapiConnectivitySwitchControl = (TapiConnectivitySwitchControl) o;
    return Objects.equals(this.faultConditionDetermination, tapiConnectivitySwitchControl.faultConditionDetermination) &&
        Objects.equals(this.holdOffTime, tapiConnectivitySwitchControl.holdOffTime) &&
        Objects.equals(this.isCoordinatedSwitchingBothEnds, tapiConnectivitySwitchControl.isCoordinatedSwitchingBothEnds) &&
        Objects.equals(this.isFrozen, tapiConnectivitySwitchControl.isFrozen) &&
        Objects.equals(this.isLockOut, tapiConnectivitySwitchControl.isLockOut) &&
        Objects.equals(this.maxSwitchTimes, tapiConnectivitySwitchControl.maxSwitchTimes) &&
        Objects.equals(this.preferredRestorationLayer, tapiConnectivitySwitchControl.preferredRestorationLayer) &&
        Objects.equals(this.protectionType, tapiConnectivitySwitchControl.protectionType) &&
        Objects.equals(this.restorationCoordinateType, tapiConnectivitySwitchControl.restorationCoordinateType) &&
        Objects.equals(this.restorationPolicy, tapiConnectivitySwitchControl.restorationPolicy) &&
        Objects.equals(this.restorePriority, tapiConnectivitySwitchControl.restorePriority) &&
        Objects.equals(this.reversionMode, tapiConnectivitySwitchControl.reversionMode) &&
        Objects.equals(this.selectionControl, tapiConnectivitySwitchControl.selectionControl) &&
        Objects.equals(this.subSwitchControl, tapiConnectivitySwitchControl.subSwitchControl) &&
        Objects.equals(this._switch, tapiConnectivitySwitchControl._switch) &&
        Objects.equals(this.waitToRevertTime, tapiConnectivitySwitchControl.waitToRevertTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faultConditionDetermination, holdOffTime, isCoordinatedSwitchingBothEnds, isFrozen, isLockOut, maxSwitchTimes, preferredRestorationLayer, protectionType, restorationCoordinateType, restorationPolicy, restorePriority, reversionMode, selectionControl, subSwitchControl, _switch, waitToRevertTime, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivitySwitchControl {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    faultConditionDetermination: ").append(toIndentedString(faultConditionDetermination)).append("\n");
    sb.append("    holdOffTime: ").append(toIndentedString(holdOffTime)).append("\n");
    sb.append("    isCoordinatedSwitchingBothEnds: ").append(toIndentedString(isCoordinatedSwitchingBothEnds)).append("\n");
    sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
    sb.append("    isLockOut: ").append(toIndentedString(isLockOut)).append("\n");
    sb.append("    maxSwitchTimes: ").append(toIndentedString(maxSwitchTimes)).append("\n");
    sb.append("    preferredRestorationLayer: ").append(toIndentedString(preferredRestorationLayer)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    restorationCoordinateType: ").append(toIndentedString(restorationCoordinateType)).append("\n");
    sb.append("    restorationPolicy: ").append(toIndentedString(restorationPolicy)).append("\n");
    sb.append("    restorePriority: ").append(toIndentedString(restorePriority)).append("\n");
    sb.append("    reversionMode: ").append(toIndentedString(reversionMode)).append("\n");
    sb.append("    selectionControl: ").append(toIndentedString(selectionControl)).append("\n");
    sb.append("    subSwitchControl: ").append(toIndentedString(subSwitchControl)).append("\n");
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
    sb.append("    waitToRevertTime: ").append(toIndentedString(waitToRevertTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
