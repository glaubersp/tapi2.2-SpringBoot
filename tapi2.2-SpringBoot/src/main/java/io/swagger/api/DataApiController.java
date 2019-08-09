package io.swagger.api;

import io.swagger.model.TapiCommonAdminStatePac;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonCapacityValue;
import io.swagger.model.TapiCommonContext;
import io.swagger.model.TapiCommonContextServiceInterfacePoint;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonServiceInterfacePointRef;
import io.swagger.model.TapiCommonTimeInterval;
import io.swagger.model.TapiCommonTimePeriod;
import io.swagger.model.TapiCommonTimeRange;
import io.swagger.model.TapiConnectivityCeplistConnectionEndPoint;
import io.swagger.model.TapiConnectivityConnection;
import io.swagger.model.TapiConnectivityConnectionEndPointRef;
import io.swagger.model.TapiConnectivityConnectionRef;
import io.swagger.model.TapiConnectivityConnectivityConstraint;
import io.swagger.model.TapiConnectivityConnectivityServiceEndPointRef;
import io.swagger.model.TapiConnectivityConnectivityServiceRef;
import io.swagger.model.TapiConnectivityConnectivitycontextConnectivityService;
import io.swagger.model.TapiConnectivityConnectivityServiceEndPoint;
import io.swagger.model.TapiConnectivityContextConnectivityContext;
import io.swagger.model.TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList;
import io.swagger.model.TapiConnectivityResilienceConstraint;
import io.swagger.model.TapiConnectivityRoute;
import io.swagger.model.TapiConnectivityRouteRef;
import io.swagger.model.TapiConnectivitySwitch;
import io.swagger.model.TapiConnectivitySwitchControl;
import io.swagger.model.TapiConnectivitySwitchControlRef;
import io.swagger.model.TapiEthBandwidthReport;
import io.swagger.model.TapiEthControlFrameFilter;
import io.swagger.model.TapiEthEthCfmLinkTracePac;
import io.swagger.model.TapiEthEthCfmLinkTraceResultData;
import io.swagger.model.TapiEthEthCfmMaintenanceAssociation;
import io.swagger.model.TapiEthEthCfmMaintenanceDomain;
import io.swagger.model.TapiEthEthConnectionEndPointSpec;
import io.swagger.model.TapiEthEthConnectivityService;
import io.swagger.model.TapiEthEthConnectivityServiceEndPointSpec;
import io.swagger.model.TapiEthEthCtpCommonPac;
import io.swagger.model.TapiEthEthCtpPac;
import io.swagger.model.TapiEthEthLinkTraceJob;
import io.swagger.model.TapiEthEthLinkTraceResultData;
import io.swagger.model.TapiEthEthLoopbackJob;
import io.swagger.model.TapiEthEthLoopbackResultData;
import io.swagger.model.TapiEthEthMegCommon;
import io.swagger.model.TapiEthEthMegSpec;
import io.swagger.model.TapiEthEthMepCommon;
import io.swagger.model.TapiEthEthMepSink;
import io.swagger.model.TapiEthEthMepSource;
import io.swagger.model.TapiEthEthMepSpec;
import io.swagger.model.TapiEthEthMipCommon;
import io.swagger.model.TapiEthEthMipSpec;
import io.swagger.model.TapiEthEthOamMepServicePoint;
import io.swagger.model.TapiEthEthOamMipServicePoint;
import io.swagger.model.TapiEthEthOamService;
import io.swagger.model.TapiEthEthOamTestLoopbackCommonPac;
import io.swagger.model.TapiEthEthOnDemand1DmPerformanceData;
import io.swagger.model.TapiEthEthOnDemand1DmSourcePerformanceData;
import io.swagger.model.TapiEthEthOnDemand1LmPerformanceData;
import io.swagger.model.TapiEthEthOnDemand1LmSourcePerformanceData;
import io.swagger.model.TapiEthEthOnDemandDmPerformanceData;
import io.swagger.model.TapiEthEthOnDemandDualEndedMeasurementJob;
import io.swagger.model.TapiEthEthOnDemandLmPerformanceData;
import io.swagger.model.TapiEthEthOnDemandMeasurementJobControlSink;
import io.swagger.model.TapiEthEthOnDemandMeasurementJobControlSource;
import io.swagger.model.TapiEthEthOnDemandSingleEndedMeasurementJob;
import io.swagger.model.TapiEthEthProActive1DmPerformanceData;
import io.swagger.model.TapiEthEthProActive1DmSourcePerformanceData;
import io.swagger.model.TapiEthEthProActive1LmPerformanceData;
import io.swagger.model.TapiEthEthProActive1LmSourcePerformanceData;
import io.swagger.model.TapiEthEthProActiveDmPerformanceData;
import io.swagger.model.TapiEthEthProActiveDualEndedMeasurementJob;
import io.swagger.model.TapiEthEthProActiveLmPerformanceData;
import io.swagger.model.TapiEthEthProActiveMeasurementJobControlSink;
import io.swagger.model.TapiEthEthProActiveMeasurementJobControlSource;
import io.swagger.model.TapiEthEthProActiveSingleEndedMeasurementJob;
import io.swagger.model.TapiEthEthServiceIntefacePointSpec;
import io.swagger.model.TapiEthEthTerminationCommonPac;
import io.swagger.model.TapiEthEthTerminationPac;
import io.swagger.model.TapiEthEthTestJob;
import io.swagger.model.TapiEthEthTestJobSinkPoint;
import io.swagger.model.TapiEthEthTestResultData;
import io.swagger.model.TapiEthEtyTerminationCommonPac;
import io.swagger.model.TapiEthEtyTerminationPac;
import io.swagger.model.TapiEthLinkTraceResult;
import io.swagger.model.TapiEthLldpChassisIdSubtype;
import io.swagger.model.TapiEthLldpPortIdSubtype;
import io.swagger.model.TapiEthMaintenanceAssociationName;
import io.swagger.model.TapiEthPriorityConfiguration;
import io.swagger.model.TapiEthPriorityMapping;
import io.swagger.model.TapiEthQueueConfiguration;
import io.swagger.model.TapiEthSamplesDmPerformanceParameters;
import io.swagger.model.TapiEthStatisticalDmPerformanceParameters;
import io.swagger.model.TapiEthStatisticalLmPerformanceParameters;
import io.swagger.model.TapiEthTotalCountersLmPerformanceParameters;
import io.swagger.model.TapiEthTrafficConditioningConfiguration;
import io.swagger.model.TapiEthTrafficConditioningPac;
import io.swagger.model.TapiEthTrafficShapingPac;
import io.swagger.model.TapiNotificationContextNotificationContext;
import io.swagger.model.TapiNotificationNameAndValueChange;
import io.swagger.model.TapiNotificationNotification;
import io.swagger.model.TapiNotificationNotificationChannel;
import io.swagger.model.TapiNotificationNotificationSubscriptionService;
import io.swagger.model.TapiNotificationNotificationcontextNotification;
import io.swagger.model.TapiNotificationSubscriptionFilter;
import io.swagger.model.TapiOamAlarmInfo;
import io.swagger.model.TapiOamContextOamContext;
import io.swagger.model.TapiOamCurrentdataHistoryData;
import io.swagger.model.TapiOamMegMep;
import io.swagger.model.TapiOamMegMip;
import io.swagger.model.TapiOamMegRef;
import io.swagger.model.TapiOamMepMipList;
import io.swagger.model.TapiOamMepRef;
import io.swagger.model.TapiOamMipRef;
import io.swagger.model.TapiOamOamJobRef;
import io.swagger.model.TapiOamOamProfile;
import io.swagger.model.TapiOamOamProfileRef;
import io.swagger.model.TapiOamOamServicePointRef;
import io.swagger.model.TapiOamOamcontextMeg;
import io.swagger.model.TapiOamOamcontextOamJob;
import io.swagger.model.TapiOamOamcontextOamService;
import io.swagger.model.TapiOamOamjobCurrentData;
import io.swagger.model.TapiOamOamserviceOamServicePoint;
import io.swagger.model.TapiOamPmDataPac;
import io.swagger.model.TapiOamPmParameterValue;
import io.swagger.model.TapiOamPmThresholdData;
import io.swagger.model.TapiOamTcaInfo;
import io.swagger.model.TapiOamThresholdParameter;
import io.swagger.model.TapiPathComputationPath;
import io.swagger.model.TapiPathComputationPathComputationContext;
import io.swagger.model.TapiPathComputationPathComputationService;
import io.swagger.model.TapiPathComputationPathObjectiveFunction;
import io.swagger.model.TapiPathComputationPathOptimizationConstraint;
import io.swagger.model.TapiPathComputationPathRef;
import io.swagger.model.TapiPathComputationPathServiceEndPoint;
import io.swagger.model.TapiPathComputationRoutingConstraint;
import io.swagger.model.TapiPathComputationTopologyConstraint;
import io.swagger.model.TapiPhotonicMediaApplicationIdentifier;
import io.swagger.model.TapiPhotonicMediaCentralFrequency;
import io.swagger.model.TapiPhotonicMediaCentralFrequencyBand;
import io.swagger.model.TapiPhotonicMediaFecProperties;
import io.swagger.model.TapiPhotonicMediaFrequencyConstraint;
import io.swagger.model.TapiPhotonicMediaLaserProperties;
import io.swagger.model.TapiPhotonicMediaMediaChannelConfigPac;
import io.swagger.model.TapiPhotonicMediaMediaChannelConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec;
import io.swagger.model.TapiPhotonicMediaMediaChannelNodeEdgePointSpec;
import io.swagger.model.TapiPhotonicMediaMediaChannelPoolCapabilityPac;
import io.swagger.model.TapiPhotonicMediaMediaChannelPropertiesPac;
import io.swagger.model.TapiPhotonicMediaMediaChannelServiceInterfacePointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiCapabilityPac;
import io.swagger.model.TapiPhotonicMediaOtsiConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiServerAdaptationPac;
import io.swagger.model.TapiPhotonicMediaOtsiServiceInterfacePointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiTerminationConfigPac;
import io.swagger.model.TapiPhotonicMediaOtsiTerminationPac;
import io.swagger.model.TapiPhotonicMediaPowerManagementCapabilityPac;
import io.swagger.model.TapiPhotonicMediaPowerManagementConfigPac;
import io.swagger.model.TapiPhotonicMediaPowerProperties;
import io.swagger.model.TapiPhotonicMediaSpectrumBand;
import io.swagger.model.TapiPhotonicMediaTotalPowerThresholdPac;
import io.swagger.model.TapiTopologyCostCharacteristic;
import io.swagger.model.TapiTopologyInterRuleGroup;
import io.swagger.model.TapiTopologyLatencyCharacteristic;
import io.swagger.model.TapiTopologyLink;
import io.swagger.model.TapiTopologyLinkRef;
import io.swagger.model.TapiTopologyNepLayerProtocolCapability;
import io.swagger.model.TapiTopologyNetworkTopologyService;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import io.swagger.model.TapiTopologyNodeNodeEdgePoint;
import io.swagger.model.TapiTopologyNodeRef;
import io.swagger.model.TapiTopologyNodeRuleGroup;
import io.swagger.model.TapiTopologyNodeRuleGroupRef;
import io.swagger.model.TapiTopologyRiskCharacteristic;
import io.swagger.model.TapiTopologyRule;
import io.swagger.model.TapiTopologyTopologyContext;
import io.swagger.model.TapiTopologyTopologyNode;
import io.swagger.model.TapiTopologyTopologyRef;
import io.swagger.model.TapiTopologyTopologycontextTopology;
import io.swagger.model.TapiTopologyValidationMechanism;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkConstraint;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkContext;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkService;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkServiceEndPoint;
import io.swagger.model.TapiVirtualNetworkVirtualNwServiceRef;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
@Controller
public class DataApiController implements DataApi {

    private static final Logger log = LoggerFactory.getLogger(DataApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DataApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<TapiTopologyNodeRef> dataContextConnectivityContextConnectionuuidBoundingNodeGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeRef>(objectMapper.readValue("", TapiTopologyNodeRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectionEndPointRef> dataContextConnectivityContextConnectionuuidConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(objectMapper.readValue("", TapiConnectivityConnectionEndPointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnection> dataContextConnectivityContextConnectionuuidGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnection>(objectMapper.readValue("", TapiConnectivityConnection.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnection>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnection>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectionRef> dataContextConnectivityContextConnectionuuidLowerConnectionconnectionUuidGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of lower-connection",required=true) @PathVariable("connection-uuid") String connectionUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectionRef>(objectMapper.readValue("{\"connection-uuid\":\"connection-uuid\"}", TapiConnectivityConnectionRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectionRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectionRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextConnectivityContextConnectionuuidNamevalueNameGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{\"value-name\":\"value-name\",\"value\":\"value\"}", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectionEndPointRef> dataContextConnectivityContextConnectionuuidRoutelocalIdConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of route",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(objectMapper.readValue("", TapiConnectivityConnectionEndPointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityRoute> dataContextConnectivityContextConnectionuuidRoutelocalIdGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of route",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityRoute>(objectMapper.readValue("", TapiConnectivityRoute.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityRoute>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityRoute>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextConnectivityContextConnectionuuidRoutelocalIdNamevalueNameGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of route",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{\"value-name\":\"value-name\",\"value\":\"value\"}", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyLinkRef> dataContextConnectivityContextConnectionuuidSupportedClientLinktopologyUuidlinkUuidGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of supported-client-link",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of supported-client-link",required=true) @PathVariable("link-uuid") String linkUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyLinkRef>(objectMapper.readValue("", TapiTopologyLinkRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyLinkRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyLinkRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivitySwitchControl> dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of switch-control",required=true) @PathVariable("switch-control-uuid") String switchControlUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivitySwitchControl>(objectMapper.readValue("", TapiConnectivitySwitchControl.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivitySwitchControl>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivitySwitchControl>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidNamevalueNameGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of switch-control",required=true) @PathVariable("switch-control-uuid") String switchControlUuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{\"value-name\":\"value-name\",\"value\":\"value\"}", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivitySwitchControlRef> dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSubSwitchControlconnectionUuidsubSwitchControlSwitchControlUuidGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of switch-control",required=true) @PathVariable("switch-control-uuid") String switchControlUuid,@ApiParam(value = "Id of sub-switch-control",required=true) @PathVariable("connection-uuid") String connectionUuid,@ApiParam(value = "Id of sub-switch-control",required=true) @PathVariable("sub-switch-control-switch-control-uuid") String subSwitchControlSwitchControlUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivitySwitchControlRef>(objectMapper.readValue("", TapiConnectivitySwitchControlRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivitySwitchControlRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivitySwitchControlRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivitySwitch> dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of switch-control",required=true) @PathVariable("switch-control-uuid") String switchControlUuid,@ApiParam(value = "Id of switch",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivitySwitch>(objectMapper.readValue("", TapiConnectivitySwitch.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivitySwitch>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivitySwitch>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdNamevalueNameGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of switch-control",required=true) @PathVariable("switch-control-uuid") String switchControlUuid,@ApiParam(value = "Id of switch",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{\"value-name\":\"value-name\",\"value\":\"value\"}", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectionEndPointRef> dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdSelectedConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of switch-control",required=true) @PathVariable("switch-control-uuid") String switchControlUuid,@ApiParam(value = "Id of switch",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of selected-connection-end-point",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of selected-connection-end-point",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of selected-connection-end-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of selected-connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(objectMapper.readValue("", TapiConnectivityConnectionEndPointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityRouteRef> dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdSelectedRouteconnectionUuidrouteLocalIdGet(@ApiParam(value = "Id of connection",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of switch-control",required=true) @PathVariable("switch-control-uuid") String switchControlUuid,@ApiParam(value = "Id of switch",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of selected-route",required=true) @PathVariable("connection-uuid") String connectionUuid,@ApiParam(value = "Id of selected-route",required=true) @PathVariable("route-local-id") String routeLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityRouteRef>(objectMapper.readValue("", TapiConnectivityRouteRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityRouteRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityRouteRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServicePost(@ApiParam(value = "tapi.connectivity.connectivitycontext.ConnectivityService to be added to list"  )  @Valid @RequestBody TapiConnectivityConnectivitycontextConnectivityService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectionRef> dataContextConnectivityContextConnectivityServiceuuidConnectionconnectionUuidGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of connection",required=true) @PathVariable("connection-uuid") String connectionUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectionRef>(objectMapper.readValue("{\"connection-uuid\":\"connection-uuid\"}", TapiConnectivityConnectionRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectionRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectionRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectivityServiceRef> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectivityServiceRef>(objectMapper.readValue("{\"connectivity-service-uuid\":\"connectivity-service-uuid\"}", TapiConnectivityConnectivityServiceRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectivityServiceRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectivityServiceRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.connectivity.ConnectivityServiceRef to be added to list"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.connectivity.ConnectivityServiceRef to be added or updated"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.connectivity.ConnectivityServiceRef to be added to list"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionconnectivityServiceUuidDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of diversity-exclusion",required=true) @PathVariable("connectivity-service-uuid") String connectivityServiceUuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectivityServiceRef> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionconnectivityServiceUuidGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of diversity-exclusion",required=true) @PathVariable("connectivity-service-uuid") String connectivityServiceUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectivityServiceRef>(objectMapper.readValue("{\"connectivity-service-uuid\":\"connectivity-service-uuid\"}", TapiConnectivityConnectivityServiceRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectivityServiceRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectivityServiceRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionconnectivityServiceUuidPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of diversity-exclusion",required=true) @PathVariable("connectivity-service-uuid") String connectivityServiceUuid,@ApiParam(value = "tapi.connectivity.ConnectivityServiceRef to be added or updated"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectivityConstraint> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectivityConstraint>(objectMapper.readValue("{ \"schedule\" : { \"start-time\" : \"start-time\", \"end-time\" : \"end-time\" }, \"requested-capacity\" : { \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }, \"diversity-exclusion\" : [ { \"connectivity-service-uuid\" : \"connectivity-service-uuid\" }, { \"connectivity-service-uuid\" : \"connectivity-service-uuid\" } ], \"service-level\" : \"service-level\", \"service-type\" : \"POINT_TO_POINT_CONNECTIVITY\", \"coroute-inclusion\" : { \"connectivity-service-uuid\" : \"connectivity-service-uuid\" } }", TapiConnectivityConnectivityConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectivityConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectivityConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.connectivity.ConnectivityConstraint to be added to list"  )  @Valid @RequestBody TapiConnectivityConnectivityConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.connectivity.ConnectivityConstraint to be added or updated"  )  @Valid @RequestBody TapiConnectivityConnectivityConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.Capacity to be added to list"  )  @Valid @RequestBody TapiCommonCapacity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.Capacity to be added or updated"  )  @Valid @RequestBody TapiCommonCapacity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizeDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizeGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizePost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.CapacityValue to be added to list"  )  @Valid @RequestBody TapiCommonCapacityValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizePut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.CapacityValue to be added or updated"  )  @Valid @RequestBody TapiCommonCapacityValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintScheduleDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonTimeRange> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintScheduleGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonTimeRange>(objectMapper.readValue("{ \"start-time\" : \"start-time\", \"end-time\" : \"end-time\" }", TapiCommonTimeRange.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonTimeRange>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonTimeRange>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintSchedulePost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.TimeRange to be added to list"  )  @Valid @RequestBody TapiCommonTimeRange body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintSchedulePut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.TimeRange to be added or updated"  )  @Valid @RequestBody TapiCommonTimeRange body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.connectivity.connectivityservice.EndPoint to be added to list"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceEndPoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.Capacity to be added to list"  )  @Valid @RequestBody TapiCommonCapacity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.Capacity to be added or updated"  )  @Valid @RequestBody TapiCommonCapacity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizeDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizeGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizePost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.CapacityValue to be added to list"  )  @Valid @RequestBody TapiCommonCapacityValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizePut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.CapacityValue to be added or updated"  )  @Valid @RequestBody TapiCommonCapacityValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectionEndPointRef> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(objectMapper.readValue("", TapiConnectivityConnectionEndPointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthControlFrameFilter> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthControlFrameFilter>(objectMapper.readValue("{ \"c-2-00-00-2-a\" : false, \"c-2-00-00-0-c\" : false, \"c-2-00-00-0-b\" : false, \"c-2-00-00-2-c\" : false, \"c-2-00-00-0-e\" : false, \"c-2-00-00-2-b\" : false, \"c-2-00-00-0-d\" : false, \"c-2-00-00-2-e\" : false, \"c-2-00-00-2-d\" : false, \"c-2-00-00-0-f\" : false, \"c-2-00-00-2-f\" : false, \"c-2-00-00-10\" : false, \"c-2-00-00-09\" : false, \"c-2-00-00-29\" : false, \"c-2-00-00-07\" : false, \"c-2-00-00-08\" : false, \"c-2-00-00-27\" : false, \"c-2-00-00-05\" : false, \"c-2-00-00-28\" : false, \"c-2-00-00-06\" : false, \"c-2-00-00-25\" : false, \"c-2-00-00-03\" : false, \"c-2-00-00-26\" : false, \"c-2-00-00-04\" : false, \"c-2-00-00-23\" : false, \"c-2-00-00-01\" : false, \"c-2-00-00-24\" : false, \"c-2-00-00-02\" : false, \"c-2-00-00-21\" : false, \"c-2-00-00-22\" : false, \"c-2-00-00-00\" : false, \"c-2-00-00-20\" : false, \"c-2-00-00-0-a\" : false }", TapiEthControlFrameFilter.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthControlFrameFilter>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthControlFrameFilter>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.ControlFrameFilter to be added to list"  )  @Valid @RequestBody TapiEthControlFrameFilter body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.ControlFrameFilter to be added or updated"  )  @Valid @RequestBody TapiEthControlFrameFilter body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthCtpCommonPac> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthCtpCommonPac>(objectMapper.readValue("{ \"vlan-config\" : 0, \"csf-rdi-fdi-enable\" : false, \"filter-config\" : { \"c-2-00-00-2-a\" : false, \"c-2-00-00-0-c\" : false, \"c-2-00-00-0-b\" : false, \"c-2-00-00-2-c\" : false, \"c-2-00-00-0-e\" : false, \"c-2-00-00-2-b\" : false, \"c-2-00-00-0-d\" : false, \"c-2-00-00-2-e\" : false, \"c-2-00-00-2-d\" : false, \"c-2-00-00-0-f\" : false, \"c-2-00-00-2-f\" : false, \"c-2-00-00-10\" : false, \"c-2-00-00-09\" : false, \"c-2-00-00-29\" : false, \"c-2-00-00-07\" : false, \"c-2-00-00-08\" : false, \"c-2-00-00-27\" : false, \"c-2-00-00-05\" : false, \"c-2-00-00-28\" : false, \"c-2-00-00-06\" : false, \"c-2-00-00-25\" : false, \"c-2-00-00-03\" : false, \"c-2-00-00-26\" : false, \"c-2-00-00-04\" : false, \"c-2-00-00-23\" : false, \"c-2-00-00-01\" : false, \"c-2-00-00-24\" : false, \"c-2-00-00-02\" : false, \"c-2-00-00-21\" : false, \"c-2-00-00-22\" : false, \"c-2-00-00-00\" : false, \"c-2-00-00-20\" : false, \"c-2-00-00-0-a\" : false }, \"traffic-shaping-pac\" : { \"codirectional\" : false, \"sched-config\" : \"sched-config\", \"queue-config-list\" : [ { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 }, { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] }, \"mac-length\" : 7, \"csf-report\" : false, \"filter-config-snk\" : [ \"filter-config-snk\", \"filter-config-snk\" ], \"pll-thr\" : 9, \"csf-config\" : \"DISABLED\", \"is-ssf-reported\" : false, \"collector-max-delay\" : 3, \"auxiliary-function-position-sequence\" : [ 2, 2 ], \"traffic-conditioning-pac\" : { \"codirectional\" : false, \"cond-config-list\" : [ { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 }, { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] } }", TapiEthEthCtpCommonPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthCtpCommonPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthCtpCommonPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthCtpCommonPac to be added to list"  )  @Valid @RequestBody TapiEthEthCtpCommonPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthCtpCommonPac to be added or updated"  )  @Valid @RequestBody TapiEthEthCtpCommonPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.TrafficConditioningConfiguration to be added to list"  )  @Valid @RequestBody TapiEthTrafficConditioningConfiguration body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of cond-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTrafficConditioningConfiguration> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of cond-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTrafficConditioningConfiguration>(objectMapper.readValue("{ \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 }", TapiEthTrafficConditioningConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTrafficConditioningConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTrafficConditioningConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of cond-config-list",required=true) @PathVariable("queue-id") Integer queueId,@ApiParam(value = "tapi.eth.TrafficConditioningConfiguration to be added or updated"  )  @Valid @RequestBody TapiEthTrafficConditioningConfiguration body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTrafficConditioningPac> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTrafficConditioningPac>(objectMapper.readValue("{ \"codirectional\" : false, \"cond-config-list\" : [ { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 }, { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] }", TapiEthTrafficConditioningPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTrafficConditioningPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTrafficConditioningPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.TrafficConditioningPac to be added to list"  )  @Valid @RequestBody TapiEthTrafficConditioningPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.PriorityConfiguration to be added to list"  )  @Valid @RequestBody TapiEthPriorityConfiguration body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of prio-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthPriorityConfiguration> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of prio-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthPriorityConfiguration>(objectMapper.readValue("{ \"queue-id\" : 2, \"priority\" : 5 }", TapiEthPriorityConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthPriorityConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthPriorityConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of prio-config-list",required=true) @PathVariable("queue-id") Integer queueId,@ApiParam(value = "tapi.eth.PriorityConfiguration to be added or updated"  )  @Valid @RequestBody TapiEthPriorityConfiguration body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.TrafficConditioningPac to be added or updated"  )  @Valid @RequestBody TapiEthTrafficConditioningPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTrafficShapingPac> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTrafficShapingPac>(objectMapper.readValue("{ \"codirectional\" : false, \"sched-config\" : \"sched-config\", \"queue-config-list\" : [ { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 }, { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] }", TapiEthTrafficShapingPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTrafficShapingPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTrafficShapingPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.TrafficShapingPac to be added to list"  )  @Valid @RequestBody TapiEthTrafficShapingPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.PriorityConfiguration to be added to list"  )  @Valid @RequestBody TapiEthPriorityConfiguration body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of prio-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthPriorityConfiguration> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of prio-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthPriorityConfiguration>(objectMapper.readValue("{ \"queue-id\" : 2, \"priority\" : 5 }", TapiEthPriorityConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthPriorityConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthPriorityConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of prio-config-list",required=true) @PathVariable("queue-id") Integer queueId,@ApiParam(value = "tapi.eth.PriorityConfiguration to be added or updated"  )  @Valid @RequestBody TapiEthPriorityConfiguration body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.TrafficShapingPac to be added or updated"  )  @Valid @RequestBody TapiEthTrafficShapingPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.QueueConfiguration to be added to list"  )  @Valid @RequestBody TapiEthQueueConfiguration body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of queue-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthQueueConfiguration> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of queue-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthQueueConfiguration>(objectMapper.readValue("{ \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 }", TapiEthQueueConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthQueueConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthQueueConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of queue-config-list",required=true) @PathVariable("queue-id") Integer queueId,@ApiParam(value = "tapi.eth.QueueConfiguration to be added or updated"  )  @Valid @RequestBody TapiEthQueueConfiguration body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthTerminationCommonPac> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthTerminationCommonPac>(objectMapper.readValue("{ \"filter-config-1\" : [ \"filter-config-1\", \"filter-config-1\" ], \"ether-type\" : \"C_Tag\", \"priority-code-point-config\" : \"8P0D\", \"frametype-config\" : \"ADMIT_ONLY_VLAN_TAGGED_FRAMES\", \"port-vid\" : \"1\", \"priority-regenerate\" : { \"priority-0\" : 6, \"priority-1\" : 7, \"priority-2\" : 1, \"priority-3\" : 4, \"priority-4\" : 5, \"priority-5\" : 9, \"priority-6\" : 9, \"priority-7\" : 6 } }", TapiEthEthTerminationCommonPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthTerminationCommonPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthTerminationCommonPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthTerminationCommonPac to be added to list"  )  @Valid @RequestBody TapiEthEthTerminationCommonPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegenerateDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthPriorityMapping> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegenerateGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthPriorityMapping>(objectMapper.readValue("{ \"priority-0\" : 6, \"priority-1\" : 7, \"priority-2\" : 1, \"priority-3\" : 4, \"priority-4\" : 5, \"priority-5\" : 9, \"priority-6\" : 9, \"priority-7\" : 6 }", TapiEthPriorityMapping.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthPriorityMapping>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthPriorityMapping>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegeneratePost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.PriorityMapping to be added to list"  )  @Valid @RequestBody TapiEthPriorityMapping body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegeneratePut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.PriorityMapping to be added or updated"  )  @Valid @RequestBody TapiEthPriorityMapping body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthTerminationCommonPac to be added or updated"  )  @Valid @RequestBody TapiEthEthTerminationCommonPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEtyTerminationCommonPac> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEtyTerminationCommonPac>(objectMapper.readValue("{ \"is-fts-enabled\" : false, \"is-tx-pause-enabled\" : false }", TapiEthEtyTerminationCommonPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEtyTerminationCommonPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEtyTerminationCommonPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EtyTerminationCommonPac to be added to list"  )  @Valid @RequestBody TapiEthEtyTerminationCommonPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EtyTerminationCommonPac to be added or updated"  )  @Valid @RequestBody TapiEthEtyTerminationCommonPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthConnectivityServiceEndPointSpec> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthConnectivityServiceEndPointSpec>(objectMapper.readValue("{ \"eth-ctp-common-pac\" : { \"vlan-config\" : 0, \"csf-rdi-fdi-enable\" : false, \"filter-config\" : { \"c-2-00-00-2-a\" : false, \"c-2-00-00-0-c\" : false, \"c-2-00-00-0-b\" : false, \"c-2-00-00-2-c\" : false, \"c-2-00-00-0-e\" : false, \"c-2-00-00-2-b\" : false, \"c-2-00-00-0-d\" : false, \"c-2-00-00-2-e\" : false, \"c-2-00-00-2-d\" : false, \"c-2-00-00-0-f\" : false, \"c-2-00-00-2-f\" : false, \"c-2-00-00-10\" : false, \"c-2-00-00-09\" : false, \"c-2-00-00-29\" : false, \"c-2-00-00-07\" : false, \"c-2-00-00-08\" : false, \"c-2-00-00-27\" : false, \"c-2-00-00-05\" : false, \"c-2-00-00-28\" : false, \"c-2-00-00-06\" : false, \"c-2-00-00-25\" : false, \"c-2-00-00-03\" : false, \"c-2-00-00-26\" : false, \"c-2-00-00-04\" : false, \"c-2-00-00-23\" : false, \"c-2-00-00-01\" : false, \"c-2-00-00-24\" : false, \"c-2-00-00-02\" : false, \"c-2-00-00-21\" : false, \"c-2-00-00-22\" : false, \"c-2-00-00-00\" : false, \"c-2-00-00-20\" : false, \"c-2-00-00-0-a\" : false }, \"traffic-shaping-pac\" : { \"codirectional\" : false, \"sched-config\" : \"sched-config\", \"queue-config-list\" : [ { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 }, { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] }, \"mac-length\" : 7, \"csf-report\" : false, \"filter-config-snk\" : [ \"filter-config-snk\", \"filter-config-snk\" ], \"pll-thr\" : 9, \"csf-config\" : \"DISABLED\", \"is-ssf-reported\" : false, \"collector-max-delay\" : 3, \"auxiliary-function-position-sequence\" : [ 2, 2 ], \"traffic-conditioning-pac\" : { \"codirectional\" : false, \"cond-config-list\" : [ { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 }, { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] } }, \"eth-termination-common-pac\" : { \"filter-config-1\" : [ \"filter-config-1\", \"filter-config-1\" ], \"ether-type\" : \"C_Tag\", \"priority-code-point-config\" : \"8P0D\", \"frametype-config\" : \"ADMIT_ONLY_VLAN_TAGGED_FRAMES\", \"port-vid\" : \"1\", \"priority-regenerate\" : { \"priority-0\" : 6, \"priority-1\" : 7, \"priority-2\" : 1, \"priority-3\" : 4, \"priority-4\" : 5, \"priority-5\" : 9, \"priority-6\" : 9, \"priority-7\" : 6 } }, \"ety-termination-common-pac\" : { \"is-fts-enabled\" : false, \"is-tx-pause-enabled\" : false } }", TapiEthEthConnectivityServiceEndPointSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthConnectivityServiceEndPointSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthConnectivityServiceEndPointSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthConnectivityServiceEndPointSpec to be added to list"  )  @Valid @RequestBody TapiEthEthConnectivityServiceEndPointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthConnectivityServiceEndPointSpec to be added or updated"  )  @Valid @RequestBody TapiEthEthConnectivityServiceEndPointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectivityServiceEndPoint> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectivityServiceEndPoint>(objectMapper.readValue("", TapiConnectivityConnectivityServiceEndPoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectivityServiceEndPoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectivityServiceEndPoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec>(objectMapper.readValue("{ \"power-management-config\" : { \"expected-maximum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"expected-minimum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"intended-minimum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"intended-maximum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" } }, \"mc-config\" : { \"spectrum\" : { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } } }", TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaMediaChannelConfigPac> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaMediaChannelConfigPac>(objectMapper.readValue("{ \"spectrum\" : { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } }", TapiPhotonicMediaMediaChannelConfigPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaMediaChannelConfigPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaMediaChannelConfigPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.MediaChannelConfigPac to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaMediaChannelConfigPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.MediaChannelConfigPac to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaMediaChannelConfigPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.FrequencyConstraint to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaFrequencyConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.FrequencyConstraint to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaFrequencyConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaSpectrumBand> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(objectMapper.readValue("{ \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }", TapiPhotonicMediaSpectrumBand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.SpectrumBand to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaSpectrumBand body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.SpectrumBand to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaSpectrumBand body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.MediaChannelConnectivityServiceEndPointSpec to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerManagementConfigPac> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerManagementConfigPac>(objectMapper.readValue("{ \"expected-maximum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"expected-minimum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"intended-minimum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"intended-maximum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" } }", TapiPhotonicMediaPowerManagementConfigPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerManagementConfigPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerManagementConfigPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerManagementConfigPac to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerManagementConfigPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerManagementConfigPac to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerManagementConfigPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.MediaChannelConnectivityServiceEndPointSpec to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamePost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamevalueNameDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamevalueNameGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamevalueNamePut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec>(objectMapper.readValue("{ \"otsi-config\" : { \"application-identifier\" : { \"application-identifier-type\" : \"PROPRIETARY\", \"application-code\" : \"application-code\" }, \"central-frequency\" : { \"central-frequency\" : 0, \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" } }, \"modulation\" : \"RZ\", \"spectrum\" : { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, \"laser-control\" : \"FORCED-ON\", \"total-power-warn-threshold-lower\" : \"total-power-warn-threshold-lower\", \"total-power-warn-threshold-upper\" : \"total-power-warn-threshold-upper\", \"transmit-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" } } }", TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaApplicationIdentifier> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaApplicationIdentifier>(objectMapper.readValue("{ \"application-identifier-type\" : \"PROPRIETARY\", \"application-code\" : \"application-code\" }", TapiPhotonicMediaApplicationIdentifier.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaApplicationIdentifier>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaApplicationIdentifier>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.ApplicationIdentifier to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaApplicationIdentifier body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.ApplicationIdentifier to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaApplicationIdentifier body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.FrequencyConstraint to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaFrequencyConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.FrequencyConstraint to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaFrequencyConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaCentralFrequency> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaCentralFrequency>(objectMapper.readValue("{ \"central-frequency\" : 0, \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" } }", TapiPhotonicMediaCentralFrequency.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaCentralFrequency>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaCentralFrequency>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.CentralFrequency to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaCentralFrequency body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.CentralFrequency to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaCentralFrequency body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaOtsiTerminationConfigPac> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaOtsiTerminationConfigPac>(objectMapper.readValue("{ \"application-identifier\" : { \"application-identifier-type\" : \"PROPRIETARY\", \"application-code\" : \"application-code\" }, \"central-frequency\" : { \"central-frequency\" : 0, \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" } }, \"modulation\" : \"RZ\", \"spectrum\" : { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, \"laser-control\" : \"FORCED-ON\", \"total-power-warn-threshold-lower\" : \"total-power-warn-threshold-lower\", \"total-power-warn-threshold-upper\" : \"total-power-warn-threshold-upper\", \"transmit-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" } }", TapiPhotonicMediaOtsiTerminationConfigPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaOtsiTerminationConfigPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaOtsiTerminationConfigPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.OtsiTerminationConfigPac to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaOtsiTerminationConfigPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.OtsiTerminationConfigPac to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaOtsiTerminationConfigPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.FrequencyConstraint to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaFrequencyConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.FrequencyConstraint to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaFrequencyConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaSpectrumBand> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(objectMapper.readValue("{ \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }", TapiPhotonicMediaSpectrumBand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.SpectrumBand to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaSpectrumBand body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.SpectrumBand to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaSpectrumBand body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.OtsiConnectivityServiceEndPointSpec to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.photonic.media.OtsiConnectivityServiceEndPointSpec to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(objectMapper.readValue("", TapiConnectivityConnectivityServiceEndPointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.connectivity.ConnectivityServiceEndPointRef to be added to list"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceEndPointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.connectivity.ConnectivityServiceEndPointRef to be added or updated"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceEndPointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(objectMapper.readValue("", TapiConnectivityConnectivityServiceEndPointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.connectivity.ConnectivityServiceEndPointRef to be added to list"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceEndPointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.connectivity.ConnectivityServiceEndPointRef to be added or updated"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceEndPointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.connectivity.connectivityservice.EndPoint to be added or updated"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceEndPoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(objectMapper.readValue("", TapiConnectivityConnectivityServiceEndPointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.connectivity.ConnectivityServiceEndPointRef to be added to list"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceEndPointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.connectivity.ConnectivityServiceEndPointRef to be added or updated"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceEndPointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonServiceInterfacePointRef> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(objectMapper.readValue("{ \"service-interface-point-uuid\" : \"service-interface-point-uuid\" }", TapiCommonServiceInterfacePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.ServiceInterfacePointRef to be added to list"  )  @Valid @RequestBody TapiCommonServiceInterfacePointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.ServiceInterfacePointRef to be added or updated"  )  @Valid @RequestBody TapiCommonServiceInterfacePointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServiceDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthConnectivityService> dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServiceGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthConnectivityService>(objectMapper.readValue("{ }", TapiEthEthConnectivityService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthConnectivityService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthConnectivityService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServicePost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthConnectivityService to be added to list"  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServicePut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthConnectivityService to be added or updated"  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectivitycontextConnectivityService> dataContextConnectivityContextConnectivityServiceuuidGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectivitycontextConnectivityService>(objectMapper.readValue("", TapiConnectivityConnectivitycontextConnectivityService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectivitycontextConnectivityService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectivitycontextConnectivityService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidNamePost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidNamevalueNameDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextConnectivityContextConnectivityServiceuuidNamevalueNameGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidNamevalueNamePut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.connectivity.connectivitycontext.ConnectivityService to be added or updated"  )  @Valid @RequestBody TapiConnectivityConnectivitycontextConnectivityService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityResilienceConstraint> dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityResilienceConstraint>(objectMapper.readValue("{ \"is-lock-out\" : false, \"max-switch-times\" : 0, \"protection-type\" : \"NO_PROTECTION\", \"hold-off-time\" : 6, \"wait-to-revert-time\" : 1, \"selection-control\" : \"LOCK_OUT\", \"preferred-restoration-layer\" : [ \"ODU\", \"ODU\" ], \"restore-priority\" : 5, \"restoration-policy\" : \"PER_DOMAIN_RESTORATION\", \"restoration-coordinate-type\" : \"NO_COORDINATE\", \"is-coordinated-switching-both-ends\" : false, \"fault-condition-determination\" : \"fault-condition-determination\", \"is-frozen\" : false, \"reversion-mode\" : \"REVERTIVE\" }", TapiConnectivityResilienceConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityResilienceConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityResilienceConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.connectivity.ResilienceConstraint to be added to list"  )  @Valid @RequestBody TapiConnectivityResilienceConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.connectivity.ResilienceConstraint to be added or updated"  )  @Valid @RequestBody TapiConnectivityResilienceConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristicPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.topology.CostCharacteristic to be added to list"  )  @Valid @RequestBody TapiTopologyCostCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristiccostNameDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyCostCharacteristic> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristiccostNameGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyCostCharacteristic>(objectMapper.readValue("{ \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" }", TapiTopologyCostCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristiccostNamePut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName,@ApiParam(value = "tapi.topology.CostCharacteristic to be added or updated"  )  @Valid @RequestBody TapiTopologyCostCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationRoutingConstraint> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationRoutingConstraint>(objectMapper.readValue("{ \"is-exclusive\" : true, \"tolerable-impact\" : \"tolerable-impact\", \"diversity-policy\" : \"SRLG\", \"route-objective-function\" : \"MIN_WORK_ROUTE_HOP\", \"cost-characteristic\" : [ { \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" }, { \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" } ], \"latency-characteristic\" : [ { \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" }, { \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" } ], \"risk-diversity-characteristic\" : [ { \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] }, { \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] } ] }", TapiPathComputationRoutingConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationRoutingConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationRoutingConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristicPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.topology.LatencyCharacteristic to be added to list"  )  @Valid @RequestBody TapiTopologyLatencyCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyLatencyCharacteristic> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(objectMapper.readValue("{ \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" }", TapiTopologyLatencyCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNamePut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName,@ApiParam(value = "tapi.topology.LatencyCharacteristic to be added or updated"  )  @Valid @RequestBody TapiTopologyLatencyCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.RoutingConstraint to be added to list"  )  @Valid @RequestBody TapiPathComputationRoutingConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.RoutingConstraint to be added or updated"  )  @Valid @RequestBody TapiPathComputationRoutingConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.topology.RiskCharacteristic to be added to list"  )  @Valid @RequestBody TapiTopologyRiskCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of risk-diversity-characteristic",required=true) @PathVariable("risk-characteristic-name") String riskCharacteristicName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyRiskCharacteristic> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of risk-diversity-characteristic",required=true) @PathVariable("risk-characteristic-name") String riskCharacteristicName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(objectMapper.readValue("{ \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] }", TapiTopologyRiskCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNamePut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of risk-diversity-characteristic",required=true) @PathVariable("risk-characteristic-name") String riskCharacteristicName,@ApiParam(value = "tapi.topology.RiskCharacteristic to be added or updated"  )  @Valid @RequestBody TapiTopologyRiskCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintPost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.TopologyConstraint to be added to list"  )  @Valid @RequestBody TapiPathComputationTopologyConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationTopologyConstraint> dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationTopologyConstraint>(objectMapper.readValue("", TapiPathComputationTopologyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationTopologyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationTopologyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamePost(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamevalueNameDelete(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamevalueNameGet(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamevalueNamePut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdPut(@ApiParam(value = "Id of connectivity-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.path.computation.TopologyConstraint to be added or updated"  )  @Valid @RequestBody TapiPathComputationTopologyConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextDelete() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityContextConnectivityContext> dataContextConnectivityContextGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityContextConnectivityContext>(objectMapper.readValue("", TapiConnectivityContextConnectivityContext.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityContextConnectivityContext>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityContextConnectivityContext>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextPost(@ApiParam(value = "tapi.connectivity.context.ConnectivityContext to be added to list"  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextConnectivityContextPut(@ApiParam(value = "tapi.connectivity.context.ConnectivityContext to be added or updated"  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextDelete() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonContext> dataContextGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonContext>(objectMapper.readValue("", TapiCommonContext.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonContext>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonContext>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNamePost(@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNamevalueNameDelete(@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextNamevalueNameGet(@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNamevalueNamePut(@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextDelete() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationContextNotificationContext> dataContextNotificationContextGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationContextNotificationContext>(objectMapper.readValue("", TapiNotificationContextNotificationContext.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationContextNotificationContext>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationContextNotificationContext>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionPost(@ApiParam(value = "tapi.notification.NotificationSubscriptionService to be added to list"  )  @Valid @RequestBody TapiNotificationNotificationSubscriptionService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionuuidDelete(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationNotificationSubscriptionService> dataContextNotificationContextNotifSubscriptionuuidGet(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationNotificationSubscriptionService>(objectMapper.readValue("", TapiNotificationNotificationSubscriptionService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationNotificationSubscriptionService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationNotificationSubscriptionService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionuuidNamePost(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionuuidNamevalueNameDelete(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextNotificationContextNotifSubscriptionuuidNamevalueNameGet(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionuuidNamevalueNamePut(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationNotificationChannel> dataContextNotificationContextNotifSubscriptionuuidNotificationChannelGet(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationNotificationChannel>(objectMapper.readValue("", TapiNotificationNotificationChannel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationNotificationChannel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationNotificationChannel>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextNotificationContextNotifSubscriptionuuidNotificationChannelNamevalueNameGet(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidAdditionalInfovalueNameGet(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of notification",required=true) @PathVariable("notification-uuid") String notificationUuid,@ApiParam(value = "Id of additional-info",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationNameAndValueChange> dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidChangedAttributesvalueNameGet(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of notification",required=true) @PathVariable("notification-uuid") String notificationUuid,@ApiParam(value = "Id of changed-attributes",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationNameAndValueChange>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"old-value\" : \"old-value\", \"new-value\" : \"new-value\" }", TapiNotificationNameAndValueChange.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationNameAndValueChange>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationNameAndValueChange>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationNotification> dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidGet(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of notification",required=true) @PathVariable("notification-uuid") String notificationUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationNotification>(objectMapper.readValue("", TapiNotificationNotification.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationNotification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationNotification>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidNamevalueNameGet(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of notification",required=true) @PathVariable("notification-uuid") String notificationUuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidTargetObjectNamevalueNameGet(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of notification",required=true) @PathVariable("notification-uuid") String notificationUuid,@ApiParam(value = "Id of target-object-name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionuuidPut(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.notification.NotificationSubscriptionService to be added or updated"  )  @Valid @RequestBody TapiNotificationNotificationSubscriptionService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterDelete(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationSubscriptionFilter> dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterGet(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationSubscriptionFilter>(objectMapper.readValue("", TapiNotificationSubscriptionFilter.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationSubscriptionFilter>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationSubscriptionFilter>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamePost(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamevalueNameDelete(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamevalueNameGet(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamevalueNamePut(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterPost(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.notification.SubscriptionFilter to be added to list"  )  @Valid @RequestBody TapiNotificationSubscriptionFilter body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterPut(@ApiParam(value = "Id of notif-subscription",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.notification.SubscriptionFilter to be added or updated"  )  @Valid @RequestBody TapiNotificationSubscriptionFilter body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextNotificationContextNotificationuuidAdditionalInfovalueNameGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of additional-info",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamAlarmInfo> dataContextNotificationContextNotificationuuidAlarmInfoGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamAlarmInfo>(objectMapper.readValue("{ \"probable-cause\" : \"probable-cause\", \"service-affecting\" : \"SERVICE_AFFECTING\", \"is-transient\" : false, \"perceived-severity\" : \"CRITICAL\" }", TapiOamAlarmInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamAlarmInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamAlarmInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationNameAndValueChange> dataContextNotificationContextNotificationuuidChangedAttributesvalueNameGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of changed-attributes",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationNameAndValueChange>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"old-value\" : \"old-value\", \"new-value\" : \"new-value\" }", TapiNotificationNameAndValueChange.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationNameAndValueChange>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationNameAndValueChange>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationNotificationcontextNotification> dataContextNotificationContextNotificationuuidGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationNotificationcontextNotification>(objectMapper.readValue("", TapiNotificationNotificationcontextNotification.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationNotificationcontextNotification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationNotificationcontextNotification>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextNotificationContextNotificationuuidNamevalueNameGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextNotificationContextNotificationuuidTargetObjectNamevalueNameGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of target-object-name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamTcaInfo> dataContextNotificationContextNotificationuuidTcaInfoGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamTcaInfo>(objectMapper.readValue("{ \"oam-job\" : { \"oam-job-uuid\" : \"oam-job-uuid\" }, \"threshold-parameter\" : { \"pm-parameter-below-thrs\" : { \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }, \"pm-parameter-name\" : \"pm-parameter-name\", \"pm-parameter-clear-thrs\" : { \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }, \"pm-parameter-above-thrs\" : { \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }, \"threshold-location\" : \"NOT_APPLICABLE\" }, \"is-transient\" : false, \"perceived-severity\" : \"WARNING\", \"suspect-interval-flag\" : false, \"measurement-interval\" : \"measurement-interval\" }", TapiOamTcaInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamTcaInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamTcaInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamOamJobRef> dataContextNotificationContextNotificationuuidTcaInfoOamJobGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamOamJobRef>(objectMapper.readValue("{ \"oam-job-uuid\" : \"oam-job-uuid\" }", TapiOamOamJobRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamOamJobRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamOamJobRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamThresholdParameter> dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamThresholdParameter>(objectMapper.readValue("{ \"pm-parameter-below-thrs\" : { \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }, \"pm-parameter-name\" : \"pm-parameter-name\", \"pm-parameter-clear-thrs\" : { \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }, \"pm-parameter-above-thrs\" : { \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }, \"threshold-location\" : \"NOT_APPLICABLE\" }", TapiOamThresholdParameter.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamThresholdParameter>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamThresholdParameter>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamPmParameterValue> dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterPmParameterAboveThrsGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamPmParameterValue>(objectMapper.readValue("{ \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }", TapiOamPmParameterValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamPmParameterValue> dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterPmParameterBelowThrsGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamPmParameterValue>(objectMapper.readValue("{ \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }", TapiOamPmParameterValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamPmParameterValue> dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterPmParameterClearThrsGet(@ApiParam(value = "Id of notification",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamPmParameterValue>(objectMapper.readValue("{ \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }", TapiOamPmParameterValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextPost(@ApiParam(value = "tapi.notification.context.NotificationContext to be added to list"  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextNotificationContextPut(@ApiParam(value = "tapi.notification.context.NotificationContext to be added or updated"  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextDelete() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamContextOamContext> dataContextOamContextGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamContextOamContext>(objectMapper.readValue("", TapiOamContextOamContext.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamContextOamContext>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamContextOamContext>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthCfmMaintenanceAssociation> dataContextOamContextMeguuidEthMegSpecEthCfmMaintenanceAssociationGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthCfmMaintenanceAssociation>(objectMapper.readValue("{ \"maintenance-association-name\" : { \"char-string\" : \"char-string\", \"ieee-reserved\" : \"0\", \"unsigned-int-16\" : 0, \"icc-format\" : \"icc-format\", \"primary-vlan-id\" : \"primary-vlan-id\", \"rfc-2865-vpn-id\" : \"rfc-2865-vpn-id\" }, \"id-permission\" : \"id-permission\" }", TapiEthEthCfmMaintenanceAssociation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthCfmMaintenanceAssociation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthCfmMaintenanceAssociation>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthMaintenanceAssociationName> dataContextOamContextMeguuidEthMegSpecEthCfmMaintenanceAssociationMaintenanceAssociationNameGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthMaintenanceAssociationName>(objectMapper.readValue("{ \"char-string\" : \"char-string\", \"ieee-reserved\" : \"0\", \"unsigned-int-16\" : 0, \"icc-format\" : \"icc-format\", \"primary-vlan-id\" : \"primary-vlan-id\", \"rfc-2865-vpn-id\" : \"rfc-2865-vpn-id\" }", TapiEthMaintenanceAssociationName.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthMaintenanceAssociationName>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthMaintenanceAssociationName>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthCfmMaintenanceDomain> dataContextOamContextMeguuidEthMegSpecEthCfmMaintenanceDomainGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthCfmMaintenanceDomain>(objectMapper.readValue("{ \"maintenance-domain-name-type\" : \"maintenance-domain-name-type\", \"maintenance-domain-name\" : \"maintenance-domain-name\" }", TapiEthEthCfmMaintenanceDomain.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthCfmMaintenanceDomain>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthCfmMaintenanceDomain>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMegCommon> dataContextOamContextMeguuidEthMegSpecEthMegCommonGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMegCommon>(objectMapper.readValue("{ \"meg-identifier\" : \"meg-identifier\", \"meg-level\" : 6, \"client-mel\" : 1, \"is-cc-enabled\" : false, \"cc-period\" : \"3_33MS\" }", TapiEthEthMegCommon.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMegCommon>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMegCommon>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMegSpec> dataContextOamContextMeguuidEthMegSpecGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMegSpec>(objectMapper.readValue("{ \"eth-cfm-maintenance-association\" : { \"maintenance-association-name\" : { \"char-string\" : \"char-string\", \"ieee-reserved\" : \"0\", \"unsigned-int-16\" : 0, \"icc-format\" : \"icc-format\", \"primary-vlan-id\" : \"primary-vlan-id\", \"rfc-2865-vpn-id\" : \"rfc-2865-vpn-id\" }, \"id-permission\" : \"id-permission\" }, \"eth-meg-common\" : { \"meg-identifier\" : \"meg-identifier\", \"meg-level\" : 6, \"client-mel\" : 1, \"is-cc-enabled\" : false, \"cc-period\" : \"3_33MS\" }, \"eth-cfm-maintenance-domain\" : { \"maintenance-domain-name-type\" : \"maintenance-domain-name-type\", \"maintenance-domain-name\" : \"maintenance-domain-name\" } }", TapiEthEthMegSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMegSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMegSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamOamcontextMeg> dataContextOamContextMeguuidGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamOamcontextMeg>(objectMapper.readValue("", TapiOamOamcontextMeg.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamOamcontextMeg>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamOamcontextMeg>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMepCommon> dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepCommonGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of mep",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMepCommon>(objectMapper.readValue("{ \"codirectional\" : true, \"lck-period\" : \"3_33MS\", \"cc-priority\" : 1, \"lck-priority\" : 0, \"mep-identifier\" : 6 }", TapiEthEthMepCommon.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMepCommon>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMepCommon>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthBandwidthReport> dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepSinkBandwidthReportGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of mep",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthBandwidthReport>(objectMapper.readValue("{ \"source-mac-address\" : \"source-mac-address\", \"current-bandwidth\" : 2, \"nominal-bandwidth\" : 4, \"port-id\" : 3 }", TapiEthBandwidthReport.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthBandwidthReport>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthBandwidthReport>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMepSink> dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepSinkGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of mep",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMepSink>(objectMapper.readValue("{ \"peer-mep-identifier\" : [ 2, 2 ], \"lm-m\" : 7, \"is-csf-reported\" : true, \"lm-deg-thr\" : 9, \"bandwidth-report\" : { \"source-mac-address\" : \"source-mac-address\", \"current-bandwidth\" : 2, \"nominal-bandwidth\" : 4, \"port-id\" : 3 }, \"lm-degm\" : 7, \"is-csf-rdi-fdi-enabled\" : true, \"ais-period\" : \"3_33MS\", \"ais-priority\" : 1, \"unexpected-ltr-received\" : 1, \"lm-tf-min\" : 1 }", TapiEthEthMepSink.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMepSink>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMepSink>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMepSource> dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepSourceGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of mep",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMepSource>(objectMapper.readValue("{ \"csf-period\" : \"3_33MS\", \"aps-priority\" : 5, \"csf-priority\" : 5, \"csf-config\" : \"DISABLED\" }", TapiEthEthMepSource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMepSource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMepSource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMepSpec> dataContextOamContextMeguuidMeplocalIdEthMepSpecGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of mep",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMepSpec>(objectMapper.readValue("{ \"eth-mep-sink\" : { \"peer-mep-identifier\" : [ 2, 2 ], \"lm-m\" : 7, \"is-csf-reported\" : true, \"lm-deg-thr\" : 9, \"bandwidth-report\" : { \"source-mac-address\" : \"source-mac-address\", \"current-bandwidth\" : 2, \"nominal-bandwidth\" : 4, \"port-id\" : 3 }, \"lm-degm\" : 7, \"is-csf-rdi-fdi-enabled\" : true, \"ais-period\" : \"3_33MS\", \"ais-priority\" : 1, \"unexpected-ltr-received\" : 1, \"lm-tf-min\" : 1 }, \"eth-mep-common\" : { \"codirectional\" : true, \"lck-period\" : \"3_33MS\", \"cc-priority\" : 1, \"lck-priority\" : 0, \"mep-identifier\" : 6 }, \"mep-mac\" : \"mep-mac\", \"eth-mep-source\" : { \"csf-period\" : \"3_33MS\", \"aps-priority\" : 5, \"csf-priority\" : 5, \"csf-config\" : \"DISABLED\" } }", TapiEthEthMepSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMepSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMepSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamMegMep> dataContextOamContextMeguuidMeplocalIdGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of mep",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamMegMep>(objectMapper.readValue("", TapiOamMegMep.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamMegMep>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamMegMep>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextOamContextMeguuidMeplocalIdNamevalueNameGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of mep",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMipCommon> dataContextOamContextMeguuidMiplocalIdEthMipSpecEthMipCommonGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of mip",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMipCommon>(objectMapper.readValue("{ \"is-full-mip\" : false }", TapiEthEthMipCommon.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMipCommon>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMipCommon>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMipSpec> dataContextOamContextMeguuidMiplocalIdEthMipSpecGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of mip",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMipSpec>(objectMapper.readValue("{ \"mip-mac\" : \"mip-mac\", \"eth-mip-common\" : { \"is-full-mip\" : false } }", TapiEthEthMipSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMipSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMipSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamMegMip> dataContextOamContextMeguuidMiplocalIdGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of mip",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamMegMip>(objectMapper.readValue("", TapiOamMegMip.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamMegMip>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamMegMip>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextOamContextMeguuidMiplocalIdNamevalueNameGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of mip",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextOamContextMeguuidNamevalueNameGet(@ApiParam(value = "Id of meg",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobPost(@ApiParam(value = "tapi.oam.oamcontext.OamJob to be added to list"  )  @Valid @RequestBody TapiOamOamcontextOamJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonTimeInterval> dataContextOamContextOamJobuuidCurrentDatalocalIdElapsedTimeGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonTimeInterval>(objectMapper.readValue("{ \"period\" : [ { \"unit\" : \"YEARS\", \"value\" : 0 }, { \"unit\" : \"YEARS\", \"value\" : 0 } ] }", TapiCommonTimeInterval.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonTimeInterval>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonTimeInterval>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonTimePeriod> dataContextOamContextOamJobuuidCurrentDatalocalIdElapsedTimePeriodunitGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of period",required=true) @PathVariable("unit") String unit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonTimePeriod>(objectMapper.readValue("{ \"unit\" : \"YEARS\", \"value\" : 0 }", TapiCommonTimePeriod.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonTimePeriod>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonTimePeriod>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthLldpChassisIdSubtype> dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberChassisIdGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of eth-cfm-link-trace-result-data",required=true) @PathVariable("seq-number") Integer seqNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthLldpChassisIdSubtype>(objectMapper.readValue("{ \"mac-address\" : \"mac-address\", \"chassis-component\" : \"chassis-component\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }", TapiEthLldpChassisIdSubtype.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthLldpChassisIdSubtype>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthLldpChassisIdSubtype>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthLldpPortIdSubtype> dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberEgressPortIdGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of eth-cfm-link-trace-result-data",required=true) @PathVariable("seq-number") Integer seqNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthLldpPortIdSubtype>(objectMapper.readValue("{ \"agent-circuit-id\" : \"agent-circuit-id\", \"mac-address\" : \"mac-address\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }", TapiEthLldpPortIdSubtype.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthLldpPortIdSubtype>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthLldpPortIdSubtype>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthCfmLinkTraceResultData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of eth-cfm-link-trace-result-data",required=true) @PathVariable("seq-number") Integer seqNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthCfmLinkTraceResultData>(objectMapper.readValue("{ \"egress-action-field\" : \"egress-action-field\", \"receive-order\" : 1, \"seq-number\" : 5, \"ingress-port-id\" : { \"agent-circuit-id\" : \"agent-circuit-id\", \"mac-address\" : \"mac-address\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }, \"organization-specific-tlv\" : \"organization-specific-tlv\", \"ingress-action-field\" : \"ingress-action-field\", \"chassis-id\" : { \"mac-address\" : \"mac-address\", \"chassis-component\" : \"chassis-component\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }, \"forwarded\" : false, \"terminal-mep\" : false, \"ingress-mac\" : \"ingress-mac\", \"egress-port-id\" : { \"agent-circuit-id\" : \"agent-circuit-id\", \"mac-address\" : \"mac-address\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }, \"egress-mac\" : \"egress-mac\", \"next-egress-identifier\" : \"next-egress-identifier\", \"last-egress-identifier\" : \"last-egress-identifier\", \"relay-action-field\" : \"relay-action-field\", \"reply-ttl\" : 5 }", TapiEthEthCfmLinkTraceResultData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthCfmLinkTraceResultData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthCfmLinkTraceResultData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthLldpPortIdSubtype> dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberIngressPortIdGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of eth-cfm-link-trace-result-data",required=true) @PathVariable("seq-number") Integer seqNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthLldpPortIdSubtype>(objectMapper.readValue("{ \"agent-circuit-id\" : \"agent-circuit-id\", \"mac-address\" : \"mac-address\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }", TapiEthLldpPortIdSubtype.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthLldpPortIdSubtype>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthLldpPortIdSubtype>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthLinkTraceResultData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthLinkTraceResultData>(objectMapper.readValue("{ \"result-list\" : [ { \"data-tlv-length\" : 0, \"time-to-live\" : 6, \"source-address\" : \"source-address\" }, { \"data-tlv-length\" : 0, \"time-to-live\" : 6, \"source-address\" : \"source-address\" } ], \"eth-cfm-link-trace-result-data\" : [ { \"egress-action-field\" : \"egress-action-field\", \"receive-order\" : 1, \"seq-number\" : 5, \"ingress-port-id\" : { \"agent-circuit-id\" : \"agent-circuit-id\", \"mac-address\" : \"mac-address\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }, \"organization-specific-tlv\" : \"organization-specific-tlv\", \"ingress-action-field\" : \"ingress-action-field\", \"chassis-id\" : { \"mac-address\" : \"mac-address\", \"chassis-component\" : \"chassis-component\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }, \"forwarded\" : false, \"terminal-mep\" : false, \"ingress-mac\" : \"ingress-mac\", \"egress-port-id\" : { \"agent-circuit-id\" : \"agent-circuit-id\", \"mac-address\" : \"mac-address\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }, \"egress-mac\" : \"egress-mac\", \"next-egress-identifier\" : \"next-egress-identifier\", \"last-egress-identifier\" : \"last-egress-identifier\", \"relay-action-field\" : \"relay-action-field\", \"reply-ttl\" : 5 }, { \"egress-action-field\" : \"egress-action-field\", \"receive-order\" : 1, \"seq-number\" : 5, \"ingress-port-id\" : { \"agent-circuit-id\" : \"agent-circuit-id\", \"mac-address\" : \"mac-address\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }, \"organization-specific-tlv\" : \"organization-specific-tlv\", \"ingress-action-field\" : \"ingress-action-field\", \"chassis-id\" : { \"mac-address\" : \"mac-address\", \"chassis-component\" : \"chassis-component\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }, \"forwarded\" : false, \"terminal-mep\" : false, \"ingress-mac\" : \"ingress-mac\", \"egress-port-id\" : { \"agent-circuit-id\" : \"agent-circuit-id\", \"mac-address\" : \"mac-address\", \"interface-name\" : \"interface-name\", \"network-address\" : \"network-address\", \"interface-alias\" : \"interface-alias\", \"port-component\" : \"port-component\", \"local\" : \"local\" }, \"egress-mac\" : \"egress-mac\", \"next-egress-identifier\" : \"next-egress-identifier\", \"last-egress-identifier\" : \"last-egress-identifier\", \"relay-action-field\" : \"relay-action-field\", \"reply-ttl\" : 5 } ] }", TapiEthEthLinkTraceResultData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthLinkTraceResultData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthLinkTraceResultData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthLinkTraceResult> dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataResultListsourceAddressGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of result-list",required=true) @PathVariable("source-address") String sourceAddress) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthLinkTraceResult>(objectMapper.readValue("{ \"data-tlv-length\" : 0, \"time-to-live\" : 6, \"source-address\" : \"source-address\" }", TapiEthLinkTraceResult.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthLinkTraceResult>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthLinkTraceResult>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthLoopbackResultData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthLoopbackResultDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthLoopbackResultData>(objectMapper.readValue("{ \"ber-lbr-frames\" : 0, \"crc-lbr-frames\" : 6, \"detected-peer-mep\" : [ \"detected-peer-mep\", \"detected-peer-mep\" ], \"sent-lbm-frames\" : 1, \"out-of-order-lbr-frames\" : 5, \"rec-lbr-frames\" : 5 }", TapiEthEthLoopbackResultData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthLoopbackResultData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthLoopbackResultData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemand1DmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemand1DmPerformanceData>(objectMapper.readValue("{ \"samples-near-end-1-dm-parameters\" : { \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }, \"statistical-near-end-1-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 } }", TapiEthEthOnDemand1DmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemand1DmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemand1DmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthSamplesDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmPerformanceDataSamplesNearEnd1DmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(objectMapper.readValue("{ \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }", TapiEthSamplesDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmPerformanceDataStatisticalNearEnd1DmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemand1DmSourcePerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmSourcePerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemand1DmSourcePerformanceData>(objectMapper.readValue("{ }", TapiEthEthOnDemand1DmSourcePerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemand1DmSourcePerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemand1DmSourcePerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemand1LmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemand1LmPerformanceData>(objectMapper.readValue("{ \"statistical-near-end-1-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"total-counters-near-end-1-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" } }", TapiEthEthOnDemand1LmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemand1LmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemand1LmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmPerformanceDataStatisticalNearEnd1LmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmPerformanceDataTotalCountersNearEnd1LmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemand1LmSourcePerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmSourcePerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemand1LmSourcePerformanceData>(objectMapper.readValue("{ }", TapiEthEthOnDemand1LmSourcePerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemand1LmSourcePerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemand1LmSourcePerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemandDmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemandDmPerformanceData>(objectMapper.readValue("{ \"samples-far-end-dm-parameters\" : { \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }, \"samples-near-end-dm-parameters\" : { \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }, \"statistical-bi-dir-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }, \"statistical-far-end-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }, \"statistical-near-end-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 } }", TapiEthEthOnDemandDmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemandDmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemandDmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthSamplesDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataSamplesFarEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(objectMapper.readValue("{ \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }", TapiEthSamplesDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthSamplesDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataSamplesNearEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(objectMapper.readValue("{ \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }", TapiEthSamplesDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataStatisticalBiDirDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataStatisticalFarEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataStatisticalNearEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemandLmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemandLmPerformanceData>(objectMapper.readValue("{ \"bidir-unavailable-intervals\" : 0, \"total-counters-far-end-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }, \"statistical-far-end-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"statistical-near-end-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"total-counters-near-end-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" } }", TapiEthEthOnDemandLmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemandLmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemandLmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataStatisticalFarEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataStatisticalNearEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataTotalCountersFarEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataTotalCountersNearEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActive1DmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1DmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActive1DmPerformanceData>(objectMapper.readValue("{ \"statistical-near-end-1-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 } }", TapiEthEthProActive1DmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActive1DmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActive1DmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1DmPerformanceDataStatisticalNearEnd1DmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActive1DmSourcePerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1DmSourcePerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActive1DmSourcePerformanceData>(objectMapper.readValue("{ }", TapiEthEthProActive1DmSourcePerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActive1DmSourcePerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActive1DmSourcePerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActive1LmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActive1LmPerformanceData>(objectMapper.readValue("{ \"statistical-near-end-1-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"total-counters-near-end-1-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" } }", TapiEthEthProActive1LmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActive1LmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActive1LmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmPerformanceDataStatisticalNearEnd1LmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmPerformanceDataTotalCountersNearEnd1LmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActive1LmSourcePerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmSourcePerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActive1LmSourcePerformanceData>(objectMapper.readValue("{ }", TapiEthEthProActive1LmSourcePerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActive1LmSourcePerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActive1LmSourcePerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActiveDmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActiveDmPerformanceData>(objectMapper.readValue("{ \"statistical-bi-dir-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }, \"statistical-far-end-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }, \"statistical-near-end-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 } }", TapiEthEthProActiveDmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActiveDmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActiveDmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataStatisticalBiDirDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataStatisticalFarEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataStatisticalNearEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActiveLmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActiveLmPerformanceData>(objectMapper.readValue("{ \"bidir-unavailable-intervals\" : 0, \"total-counters-far-end-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }, \"statistical-far-end-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"statistical-near-end-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"total-counters-near-end-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" } }", TapiEthEthProActiveLmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActiveLmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActiveLmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataStatisticalFarEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataStatisticalNearEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataTotalCountersFarEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataTotalCountersNearEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthTestResultData> dataContextOamContextOamJobuuidCurrentDatalocalIdEthTestResultDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthTestResultData>(objectMapper.readValue("{ \"sent-tst-frames\" : 0, \"rec-tst-frames\" : 6 }", TapiEthEthTestResultData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthTestResultData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthTestResultData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamOamjobCurrentData> dataContextOamContextOamJobuuidCurrentDatalocalIdGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamOamjobCurrentData>(objectMapper.readValue("", TapiOamOamjobCurrentData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamOamjobCurrentData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamOamjobCurrentData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemand1DmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemand1DmPerformanceData>(objectMapper.readValue("{ \"samples-near-end-1-dm-parameters\" : { \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }, \"statistical-near-end-1-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 } }", TapiEthEthOnDemand1DmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemand1DmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemand1DmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthSamplesDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmPerformanceDataSamplesNearEnd1DmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(objectMapper.readValue("{ \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }", TapiEthSamplesDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmPerformanceDataStatisticalNearEnd1DmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemand1DmSourcePerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmSourcePerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemand1DmSourcePerformanceData>(objectMapper.readValue("{ }", TapiEthEthOnDemand1DmSourcePerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemand1DmSourcePerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemand1DmSourcePerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemand1LmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemand1LmPerformanceData>(objectMapper.readValue("{ \"statistical-near-end-1-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"total-counters-near-end-1-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" } }", TapiEthEthOnDemand1LmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemand1LmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemand1LmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmPerformanceDataStatisticalNearEnd1LmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmPerformanceDataTotalCountersNearEnd1LmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemand1LmSourcePerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmSourcePerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemand1LmSourcePerformanceData>(objectMapper.readValue("{ }", TapiEthEthOnDemand1LmSourcePerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemand1LmSourcePerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemand1LmSourcePerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemandDmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemandDmPerformanceData>(objectMapper.readValue("{ \"samples-far-end-dm-parameters\" : { \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }, \"samples-near-end-dm-parameters\" : { \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }, \"statistical-bi-dir-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }, \"statistical-far-end-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }, \"statistical-near-end-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 } }", TapiEthEthOnDemandDmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemandDmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemandDmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthSamplesDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataSamplesFarEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(objectMapper.readValue("{ \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }", TapiEthSamplesDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthSamplesDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataSamplesNearEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(objectMapper.readValue("{ \"frame-delay-variation-list\" : [ 0, 0 ], \"number-of-samples\" : 6, \"frame-delay-list\" : [ 1, 1 ] }", TapiEthSamplesDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthSamplesDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataStatisticalBiDirDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataStatisticalFarEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataStatisticalNearEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemandLmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemandLmPerformanceData>(objectMapper.readValue("{ \"bidir-unavailable-intervals\" : 0, \"total-counters-far-end-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }, \"statistical-far-end-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"statistical-near-end-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"total-counters-near-end-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" } }", TapiEthEthOnDemandLmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemandLmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemandLmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataStatisticalFarEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataStatisticalNearEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataTotalCountersFarEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataTotalCountersNearEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActive1DmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1DmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActive1DmPerformanceData>(objectMapper.readValue("{ \"statistical-near-end-1-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 } }", TapiEthEthProActive1DmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActive1DmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActive1DmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1DmPerformanceDataStatisticalNearEnd1DmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActive1DmSourcePerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1DmSourcePerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActive1DmSourcePerformanceData>(objectMapper.readValue("{ }", TapiEthEthProActive1DmSourcePerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActive1DmSourcePerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActive1DmSourcePerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActive1LmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActive1LmPerformanceData>(objectMapper.readValue("{ \"statistical-near-end-1-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"total-counters-near-end-1-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" } }", TapiEthEthProActive1LmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActive1LmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActive1LmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmPerformanceDataStatisticalNearEnd1LmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmPerformanceDataTotalCountersNearEnd1LmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActive1LmSourcePerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmSourcePerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActive1LmSourcePerformanceData>(objectMapper.readValue("{ }", TapiEthEthProActive1LmSourcePerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActive1LmSourcePerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActive1LmSourcePerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActiveDmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActiveDmPerformanceData>(objectMapper.readValue("{ \"statistical-bi-dir-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }, \"statistical-far-end-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }, \"statistical-near-end-dm-parameters\" : { \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 } }", TapiEthEthProActiveDmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActiveDmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActiveDmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataStatisticalBiDirDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataStatisticalFarEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalDmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataStatisticalNearEndDmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(objectMapper.readValue("{ \"average-frame-delay\" : 5, \"maximum-frame-delay\" : 5, \"average-inter-frame-delay-variation\" : 2, \"minimum-frame-delay\" : 7, \"maximum-frame-delay-variation\" : 9, \"minimum-frame-delay-variation\" : 3, \"minimum-inter-frame-delay-variation\" : 2, \"maximum-inter-frame-delay-variation\" : 4, \"average-frame-delay-variation\" : 7 }", TapiEthStatisticalDmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalDmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActiveLmPerformanceData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActiveLmPerformanceData>(objectMapper.readValue("{ \"bidir-unavailable-intervals\" : 0, \"total-counters-far-end-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }, \"statistical-far-end-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"statistical-near-end-lm-parameters\" : { \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }, \"total-counters-near-end-lm-parameters\" : { \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" } }", TapiEthEthProActiveLmPerformanceData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActiveLmPerformanceData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActiveLmPerformanceData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataStatisticalFarEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthStatisticalLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataStatisticalNearEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(objectMapper.readValue("{ \"unavailable-intervals\" : 0, \"maximum-frame-loss-ratio\" : \"maximum-frame-loss-ratio\", \"average-frame-loss-ratio\" : \"average-frame-loss-ratio\", \"hli-count\" : 6, \"minimum-frame-loss-ratio\" : \"minimum-frame-loss-ratio\" }", TapiEthStatisticalLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthStatisticalLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataTotalCountersFarEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataTotalCountersNearEndLmParametersGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(objectMapper.readValue("{ \"total-transmitted-frames\" : 1, \"total-lost-frames\" : 5, \"total-frame-loss-ratio\" : \"total-frame-loss-ratio\" }", TapiEthTotalCountersLmPerformanceParameters.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTotalCountersLmPerformanceParameters>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamCurrentdataHistoryData> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamCurrentdataHistoryData>(objectMapper.readValue("", TapiOamCurrentdataHistoryData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamCurrentdataHistoryData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamCurrentdataHistoryData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdNamevalueNameGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamPmDataPac> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdPmDataPacGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamPmDataPac>(objectMapper.readValue("{ \"granularity-period\" : { \"unit\" : \"YEARS\", \"value\" : 0 }, \"suspect-interval-flag\" : false }", TapiOamPmDataPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamPmDataPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamPmDataPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonTimePeriod> dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdPmDataPacGranularityPeriodGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of history-data",required=true) @PathVariable("history-data-local-id") String historyDataLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonTimePeriod>(objectMapper.readValue("{ \"unit\" : \"YEARS\", \"value\" : 0 }", TapiCommonTimePeriod.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonTimePeriod>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonTimePeriod>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextOamContextOamJobuuidCurrentDatalocalIdNamevalueNameGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamPmDataPac> dataContextOamContextOamJobuuidCurrentDatalocalIdPmDataPacGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamPmDataPac>(objectMapper.readValue("{ \"granularity-period\" : { \"unit\" : \"YEARS\", \"value\" : 0 }, \"suspect-interval-flag\" : false }", TapiOamPmDataPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamPmDataPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamPmDataPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonTimePeriod> dataContextOamContextOamJobuuidCurrentDatalocalIdPmDataPacGranularityPeriodGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of current-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonTimePeriod>(objectMapper.readValue("{ \"unit\" : \"YEARS\", \"value\" : 0 }", TapiCommonTimePeriod.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonTimePeriod>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonTimePeriod>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLinkTraceJobDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthCfmLinkTracePac> dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthCfmLinkTracePac>(objectMapper.readValue("{ \"period\" : \"3_33MS\", \"drop-eligibility\" : false, \"ltm-flags\" : \"ltm-flags\", \"target-mep-id\" : 6 }", TapiEthEthCfmLinkTracePac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthCfmLinkTracePac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthCfmLinkTracePac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthCfmLinkTracePac to be added to list"  )  @Valid @RequestBody TapiEthEthCfmLinkTracePac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthCfmLinkTracePac to be added or updated"  )  @Valid @RequestBody TapiEthEthCfmLinkTracePac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthLinkTraceJob> dataContextOamContextOamJobuuidEthLinkTraceJobGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthLinkTraceJob>(objectMapper.readValue("{ \"time-to-live\" : 0, \"eth-cfm-link-trace-pac\" : { \"period\" : \"3_33MS\", \"drop-eligibility\" : false, \"ltm-flags\" : \"ltm-flags\", \"target-mep-id\" : 6 }, \"destination-address\" : \"destination-address\", \"priority\" : 1 }", TapiEthEthLinkTraceJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthLinkTraceJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthLinkTraceJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLinkTraceJobPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthLinkTraceJob to be added to list"  )  @Valid @RequestBody TapiEthEthLinkTraceJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLinkTraceJobPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthLinkTraceJob to be added or updated"  )  @Valid @RequestBody TapiEthEthLinkTraceJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLoopbackJobDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOamTestLoopbackCommonPac> dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOamTestLoopbackCommonPac>(objectMapper.readValue("{ \"data-tlv-length\" : 6, \"period\" : \"3_33MS\", \"drop-eligibility\" : false }", TapiEthEthOamTestLoopbackCommonPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOamTestLoopbackCommonPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOamTestLoopbackCommonPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOamTestLoopbackCommonPac to be added to list"  )  @Valid @RequestBody TapiEthEthOamTestLoopbackCommonPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOamTestLoopbackCommonPac to be added or updated"  )  @Valid @RequestBody TapiEthEthOamTestLoopbackCommonPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthLoopbackJob> dataContextOamContextOamJobuuidEthLoopbackJobGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthLoopbackJob>(objectMapper.readValue("{ \"number\" : 0, \"eth-oam-test-loopback-common-pac\" : { \"data-tlv-length\" : 6, \"period\" : \"3_33MS\", \"drop-eligibility\" : false }, \"lbm-data-tlv\" : \"lbm-data-tlv\" }", TapiEthEthLoopbackJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthLoopbackJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthLoopbackJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLoopbackJobPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthLoopbackJob to be added to list"  )  @Valid @RequestBody TapiEthEthLoopbackJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthLoopbackJobPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthLoopbackJob to be added or updated"  )  @Valid @RequestBody TapiEthEthLoopbackJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSink> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSink>(objectMapper.readValue("", TapiEthEthOnDemandMeasurementJobControlSink.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSink>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSink>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOnDemandMeasurementJobControlSink to be added to list"  )  @Valid @RequestBody TapiEthEthOnDemandMeasurementJobControlSink body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOnDemandMeasurementJobControlSink to be added or updated"  )  @Valid @RequestBody TapiEthEthOnDemandMeasurementJobControlSink body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourceDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSource> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourceGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSource>(objectMapper.readValue("", TapiEthEthOnDemandMeasurementJobControlSource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOnDemandMeasurementJobControlSource to be added to list"  )  @Valid @RequestBody TapiEthEthOnDemandMeasurementJobControlSource body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOnDemandMeasurementJobControlSource to be added or updated"  )  @Valid @RequestBody TapiEthEthOnDemandMeasurementJobControlSource body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemandDualEndedMeasurementJob> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemandDualEndedMeasurementJob>(objectMapper.readValue("{ \"eth-on-demand-measurement-job-control-sink\" : \"\", \"eth-on-demand-measurement-job-control-source\" : \"\" }", TapiEthEthOnDemandDualEndedMeasurementJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemandDualEndedMeasurementJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemandDualEndedMeasurementJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOnDemandDualEndedMeasurementJob to be added to list"  )  @Valid @RequestBody TapiEthEthOnDemandDualEndedMeasurementJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOnDemandDualEndedMeasurementJob to be added or updated"  )  @Valid @RequestBody TapiEthEthOnDemandDualEndedMeasurementJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourceDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSource> dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourceGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSource>(objectMapper.readValue("", TapiEthEthOnDemandMeasurementJobControlSource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOnDemandMeasurementJobControlSource to be added to list"  )  @Valid @RequestBody TapiEthEthOnDemandMeasurementJobControlSource body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOnDemandMeasurementJobControlSource to be added or updated"  )  @Valid @RequestBody TapiEthEthOnDemandMeasurementJobControlSource body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOnDemandSingleEndedMeasurementJob> dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOnDemandSingleEndedMeasurementJob>(objectMapper.readValue("{ \"eth-on-demand-measurement-job-control-source\" : \"\" }", TapiEthEthOnDemandSingleEndedMeasurementJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOnDemandSingleEndedMeasurementJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOnDemandSingleEndedMeasurementJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOnDemandSingleEndedMeasurementJob to be added to list"  )  @Valid @RequestBody TapiEthEthOnDemandSingleEndedMeasurementJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOnDemandSingleEndedMeasurementJob to be added or updated"  )  @Valid @RequestBody TapiEthEthOnDemandSingleEndedMeasurementJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActiveMeasurementJobControlSink> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActiveMeasurementJobControlSink>(objectMapper.readValue("", TapiEthEthProActiveMeasurementJobControlSink.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActiveMeasurementJobControlSink>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActiveMeasurementJobControlSink>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthProActiveMeasurementJobControlSink to be added to list"  )  @Valid @RequestBody TapiEthEthProActiveMeasurementJobControlSink body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthProActiveMeasurementJobControlSink to be added or updated"  )  @Valid @RequestBody TapiEthEthProActiveMeasurementJobControlSink body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourceDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActiveMeasurementJobControlSource> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourceGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActiveMeasurementJobControlSource>(objectMapper.readValue("", TapiEthEthProActiveMeasurementJobControlSource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActiveMeasurementJobControlSource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActiveMeasurementJobControlSource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourcePost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthProActiveMeasurementJobControlSource to be added to list"  )  @Valid @RequestBody TapiEthEthProActiveMeasurementJobControlSource body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourcePut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthProActiveMeasurementJobControlSource to be added or updated"  )  @Valid @RequestBody TapiEthEthProActiveMeasurementJobControlSource body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActiveDualEndedMeasurementJob> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActiveDualEndedMeasurementJob>(objectMapper.readValue("{ \"eth-pro-active-measurement-job-control-source\" : \"\", \"eth-pro-active-measurement-job-control-sink\" : \"\" }", TapiEthEthProActiveDualEndedMeasurementJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActiveDualEndedMeasurementJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActiveDualEndedMeasurementJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthProActiveDualEndedMeasurementJob to be added to list"  )  @Valid @RequestBody TapiEthEthProActiveDualEndedMeasurementJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthProActiveDualEndedMeasurementJob to be added or updated"  )  @Valid @RequestBody TapiEthEthProActiveDualEndedMeasurementJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourceDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActiveMeasurementJobControlSource> dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourceGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActiveMeasurementJobControlSource>(objectMapper.readValue("", TapiEthEthProActiveMeasurementJobControlSource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActiveMeasurementJobControlSource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActiveMeasurementJobControlSource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourcePost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthProActiveMeasurementJobControlSource to be added to list"  )  @Valid @RequestBody TapiEthEthProActiveMeasurementJobControlSource body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourcePut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthProActiveMeasurementJobControlSource to be added or updated"  )  @Valid @RequestBody TapiEthEthProActiveMeasurementJobControlSource body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthProActiveSingleEndedMeasurementJob> dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthProActiveSingleEndedMeasurementJob>(objectMapper.readValue("{ \"eth-pro-active-measurement-job-control-source\" : \"\" }", TapiEthEthProActiveSingleEndedMeasurementJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthProActiveSingleEndedMeasurementJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthProActiveSingleEndedMeasurementJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthProActiveSingleEndedMeasurementJob to be added to list"  )  @Valid @RequestBody TapiEthEthProActiveSingleEndedMeasurementJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthProActiveSingleEndedMeasurementJob to be added or updated"  )  @Valid @RequestBody TapiEthEthProActiveSingleEndedMeasurementJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthTestJobDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOamTestLoopbackCommonPac> dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOamTestLoopbackCommonPac>(objectMapper.readValue("{ \"data-tlv-length\" : 6, \"period\" : \"3_33MS\", \"drop-eligibility\" : false }", TapiEthEthOamTestLoopbackCommonPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOamTestLoopbackCommonPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOamTestLoopbackCommonPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOamTestLoopbackCommonPac to be added to list"  )  @Valid @RequestBody TapiEthEthOamTestLoopbackCommonPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOamTestLoopbackCommonPac to be added or updated"  )  @Valid @RequestBody TapiEthEthOamTestLoopbackCommonPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthTestJobSinkPoint> dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthTestJobSinkPoint>(objectMapper.readValue("{ \"source-address\" : \"source-address\" }", TapiEthEthTestJobSinkPoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthTestJobSinkPoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthTestJobSinkPoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthTestJobSinkPoint to be added to list"  )  @Valid @RequestBody TapiEthEthTestJobSinkPoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthTestJobSinkPoint to be added or updated"  )  @Valid @RequestBody TapiEthEthTestJobSinkPoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthTestJob> dataContextOamContextOamJobuuidEthTestJobGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthTestJob>(objectMapper.readValue("{ \"number\" : 0, \"test-pattern\" : \"test-pattern\", \"eth-test-job-sink-point\" : { \"source-address\" : \"source-address\" }, \"eth-oam-test-loopback-common-pac\" : { \"data-tlv-length\" : 6, \"period\" : \"3_33MS\", \"drop-eligibility\" : false }, \"destination-address\" : \"destination-address\" }", TapiEthEthTestJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthTestJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthTestJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthTestJobPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthTestJob to be added to list"  )  @Valid @RequestBody TapiEthEthTestJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidEthTestJobPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthTestJob to be added or updated"  )  @Valid @RequestBody TapiEthEthTestJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamOamcontextOamJob> dataContextOamContextOamJobuuidGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamOamcontextOamJob>(objectMapper.readValue("", TapiOamOamcontextOamJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamOamcontextOamJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamOamcontextOamJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidNamePost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidNamevalueNameDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextOamContextOamJobuuidNamevalueNameGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidNamevalueNamePut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidOamProfileDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamOamProfileRef> dataContextOamContextOamJobuuidOamProfileGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamOamProfileRef>(objectMapper.readValue("{ \"oam-profile-uuid\" : \"oam-profile-uuid\" }", TapiOamOamProfileRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamOamProfileRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamOamProfileRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidOamProfilePost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.oam.OamProfileRef to be added to list"  )  @Valid @RequestBody TapiOamOamProfileRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidOamProfilePut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.oam.OamProfileRef to be added or updated"  )  @Valid @RequestBody TapiOamOamProfileRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidOamServicePointPost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.oam.OamServicePointRef to be added to list"  )  @Valid @RequestBody TapiOamOamServicePointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidOamServicePointoamServiceUuidoamServicePointLocalIdDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("oam-service-uuid") String oamServiceUuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("oam-service-point-local-id") String oamServicePointLocalId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamOamServicePointRef> dataContextOamContextOamJobuuidOamServicePointoamServiceUuidoamServicePointLocalIdGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("oam-service-uuid") String oamServiceUuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("oam-service-point-local-id") String oamServicePointLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamOamServicePointRef>(objectMapper.readValue("", TapiOamOamServicePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamOamServicePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamOamServicePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidOamServicePointoamServiceUuidoamServicePointLocalIdPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("oam-service-uuid") String oamServiceUuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("oam-service-point-local-id") String oamServicePointLocalId,@ApiParam(value = "tapi.oam.OamServicePointRef to be added or updated"  )  @Valid @RequestBody TapiOamOamServicePointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidPut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.oam.oamcontext.OamJob to be added or updated"  )  @Valid @RequestBody TapiOamOamcontextOamJob body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidScheduleDelete(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonTimeRange> dataContextOamContextOamJobuuidScheduleGet(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonTimeRange>(objectMapper.readValue("{ \"start-time\" : \"start-time\", \"end-time\" : \"end-time\" }", TapiCommonTimeRange.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonTimeRange>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonTimeRange>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidSchedulePost(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.TimeRange to be added to list"  )  @Valid @RequestBody TapiCommonTimeRange body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamJobuuidSchedulePut(@ApiParam(value = "Id of oam-job",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.TimeRange to be added or updated"  )  @Valid @RequestBody TapiCommonTimeRange body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfilePost(@ApiParam(value = "tapi.oam.OamProfile to be added to list"  )  @Valid @RequestBody TapiOamOamProfile body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidDelete(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamOamProfile> dataContextOamContextOamProfileuuidGet(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamOamProfile>(objectMapper.readValue("", TapiOamOamProfile.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamOamProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamOamProfile>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidNamePost(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidNamevalueNameDelete(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextOamContextOamProfileuuidNamevalueNameGet(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidNamevalueNamePut(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDataPost(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.oam.PmThresholdData to be added to list"  )  @Valid @RequestBody TapiOamPmThresholdData body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdDelete(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamPmThresholdData> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGet(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamPmThresholdData>(objectMapper.readValue("", TapiOamPmThresholdData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamPmThresholdData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamPmThresholdData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodDelete(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonTimePeriod> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodGet(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonTimePeriod>(objectMapper.readValue("{ \"unit\" : \"YEARS\", \"value\" : 0 }", TapiCommonTimePeriod.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonTimePeriod>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonTimePeriod>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodPost(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.TimePeriod to be added to list"  )  @Valid @RequestBody TapiCommonTimePeriod body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodPut(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.TimePeriod to be added or updated"  )  @Valid @RequestBody TapiCommonTimePeriod body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamePost(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamevalueNameDelete(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamevalueNameGet(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamevalueNamePut(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdPut(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.oam.PmThresholdData to be added or updated"  )  @Valid @RequestBody TapiOamPmThresholdData body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterPost(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.oam.ThresholdParameter to be added to list"  )  @Valid @RequestBody TapiOamThresholdParameter body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationDelete(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamThresholdParameter> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationGet(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamThresholdParameter>(objectMapper.readValue("{ \"pm-parameter-below-thrs\" : { \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }, \"pm-parameter-name\" : \"pm-parameter-name\", \"pm-parameter-clear-thrs\" : { \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }, \"pm-parameter-above-thrs\" : { \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }, \"threshold-location\" : \"NOT_APPLICABLE\" }", TapiOamThresholdParameter.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamThresholdParameter>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamThresholdParameter>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsDelete(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamPmParameterValue> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsGet(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamPmParameterValue>(objectMapper.readValue("{ \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }", TapiOamPmParameterValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsPost(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation,@ApiParam(value = "tapi.oam.PmParameterValue to be added to list"  )  @Valid @RequestBody TapiOamPmParameterValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsPut(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation,@ApiParam(value = "tapi.oam.PmParameterValue to be added or updated"  )  @Valid @RequestBody TapiOamPmParameterValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsDelete(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamPmParameterValue> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsGet(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamPmParameterValue>(objectMapper.readValue("{ \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }", TapiOamPmParameterValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsPost(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation,@ApiParam(value = "tapi.oam.PmParameterValue to be added to list"  )  @Valid @RequestBody TapiOamPmParameterValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsPut(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation,@ApiParam(value = "tapi.oam.PmParameterValue to be added or updated"  )  @Valid @RequestBody TapiOamPmParameterValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsDelete(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamPmParameterValue> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsGet(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamPmParameterValue>(objectMapper.readValue("{ \"pm-parameter-int-value\" : 0, \"pm-parameter-real-value\" : \"pm-parameter-real-value\" }", TapiOamPmParameterValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamPmParameterValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsPost(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation,@ApiParam(value = "tapi.oam.PmParameterValue to be added to list"  )  @Valid @RequestBody TapiOamPmParameterValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsPut(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation,@ApiParam(value = "tapi.oam.PmParameterValue to be added or updated"  )  @Valid @RequestBody TapiOamPmParameterValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPut(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of pm-threshold-data",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("pm-parameter-name") String pmParameterName,@ApiParam(value = "Id of threshold-parameter",required=true) @PathVariable("threshold-location") String thresholdLocation,@ApiParam(value = "tapi.oam.ThresholdParameter to be added or updated"  )  @Valid @RequestBody TapiOamThresholdParameter body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamProfileuuidPut(@ApiParam(value = "Id of oam-profile",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.oam.OamProfile to be added or updated"  )  @Valid @RequestBody TapiOamOamProfile body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServicePost(@ApiParam(value = "tapi.oam.oamcontext.OamService to be added to list"  )  @Valid @RequestBody TapiOamOamcontextOamService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthCfmMaintenanceAssociation> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthCfmMaintenanceAssociation>(objectMapper.readValue("{ \"maintenance-association-name\" : { \"char-string\" : \"char-string\", \"ieee-reserved\" : \"0\", \"unsigned-int-16\" : 0, \"icc-format\" : \"icc-format\", \"primary-vlan-id\" : \"primary-vlan-id\", \"rfc-2865-vpn-id\" : \"rfc-2865-vpn-id\" }, \"id-permission\" : \"id-permission\" }", TapiEthEthCfmMaintenanceAssociation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthCfmMaintenanceAssociation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthCfmMaintenanceAssociation>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNameDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthMaintenanceAssociationName> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNameGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthMaintenanceAssociationName>(objectMapper.readValue("{ \"char-string\" : \"char-string\", \"ieee-reserved\" : \"0\", \"unsigned-int-16\" : 0, \"icc-format\" : \"icc-format\", \"primary-vlan-id\" : \"primary-vlan-id\", \"rfc-2865-vpn-id\" : \"rfc-2865-vpn-id\" }", TapiEthMaintenanceAssociationName.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthMaintenanceAssociationName>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthMaintenanceAssociationName>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNamePost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.MaintenanceAssociationName to be added to list"  )  @Valid @RequestBody TapiEthMaintenanceAssociationName body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNamePut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.MaintenanceAssociationName to be added or updated"  )  @Valid @RequestBody TapiEthMaintenanceAssociationName body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationPost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthCfmMaintenanceAssociation to be added to list"  )  @Valid @RequestBody TapiEthEthCfmMaintenanceAssociation body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthCfmMaintenanceAssociation to be added or updated"  )  @Valid @RequestBody TapiEthEthCfmMaintenanceAssociation body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthCfmMaintenanceDomain> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthCfmMaintenanceDomain>(objectMapper.readValue("{ \"maintenance-domain-name-type\" : \"maintenance-domain-name-type\", \"maintenance-domain-name\" : \"maintenance-domain-name\" }", TapiEthEthCfmMaintenanceDomain.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthCfmMaintenanceDomain>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthCfmMaintenanceDomain>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainPost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthCfmMaintenanceDomain to be added to list"  )  @Valid @RequestBody TapiEthEthCfmMaintenanceDomain body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthCfmMaintenanceDomain to be added or updated"  )  @Valid @RequestBody TapiEthEthCfmMaintenanceDomain body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMegCommon> dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMegCommon>(objectMapper.readValue("{ \"meg-identifier\" : \"meg-identifier\", \"meg-level\" : 6, \"client-mel\" : 1, \"is-cc-enabled\" : false, \"cc-period\" : \"3_33MS\" }", TapiEthEthMegCommon.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMegCommon>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMegCommon>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonPost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthMegCommon to be added to list"  )  @Valid @RequestBody TapiEthEthMegCommon body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthMegCommon to be added or updated"  )  @Valid @RequestBody TapiEthEthMegCommon body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOamService> dataContextOamContextOamServiceuuidEthOamServiceGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOamService>(objectMapper.readValue("{ \"eth-cfm-maintenance-association\" : { \"maintenance-association-name\" : { \"char-string\" : \"char-string\", \"ieee-reserved\" : \"0\", \"unsigned-int-16\" : 0, \"icc-format\" : \"icc-format\", \"primary-vlan-id\" : \"primary-vlan-id\", \"rfc-2865-vpn-id\" : \"rfc-2865-vpn-id\" }, \"id-permission\" : \"id-permission\" }, \"eth-meg-common\" : { \"meg-identifier\" : \"meg-identifier\", \"meg-level\" : 6, \"client-mel\" : 1, \"is-cc-enabled\" : false, \"cc-period\" : \"3_33MS\" }, \"eth-cfm-maintenance-domain\" : { \"maintenance-domain-name-type\" : \"maintenance-domain-name-type\", \"maintenance-domain-name\" : \"maintenance-domain-name\" } }", TapiEthEthOamService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOamService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOamService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServicePost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOamService to be added to list"  )  @Valid @RequestBody TapiEthEthOamService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidEthOamServicePut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthOamService to be added or updated"  )  @Valid @RequestBody TapiEthEthOamService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamOamcontextOamService> dataContextOamContextOamServiceuuidGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamOamcontextOamService>(objectMapper.readValue("", TapiOamOamcontextOamService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamOamcontextOamService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamOamcontextOamService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamMegRef> dataContextOamContextOamServiceuuidMegGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamMegRef>(objectMapper.readValue("{ \"meg-uuid\" : \"meg-uuid\" }", TapiOamMegRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamMegRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamMegRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidNamePost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidNamevalueNameDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextOamContextOamServiceuuidNamevalueNameGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidNamevalueNamePut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointPost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.oam.oamservice.OamServicePoint to be added to list"  )  @Valid @RequestBody TapiOamOamserviceOamServicePoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef> dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(objectMapper.readValue("", TapiConnectivityConnectivityServiceEndPointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointPost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.connectivity.ConnectivityServiceEndPointRef to be added to list"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceEndPointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.connectivity.ConnectivityServiceEndPointRef to be added or updated"  )  @Valid @RequestBody TapiConnectivityConnectivityServiceEndPointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMepCommon> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMepCommon>(objectMapper.readValue("{ \"codirectional\" : true, \"lck-period\" : \"3_33MS\", \"cc-priority\" : 1, \"lck-priority\" : 0, \"mep-identifier\" : 6 }", TapiEthEthMepCommon.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMepCommon>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMepCommon>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonPost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthMepCommon to be added to list"  )  @Valid @RequestBody TapiEthEthMepCommon body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthMepCommon to be added or updated"  )  @Valid @RequestBody TapiEthEthMepCommon body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthBandwidthReport> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkBandwidthReportGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthBandwidthReport>(objectMapper.readValue("{ \"source-mac-address\" : \"source-mac-address\", \"current-bandwidth\" : 2, \"nominal-bandwidth\" : 4, \"port-id\" : 3 }", TapiEthBandwidthReport.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthBandwidthReport>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthBandwidthReport>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMepSink> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMepSink>(objectMapper.readValue("{ \"peer-mep-identifier\" : [ 2, 2 ], \"lm-m\" : 7, \"is-csf-reported\" : true, \"lm-deg-thr\" : 9, \"bandwidth-report\" : { \"source-mac-address\" : \"source-mac-address\", \"current-bandwidth\" : 2, \"nominal-bandwidth\" : 4, \"port-id\" : 3 }, \"lm-degm\" : 7, \"is-csf-rdi-fdi-enabled\" : true, \"ais-period\" : \"3_33MS\", \"ais-priority\" : 1, \"unexpected-ltr-received\" : 1, \"lm-tf-min\" : 1 }", TapiEthEthMepSink.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMepSink>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMepSink>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkPost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthMepSink to be added to list"  )  @Valid @RequestBody TapiEthEthMepSink body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthMepSink to be added or updated"  )  @Valid @RequestBody TapiEthEthMepSink body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourceDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMepSource> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourceGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMepSource>(objectMapper.readValue("{ \"csf-period\" : \"3_33MS\", \"aps-priority\" : 5, \"csf-priority\" : 5, \"csf-config\" : \"DISABLED\" }", TapiEthEthMepSource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMepSource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMepSource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourcePost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthMepSource to be added to list"  )  @Valid @RequestBody TapiEthEthMepSource body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourcePut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthMepSource to be added or updated"  )  @Valid @RequestBody TapiEthEthMepSource body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOamMepServicePoint> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOamMepServicePoint>(objectMapper.readValue("{ \"eth-mep-sink\" : { \"peer-mep-identifier\" : [ 2, 2 ], \"lm-m\" : 7, \"is-csf-reported\" : true, \"lm-deg-thr\" : 9, \"bandwidth-report\" : { \"source-mac-address\" : \"source-mac-address\", \"current-bandwidth\" : 2, \"nominal-bandwidth\" : 4, \"port-id\" : 3 }, \"lm-degm\" : 7, \"is-csf-rdi-fdi-enabled\" : true, \"ais-period\" : \"3_33MS\", \"ais-priority\" : 1, \"unexpected-ltr-received\" : 1, \"lm-tf-min\" : 1 }, \"eth-mep-common\" : { \"codirectional\" : true, \"lck-period\" : \"3_33MS\", \"cc-priority\" : 1, \"lck-priority\" : 0, \"mep-identifier\" : 6 }, \"eth-mep-source\" : { \"csf-period\" : \"3_33MS\", \"aps-priority\" : 5, \"csf-priority\" : 5, \"csf-config\" : \"DISABLED\" } }", TapiEthEthOamMepServicePoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOamMepServicePoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOamMepServicePoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointPost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthOamMepServicePoint to be added to list"  )  @Valid @RequestBody TapiEthEthOamMepServicePoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthOamMepServicePoint to be added or updated"  )  @Valid @RequestBody TapiEthEthOamMepServicePoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthMipCommon> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthMipCommon>(objectMapper.readValue("{ \"is-full-mip\" : false }", TapiEthEthMipCommon.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthMipCommon>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthMipCommon>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonPost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthMipCommon to be added to list"  )  @Valid @RequestBody TapiEthEthMipCommon body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthMipCommon to be added or updated"  )  @Valid @RequestBody TapiEthEthMipCommon body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthOamMipServicePoint> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthOamMipServicePoint>(objectMapper.readValue("{ \"eth-mip-common\" : { \"is-full-mip\" : false } }", TapiEthEthOamMipServicePoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthOamMipServicePoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthOamMipServicePoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointPost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthOamMipServicePoint to be added to list"  )  @Valid @RequestBody TapiEthEthOamMipServicePoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.eth.EthOamMipServicePoint to be added or updated"  )  @Valid @RequestBody TapiEthEthOamMipServicePoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamOamserviceOamServicePoint> dataContextOamContextOamServiceuuidOamServicePointlocalIdGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamOamserviceOamServicePoint>(objectMapper.readValue("", TapiOamOamserviceOamServicePoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamOamserviceOamServicePoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamOamserviceOamServicePoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamMepRef> dataContextOamContextOamServiceuuidOamServicePointlocalIdMepGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamMepRef>(objectMapper.readValue("", TapiOamMepRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamMepRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamMepRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamMipRef> dataContextOamContextOamServiceuuidOamServicePointlocalIdMipGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamMipRef>(objectMapper.readValue("", TapiOamMipRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamMipRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamMipRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdNamePost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdNamevalueNameDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextOamContextOamServiceuuidOamServicePointlocalIdNamevalueNameGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdNamevalueNamePut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.oam.oamservice.OamServicePoint to be added or updated"  )  @Valid @RequestBody TapiOamOamserviceOamServicePoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointDelete(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonServiceInterfacePointRef> dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointGet(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(objectMapper.readValue("{ \"service-interface-point-uuid\" : \"service-interface-point-uuid\" }", TapiCommonServiceInterfacePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointPost(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.ServiceInterfacePointRef to be added to list"  )  @Valid @RequestBody TapiCommonServiceInterfacePointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of oam-service-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.ServiceInterfacePointRef to be added or updated"  )  @Valid @RequestBody TapiCommonServiceInterfacePointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextOamServiceuuidPut(@ApiParam(value = "Id of oam-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.oam.oamcontext.OamService to be added or updated"  )  @Valid @RequestBody TapiOamOamcontextOamService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextPost(@ApiParam(value = "tapi.oam.context.OamContext to be added to list"  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextOamContextPut(@ApiParam(value = "tapi.oam.context.OamContext to be added or updated"  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextDelete() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationPathComputationContext> dataContextPathComputationContextGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationPathComputationContext>(objectMapper.readValue("{ \"path-comp-service\" : [ \"\", \"\" ], \"path\" : [ \"\", \"\" ] }", TapiPathComputationPathComputationContext.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationPathComputationContext>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationPathComputationContext>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServicePost(@ApiParam(value = "tapi.path.computation.PathComputationService to be added to list"  )  @Valid @RequestBody TapiPathComputationPathComputationService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointPost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.PathServiceEndPoint to be added to list"  )  @Valid @RequestBody TapiPathComputationPathServiceEndPoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityPost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.Capacity to be added to list"  )  @Valid @RequestBody TapiCommonCapacity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityPut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.Capacity to be added or updated"  )  @Valid @RequestBody TapiCommonCapacity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizeDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizeGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizePost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.CapacityValue to be added to list"  )  @Valid @RequestBody TapiCommonCapacityValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizePut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.CapacityValue to be added or updated"  )  @Valid @RequestBody TapiCommonCapacityValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationPathServiceEndPoint> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationPathServiceEndPoint>(objectMapper.readValue("", TapiPathComputationPathServiceEndPoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationPathServiceEndPoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationPathServiceEndPoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamePost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamevalueNameDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamevalueNameGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamevalueNamePut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdPut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.path.computation.PathServiceEndPoint to be added or updated"  )  @Valid @RequestBody TapiPathComputationPathServiceEndPoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonServiceInterfacePointRef> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(objectMapper.readValue("{ \"service-interface-point-uuid\" : \"service-interface-point-uuid\" }", TapiCommonServiceInterfacePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointPost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.ServiceInterfacePointRef to be added to list"  )  @Valid @RequestBody TapiCommonServiceInterfacePointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointPut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.ServiceInterfacePointRef to be added or updated"  )  @Valid @RequestBody TapiCommonServiceInterfacePointRef body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationPathComputationService> dataContextPathComputationContextPathCompServiceuuidGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationPathComputationService>(objectMapper.readValue("", TapiPathComputationPathComputationService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationPathComputationService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationPathComputationService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidNamePost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidNamevalueNameDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextPathComputationContextPathCompServiceuuidNamevalueNameGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidNamevalueNamePut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationPathObjectiveFunction> dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationPathObjectiveFunction>(objectMapper.readValue("", TapiPathComputationPathObjectiveFunction.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationPathObjectiveFunction>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationPathObjectiveFunction>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamePost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamevalueNameDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamevalueNameGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamevalueNamePut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionPost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.PathObjectiveFunction to be added to list"  )  @Valid @RequestBody TapiPathComputationPathObjectiveFunction body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionPut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.PathObjectiveFunction to be added or updated"  )  @Valid @RequestBody TapiPathComputationPathObjectiveFunction body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationPathOptimizationConstraint> dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationPathOptimizationConstraint>(objectMapper.readValue("", TapiPathComputationPathOptimizationConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationPathOptimizationConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationPathOptimizationConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamePost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamevalueNameDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamevalueNameGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamevalueNamePut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintPost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.PathOptimizationConstraint to be added to list"  )  @Valid @RequestBody TapiPathComputationPathOptimizationConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintPut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.PathOptimizationConstraint to be added or updated"  )  @Valid @RequestBody TapiPathComputationPathOptimizationConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationPathRef> dataContextPathComputationContextPathCompServiceuuidPathpathUuidGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of path",required=true) @PathVariable("path-uuid") String pathUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationPathRef>(objectMapper.readValue("{ \"path-uuid\" : \"path-uuid\" }", TapiPathComputationPathRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationPathRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationPathRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidPut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.PathComputationService to be added or updated"  )  @Valid @RequestBody TapiPathComputationPathComputationService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristicPost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.topology.CostCharacteristic to be added to list"  )  @Valid @RequestBody TapiTopologyCostCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristiccostNameDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyCostCharacteristic> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristiccostNameGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyCostCharacteristic>(objectMapper.readValue("{ \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" }", TapiTopologyCostCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristiccostNamePut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName,@ApiParam(value = "tapi.topology.CostCharacteristic to be added or updated"  )  @Valid @RequestBody TapiTopologyCostCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationRoutingConstraint> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationRoutingConstraint>(objectMapper.readValue("{ \"is-exclusive\" : true, \"tolerable-impact\" : \"tolerable-impact\", \"diversity-policy\" : \"SRLG\", \"route-objective-function\" : \"MIN_WORK_ROUTE_HOP\", \"cost-characteristic\" : [ { \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" }, { \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" } ], \"latency-characteristic\" : [ { \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" }, { \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" } ], \"risk-diversity-characteristic\" : [ { \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] }, { \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] } ] }", TapiPathComputationRoutingConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationRoutingConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationRoutingConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristicPost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.topology.LatencyCharacteristic to be added to list"  )  @Valid @RequestBody TapiTopologyLatencyCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyLatencyCharacteristic> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(objectMapper.readValue("{ \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" }", TapiTopologyLatencyCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNamePut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName,@ApiParam(value = "tapi.topology.LatencyCharacteristic to be added or updated"  )  @Valid @RequestBody TapiTopologyLatencyCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintPost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.RoutingConstraint to be added to list"  )  @Valid @RequestBody TapiPathComputationRoutingConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintPut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.RoutingConstraint to be added or updated"  )  @Valid @RequestBody TapiPathComputationRoutingConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicPost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.topology.RiskCharacteristic to be added to list"  )  @Valid @RequestBody TapiTopologyRiskCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of risk-diversity-characteristic",required=true) @PathVariable("risk-characteristic-name") String riskCharacteristicName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyRiskCharacteristic> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of risk-diversity-characteristic",required=true) @PathVariable("risk-characteristic-name") String riskCharacteristicName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(objectMapper.readValue("{ \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] }", TapiTopologyRiskCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNamePut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of risk-diversity-characteristic",required=true) @PathVariable("risk-characteristic-name") String riskCharacteristicName,@ApiParam(value = "tapi.topology.RiskCharacteristic to be added or updated"  )  @Valid @RequestBody TapiTopologyRiskCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidTopologyConstraintPost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.path.computation.TopologyConstraint to be added to list"  )  @Valid @RequestBody TapiPathComputationTopologyConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationTopologyConstraint> dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationTopologyConstraint>(objectMapper.readValue("", TapiPathComputationTopologyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationTopologyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationTopologyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamePost(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamevalueNameDelete(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamevalueNameGet(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamevalueNamePut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdPut(@ApiParam(value = "Id of path-comp-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of topology-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.path.computation.TopologyConstraint to be added or updated"  )  @Valid @RequestBody TapiPathComputationTopologyConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationPath> dataContextPathComputationContextPathuuidGet(@ApiParam(value = "Id of path",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationPath>(objectMapper.readValue("", TapiPathComputationPath.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationPath>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationPath>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyLinkRef> dataContextPathComputationContextPathuuidLinktopologyUuidlinkUuidGet(@ApiParam(value = "Id of path",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyLinkRef>(objectMapper.readValue("", TapiTopologyLinkRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyLinkRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyLinkRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextPathComputationContextPathuuidNamevalueNameGet(@ApiParam(value = "Id of path",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyCostCharacteristic> dataContextPathComputationContextPathuuidRoutingConstraintCostCharacteristiccostNameGet(@ApiParam(value = "Id of path",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyCostCharacteristic>(objectMapper.readValue("{ \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" }", TapiTopologyCostCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationRoutingConstraint> dataContextPathComputationContextPathuuidRoutingConstraintGet(@ApiParam(value = "Id of path",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationRoutingConstraint>(objectMapper.readValue("{ \"is-exclusive\" : true, \"tolerable-impact\" : \"tolerable-impact\", \"diversity-policy\" : \"SRLG\", \"route-objective-function\" : \"MIN_WORK_ROUTE_HOP\", \"cost-characteristic\" : [ { \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" }, { \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" } ], \"latency-characteristic\" : [ { \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" }, { \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" } ], \"risk-diversity-characteristic\" : [ { \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] }, { \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] } ] }", TapiPathComputationRoutingConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationRoutingConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationRoutingConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyLatencyCharacteristic> dataContextPathComputationContextPathuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameGet(@ApiParam(value = "Id of path",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(objectMapper.readValue("{ \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" }", TapiTopologyLatencyCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyRiskCharacteristic> dataContextPathComputationContextPathuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameGet(@ApiParam(value = "Id of path",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of risk-diversity-characteristic",required=true) @PathVariable("risk-characteristic-name") String riskCharacteristicName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(objectMapper.readValue("{ \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] }", TapiTopologyRiskCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPost(@ApiParam(value = "tapi.path.computation.PathComputationContext to be added to list"  )  @Valid @RequestBody TapiPathComputationPathComputationContext body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPathComputationContextPut(@ApiParam(value = "tapi.path.computation.PathComputationContext to be added or updated"  )  @Valid @RequestBody TapiPathComputationPathComputationContext body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPost(@ApiParam(value = "tapi.common.Context to be added to list"  )  @Valid @RequestBody TapiCommonContext body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextPut(@ApiParam(value = "tapi.common.Context to be added or updated"  )  @Valid @RequestBody TapiCommonContext body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointPost(@ApiParam(value = "tapi.common.context.ServiceInterfacePoint to be added to list"  )  @Valid @RequestBody TapiCommonContextServiceInterfacePoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextServiceInterfacePointuuidAvailableCapacityGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextServiceInterfacePointuuidAvailableCapacityTotalSizeGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthServiceIntefacePointSpec> dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthServiceIntefacePointSpec>(objectMapper.readValue("{ \"phy-type\" : \"OTHER\", \"phy-type-list\" : [ \"OTHER\", \"OTHER\" ] }", TapiEthEthServiceIntefacePointSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthServiceIntefacePointSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthServiceIntefacePointSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthServiceIntefacePointSpec to be added to list"  )  @Valid @RequestBody TapiEthEthServiceIntefacePointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.eth.EthServiceIntefacePointSpec to be added or updated"  )  @Valid @RequestBody TapiEthEthServiceIntefacePointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonContextServiceInterfacePoint> dataContextServiceInterfacePointuuidGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonContextServiceInterfacePoint>(objectMapper.readValue("", TapiCommonContextServiceInterfacePoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonContextServiceInterfacePoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonContextServiceInterfacePoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaMediaChannelServiceInterfacePointSpec> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaMediaChannelServiceInterfacePointSpec>(objectMapper.readValue("{ \"mc-pool\" : { \"supportable-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ], \"available-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ], \"occupied-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ] }, \"power-management-capability\" : { \"tolerable-maximum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"supportable-minimum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"tolerable-minimum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"supportable-maximum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" } } }", TapiPhotonicMediaMediaChannelServiceInterfacePointSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaMediaChannelServiceInterfacePointSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaMediaChannelServiceInterfacePointSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of available-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of available-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaSpectrumBand> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of available-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of available-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(objectMapper.readValue("{ \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }", TapiPhotonicMediaSpectrumBand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaMediaChannelPoolCapabilityPac> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaMediaChannelPoolCapabilityPac>(objectMapper.readValue("{ \"supportable-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ], \"available-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ], \"occupied-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ] }", TapiPhotonicMediaMediaChannelPoolCapabilityPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaMediaChannelPoolCapabilityPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaMediaChannelPoolCapabilityPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of occupied-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of occupied-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaSpectrumBand> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of occupied-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of occupied-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(objectMapper.readValue("{ \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }", TapiPhotonicMediaSpectrumBand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of supportable-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of supportable-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaSpectrumBand> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of supportable-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of supportable-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(objectMapper.readValue("{ \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }", TapiPhotonicMediaSpectrumBand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.MediaChannelServiceInterfacePointSpec to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaMediaChannelServiceInterfacePointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerManagementCapabilityPac> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerManagementCapabilityPac>(objectMapper.readValue("{ \"tolerable-maximum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"supportable-minimum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"tolerable-minimum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"supportable-maximum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" } }", TapiPhotonicMediaPowerManagementCapabilityPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerManagementCapabilityPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerManagementCapabilityPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerManagementCapabilityPac to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerManagementCapabilityPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerManagementCapabilityPac to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerManagementCapabilityPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.MediaChannelServiceInterfacePointSpec to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaMediaChannelServiceInterfacePointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidNamePost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidNamevalueNameDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextServiceInterfacePointuuidNamevalueNameGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidNamevalueNamePut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaOtsiServiceInterfacePointSpec> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaOtsiServiceInterfacePointSpec>(objectMapper.readValue("{ \"otsi-capability\" : { \"supportable-modulation\" : [ \"RZ\", \"RZ\" ], \"supportable-central-frequency-band\" : [ { \"upper-central-frequency\" : 0, \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-central-frequency\" : 6 }, { \"upper-central-frequency\" : 0, \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-central-frequency\" : 6 } ], \"supportable-application-identifier\" : [ { \"application-identifier-type\" : \"PROPRIETARY\", \"application-code\" : \"application-code\" }, { \"application-identifier-type\" : \"PROPRIETARY\", \"application-code\" : \"application-code\" } ], \"total-power-warn-threshold\" : { \"total-power-upper-warn-threshold-default\" : \"total-power-upper-warn-threshold-default\", \"total-power-lower-warn-threshold-min\" : \"total-power-lower-warn-threshold-min\", \"total-power-upper-warn-threshold-min\" : \"total-power-upper-warn-threshold-min\", \"total-power-upper-warn-threshold-max\" : \"total-power-upper-warn-threshold-max\", \"total-power-lower-warn-threshold-max\" : \"total-power-lower-warn-threshold-max\", \"total-power-lower-warn-threshold-default\" : \"total-power-lower-warn-threshold-default\" } }, \"power-management-capability\" : { \"tolerable-maximum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"supportable-minimum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"tolerable-minimum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"supportable-maximum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" } } }", TapiPhotonicMediaOtsiServiceInterfacePointSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaOtsiServiceInterfacePointSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaOtsiServiceInterfacePointSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaOtsiCapabilityPac> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilityGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaOtsiCapabilityPac>(objectMapper.readValue("{ \"supportable-modulation\" : [ \"RZ\", \"RZ\" ], \"supportable-central-frequency-band\" : [ { \"upper-central-frequency\" : 0, \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-central-frequency\" : 6 }, { \"upper-central-frequency\" : 0, \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-central-frequency\" : 6 } ], \"supportable-application-identifier\" : [ { \"application-identifier-type\" : \"PROPRIETARY\", \"application-code\" : \"application-code\" }, { \"application-identifier-type\" : \"PROPRIETARY\", \"application-code\" : \"application-code\" } ], \"total-power-warn-threshold\" : { \"total-power-upper-warn-threshold-default\" : \"total-power-upper-warn-threshold-default\", \"total-power-lower-warn-threshold-min\" : \"total-power-lower-warn-threshold-min\", \"total-power-upper-warn-threshold-min\" : \"total-power-upper-warn-threshold-min\", \"total-power-upper-warn-threshold-max\" : \"total-power-upper-warn-threshold-max\", \"total-power-lower-warn-threshold-max\" : \"total-power-lower-warn-threshold-max\", \"total-power-lower-warn-threshold-default\" : \"total-power-lower-warn-threshold-default\" } }", TapiPhotonicMediaOtsiCapabilityPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaOtsiCapabilityPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaOtsiCapabilityPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaApplicationIdentifier> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilitySupportableApplicationIdentifierapplicationCodeGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of supportable-application-identifier",required=true) @PathVariable("application-code") String applicationCode) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaApplicationIdentifier>(objectMapper.readValue("{ \"application-identifier-type\" : \"PROPRIETARY\", \"application-code\" : \"application-code\" }", TapiPhotonicMediaApplicationIdentifier.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaApplicationIdentifier>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaApplicationIdentifier>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilitySupportableCentralFrequencyBandFrequencyConstraintGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaCentralFrequencyBand> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilitySupportableCentralFrequencyBandGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaCentralFrequencyBand>(objectMapper.readValue("{ \"upper-central-frequency\" : 0, \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-central-frequency\" : 6 }", TapiPhotonicMediaCentralFrequencyBand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaCentralFrequencyBand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaCentralFrequencyBand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaTotalPowerThresholdPac> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilityTotalPowerWarnThresholdGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaTotalPowerThresholdPac>(objectMapper.readValue("{ \"total-power-upper-warn-threshold-default\" : \"total-power-upper-warn-threshold-default\", \"total-power-lower-warn-threshold-min\" : \"total-power-lower-warn-threshold-min\", \"total-power-upper-warn-threshold-min\" : \"total-power-upper-warn-threshold-min\", \"total-power-upper-warn-threshold-max\" : \"total-power-upper-warn-threshold-max\", \"total-power-lower-warn-threshold-max\" : \"total-power-lower-warn-threshold-max\", \"total-power-lower-warn-threshold-default\" : \"total-power-lower-warn-threshold-default\" }", TapiPhotonicMediaTotalPowerThresholdPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaTotalPowerThresholdPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaTotalPowerThresholdPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.OtsiServiceInterfacePointSpec to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaOtsiServiceInterfacePointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerManagementCapabilityPac> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerManagementCapabilityPac>(objectMapper.readValue("{ \"tolerable-maximum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"supportable-minimum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"tolerable-minimum-input-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"supportable-maximum-output-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" } }", TapiPhotonicMediaPowerManagementCapabilityPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerManagementCapabilityPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerManagementCapabilityPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerManagementCapabilityPac to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerManagementCapabilityPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerManagementCapabilityPac to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerManagementCapabilityPac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerDelete(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPost(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added to list"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.PowerProperties to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaPowerProperties body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.photonic.media.OtsiServiceInterfacePointSpec to be added or updated"  )  @Valid @RequestBody TapiPhotonicMediaOtsiServiceInterfacePointSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextServiceInterfacePointuuidPut(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.context.ServiceInterfacePoint to be added or updated"  )  @Valid @RequestBody TapiCommonContextServiceInterfacePoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextServiceInterfacePointuuidTotalPotentialCapacityGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextServiceInterfacePointuuidTotalPotentialCapacityTotalSizeGet(@ApiParam(value = "Id of service-interface-point",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextTopologyContextDelete() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyTopologyContext> dataContextTopologyContextGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyTopologyContext>(objectMapper.readValue("{ \"nw-topology-service\" : \"\", \"topology\" : [ \"\", \"\" ] }", TapiTopologyTopologyContext.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyTopologyContext>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyTopologyContext>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNetworkTopologyService> dataContextTopologyContextNwTopologyServiceGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNetworkTopologyService>(objectMapper.readValue("", TapiTopologyNetworkTopologyService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNetworkTopologyService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNetworkTopologyService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextTopologyContextNwTopologyServiceNamevalueNameGet(@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyTopologyRef> dataContextTopologyContextNwTopologyServiceTopologytopologyUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("topology-uuid") String topologyUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyTopologyRef>(objectMapper.readValue("{ \"topology-uuid\" : \"topology-uuid\" }", TapiTopologyTopologyRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyTopologyRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyTopologyRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextTopologyContextPost(@ApiParam(value = "tapi.topology.TopologyContext to be added to list"  )  @Valid @RequestBody TapiTopologyTopologyContext body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextTopologyContextPut(@ApiParam(value = "tapi.topology.TopologyContext to be added or updated"  )  @Valid @RequestBody TapiTopologyTopologyContext body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNodeEdgePointRef> dataContextTopologyContextTopologyuuidBoundaryNodeEdgePointtopologyUuidnodeUuidnodeEdgePointUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of boundary-node-edge-point",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of boundary-node-edge-point",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of boundary-node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(objectMapper.readValue("", TapiTopologyNodeEdgePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyTopologycontextTopology> dataContextTopologyContextTopologyuuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyTopologycontextTopology>(objectMapper.readValue("", TapiTopologyTopologycontextTopology.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyTopologycontextTopology>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyTopologycontextTopology>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextTopologyContextTopologyuuidLinklinkUuidAvailableCapacityGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextTopologyContextTopologyuuidLinklinkUuidAvailableCapacityTotalSizeGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyCostCharacteristic> dataContextTopologyContextTopologyuuidLinklinkUuidCostCharacteristiccostNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyCostCharacteristic>(objectMapper.readValue("{ \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" }", TapiTopologyCostCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyLink> dataContextTopologyContextTopologyuuidLinklinkUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyLink>(objectMapper.readValue("", TapiTopologyLink.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyLink>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyLink>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyLatencyCharacteristic> dataContextTopologyContextTopologyuuidLinklinkUuidLatencyCharacteristictrafficPropertyNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(objectMapper.readValue("{ \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" }", TapiTopologyLatencyCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextTopologyContextTopologyuuidLinklinkUuidNamevalueNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNodeEdgePointRef> dataContextTopologyContextTopologyuuidLinklinkUuidNodeEdgePointtopologyUuidnodeUuidnodeEdgePointUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(objectMapper.readValue("", TapiTopologyNodeEdgePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyRiskCharacteristic> dataContextTopologyContextTopologyuuidLinklinkUuidRiskCharacteristicriskCharacteristicNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid,@ApiParam(value = "Id of risk-characteristic",required=true) @PathVariable("risk-characteristic-name") String riskCharacteristicName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(objectMapper.readValue("{ \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] }", TapiTopologyRiskCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextTopologyContextTopologyuuidLinklinkUuidTotalPotentialCapacityGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextTopologyContextTopologyuuidLinklinkUuidTotalPotentialCapacityTotalSizeGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyValidationMechanism> dataContextTopologyContextTopologyuuidLinklinkUuidValidationMechanismvalidationMechanismGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of link",required=true) @PathVariable("link-uuid") String linkUuid,@ApiParam(value = "Id of validation-mechanism",required=true) @PathVariable("validation-mechanism") String validationMechanism) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyValidationMechanism>(objectMapper.readValue("{ \"layer-protocol-adjacency-validated\" : \"layer-protocol-adjacency-validated\", \"validation-mechanism\" : \"validation-mechanism\", \"validation-robustness\" : \"validation-robustness\" }", TapiTopologyValidationMechanism.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyValidationMechanism>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyValidationMechanism>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextTopologyContextTopologyuuidNamevalueNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNodeEdgePointRef> dataContextTopologyContextTopologyuuidNodenodeUuidAggregatedNodeEdgePointtopologyUuidaggregatedNodeEdgePointNodeUuidnodeEdgePointUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of aggregated-node-edge-point",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of aggregated-node-edge-point",required=true) @PathVariable("aggregated-node-edge-point-node-uuid") String aggregatedNodeEdgePointNodeUuid,@ApiParam(value = "Id of aggregated-node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(objectMapper.readValue("", TapiTopologyNodeEdgePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextTopologyContextTopologyuuidNodenodeUuidAvailableCapacityGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextTopologyContextTopologyuuidNodenodeUuidAvailableCapacityTotalSizeGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyCostCharacteristic> dataContextTopologyContextTopologyuuidNodenodeUuidCostCharacteristiccostNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyCostCharacteristic>(objectMapper.readValue("{ \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" }", TapiTopologyCostCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyTopologyRef> dataContextTopologyContextTopologyuuidNodenodeUuidEncapTopologyGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyTopologyRef>(objectMapper.readValue("{ \"topology-uuid\" : \"topology-uuid\" }", TapiTopologyTopologyRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyTopologyRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyTopologyRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyTopologyNode> dataContextTopologyContextTopologyuuidNodenodeUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyTopologyNode>(objectMapper.readValue("", TapiTopologyTopologyNode.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyTopologyNode>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyTopologyNode>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyLatencyCharacteristic> dataContextTopologyContextTopologyuuidNodenodeUuidLatencyCharacteristictrafficPropertyNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(objectMapper.readValue("{ \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" }", TapiTopologyLatencyCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextTopologyContextTopologyuuidNodenodeUuidNamevalueNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNodeEdgePointRef> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAggregatedNodeEdgePointtopologyUuidaggregatedNodeEdgePointNodeUuidaggregatedNodeEdgePointNodeEdgePointUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of aggregated-node-edge-point",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of aggregated-node-edge-point",required=true) @PathVariable("aggregated-node-edge-point-node-uuid") String aggregatedNodeEdgePointNodeUuid,@ApiParam(value = "Id of aggregated-node-edge-point",required=true) @PathVariable("aggregated-node-edge-point-node-edge-point-uuid") String aggregatedNodeEdgePointNodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(objectMapper.readValue("", TapiTopologyNodeEdgePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAvailableCapacityGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAvailableCapacityTotalSizeGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNepLayerProtocolCapability> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAvailableCepLayerProtocollayerProtocolQualifierGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of available-cep-layer-protocol",required=true) @PathVariable("layer-protocol-qualifier") String layerProtocolQualifier) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNepLayerProtocolCapability>(objectMapper.readValue("{ \"number-of-cep-instances\" : 0, \"layer-protocol-qualifier\" : \"layer-protocol-qualifier\" }", TapiTopologyNepLayerProtocolCapability.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNepLayerProtocolCapability>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNepLayerProtocolCapability>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityConnectionEndPointRef> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidAggregatedConnectionEndPointtopologyUuidaggregatedConnectionEndPointNodeUuidaggregatedConnectionEndPointNodeEdgePointUuidaggregatedConnectionEndPointConnectionEndPointUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid,@ApiParam(value = "Id of aggregated-connection-end-point",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of aggregated-connection-end-point",required=true) @PathVariable("aggregated-connection-end-point-node-uuid") String aggregatedConnectionEndPointNodeUuid,@ApiParam(value = "Id of aggregated-connection-end-point",required=true) @PathVariable("aggregated-connection-end-point-node-edge-point-uuid") String aggregatedConnectionEndPointNodeEdgePointUuid,@ApiParam(value = "Id of aggregated-connection-end-point",required=true) @PathVariable("aggregated-connection-end-point-connection-end-point-uuid") String aggregatedConnectionEndPointConnectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(objectMapper.readValue("", TapiConnectivityConnectionEndPointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityConnectionEndPointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNodeEdgePointRef> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidClientNodeEdgePointtopologyUuidclientNodeEdgePointNodeUuidclientNodeEdgePointNodeEdgePointUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid,@ApiParam(value = "Id of client-node-edge-point",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of client-node-edge-point",required=true) @PathVariable("client-node-edge-point-node-uuid") String clientNodeEdgePointNodeUuid,@ApiParam(value = "Id of client-node-edge-point",required=true) @PathVariable("client-node-edge-point-node-edge-point-uuid") String clientNodeEdgePointNodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(objectMapper.readValue("", TapiTopologyNodeEdgePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthControlFrameFilter> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacFilterConfigGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthControlFrameFilter>(objectMapper.readValue("{ \"c-2-00-00-2-a\" : false, \"c-2-00-00-0-c\" : false, \"c-2-00-00-0-b\" : false, \"c-2-00-00-2-c\" : false, \"c-2-00-00-0-e\" : false, \"c-2-00-00-2-b\" : false, \"c-2-00-00-0-d\" : false, \"c-2-00-00-2-e\" : false, \"c-2-00-00-2-d\" : false, \"c-2-00-00-0-f\" : false, \"c-2-00-00-2-f\" : false, \"c-2-00-00-10\" : false, \"c-2-00-00-09\" : false, \"c-2-00-00-29\" : false, \"c-2-00-00-07\" : false, \"c-2-00-00-08\" : false, \"c-2-00-00-27\" : false, \"c-2-00-00-05\" : false, \"c-2-00-00-28\" : false, \"c-2-00-00-06\" : false, \"c-2-00-00-25\" : false, \"c-2-00-00-03\" : false, \"c-2-00-00-26\" : false, \"c-2-00-00-04\" : false, \"c-2-00-00-23\" : false, \"c-2-00-00-01\" : false, \"c-2-00-00-24\" : false, \"c-2-00-00-02\" : false, \"c-2-00-00-21\" : false, \"c-2-00-00-22\" : false, \"c-2-00-00-00\" : false, \"c-2-00-00-20\" : false, \"c-2-00-00-0-a\" : false }", TapiEthControlFrameFilter.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthControlFrameFilter>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthControlFrameFilter>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthCtpCommonPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthCtpCommonPac>(objectMapper.readValue("{ \"vlan-config\" : 0, \"csf-rdi-fdi-enable\" : false, \"filter-config\" : { \"c-2-00-00-2-a\" : false, \"c-2-00-00-0-c\" : false, \"c-2-00-00-0-b\" : false, \"c-2-00-00-2-c\" : false, \"c-2-00-00-0-e\" : false, \"c-2-00-00-2-b\" : false, \"c-2-00-00-0-d\" : false, \"c-2-00-00-2-e\" : false, \"c-2-00-00-2-d\" : false, \"c-2-00-00-0-f\" : false, \"c-2-00-00-2-f\" : false, \"c-2-00-00-10\" : false, \"c-2-00-00-09\" : false, \"c-2-00-00-29\" : false, \"c-2-00-00-07\" : false, \"c-2-00-00-08\" : false, \"c-2-00-00-27\" : false, \"c-2-00-00-05\" : false, \"c-2-00-00-28\" : false, \"c-2-00-00-06\" : false, \"c-2-00-00-25\" : false, \"c-2-00-00-03\" : false, \"c-2-00-00-26\" : false, \"c-2-00-00-04\" : false, \"c-2-00-00-23\" : false, \"c-2-00-00-01\" : false, \"c-2-00-00-24\" : false, \"c-2-00-00-02\" : false, \"c-2-00-00-21\" : false, \"c-2-00-00-22\" : false, \"c-2-00-00-00\" : false, \"c-2-00-00-20\" : false, \"c-2-00-00-0-a\" : false }, \"traffic-shaping-pac\" : { \"codirectional\" : false, \"sched-config\" : \"sched-config\", \"queue-config-list\" : [ { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 }, { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] }, \"mac-length\" : 7, \"csf-report\" : false, \"filter-config-snk\" : [ \"filter-config-snk\", \"filter-config-snk\" ], \"pll-thr\" : 9, \"csf-config\" : \"DISABLED\", \"is-ssf-reported\" : false, \"collector-max-delay\" : 3, \"auxiliary-function-position-sequence\" : [ 2, 2 ], \"traffic-conditioning-pac\" : { \"codirectional\" : false, \"cond-config-list\" : [ { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 }, { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] } }", TapiEthEthCtpCommonPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthCtpCommonPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthCtpCommonPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTrafficConditioningConfiguration> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid,@ApiParam(value = "Id of cond-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTrafficConditioningConfiguration>(objectMapper.readValue("{ \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 }", TapiEthTrafficConditioningConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTrafficConditioningConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTrafficConditioningConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTrafficConditioningPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficConditioningPacGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTrafficConditioningPac>(objectMapper.readValue("{ \"codirectional\" : false, \"cond-config-list\" : [ { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 }, { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] }", TapiEthTrafficConditioningPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTrafficConditioningPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTrafficConditioningPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthPriorityConfiguration> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid,@ApiParam(value = "Id of prio-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthPriorityConfiguration>(objectMapper.readValue("{ \"queue-id\" : 2, \"priority\" : 5 }", TapiEthPriorityConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthPriorityConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthPriorityConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthTrafficShapingPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficShapingPacGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthTrafficShapingPac>(objectMapper.readValue("{ \"codirectional\" : false, \"sched-config\" : \"sched-config\", \"queue-config-list\" : [ { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 }, { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] }", TapiEthTrafficShapingPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthTrafficShapingPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthTrafficShapingPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthPriorityConfiguration> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid,@ApiParam(value = "Id of prio-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthPriorityConfiguration>(objectMapper.readValue("{ \"queue-id\" : 2, \"priority\" : 5 }", TapiEthPriorityConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthPriorityConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthPriorityConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthQueueConfiguration> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid,@ApiParam(value = "Id of queue-config-list",required=true) @PathVariable("queue-id") Integer queueId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthQueueConfiguration>(objectMapper.readValue("{ \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 }", TapiEthQueueConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthQueueConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthQueueConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthCtpPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthCtpPac>(objectMapper.readValue("{ \"eth-ctp-common-pac\" : { \"vlan-config\" : 0, \"csf-rdi-fdi-enable\" : false, \"filter-config\" : { \"c-2-00-00-2-a\" : false, \"c-2-00-00-0-c\" : false, \"c-2-00-00-0-b\" : false, \"c-2-00-00-2-c\" : false, \"c-2-00-00-0-e\" : false, \"c-2-00-00-2-b\" : false, \"c-2-00-00-0-d\" : false, \"c-2-00-00-2-e\" : false, \"c-2-00-00-2-d\" : false, \"c-2-00-00-0-f\" : false, \"c-2-00-00-2-f\" : false, \"c-2-00-00-10\" : false, \"c-2-00-00-09\" : false, \"c-2-00-00-29\" : false, \"c-2-00-00-07\" : false, \"c-2-00-00-08\" : false, \"c-2-00-00-27\" : false, \"c-2-00-00-05\" : false, \"c-2-00-00-28\" : false, \"c-2-00-00-06\" : false, \"c-2-00-00-25\" : false, \"c-2-00-00-03\" : false, \"c-2-00-00-26\" : false, \"c-2-00-00-04\" : false, \"c-2-00-00-23\" : false, \"c-2-00-00-01\" : false, \"c-2-00-00-24\" : false, \"c-2-00-00-02\" : false, \"c-2-00-00-21\" : false, \"c-2-00-00-22\" : false, \"c-2-00-00-00\" : false, \"c-2-00-00-20\" : false, \"c-2-00-00-0-a\" : false }, \"traffic-shaping-pac\" : { \"codirectional\" : false, \"sched-config\" : \"sched-config\", \"queue-config-list\" : [ { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 }, { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] }, \"mac-length\" : 7, \"csf-report\" : false, \"filter-config-snk\" : [ \"filter-config-snk\", \"filter-config-snk\" ], \"pll-thr\" : 9, \"csf-config\" : \"DISABLED\", \"is-ssf-reported\" : false, \"collector-max-delay\" : 3, \"auxiliary-function-position-sequence\" : [ 2, 2 ], \"traffic-conditioning-pac\" : { \"codirectional\" : false, \"cond-config-list\" : [ { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 }, { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] } }, \"partner-system-priority\" : 0, \"partner-oper-key\" : 6, \"actor-system-priority\" : 1, \"actor-oper-key\" : 5, \"data-rate\" : 5, \"actor-system-id\" : \"actor-system-id\", \"partner-system-id\" : \"partner-system-id\" }", TapiEthEthCtpPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthCtpPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthCtpPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthTerminationCommonPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthTermEthTerminationCommonPacGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthTerminationCommonPac>(objectMapper.readValue("{ \"filter-config-1\" : [ \"filter-config-1\", \"filter-config-1\" ], \"ether-type\" : \"C_Tag\", \"priority-code-point-config\" : \"8P0D\", \"frametype-config\" : \"ADMIT_ONLY_VLAN_TAGGED_FRAMES\", \"port-vid\" : \"1\", \"priority-regenerate\" : { \"priority-0\" : 6, \"priority-1\" : 7, \"priority-2\" : 1, \"priority-3\" : 4, \"priority-4\" : 5, \"priority-5\" : 9, \"priority-6\" : 9, \"priority-7\" : 6 } }", TapiEthEthTerminationCommonPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthTerminationCommonPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthTerminationCommonPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthPriorityMapping> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthTermEthTerminationCommonPacPriorityRegenerateGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthPriorityMapping>(objectMapper.readValue("{ \"priority-0\" : 6, \"priority-1\" : 7, \"priority-2\" : 1, \"priority-3\" : 4, \"priority-4\" : 5, \"priority-5\" : 9, \"priority-6\" : 9, \"priority-7\" : 6 }", TapiEthPriorityMapping.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthPriorityMapping>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthPriorityMapping>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthTerminationPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthTermGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthTerminationPac>(objectMapper.readValue("{ \"eth-termination-common-pac\" : { \"filter-config-1\" : [ \"filter-config-1\", \"filter-config-1\" ], \"ether-type\" : \"C_Tag\", \"priority-code-point-config\" : \"8P0D\", \"frametype-config\" : \"ADMIT_ONLY_VLAN_TAGGED_FRAMES\", \"port-vid\" : \"1\", \"priority-regenerate\" : { \"priority-0\" : 6, \"priority-1\" : 7, \"priority-2\" : 1, \"priority-3\" : 4, \"priority-4\" : 5, \"priority-5\" : 9, \"priority-6\" : 9, \"priority-7\" : 6 } } }", TapiEthEthTerminationPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthTerminationPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthTerminationPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEtyTerminationCommonPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEtyTermEtyTerminationCommonPacGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEtyTerminationCommonPac>(objectMapper.readValue("{ \"is-fts-enabled\" : false, \"is-tx-pause-enabled\" : false }", TapiEthEtyTerminationCommonPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEtyTerminationCommonPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEtyTerminationCommonPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEtyTerminationPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEtyTermGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEtyTerminationPac>(objectMapper.readValue("", TapiEthEtyTerminationPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEtyTerminationPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEtyTerminationPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiEthEthConnectionEndPointSpec> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiEthEthConnectionEndPointSpec>(objectMapper.readValue("{ \"eth-term\" : { \"eth-termination-common-pac\" : { \"filter-config-1\" : [ \"filter-config-1\", \"filter-config-1\" ], \"ether-type\" : \"C_Tag\", \"priority-code-point-config\" : \"8P0D\", \"frametype-config\" : \"ADMIT_ONLY_VLAN_TAGGED_FRAMES\", \"port-vid\" : \"1\", \"priority-regenerate\" : { \"priority-0\" : 6, \"priority-1\" : 7, \"priority-2\" : 1, \"priority-3\" : 4, \"priority-4\" : 5, \"priority-5\" : 9, \"priority-6\" : 9, \"priority-7\" : 6 } } }, \"ety-term\" : \"\", \"eth-ctp\" : { \"eth-ctp-common-pac\" : { \"vlan-config\" : 0, \"csf-rdi-fdi-enable\" : false, \"filter-config\" : { \"c-2-00-00-2-a\" : false, \"c-2-00-00-0-c\" : false, \"c-2-00-00-0-b\" : false, \"c-2-00-00-2-c\" : false, \"c-2-00-00-0-e\" : false, \"c-2-00-00-2-b\" : false, \"c-2-00-00-0-d\" : false, \"c-2-00-00-2-e\" : false, \"c-2-00-00-2-d\" : false, \"c-2-00-00-0-f\" : false, \"c-2-00-00-2-f\" : false, \"c-2-00-00-10\" : false, \"c-2-00-00-09\" : false, \"c-2-00-00-29\" : false, \"c-2-00-00-07\" : false, \"c-2-00-00-08\" : false, \"c-2-00-00-27\" : false, \"c-2-00-00-05\" : false, \"c-2-00-00-28\" : false, \"c-2-00-00-06\" : false, \"c-2-00-00-25\" : false, \"c-2-00-00-03\" : false, \"c-2-00-00-26\" : false, \"c-2-00-00-04\" : false, \"c-2-00-00-23\" : false, \"c-2-00-00-01\" : false, \"c-2-00-00-24\" : false, \"c-2-00-00-02\" : false, \"c-2-00-00-21\" : false, \"c-2-00-00-22\" : false, \"c-2-00-00-00\" : false, \"c-2-00-00-20\" : false, \"c-2-00-00-0-a\" : false }, \"traffic-shaping-pac\" : { \"codirectional\" : false, \"sched-config\" : \"sched-config\", \"queue-config-list\" : [ { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 }, { \"queue-threshold\" : 6, \"queue-id\" : 1, \"queue-depth\" : 5 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] }, \"mac-length\" : 7, \"csf-report\" : false, \"filter-config-snk\" : [ \"filter-config-snk\", \"filter-config-snk\" ], \"pll-thr\" : 9, \"csf-config\" : \"DISABLED\", \"is-ssf-reported\" : false, \"collector-max-delay\" : 3, \"auxiliary-function-position-sequence\" : [ 2, 2 ], \"traffic-conditioning-pac\" : { \"codirectional\" : false, \"cond-config-list\" : [ { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 }, { \"queue-id\" : 4, \"coupling-flag\" : false, \"cbs\" : 7, \"ebs\" : 1, \"colour-mode\" : \"COLOUR_BLIND\", \"cir\" : 1, \"eir\" : 1 } ], \"prio-config-list\" : [ { \"queue-id\" : 2, \"priority\" : 5 }, { \"queue-id\" : 2, \"priority\" : 5 } ] } }, \"partner-system-priority\" : 0, \"partner-oper-key\" : 6, \"actor-system-priority\" : 1, \"actor-oper-key\" : 5, \"data-rate\" : 5, \"actor-system-id\" : \"actor-system-id\", \"partner-system-id\" : \"partner-system-id\" } }", TapiEthEthConnectionEndPointSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiEthEthConnectionEndPointSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiEthEthConnectionEndPointSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityCeplistConnectionEndPoint> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityCeplistConnectionEndPoint>(objectMapper.readValue("", TapiConnectivityCeplistConnectionEndPoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityCeplistConnectionEndPoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityCeplistConnectionEndPoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaMediaChannelConnectionEndPointSpec> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaMediaChannelConnectionEndPointSpec>(objectMapper.readValue("{ \"media-channel\" : { \"measured-power-egress\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"occupied-spectrum\" : { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, \"measured-power-ingress\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" } } }", TapiPhotonicMediaMediaChannelConnectionEndPointSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaMediaChannelConnectionEndPointSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaMediaChannelConnectionEndPointSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaMediaChannelPropertiesPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaMediaChannelPropertiesPac>(objectMapper.readValue("{ \"measured-power-egress\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"occupied-spectrum\" : { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, \"measured-power-ingress\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" } }", TapiPhotonicMediaMediaChannelPropertiesPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaMediaChannelPropertiesPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaMediaChannelPropertiesPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelMeasuredPowerEgressGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelMeasuredPowerIngressGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelOccupiedSpectrumFrequencyConstraintGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaSpectrumBand> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelOccupiedSpectrumGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(objectMapper.readValue("{ \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }", TapiPhotonicMediaSpectrumBand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamMepMipList> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMepMipListGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamMepMipList>(objectMapper.readValue("{ \"mip\" : [ \"\", \"\" ], \"mep\" : [ \"\", \"\" ] }", TapiOamMepMipList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamMepMipList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamMepMipList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamMepRef> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMepMipListMepmegUuidmepLocalIdGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid,@ApiParam(value = "Id of mep",required=true) @PathVariable("meg-uuid") String megUuid,@ApiParam(value = "Id of mep",required=true) @PathVariable("mep-local-id") String mepLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamMepRef>(objectMapper.readValue("", TapiOamMepRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamMepRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamMepRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamMipRef> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMepMipListMipmegUuidmipLocalIdGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid,@ApiParam(value = "Id of mip",required=true) @PathVariable("meg-uuid") String megUuid,@ApiParam(value = "Id of mip",required=true) @PathVariable("mip-local-id") String mipLocalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamMipRef>(objectMapper.readValue("", TapiOamMipRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamMipRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamMipRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidNamevalueNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiAssemblyConnectionEndPointSpecGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec>(objectMapper.readValue("{ \"otsi-adapter\" : { \"number-of-otsi\" : 7, \"fec-parameters\" : { \"uncorrectable-bytes\" : 0, \"corrected-bits\" : 6, \"pre-fec-ber\" : 1, \"uncorrectable-bits\" : 5, \"corrected-bytes\" : 5, \"post-fec-ber\" : 2 } } }", TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFecProperties> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiAssemblyConnectionEndPointSpecOtsiAdapterFecParametersGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFecProperties>(objectMapper.readValue("{ \"uncorrectable-bytes\" : 0, \"corrected-bits\" : 6, \"pre-fec-ber\" : 1, \"uncorrectable-bits\" : 5, \"corrected-bytes\" : 5, \"post-fec-ber\" : 2 }", TapiPhotonicMediaFecProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFecProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFecProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaOtsiServerAdaptationPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiAssemblyConnectionEndPointSpecOtsiAdapterGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaOtsiServerAdaptationPac>(objectMapper.readValue("{ \"number-of-otsi\" : 7, \"fec-parameters\" : { \"uncorrectable-bytes\" : 0, \"corrected-bits\" : 6, \"pre-fec-ber\" : 1, \"uncorrectable-bits\" : 5, \"corrected-bytes\" : 5, \"post-fec-ber\" : 2 } }", TapiPhotonicMediaOtsiServerAdaptationPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaOtsiServerAdaptationPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaOtsiServerAdaptationPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaOtsiConnectionEndPointSpec> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaOtsiConnectionEndPointSpec>(objectMapper.readValue("{ \"otsi-termination\" : { \"selected-application-identifier\" : { \"application-identifier-type\" : \"PROPRIETARY\", \"application-code\" : \"application-code\" }, \"received-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"selected-central-frequency\" : { \"central-frequency\" : 0, \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" } }, \"transmited-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"selected-modulation\" : \"RZ\", \"laser-properties\" : { \"laser-application-type\" : \"PUMP\", \"laser-status\" : \"ON\", \"laser-bias-current\" : \"laser-bias-current\", \"laser-temperature\" : \"laser-temperature\" }, \"selected-spectrum\" : { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } } }", TapiPhotonicMediaOtsiConnectionEndPointSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaOtsiConnectionEndPointSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaOtsiConnectionEndPointSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaOtsiTerminationPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaOtsiTerminationPac>(objectMapper.readValue("{ \"selected-application-identifier\" : { \"application-identifier-type\" : \"PROPRIETARY\", \"application-code\" : \"application-code\" }, \"received-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"selected-central-frequency\" : { \"central-frequency\" : 0, \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" } }, \"transmited-power\" : { \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }, \"selected-modulation\" : \"RZ\", \"laser-properties\" : { \"laser-application-type\" : \"PUMP\", \"laser-status\" : \"ON\", \"laser-bias-current\" : \"laser-bias-current\", \"laser-temperature\" : \"laser-temperature\" }, \"selected-spectrum\" : { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } }", TapiPhotonicMediaOtsiTerminationPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaOtsiTerminationPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaOtsiTerminationPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaLaserProperties> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationLaserPropertiesGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaLaserProperties>(objectMapper.readValue("{ \"laser-application-type\" : \"PUMP\", \"laser-status\" : \"ON\", \"laser-bias-current\" : \"laser-bias-current\", \"laser-temperature\" : \"laser-temperature\" }", TapiPhotonicMediaLaserProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaLaserProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaLaserProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationReceivedPowerGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaApplicationIdentifier> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedApplicationIdentifierGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaApplicationIdentifier>(objectMapper.readValue("{ \"application-identifier-type\" : \"PROPRIETARY\", \"application-code\" : \"application-code\" }", TapiPhotonicMediaApplicationIdentifier.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaApplicationIdentifier>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaApplicationIdentifier>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedCentralFrequencyFrequencyConstraintGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaCentralFrequency> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedCentralFrequencyGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaCentralFrequency>(objectMapper.readValue("{ \"central-frequency\" : 0, \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" } }", TapiPhotonicMediaCentralFrequency.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaCentralFrequency>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaCentralFrequency>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedSpectrumFrequencyConstraintGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaSpectrumBand> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedSpectrumGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(objectMapper.readValue("{ \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }", TapiPhotonicMediaSpectrumBand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaPowerProperties> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationTransmitedPowerGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(objectMapper.readValue("{ \"power-spectral-density\" : \"power-spectral-density\", \"total-power\" : \"total-power\" }", TapiPhotonicMediaPowerProperties.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaPowerProperties>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNodeEdgePointRef> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidParentNodeEdgePointGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of connection-end-point",required=true) @PathVariable("connection-end-point-uuid") String connectionEndPointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(objectMapper.readValue("", TapiTopologyNodeEdgePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList>(objectMapper.readValue("", TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNodeNodeEdgePoint> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeNodeEdgePoint>(objectMapper.readValue("", TapiTopologyNodeNodeEdgePoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeNodeEdgePoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeNodeEdgePoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonServiceInterfacePointRef> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMappedServiceInterfacePointserviceInterfacePointUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of mapped-service-interface-point",required=true) @PathVariable("service-interface-point-uuid") String serviceInterfacePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(objectMapper.readValue("{ \"service-interface-point-uuid\" : \"service-interface-point-uuid\" }", TapiCommonServiceInterfacePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaMediaChannelNodeEdgePointSpec> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaMediaChannelNodeEdgePointSpec>(objectMapper.readValue("{ \"mc-pool\" : { \"supportable-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ], \"available-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ], \"occupied-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ] } }", TapiPhotonicMediaMediaChannelNodeEdgePointSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaMediaChannelNodeEdgePointSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaMediaChannelNodeEdgePointSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of available-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of available-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaSpectrumBand> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of available-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of available-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(objectMapper.readValue("{ \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }", TapiPhotonicMediaSpectrumBand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaMediaChannelPoolCapabilityPac> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaMediaChannelPoolCapabilityPac>(objectMapper.readValue("{ \"supportable-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ], \"available-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ], \"occupied-spectrum\" : [ { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }, { \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 } ] }", TapiPhotonicMediaMediaChannelPoolCapabilityPac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaMediaChannelPoolCapabilityPac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaMediaChannelPoolCapabilityPac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of occupied-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of occupied-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaSpectrumBand> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of occupied-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of occupied-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(objectMapper.readValue("{ \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }", TapiPhotonicMediaSpectrumBand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaFrequencyConstraint> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of supportable-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of supportable-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(objectMapper.readValue("{ \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }", TapiPhotonicMediaFrequencyConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaFrequencyConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPhotonicMediaSpectrumBand> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of supportable-spectrum",required=true) @PathVariable("upper-frequency") Integer upperFrequency,@ApiParam(value = "Id of supportable-spectrum",required=true) @PathVariable("lower-frequency") Integer lowerFrequency) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(objectMapper.readValue("{ \"frequency-constraint\" : { \"grid-type\" : \"DWDM\", \"adjustment-granularity\" : \"G_100GHZ\" }, \"lower-frequency\" : 0, \"upper-frequency\" : 6 }", TapiPhotonicMediaSpectrumBand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPhotonicMediaSpectrumBand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidNamevalueNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidTotalPotentialCapacityGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidTotalPotentialCapacityTotalSizeGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidAvailableCapacityGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidAvailableCapacityTotalSizeGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNodeRuleGroupRef> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidComposedRuleGrouptopologyUuidcomposedRuleGroupNodeUuidcomposedRuleGroupNodeRuleGroupUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of composed-rule-group",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of composed-rule-group",required=true) @PathVariable("composed-rule-group-node-uuid") String composedRuleGroupNodeUuid,@ApiParam(value = "Id of composed-rule-group",required=true) @PathVariable("composed-rule-group-node-rule-group-uuid") String composedRuleGroupNodeRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeRuleGroupRef>(objectMapper.readValue("", TapiTopologyNodeRuleGroupRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeRuleGroupRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeRuleGroupRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyCostCharacteristic> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidCostCharacteristiccostNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyCostCharacteristic>(objectMapper.readValue("{ \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" }", TapiTopologyCostCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNodeRuleGroup> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeRuleGroup>(objectMapper.readValue("", TapiTopologyNodeRuleGroup.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeRuleGroup>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeRuleGroup>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNodeRuleGroupRef> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidAssociatedNodeRuleGrouptopologyUuidassociatedNodeRuleGroupNodeUuidassociatedNodeRuleGroupNodeRuleGroupUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid,@ApiParam(value = "Id of associated-node-rule-group",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of associated-node-rule-group",required=true) @PathVariable("associated-node-rule-group-node-uuid") String associatedNodeRuleGroupNodeUuid,@ApiParam(value = "Id of associated-node-rule-group",required=true) @PathVariable("associated-node-rule-group-node-rule-group-uuid") String associatedNodeRuleGroupNodeRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeRuleGroupRef>(objectMapper.readValue("", TapiTopologyNodeRuleGroupRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeRuleGroupRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeRuleGroupRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidAvailableCapacityGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidAvailableCapacityTotalSizeGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyCostCharacteristic> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidCostCharacteristiccostNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyCostCharacteristic>(objectMapper.readValue("{ \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" }", TapiTopologyCostCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyInterRuleGroup> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyInterRuleGroup>(objectMapper.readValue("", TapiTopologyInterRuleGroup.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyInterRuleGroup>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyInterRuleGroup>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyLatencyCharacteristic> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidLatencyCharacteristictrafficPropertyNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(objectMapper.readValue("{ \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" }", TapiTopologyLatencyCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidNamevalueNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyRiskCharacteristic> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidRiskCharacteristicriskCharacteristicNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid,@ApiParam(value = "Id of risk-characteristic",required=true) @PathVariable("risk-characteristic-name") String riskCharacteristicName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(objectMapper.readValue("{ \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] }", TapiTopologyRiskCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyRule> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidRulelocalIdGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid,@ApiParam(value = "Id of rule",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyRule>(objectMapper.readValue("", TapiTopologyRule.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyRule>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyRule>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidRulelocalIdNamevalueNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid,@ApiParam(value = "Id of rule",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidTotalPotentialCapacityGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidTotalPotentialCapacityTotalSizeGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of inter-rule-group",required=true) @PathVariable("inter-rule-group-uuid") String interRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyLatencyCharacteristic> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidLatencyCharacteristictrafficPropertyNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(objectMapper.readValue("{ \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" }", TapiTopologyLatencyCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidNamevalueNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyNodeEdgePointRef> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidNodeEdgePointtopologyUuidnodeEdgePointNodeUuidnodeEdgePointUuidGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("topology-uuid") String topologyUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-node-uuid") String nodeEdgePointNodeUuid,@ApiParam(value = "Id of node-edge-point",required=true) @PathVariable("node-edge-point-uuid") String nodeEdgePointUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(objectMapper.readValue("", TapiTopologyNodeEdgePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyNodeEdgePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyRiskCharacteristic> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidRiskCharacteristicriskCharacteristicNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of risk-characteristic",required=true) @PathVariable("risk-characteristic-name") String riskCharacteristicName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(objectMapper.readValue("{ \"risk-characteristic-name\" : \"risk-characteristic-name\", \"risk-identifier-list\" : [ \"risk-identifier-list\", \"risk-identifier-list\" ] }", TapiTopologyRiskCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyRiskCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyRule> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidRulelocalIdGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of rule",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyRule>(objectMapper.readValue("", TapiTopologyRule.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyRule>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyRule>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidRulelocalIdNamevalueNameGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid,@ApiParam(value = "Id of rule",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidTotalPotentialCapacityGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidTotalPotentialCapacityTotalSizeGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid,@ApiParam(value = "Id of node-rule-group",required=true) @PathVariable("node-rule-group-uuid") String nodeRuleGroupUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextTopologyContextTopologyuuidNodenodeUuidTotalPotentialCapacityGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextTopologyContextTopologyuuidNodenodeUuidTotalPotentialCapacityTotalSizeGet(@ApiParam(value = "Id of topology",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of node",required=true) @PathVariable("node-uuid") String nodeUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextDelete() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiVirtualNetworkVirtualNetworkContext> dataContextVirtualNetworkContextGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiVirtualNetworkVirtualNetworkContext>(objectMapper.readValue("{ \"virtual-nw-service\" : [ \"\", \"\" ] }", TapiVirtualNetworkVirtualNetworkContext.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiVirtualNetworkVirtualNetworkContext>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiVirtualNetworkVirtualNetworkContext>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextPost(@ApiParam(value = "tapi.virtual.network.VirtualNetworkContext to be added to list"  )  @Valid @RequestBody TapiVirtualNetworkVirtualNetworkContext body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextPut(@ApiParam(value = "tapi.virtual.network.VirtualNetworkContext to be added or updated"  )  @Valid @RequestBody TapiVirtualNetworkVirtualNetworkContext body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServicePost(@ApiParam(value = "tapi.virtual.network.VirtualNetworkService to be added to list"  )  @Valid @RequestBody TapiVirtualNetworkVirtualNetworkService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointPost(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.virtual.network.VirtualNetworkServiceEndPoint to be added to list"  )  @Valid @RequestBody TapiVirtualNetworkVirtualNetworkServiceEndPoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiVirtualNetworkVirtualNetworkServiceEndPoint> dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiVirtualNetworkVirtualNetworkServiceEndPoint>(objectMapper.readValue("", TapiVirtualNetworkVirtualNetworkServiceEndPoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiVirtualNetworkVirtualNetworkServiceEndPoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiVirtualNetworkVirtualNetworkServiceEndPoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamePost(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamevalueNameDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamevalueNameGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamevalueNamePut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdPut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.virtual.network.VirtualNetworkServiceEndPoint to be added or updated"  )  @Valid @RequestBody TapiVirtualNetworkVirtualNetworkServiceEndPoint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonServiceInterfacePointRef> dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdServiceInterfacePointGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of end-point",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(objectMapper.readValue("{ \"service-interface-point-uuid\" : \"service-interface-point-uuid\" }", TapiCommonServiceInterfacePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiVirtualNetworkVirtualNetworkService> dataContextVirtualNetworkContextVirtualNwServiceuuidGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiVirtualNetworkVirtualNetworkService>(objectMapper.readValue("", TapiVirtualNetworkVirtualNetworkService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiVirtualNetworkVirtualNetworkService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiVirtualNetworkVirtualNetworkService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidNamePost(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidNamevalueNameDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextVirtualNetworkContextVirtualNwServiceuuidNamevalueNameGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidNamevalueNamePut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidPut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.virtual.network.VirtualNetworkService to be added or updated"  )  @Valid @RequestBody TapiVirtualNetworkVirtualNetworkService body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidScheduleDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonTimeRange> dataContextVirtualNetworkContextVirtualNwServiceuuidScheduleGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonTimeRange>(objectMapper.readValue("{ \"start-time\" : \"start-time\", \"end-time\" : \"end-time\" }", TapiCommonTimeRange.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonTimeRange>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonTimeRange>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidSchedulePost(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.TimeRange to be added to list"  )  @Valid @RequestBody TapiCommonTimeRange body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidSchedulePut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.TimeRange to be added or updated"  )  @Valid @RequestBody TapiCommonTimeRange body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidStateDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonAdminStatePac> dataContextVirtualNetworkContextVirtualNwServiceuuidStateGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonAdminStatePac>(objectMapper.readValue("{ \"operational-state\" : \"DISABLED\", \"lifecycle-state\" : \"PLANNED\", \"administrative-state\" : \"LOCKED\" }", TapiCommonAdminStatePac.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonAdminStatePac>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonAdminStatePac>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidStatePost(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.AdminStatePac to be added to list"  )  @Valid @RequestBody TapiCommonAdminStatePac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidStatePut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.common.AdminStatePac to be added or updated"  )  @Valid @RequestBody TapiCommonAdminStatePac body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyTopologyRef> dataContextVirtualNetworkContextVirtualNwServiceuuidTopologyGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyTopologyRef>(objectMapper.readValue("{ \"topology-uuid\" : \"topology-uuid\" }", TapiTopologyTopologyRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyTopologyRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyTopologyRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintPost(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "tapi.virtual.network.VirtualNetworkConstraint to be added to list"  )  @Valid @RequestBody TapiVirtualNetworkVirtualNetworkConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristicPost(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.topology.CostCharacteristic to be added to list"  )  @Valid @RequestBody TapiTopologyCostCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristiccostNameDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyCostCharacteristic> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristiccostNameGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyCostCharacteristic>(objectMapper.readValue("{ \"cost-value\" : \"cost-value\", \"cost-algorithm\" : \"cost-algorithm\", \"cost-name\" : \"cost-name\" }", TapiTopologyCostCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyCostCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristiccostNamePut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of cost-characteristic",required=true) @PathVariable("cost-name") String costName,@ApiParam(value = "tapi.topology.CostCharacteristic to be added or updated"  )  @Valid @RequestBody TapiTopologyCostCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiVirtualNetworkVirtualNwServiceRef> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdDiversityExclusionvirtualNwServiceUuidGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of diversity-exclusion",required=true) @PathVariable("virtual-nw-service-uuid") String virtualNwServiceUuid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiVirtualNetworkVirtualNwServiceRef>(objectMapper.readValue("{ \"virtual-nw-service-uuid\" : \"virtual-nw-service-uuid\" }", TapiVirtualNetworkVirtualNwServiceRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiVirtualNetworkVirtualNwServiceRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiVirtualNetworkVirtualNwServiceRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiVirtualNetworkVirtualNetworkConstraint> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiVirtualNetworkVirtualNetworkConstraint>(objectMapper.readValue("", TapiVirtualNetworkVirtualNetworkConstraint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiVirtualNetworkVirtualNetworkConstraint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiVirtualNetworkVirtualNetworkConstraint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristicPost(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.topology.LatencyCharacteristic to be added to list"  )  @Valid @RequestBody TapiTopologyLatencyCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristictrafficPropertyNameDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyLatencyCharacteristic> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristictrafficPropertyNameGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(objectMapper.readValue("{ \"traffic-property-name\" : \"traffic-property-name\", \"fixed-latency-characteristic\" : \"fixed-latency-characteristic\", \"wander-characteristic\" : \"wander-characteristic\", \"jitter-characteristic\" : \"jitter-characteristic\", \"queing-latency-characteristic\" : \"queing-latency-characteristic\" }", TapiTopologyLatencyCharacteristic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyLatencyCharacteristic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristictrafficPropertyNamePut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of latency-characteristic",required=true) @PathVariable("traffic-property-name") String trafficPropertyName,@ApiParam(value = "tapi.topology.LatencyCharacteristic to be added or updated"  )  @Valid @RequestBody TapiTopologyLatencyCharacteristic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamePost(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.NameAndValue to be added to list"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamevalueNameDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonNameAndValue> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamevalueNameGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonNameAndValue>(objectMapper.readValue("{ \"value-name\" : \"value-name\", \"value\" : \"value\" }", TapiCommonNameAndValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonNameAndValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamevalueNamePut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "Id of name",required=true) @PathVariable("value-name") String valueName,@ApiParam(value = "tapi.common.NameAndValue to be added or updated"  )  @Valid @RequestBody TapiCommonNameAndValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdPut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.virtual.network.VirtualNetworkConstraint to be added or updated"  )  @Valid @RequestBody TapiVirtualNetworkVirtualNetworkConstraint body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacity> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacity>(objectMapper.readValue("{ \"total-size\" : { \"unit\" : \"TB\", \"value\" : 0 } }", TapiCommonCapacity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityPost(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.Capacity to be added to list"  )  @Valid @RequestBody TapiCommonCapacity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityPut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.Capacity to be added or updated"  )  @Valid @RequestBody TapiCommonCapacity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizeDelete(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonCapacityValue> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizeGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonCapacityValue>(objectMapper.readValue("{ \"unit\" : \"TB\", \"value\" : 0 }", TapiCommonCapacityValue.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonCapacityValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizePost(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.CapacityValue to be added to list"  )  @Valid @RequestBody TapiCommonCapacityValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizePut(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId,@ApiParam(value = "tapi.common.CapacityValue to be added or updated"  )  @Valid @RequestBody TapiCommonCapacityValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonServiceInterfacePointRef> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdSinkServiceEndPointGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(objectMapper.readValue("{ \"service-interface-point-uuid\" : \"service-interface-point-uuid\" }", TapiCommonServiceInterfacePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonServiceInterfacePointRef> dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdSrcServiceEndPointGet(@ApiParam(value = "Id of virtual-nw-service",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "Id of vnw-constraint",required=true) @PathVariable("local-id") String localId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(objectMapper.readValue("{ \"service-interface-point-uuid\" : \"service-interface-point-uuid\" }", TapiCommonServiceInterfacePointRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonServiceInterfacePointRef>(HttpStatus.NOT_IMPLEMENTED);
    }

}
