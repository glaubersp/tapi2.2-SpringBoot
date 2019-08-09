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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataApiControllerIntegrationTest {

    @Autowired
    private DataApi api;

    @Test
    public void dataContextConnectivityContextConnectionuuidBoundingNodeGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiTopologyNodeRef> responseEntity = api.dataContextConnectivityContextConnectionuuidBoundingNodeGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String topologyUuid = "topologyUuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiConnectivityConnectionEndPointRef> responseEntity = api.dataContextConnectivityContextConnectionuuidConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGet(uuid, topologyUuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiConnectivityConnection> responseEntity = api.dataContextConnectivityContextConnectionuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidLowerConnectionconnectionUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String connectionUuid = "connectionUuid_example";
        ResponseEntity<TapiConnectivityConnectionRef> responseEntity = api.dataContextConnectivityContextConnectionuuidLowerConnectionconnectionUuidGet(uuid, connectionUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextConnectivityContextConnectionuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidRoutelocalIdConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String topologyUuid = "topologyUuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiConnectivityConnectionEndPointRef> responseEntity = api.dataContextConnectivityContextConnectionuuidRoutelocalIdConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGet(uuid, localId, topologyUuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidRoutelocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiConnectivityRoute> responseEntity = api.dataContextConnectivityContextConnectionuuidRoutelocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidRoutelocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextConnectivityContextConnectionuuidRoutelocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidSupportedClientLinktopologyUuidlinkUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String topologyUuid = "topologyUuid_example";
        String linkUuid = "linkUuid_example";
        ResponseEntity<TapiTopologyLinkRef> responseEntity = api.dataContextConnectivityContextConnectionuuidSupportedClientLinktopologyUuidlinkUuidGet(uuid, topologyUuid, linkUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String switchControlUuid = "switchControlUuid_example";
        ResponseEntity<TapiConnectivitySwitchControl> responseEntity = api.dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidGet(uuid, switchControlUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String switchControlUuid = "switchControlUuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidNamevalueNameGet(uuid, switchControlUuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSubSwitchControlconnectionUuidsubSwitchControlSwitchControlUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String switchControlUuid = "switchControlUuid_example";
        String connectionUuid = "connectionUuid_example";
        String subSwitchControlSwitchControlUuid = "subSwitchControlSwitchControlUuid_example";
        ResponseEntity<TapiConnectivitySwitchControlRef> responseEntity = api.dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSubSwitchControlconnectionUuidsubSwitchControlSwitchControlUuidGet(uuid, switchControlUuid, connectionUuid, subSwitchControlSwitchControlUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String switchControlUuid = "switchControlUuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiConnectivitySwitch> responseEntity = api.dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdGet(uuid, switchControlUuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String switchControlUuid = "switchControlUuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdNamevalueNameGet(uuid, switchControlUuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdSelectedConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String switchControlUuid = "switchControlUuid_example";
        String localId = "localId_example";
        String topologyUuid = "topologyUuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiConnectivityConnectionEndPointRef> responseEntity = api.dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdSelectedConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGet(uuid, switchControlUuid, localId, topologyUuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdSelectedRouteconnectionUuidrouteLocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String switchControlUuid = "switchControlUuid_example";
        String localId = "localId_example";
        String connectionUuid = "connectionUuid_example";
        String routeLocalId = "routeLocalId_example";
        ResponseEntity<TapiConnectivityRouteRef> responseEntity = api.dataContextConnectivityContextConnectionuuidSwitchControlswitchControlUuidSwitchlocalIdSelectedRouteconnectionUuidrouteLocalIdGet(uuid, switchControlUuid, localId, connectionUuid, routeLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServicePostTest() throws Exception {
        TapiConnectivityConnectivitycontextConnectivityService body = new TapiConnectivityConnectivitycontextConnectivityService();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectionconnectionUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String connectionUuid = "connectionUuid_example";
        ResponseEntity<TapiConnectivityConnectionRef> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectionconnectionUuidGet(uuid, connectionUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiConnectivityConnectivityServiceRef> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiConnectivityConnectivityServiceRef body = new TapiConnectivityConnectivityServiceRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiConnectivityConnectivityServiceRef body = new TapiConnectivityConnectivityServiceRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintCorouteInclusionPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiConnectivityConnectivityServiceRef body = new TapiConnectivityConnectivityServiceRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionconnectivityServiceUuidDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String connectivityServiceUuid = "connectivityServiceUuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionconnectivityServiceUuidDelete(uuid, connectivityServiceUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionconnectivityServiceUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String connectivityServiceUuid = "connectivityServiceUuid_example";
        ResponseEntity<TapiConnectivityConnectivityServiceRef> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionconnectivityServiceUuidGet(uuid, connectivityServiceUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionconnectivityServiceUuidPutTest() throws Exception {
        String uuid = "uuid_example";
        String connectivityServiceUuid = "connectivityServiceUuid_example";
        TapiConnectivityConnectivityServiceRef body = new TapiConnectivityConnectivityServiceRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintDiversityExclusionconnectivityServiceUuidPut(uuid, connectivityServiceUuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiConnectivityConnectivityConstraint> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiConnectivityConnectivityConstraint body = new TapiConnectivityConnectivityConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiConnectivityConnectivityConstraint body = new TapiConnectivityConnectivityConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonCapacity body = new TapiCommonCapacity();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonCapacity body = new TapiCommonCapacity();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizeDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizeDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizeGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonCapacityValue body = new TapiCommonCapacityValue();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonCapacityValue body = new TapiCommonCapacityValue();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintRequestedCapacityTotalSizePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintScheduleDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintScheduleDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintScheduleGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiCommonTimeRange> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintScheduleGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintSchedulePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonTimeRange body = new TapiCommonTimeRange();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintSchedulePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintSchedulePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonTimeRange body = new TapiCommonTimeRange();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidConnectivityConstraintSchedulePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiConnectivityConnectivityServiceEndPoint body = new TapiConnectivityConnectivityServiceEndPoint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacity body = new TapiCommonCapacity();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacity body = new TapiCommonCapacity();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizeDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizeDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizeGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacityValue body = new TapiCommonCapacityValue();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacityValue body = new TapiCommonCapacityValue();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdCapacityTotalSizePut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String topologyUuid = "topologyUuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiConnectivityConnectionEndPointRef> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdConnectionEndPointtopologyUuidnodeUuidnodeEdgePointUuidconnectionEndPointUuidGet(uuid, localId, topologyUuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthControlFrameFilter> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthControlFrameFilter body = new TapiEthControlFrameFilter();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthControlFrameFilter body = new TapiEthControlFrameFilter();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacFilterConfigPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthCtpCommonPac> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthCtpCommonPac body = new TapiEthEthCtpCommonPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthCtpCommonPac body = new TapiEthEthCtpCommonPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthTrafficConditioningConfiguration body = new TapiEthTrafficConditioningConfiguration();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdDelete(uuid, localId, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        ResponseEntity<TapiEthTrafficConditioningConfiguration> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdGet(uuid, localId, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        TapiEthTrafficConditioningConfiguration body = new TapiEthTrafficConditioningConfiguration();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdPut(uuid, localId, queueId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthTrafficConditioningPac> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthTrafficConditioningPac body = new TapiEthTrafficConditioningPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthPriorityConfiguration body = new TapiEthPriorityConfiguration();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdDelete(uuid, localId, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        ResponseEntity<TapiEthPriorityConfiguration> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdGet(uuid, localId, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        TapiEthPriorityConfiguration body = new TapiEthPriorityConfiguration();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdPut(uuid, localId, queueId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthTrafficConditioningPac body = new TapiEthTrafficConditioningPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficConditioningPacPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthTrafficShapingPac> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthTrafficShapingPac body = new TapiEthTrafficShapingPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthPriorityConfiguration body = new TapiEthPriorityConfiguration();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdDelete(uuid, localId, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        ResponseEntity<TapiEthPriorityConfiguration> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdGet(uuid, localId, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        TapiEthPriorityConfiguration body = new TapiEthPriorityConfiguration();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdPut(uuid, localId, queueId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthTrafficShapingPac body = new TapiEthTrafficShapingPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthQueueConfiguration body = new TapiEthQueueConfiguration();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdDelete(uuid, localId, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        ResponseEntity<TapiEthQueueConfiguration> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdGet(uuid, localId, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer queueId = 56;
        TapiEthQueueConfiguration body = new TapiEthQueueConfiguration();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdPut(uuid, localId, queueId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthTerminationCommonPac> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthTerminationCommonPac body = new TapiEthEthTerminationCommonPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegenerateDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegenerateDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegenerateGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthPriorityMapping> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegenerateGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegeneratePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthPriorityMapping body = new TapiEthPriorityMapping();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegeneratePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegeneratePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthPriorityMapping body = new TapiEthPriorityMapping();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPriorityRegeneratePut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthTerminationCommonPac body = new TapiEthEthTerminationCommonPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEthTerminationCommonPacPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEtyTerminationCommonPac> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEtyTerminationCommonPac body = new TapiEthEtyTerminationCommonPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEtyTerminationCommonPac body = new TapiEthEtyTerminationCommonPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecEtyTerminationCommonPacPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthConnectivityServiceEndPointSpec> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthConnectivityServiceEndPointSpec body = new TapiEthEthConnectivityServiceEndPointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthConnectivityServiceEndPointSpec body = new TapiEthEthConnectivityServiceEndPointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdEthConnectivityServiceEndPointSpecPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiConnectivityConnectivityServiceEndPoint> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaMediaChannelConfigPac> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaMediaChannelConfigPac body = new TapiPhotonicMediaMediaChannelConfigPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaMediaChannelConfigPac body = new TapiPhotonicMediaMediaChannelConfigPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaFrequencyConstraint body = new TapiPhotonicMediaFrequencyConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaFrequencyConstraint body = new TapiPhotonicMediaFrequencyConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumFrequencyConstraintPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaSpectrumBand> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaSpectrumBand body = new TapiPhotonicMediaSpectrumBand();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaSpectrumBand body = new TapiPhotonicMediaSpectrumBand();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecMcConfigSpectrumPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec body = new TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMaximumInputPowerPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigExpectedMinimumInputPowerPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaPowerManagementConfigPac> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMaximumOutputPowerPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigIntendedMinimumOutputPowerPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerManagementConfigPac body = new TapiPhotonicMediaPowerManagementConfigPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerManagementConfigPac body = new TapiPhotonicMediaPowerManagementConfigPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPowerManagementConfigPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec body = new TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdMediaChannelConnectivityServiceEndPointSpecPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamevalueNameDelete(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdNamevalueNamePut(uuid, localId, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaApplicationIdentifier> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaApplicationIdentifier body = new TapiPhotonicMediaApplicationIdentifier();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaApplicationIdentifier body = new TapiPhotonicMediaApplicationIdentifier();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigApplicationIdentifierPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaFrequencyConstraint body = new TapiPhotonicMediaFrequencyConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaFrequencyConstraint body = new TapiPhotonicMediaFrequencyConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyFrequencyConstraintPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaCentralFrequency> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaCentralFrequency body = new TapiPhotonicMediaCentralFrequency();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaCentralFrequency body = new TapiPhotonicMediaCentralFrequency();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigCentralFrequencyPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaOtsiTerminationConfigPac> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaOtsiTerminationConfigPac body = new TapiPhotonicMediaOtsiTerminationConfigPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaOtsiTerminationConfigPac body = new TapiPhotonicMediaOtsiTerminationConfigPac();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaFrequencyConstraint body = new TapiPhotonicMediaFrequencyConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaFrequencyConstraint body = new TapiPhotonicMediaFrequencyConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumFrequencyConstraintPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaSpectrumBand> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaSpectrumBand body = new TapiPhotonicMediaSpectrumBand();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaSpectrumBand body = new TapiPhotonicMediaSpectrumBand();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigSpectrumPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecOtsiConfigTransmitPowerPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec body = new TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec body = new TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdOtsiConnectivityServiceEndPointSpecPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiConnectivityConnectivityServiceEndPointRef body = new TapiConnectivityConnectivityServiceEndPointRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiConnectivityConnectivityServiceEndPointRef body = new TapiConnectivityConnectivityServiceEndPointRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPeerFwdConnectivityServiceEndPointPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiConnectivityConnectivityServiceEndPointRef body = new TapiConnectivityConnectivityServiceEndPointRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiConnectivityConnectivityServiceEndPointRef body = new TapiConnectivityConnectivityServiceEndPointRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdProtectingConnectivityServiceEndPointPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiConnectivityConnectivityServiceEndPoint body = new TapiConnectivityConnectivityServiceEndPoint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiConnectivityConnectivityServiceEndPointRef body = new TapiConnectivityConnectivityServiceEndPointRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiConnectivityConnectivityServiceEndPointRef body = new TapiConnectivityConnectivityServiceEndPointRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServerConnectivityServiceEndPointPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonServiceInterfacePointRef> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonServiceInterfacePointRef body = new TapiCommonServiceInterfacePointRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonServiceInterfacePointRef body = new TapiCommonServiceInterfacePointRef();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEndPointlocalIdServiceInterfacePointPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServiceDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServiceDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServiceGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthConnectivityService> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServiceGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServicePostTest() throws Exception {
        String uuid = "uuid_example";
        Object body = null;
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServicePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServicePutTest() throws Exception {
        String uuid = "uuid_example";
        Object body = null;
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidEthConnectivityServicePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiConnectivityConnectivitycontextConnectivityService> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidNamevalueNameDelete(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidNamevalueNamePut(uuid, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiConnectivityConnectivitycontextConnectivityService body = new TapiConnectivityConnectivitycontextConnectivityService();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiConnectivityResilienceConstraint> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiConnectivityResilienceConstraint body = new TapiConnectivityResilienceConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiConnectivityResilienceConstraint body = new TapiConnectivityResilienceConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidResilienceConstraintPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristicPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiTopologyCostCharacteristic body = new TapiTopologyCostCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristicPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristiccostNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String costName = "costName_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristiccostNameDelete(uuid, costName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristiccostNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String costName = "costName_example";
        ResponseEntity<TapiTopologyCostCharacteristic> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristiccostNameGet(uuid, costName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristiccostNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String costName = "costName_example";
        TapiTopologyCostCharacteristic body = new TapiTopologyCostCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintCostCharacteristiccostNamePut(uuid, costName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPathComputationRoutingConstraint> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristicPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiTopologyLatencyCharacteristic body = new TapiTopologyLatencyCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristicPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String trafficPropertyName = "trafficPropertyName_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameDelete(uuid, trafficPropertyName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String trafficPropertyName = "trafficPropertyName_example";
        ResponseEntity<TapiTopologyLatencyCharacteristic> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameGet(uuid, trafficPropertyName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String trafficPropertyName = "trafficPropertyName_example";
        TapiTopologyLatencyCharacteristic body = new TapiTopologyLatencyCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNamePut(uuid, trafficPropertyName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationRoutingConstraint body = new TapiPathComputationRoutingConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationRoutingConstraint body = new TapiPathComputationRoutingConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiTopologyRiskCharacteristic body = new TapiTopologyRiskCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String riskCharacteristicName = "riskCharacteristicName_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameDelete(uuid, riskCharacteristicName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String riskCharacteristicName = "riskCharacteristicName_example";
        ResponseEntity<TapiTopologyRiskCharacteristic> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameGet(uuid, riskCharacteristicName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String riskCharacteristicName = "riskCharacteristicName_example";
        TapiTopologyRiskCharacteristic body = new TapiTopologyRiskCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNamePut(uuid, riskCharacteristicName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationTopologyConstraint body = new TapiPathComputationTopologyConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPathComputationTopologyConstraint> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamevalueNameDelete(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdNamevalueNamePut(uuid, localId, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPathComputationTopologyConstraint body = new TapiPathComputationTopologyConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextConnectivityServiceuuidTopologyConstraintlocalIdPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextDeleteTest() throws Exception {
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextDelete();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextGetTest() throws Exception {
        ResponseEntity<TapiConnectivityContextConnectivityContext> responseEntity = api.dataContextConnectivityContextGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextPostTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextConnectivityContextPutTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.dataContextConnectivityContextPut(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextDeleteTest() throws Exception {
        ResponseEntity<Void> responseEntity = api.dataContextDelete();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextGetTest() throws Exception {
        ResponseEntity<TapiCommonContext> responseEntity = api.dataContextGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNamePostTest() throws Exception {
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextNamePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNamevalueNameDeleteTest() throws Exception {
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextNamevalueNameDelete(valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNamevalueNameGetTest() throws Exception {
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextNamevalueNameGet(valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNamevalueNamePutTest() throws Exception {
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextNamevalueNamePut(valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextDeleteTest() throws Exception {
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextDelete();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextGetTest() throws Exception {
        ResponseEntity<TapiNotificationContextNotificationContext> responseEntity = api.dataContextNotificationContextGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionPostTest() throws Exception {
        TapiNotificationNotificationSubscriptionService body = new TapiNotificationNotificationSubscriptionService();
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiNotificationNotificationSubscriptionService> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidNamevalueNameDelete(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidNamevalueNamePut(uuid, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidNotificationChannelGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiNotificationNotificationChannel> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidNotificationChannelGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidNotificationChannelNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidNotificationChannelNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidAdditionalInfovalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String notificationUuid = "notificationUuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidAdditionalInfovalueNameGet(uuid, notificationUuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidChangedAttributesvalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String notificationUuid = "notificationUuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiNotificationNameAndValueChange> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidChangedAttributesvalueNameGet(uuid, notificationUuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String notificationUuid = "notificationUuid_example";
        ResponseEntity<TapiNotificationNotification> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidGet(uuid, notificationUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String notificationUuid = "notificationUuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidNamevalueNameGet(uuid, notificationUuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidTargetObjectNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String notificationUuid = "notificationUuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidNotificationnotificationUuidTargetObjectNamevalueNameGet(uuid, notificationUuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiNotificationNotificationSubscriptionService body = new TapiNotificationNotificationSubscriptionService();
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiNotificationSubscriptionFilter> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamevalueNameDelete(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterNamevalueNamePut(uuid, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiNotificationSubscriptionFilter body = new TapiNotificationSubscriptionFilter();
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiNotificationSubscriptionFilter body = new TapiNotificationSubscriptionFilter();
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextNotifSubscriptionuuidSubscriptionFilterPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidAdditionalInfovalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextNotificationContextNotificationuuidAdditionalInfovalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidAlarmInfoGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamAlarmInfo> responseEntity = api.dataContextNotificationContextNotificationuuidAlarmInfoGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidChangedAttributesvalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiNotificationNameAndValueChange> responseEntity = api.dataContextNotificationContextNotificationuuidChangedAttributesvalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiNotificationNotificationcontextNotification> responseEntity = api.dataContextNotificationContextNotificationuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextNotificationContextNotificationuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidTargetObjectNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextNotificationContextNotificationuuidTargetObjectNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidTcaInfoGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamTcaInfo> responseEntity = api.dataContextNotificationContextNotificationuuidTcaInfoGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidTcaInfoOamJobGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamOamJobRef> responseEntity = api.dataContextNotificationContextNotificationuuidTcaInfoOamJobGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamThresholdParameter> responseEntity = api.dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterPmParameterAboveThrsGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamPmParameterValue> responseEntity = api.dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterPmParameterAboveThrsGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterPmParameterBelowThrsGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamPmParameterValue> responseEntity = api.dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterPmParameterBelowThrsGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterPmParameterClearThrsGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamPmParameterValue> responseEntity = api.dataContextNotificationContextNotificationuuidTcaInfoThresholdParameterPmParameterClearThrsGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextPostTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextNotificationContextPutTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.dataContextNotificationContextPut(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextDeleteTest() throws Exception {
        ResponseEntity<Void> responseEntity = api.dataContextOamContextDelete();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextGetTest() throws Exception {
        ResponseEntity<TapiOamContextOamContext> responseEntity = api.dataContextOamContextGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidEthMegSpecEthCfmMaintenanceAssociationGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthCfmMaintenanceAssociation> responseEntity = api.dataContextOamContextMeguuidEthMegSpecEthCfmMaintenanceAssociationGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidEthMegSpecEthCfmMaintenanceAssociationMaintenanceAssociationNameGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthMaintenanceAssociationName> responseEntity = api.dataContextOamContextMeguuidEthMegSpecEthCfmMaintenanceAssociationMaintenanceAssociationNameGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidEthMegSpecEthCfmMaintenanceDomainGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthCfmMaintenanceDomain> responseEntity = api.dataContextOamContextMeguuidEthMegSpecEthCfmMaintenanceDomainGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidEthMegSpecEthMegCommonGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthMegCommon> responseEntity = api.dataContextOamContextMeguuidEthMegSpecEthMegCommonGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidEthMegSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthMegSpec> responseEntity = api.dataContextOamContextMeguuidEthMegSpecGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamOamcontextMeg> responseEntity = api.dataContextOamContextMeguuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepCommonGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthMepCommon> responseEntity = api.dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepCommonGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepSinkBandwidthReportGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthBandwidthReport> responseEntity = api.dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepSinkBandwidthReportGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepSinkGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthMepSink> responseEntity = api.dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepSinkGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepSourceGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthMepSource> responseEntity = api.dataContextOamContextMeguuidMeplocalIdEthMepSpecEthMepSourceGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidMeplocalIdEthMepSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthMepSpec> responseEntity = api.dataContextOamContextMeguuidMeplocalIdEthMepSpecGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidMeplocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiOamMegMep> responseEntity = api.dataContextOamContextMeguuidMeplocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidMeplocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextOamContextMeguuidMeplocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidMiplocalIdEthMipSpecEthMipCommonGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthMipCommon> responseEntity = api.dataContextOamContextMeguuidMiplocalIdEthMipSpecEthMipCommonGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidMiplocalIdEthMipSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthMipSpec> responseEntity = api.dataContextOamContextMeguuidMiplocalIdEthMipSpecGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidMiplocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiOamMegMip> responseEntity = api.dataContextOamContextMeguuidMiplocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidMiplocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextOamContextMeguuidMiplocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextMeguuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextOamContextMeguuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobPostTest() throws Exception {
        TapiOamOamcontextOamJob body = new TapiOamOamcontextOamJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdElapsedTimeGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonTimeInterval> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdElapsedTimeGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdElapsedTimePeriodunitGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String unit = "unit_example";
        ResponseEntity<TapiCommonTimePeriod> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdElapsedTimePeriodunitGet(uuid, localId, unit);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberChassisIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer seqNumber = 56;
        ResponseEntity<TapiEthLldpChassisIdSubtype> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberChassisIdGet(uuid, localId, seqNumber);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberEgressPortIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer seqNumber = 56;
        ResponseEntity<TapiEthLldpPortIdSubtype> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberEgressPortIdGet(uuid, localId, seqNumber);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer seqNumber = 56;
        ResponseEntity<TapiEthEthCfmLinkTraceResultData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberGet(uuid, localId, seqNumber);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberIngressPortIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        Integer seqNumber = 56;
        ResponseEntity<TapiEthLldpPortIdSubtype> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataEthCfmLinkTraceResultDataseqNumberIngressPortIdGet(uuid, localId, seqNumber);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthLinkTraceResultData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataResultListsourceAddressGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String sourceAddress = "sourceAddress_example";
        ResponseEntity<TapiEthLinkTraceResult> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthLinkTraceResultDataResultListsourceAddressGet(uuid, localId, sourceAddress);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthLoopbackResultDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthLoopbackResultData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthLoopbackResultDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthOnDemand1DmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmPerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmPerformanceDataSamplesNearEnd1DmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthSamplesDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmPerformanceDataSamplesNearEnd1DmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmPerformanceDataStatisticalNearEnd1DmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmPerformanceDataStatisticalNearEnd1DmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmSourcePerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthOnDemand1DmSourcePerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1DmSourcePerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthOnDemand1LmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmPerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmPerformanceDataStatisticalNearEnd1LmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmPerformanceDataStatisticalNearEnd1LmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmPerformanceDataTotalCountersNearEnd1LmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmPerformanceDataTotalCountersNearEnd1LmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmSourcePerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthOnDemand1LmSourcePerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemand1LmSourcePerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthOnDemandDmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataSamplesFarEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthSamplesDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataSamplesFarEndDmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataSamplesNearEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthSamplesDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataSamplesNearEndDmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataStatisticalBiDirDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataStatisticalBiDirDmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataStatisticalFarEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataStatisticalFarEndDmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataStatisticalNearEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandDmPerformanceDataStatisticalNearEndDmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthOnDemandLmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataStatisticalFarEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataStatisticalFarEndLmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataStatisticalNearEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataStatisticalNearEndLmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataTotalCountersFarEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataTotalCountersFarEndLmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataTotalCountersNearEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthOnDemandLmPerformanceDataTotalCountersNearEndLmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1DmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthProActive1DmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1DmPerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1DmPerformanceDataStatisticalNearEnd1DmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1DmPerformanceDataStatisticalNearEnd1DmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1DmSourcePerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthProActive1DmSourcePerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1DmSourcePerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthProActive1LmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmPerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmPerformanceDataStatisticalNearEnd1LmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmPerformanceDataStatisticalNearEnd1LmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmPerformanceDataTotalCountersNearEnd1LmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmPerformanceDataTotalCountersNearEnd1LmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmSourcePerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthProActive1LmSourcePerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActive1LmSourcePerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthProActiveDmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataStatisticalBiDirDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataStatisticalBiDirDmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataStatisticalFarEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataStatisticalFarEndDmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataStatisticalNearEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveDmPerformanceDataStatisticalNearEndDmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthProActiveLmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataStatisticalFarEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataStatisticalFarEndLmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataStatisticalNearEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataStatisticalNearEndLmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataTotalCountersFarEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataTotalCountersFarEndLmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataTotalCountersNearEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthProActiveLmPerformanceDataTotalCountersNearEndLmParametersGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdEthTestResultDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthTestResultData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdEthTestResultDataGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiOamOamjobCurrentData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthOnDemand1DmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmPerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmPerformanceDataSamplesNearEnd1DmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthSamplesDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmPerformanceDataSamplesNearEnd1DmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmPerformanceDataStatisticalNearEnd1DmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmPerformanceDataStatisticalNearEnd1DmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmSourcePerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthOnDemand1DmSourcePerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1DmSourcePerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthOnDemand1LmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmPerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmPerformanceDataStatisticalNearEnd1LmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmPerformanceDataStatisticalNearEnd1LmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmPerformanceDataTotalCountersNearEnd1LmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmPerformanceDataTotalCountersNearEnd1LmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmSourcePerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthOnDemand1LmSourcePerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemand1LmSourcePerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthOnDemandDmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataSamplesFarEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthSamplesDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataSamplesFarEndDmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataSamplesNearEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthSamplesDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataSamplesNearEndDmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataStatisticalBiDirDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataStatisticalBiDirDmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataStatisticalFarEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataStatisticalFarEndDmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataStatisticalNearEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandDmPerformanceDataStatisticalNearEndDmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthOnDemandLmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataStatisticalFarEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataStatisticalFarEndLmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataStatisticalNearEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataStatisticalNearEndLmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataTotalCountersFarEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataTotalCountersFarEndLmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataTotalCountersNearEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthOnDemandLmPerformanceDataTotalCountersNearEndLmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1DmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthProActive1DmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1DmPerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1DmPerformanceDataStatisticalNearEnd1DmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1DmPerformanceDataStatisticalNearEnd1DmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1DmSourcePerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthProActive1DmSourcePerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1DmSourcePerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthProActive1LmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmPerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmPerformanceDataStatisticalNearEnd1LmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmPerformanceDataStatisticalNearEnd1LmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmPerformanceDataTotalCountersNearEnd1LmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmPerformanceDataTotalCountersNearEnd1LmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmSourcePerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthProActive1LmSourcePerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActive1LmSourcePerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthProActiveDmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataStatisticalBiDirDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataStatisticalBiDirDmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataStatisticalFarEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataStatisticalFarEndDmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataStatisticalNearEndDmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalDmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveDmPerformanceDataStatisticalNearEndDmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthEthProActiveLmPerformanceData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataStatisticalFarEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataStatisticalFarEndLmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataStatisticalNearEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthStatisticalLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataStatisticalNearEndLmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataTotalCountersFarEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataTotalCountersFarEndLmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataTotalCountersNearEndLmParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiEthTotalCountersLmPerformanceParameters> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdEthProActiveLmPerformanceDataTotalCountersNearEndLmParametersGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiOamCurrentdataHistoryData> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdNamevalueNameGet(uuid, localId, historyDataLocalId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdPmDataPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiOamPmDataPac> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdPmDataPacGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdPmDataPacGranularityPeriodGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String historyDataLocalId = "historyDataLocalId_example";
        ResponseEntity<TapiCommonTimePeriod> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdHistoryDatahistoryDataLocalIdPmDataPacGranularityPeriodGet(uuid, localId, historyDataLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdPmDataPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiOamPmDataPac> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdPmDataPacGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidCurrentDatalocalIdPmDataPacGranularityPeriodGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonTimePeriod> responseEntity = api.dataContextOamContextOamJobuuidCurrentDatalocalIdPmDataPacGranularityPeriodGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLinkTraceJobDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLinkTraceJobDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthCfmLinkTracePac> responseEntity = api.dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthCfmLinkTracePac body = new TapiEthEthCfmLinkTracePac();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthCfmLinkTracePac body = new TapiEthEthCfmLinkTracePac();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLinkTraceJobEthCfmLinkTracePacPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLinkTraceJobGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthLinkTraceJob> responseEntity = api.dataContextOamContextOamJobuuidEthLinkTraceJobGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLinkTraceJobPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthLinkTraceJob body = new TapiEthEthLinkTraceJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLinkTraceJobPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLinkTraceJobPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthLinkTraceJob body = new TapiEthEthLinkTraceJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLinkTraceJobPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLoopbackJobDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLoopbackJobDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthOamTestLoopbackCommonPac> responseEntity = api.dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOamTestLoopbackCommonPac body = new TapiEthEthOamTestLoopbackCommonPac();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOamTestLoopbackCommonPac body = new TapiEthEthOamTestLoopbackCommonPac();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLoopbackJobEthOamTestLoopbackCommonPacPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLoopbackJobGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthLoopbackJob> responseEntity = api.dataContextOamContextOamJobuuidEthLoopbackJobGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLoopbackJobPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthLoopbackJob body = new TapiEthEthLoopbackJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLoopbackJobPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthLoopbackJobPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthLoopbackJob body = new TapiEthEthLoopbackJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthLoopbackJobPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSink> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOnDemandMeasurementJobControlSink body = new TapiEthEthOnDemandMeasurementJobControlSink();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOnDemandMeasurementJobControlSink body = new TapiEthEthOnDemandMeasurementJobControlSink();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSinkPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourceDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourceDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourceGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSource> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourceGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOnDemandMeasurementJobControlSource body = new TapiEthEthOnDemandMeasurementJobControlSource();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOnDemandMeasurementJobControlSource body = new TapiEthEthOnDemandMeasurementJobControlSource();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthOnDemandDualEndedMeasurementJob> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOnDemandDualEndedMeasurementJob body = new TapiEthEthOnDemandDualEndedMeasurementJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOnDemandDualEndedMeasurementJob body = new TapiEthEthOnDemandDualEndedMeasurementJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandDualEndedMeasurementJobPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourceDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourceDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourceGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthOnDemandMeasurementJobControlSource> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourceGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOnDemandMeasurementJobControlSource body = new TapiEthEthOnDemandMeasurementJobControlSource();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOnDemandMeasurementJobControlSource body = new TapiEthEthOnDemandMeasurementJobControlSource();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobEthOnDemandMeasurementJobControlSourcePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthOnDemandSingleEndedMeasurementJob> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOnDemandSingleEndedMeasurementJob body = new TapiEthEthOnDemandSingleEndedMeasurementJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOnDemandSingleEndedMeasurementJob body = new TapiEthEthOnDemandSingleEndedMeasurementJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthOnDemandSingleEndedMeasurementJobPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthProActiveMeasurementJobControlSink> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthProActiveMeasurementJobControlSink body = new TapiEthEthProActiveMeasurementJobControlSink();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthProActiveMeasurementJobControlSink body = new TapiEthEthProActiveMeasurementJobControlSink();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSinkPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourceDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourceDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourceGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthProActiveMeasurementJobControlSource> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourceGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourcePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthProActiveMeasurementJobControlSource body = new TapiEthEthProActiveMeasurementJobControlSource();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourcePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourcePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthProActiveMeasurementJobControlSource body = new TapiEthEthProActiveMeasurementJobControlSource();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobEthProActiveMeasurementJobControlSourcePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthProActiveDualEndedMeasurementJob> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthProActiveDualEndedMeasurementJob body = new TapiEthEthProActiveDualEndedMeasurementJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthProActiveDualEndedMeasurementJob body = new TapiEthEthProActiveDualEndedMeasurementJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveDualEndedMeasurementJobPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourceDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourceDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourceGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthProActiveMeasurementJobControlSource> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourceGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourcePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthProActiveMeasurementJobControlSource body = new TapiEthEthProActiveMeasurementJobControlSource();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourcePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourcePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthProActiveMeasurementJobControlSource body = new TapiEthEthProActiveMeasurementJobControlSource();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobEthProActiveMeasurementJobControlSourcePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthProActiveSingleEndedMeasurementJob> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthProActiveSingleEndedMeasurementJob body = new TapiEthEthProActiveSingleEndedMeasurementJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthProActiveSingleEndedMeasurementJob body = new TapiEthEthProActiveSingleEndedMeasurementJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthProActiveSingleEndedMeasurementJobPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthOamTestLoopbackCommonPac> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOamTestLoopbackCommonPac body = new TapiEthEthOamTestLoopbackCommonPac();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOamTestLoopbackCommonPac body = new TapiEthEthOamTestLoopbackCommonPac();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobEthOamTestLoopbackCommonPacPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthTestJobSinkPoint> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthTestJobSinkPoint body = new TapiEthEthTestJobSinkPoint();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthTestJobSinkPoint body = new TapiEthEthTestJobSinkPoint();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobEthTestJobSinkPointPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthTestJob> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthTestJob body = new TapiEthEthTestJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidEthTestJobPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthTestJob body = new TapiEthEthTestJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidEthTestJobPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamOamcontextOamJob> responseEntity = api.dataContextOamContextOamJobuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidNamevalueNameDelete(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextOamContextOamJobuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidNamevalueNamePut(uuid, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidOamProfileDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidOamProfileDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidOamProfileGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamOamProfileRef> responseEntity = api.dataContextOamContextOamJobuuidOamProfileGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidOamProfilePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiOamOamProfileRef body = new TapiOamOamProfileRef();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidOamProfilePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidOamProfilePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiOamOamProfileRef body = new TapiOamOamProfileRef();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidOamProfilePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidOamServicePointPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiOamOamServicePointRef body = new TapiOamOamServicePointRef();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidOamServicePointPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidOamServicePointoamServiceUuidoamServicePointLocalIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String oamServiceUuid = "oamServiceUuid_example";
        String oamServicePointLocalId = "oamServicePointLocalId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidOamServicePointoamServiceUuidoamServicePointLocalIdDelete(uuid, oamServiceUuid, oamServicePointLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidOamServicePointoamServiceUuidoamServicePointLocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String oamServiceUuid = "oamServiceUuid_example";
        String oamServicePointLocalId = "oamServicePointLocalId_example";
        ResponseEntity<TapiOamOamServicePointRef> responseEntity = api.dataContextOamContextOamJobuuidOamServicePointoamServiceUuidoamServicePointLocalIdGet(uuid, oamServiceUuid, oamServicePointLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidOamServicePointoamServiceUuidoamServicePointLocalIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String oamServiceUuid = "oamServiceUuid_example";
        String oamServicePointLocalId = "oamServicePointLocalId_example";
        TapiOamOamServicePointRef body = new TapiOamOamServicePointRef();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidOamServicePointoamServiceUuidoamServicePointLocalIdPut(uuid, oamServiceUuid, oamServicePointLocalId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiOamOamcontextOamJob body = new TapiOamOamcontextOamJob();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidScheduleDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidScheduleDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidScheduleGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiCommonTimeRange> responseEntity = api.dataContextOamContextOamJobuuidScheduleGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidSchedulePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonTimeRange body = new TapiCommonTimeRange();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidSchedulePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamJobuuidSchedulePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonTimeRange body = new TapiCommonTimeRange();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamJobuuidSchedulePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfilePostTest() throws Exception {
        TapiOamOamProfile body = new TapiOamOamProfile();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfilePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamOamProfile> responseEntity = api.dataContextOamContextOamProfileuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidNamevalueNameDelete(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextOamContextOamProfileuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidNamevalueNamePut(uuid, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDataPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiOamPmThresholdData body = new TapiOamPmThresholdData();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDataPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiOamPmThresholdData> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonTimePeriod> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonTimePeriod body = new TapiCommonTimePeriod();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonTimePeriod body = new TapiCommonTimePeriod();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdGranularityPeriodPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamevalueNameDelete(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdNamevalueNamePut(uuid, localId, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiOamPmThresholdData body = new TapiOamPmThresholdData();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiOamThresholdParameter body = new TapiOamThresholdParameter();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationDelete(uuid, localId, pmParameterName, thresholdLocation);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        ResponseEntity<TapiOamThresholdParameter> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationGet(uuid, localId, pmParameterName, thresholdLocation);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsDelete(uuid, localId, pmParameterName, thresholdLocation);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        ResponseEntity<TapiOamPmParameterValue> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsGet(uuid, localId, pmParameterName, thresholdLocation);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        TapiOamPmParameterValue body = new TapiOamPmParameterValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsPost(uuid, localId, pmParameterName, thresholdLocation, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        TapiOamPmParameterValue body = new TapiOamPmParameterValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterAboveThrsPut(uuid, localId, pmParameterName, thresholdLocation, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsDelete(uuid, localId, pmParameterName, thresholdLocation);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        ResponseEntity<TapiOamPmParameterValue> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsGet(uuid, localId, pmParameterName, thresholdLocation);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        TapiOamPmParameterValue body = new TapiOamPmParameterValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsPost(uuid, localId, pmParameterName, thresholdLocation, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        TapiOamPmParameterValue body = new TapiOamPmParameterValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterBelowThrsPut(uuid, localId, pmParameterName, thresholdLocation, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsDelete(uuid, localId, pmParameterName, thresholdLocation);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        ResponseEntity<TapiOamPmParameterValue> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsGet(uuid, localId, pmParameterName, thresholdLocation);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        TapiOamPmParameterValue body = new TapiOamPmParameterValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsPost(uuid, localId, pmParameterName, thresholdLocation, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        TapiOamPmParameterValue body = new TapiOamPmParameterValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPmParameterClearThrsPut(uuid, localId, pmParameterName, thresholdLocation, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String pmParameterName = "pmParameterName_example";
        String thresholdLocation = "thresholdLocation_example";
        TapiOamThresholdParameter body = new TapiOamThresholdParameter();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPmThresholdDatalocalIdThresholdParameterpmParameterNamethresholdLocationPut(uuid, localId, pmParameterName, thresholdLocation, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamProfileuuidPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiOamOamProfile body = new TapiOamOamProfile();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamProfileuuidPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServicePostTest() throws Exception {
        TapiOamOamcontextOamService body = new TapiOamOamcontextOamService();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthCfmMaintenanceAssociation> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNameDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNameGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthMaintenanceAssociationName> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNameGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthMaintenanceAssociationName body = new TapiEthMaintenanceAssociationName();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNamePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthMaintenanceAssociationName body = new TapiEthMaintenanceAssociationName();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationMaintenanceAssociationNamePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthCfmMaintenanceAssociation body = new TapiEthEthCfmMaintenanceAssociation();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthCfmMaintenanceAssociation body = new TapiEthEthCfmMaintenanceAssociation();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceAssociationPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthCfmMaintenanceDomain> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthCfmMaintenanceDomain body = new TapiEthEthCfmMaintenanceDomain();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthCfmMaintenanceDomain body = new TapiEthEthCfmMaintenanceDomain();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthCfmMaintenanceDomainPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthMegCommon> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthMegCommon body = new TapiEthEthMegCommon();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthMegCommon body = new TapiEthEthMegCommon();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceEthMegCommonPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServiceGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthOamService> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServiceGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServicePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOamService body = new TapiEthEthOamService();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServicePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidEthOamServicePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthOamService body = new TapiEthEthOamService();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidEthOamServicePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamOamcontextOamService> responseEntity = api.dataContextOamContextOamServiceuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidMegGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiOamMegRef> responseEntity = api.dataContextOamContextOamServiceuuidMegGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidNamevalueNameDelete(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextOamContextOamServiceuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidNamevalueNamePut(uuid, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiOamOamserviceOamServicePoint body = new TapiOamOamserviceOamServicePoint();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiConnectivityConnectivityServiceEndPointRef> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiConnectivityConnectivityServiceEndPointRef body = new TapiConnectivityConnectivityServiceEndPointRef();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiConnectivityConnectivityServiceEndPointRef body = new TapiConnectivityConnectivityServiceEndPointRef();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdConnectivityServiceEndPointPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthMepCommon> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthMepCommon body = new TapiEthEthMepCommon();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthMepCommon body = new TapiEthEthMepCommon();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepCommonPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkBandwidthReportGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthBandwidthReport> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkBandwidthReportGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthMepSink> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthMepSink body = new TapiEthEthMepSink();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthMepSink body = new TapiEthEthMepSink();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSinkPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourceDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourceDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourceGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthMepSource> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourceGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourcePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthMepSource body = new TapiEthEthMepSource();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourcePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourcePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthMepSource body = new TapiEthEthMepSource();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointEthMepSourcePut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthOamMepServicePoint> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthOamMepServicePoint body = new TapiEthEthOamMepServicePoint();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthOamMepServicePoint body = new TapiEthEthOamMepServicePoint();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMepServicePointPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthMipCommon> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthMipCommon body = new TapiEthEthMipCommon();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthMipCommon body = new TapiEthEthMipCommon();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointEthMipCommonPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiEthEthOamMipServicePoint> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthOamMipServicePoint body = new TapiEthEthOamMipServicePoint();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiEthEthOamMipServicePoint body = new TapiEthEthOamMipServicePoint();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdEthOamMipServicePointPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiOamOamserviceOamServicePoint> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdMepGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiOamMepRef> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdMepGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdMipGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiOamMipRef> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdMipGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdNamePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdNamePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdNamevalueNameDelete(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdNamevalueNamePut(uuid, localId, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiOamOamserviceOamServicePoint body = new TapiOamOamserviceOamServicePoint();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonServiceInterfacePointRef> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonServiceInterfacePointRef body = new TapiCommonServiceInterfacePointRef();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonServiceInterfacePointRef body = new TapiCommonServiceInterfacePointRef();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidOamServicePointlocalIdServiceInterfacePointPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextOamServiceuuidPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiOamOamcontextOamService body = new TapiOamOamcontextOamService();
        ResponseEntity<Void> responseEntity = api.dataContextOamContextOamServiceuuidPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextPostTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.dataContextOamContextPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextOamContextPutTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.dataContextOamContextPut(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextDeleteTest() throws Exception {
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextDelete();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextGetTest() throws Exception {
        ResponseEntity<TapiPathComputationPathComputationContext> responseEntity = api.dataContextPathComputationContextGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServicePostTest() throws Exception {
        TapiPathComputationPathComputationService body = new TapiPathComputationPathComputationService();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationPathServiceEndPoint body = new TapiPathComputationPathServiceEndPoint();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacity body = new TapiCommonCapacity();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacity body = new TapiCommonCapacity();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizeDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizeDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizeGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacityValue body = new TapiCommonCapacityValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacityValue body = new TapiCommonCapacityValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdCapacityTotalSizePut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPathComputationPathServiceEndPoint> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamevalueNameDelete(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdNamevalueNamePut(uuid, localId, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPathComputationPathServiceEndPoint body = new TapiPathComputationPathServiceEndPoint();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonServiceInterfacePointRef> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonServiceInterfacePointRef body = new TapiCommonServiceInterfacePointRef();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonServiceInterfacePointRef body = new TapiCommonServiceInterfacePointRef();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidEndPointlocalIdServiceInterfacePointPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPathComputationPathComputationService> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidNamevalueNameDelete(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidNamevalueNamePut(uuid, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPathComputationPathObjectiveFunction> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamevalueNameDelete(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionNamevalueNamePut(uuid, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationPathObjectiveFunction body = new TapiPathComputationPathObjectiveFunction();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationPathObjectiveFunction body = new TapiPathComputationPathObjectiveFunction();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidObjectiveFunctionPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPathComputationPathOptimizationConstraint> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamevalueNameDelete(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintNamevalueNamePut(uuid, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationPathOptimizationConstraint body = new TapiPathComputationPathOptimizationConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationPathOptimizationConstraint body = new TapiPathComputationPathOptimizationConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidOptimizationConstraintPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidPathpathUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String pathUuid = "pathUuid_example";
        ResponseEntity<TapiPathComputationPathRef> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidPathpathUuidGet(uuid, pathUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationPathComputationService body = new TapiPathComputationPathComputationService();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristicPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiTopologyCostCharacteristic body = new TapiTopologyCostCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristicPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristiccostNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String costName = "costName_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristiccostNameDelete(uuid, costName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristiccostNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String costName = "costName_example";
        ResponseEntity<TapiTopologyCostCharacteristic> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristiccostNameGet(uuid, costName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristiccostNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String costName = "costName_example";
        TapiTopologyCostCharacteristic body = new TapiTopologyCostCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintCostCharacteristiccostNamePut(uuid, costName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPathComputationRoutingConstraint> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristicPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiTopologyLatencyCharacteristic body = new TapiTopologyLatencyCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristicPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String trafficPropertyName = "trafficPropertyName_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameDelete(uuid, trafficPropertyName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String trafficPropertyName = "trafficPropertyName_example";
        ResponseEntity<TapiTopologyLatencyCharacteristic> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameGet(uuid, trafficPropertyName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String trafficPropertyName = "trafficPropertyName_example";
        TapiTopologyLatencyCharacteristic body = new TapiTopologyLatencyCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintLatencyCharacteristictrafficPropertyNamePut(uuid, trafficPropertyName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationRoutingConstraint body = new TapiPathComputationRoutingConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationRoutingConstraint body = new TapiPathComputationRoutingConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiTopologyRiskCharacteristic body = new TapiTopologyRiskCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String riskCharacteristicName = "riskCharacteristicName_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameDelete(uuid, riskCharacteristicName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String riskCharacteristicName = "riskCharacteristicName_example";
        ResponseEntity<TapiTopologyRiskCharacteristic> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameGet(uuid, riskCharacteristicName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String riskCharacteristicName = "riskCharacteristicName_example";
        TapiTopologyRiskCharacteristic body = new TapiTopologyRiskCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNamePut(uuid, riskCharacteristicName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidTopologyConstraintPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPathComputationTopologyConstraint body = new TapiPathComputationTopologyConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidTopologyConstraintPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiPathComputationTopologyConstraint> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamevalueNameDelete(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdNamevalueNamePut(uuid, localId, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiPathComputationTopologyConstraint body = new TapiPathComputationTopologyConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPathCompServiceuuidTopologyConstraintlocalIdPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPathComputationPath> responseEntity = api.dataContextPathComputationContextPathuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathuuidLinktopologyUuidlinkUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String topologyUuid = "topologyUuid_example";
        String linkUuid = "linkUuid_example";
        ResponseEntity<TapiTopologyLinkRef> responseEntity = api.dataContextPathComputationContextPathuuidLinktopologyUuidlinkUuidGet(uuid, topologyUuid, linkUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextPathComputationContextPathuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathuuidRoutingConstraintCostCharacteristiccostNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String costName = "costName_example";
        ResponseEntity<TapiTopologyCostCharacteristic> responseEntity = api.dataContextPathComputationContextPathuuidRoutingConstraintCostCharacteristiccostNameGet(uuid, costName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathuuidRoutingConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPathComputationRoutingConstraint> responseEntity = api.dataContextPathComputationContextPathuuidRoutingConstraintGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String trafficPropertyName = "trafficPropertyName_example";
        ResponseEntity<TapiTopologyLatencyCharacteristic> responseEntity = api.dataContextPathComputationContextPathuuidRoutingConstraintLatencyCharacteristictrafficPropertyNameGet(uuid, trafficPropertyName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPathuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String riskCharacteristicName = "riskCharacteristicName_example";
        ResponseEntity<TapiTopologyRiskCharacteristic> responseEntity = api.dataContextPathComputationContextPathuuidRoutingConstraintRiskDiversityCharacteristicriskCharacteristicNameGet(uuid, riskCharacteristicName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPostTest() throws Exception {
        TapiPathComputationPathComputationContext body = new TapiPathComputationPathComputationContext();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPathComputationContextPutTest() throws Exception {
        TapiPathComputationPathComputationContext body = new TapiPathComputationPathComputationContext();
        ResponseEntity<Void> responseEntity = api.dataContextPathComputationContextPut(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPostTest() throws Exception {
        TapiCommonContext body = new TapiCommonContext();
        ResponseEntity<Void> responseEntity = api.dataContextPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextPutTest() throws Exception {
        TapiCommonContext body = new TapiCommonContext();
        ResponseEntity<Void> responseEntity = api.dataContextPut(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointPostTest() throws Exception {
        TapiCommonContextServiceInterfacePoint body = new TapiCommonContextServiceInterfacePoint();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidAvailableCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextServiceInterfacePointuuidAvailableCapacityGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidAvailableCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextServiceInterfacePointuuidAvailableCapacityTotalSizeGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiEthEthServiceIntefacePointSpec> responseEntity = api.dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthServiceIntefacePointSpec body = new TapiEthEthServiceIntefacePointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiEthEthServiceIntefacePointSpec body = new TapiEthEthServiceIntefacePointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidEthServiceIntefacePointSpecPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiCommonContextServiceInterfacePoint> responseEntity = api.dataContextServiceInterfacePointuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaMediaChannelServiceInterfacePointSpec> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(uuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyGetTest() throws Exception {
        String uuid = "uuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaSpectrumBand> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyGet(uuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaMediaChannelPoolCapabilityPac> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(uuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyGetTest() throws Exception {
        String uuid = "uuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaSpectrumBand> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyGet(uuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(uuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyGetTest() throws Exception {
        String uuid = "uuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaSpectrumBand> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyGet(uuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaMediaChannelServiceInterfacePointSpec body = new TapiPhotonicMediaMediaChannelServiceInterfacePointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaPowerManagementCapabilityPac> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerManagementCapabilityPac body = new TapiPhotonicMediaPowerManagementCapabilityPac();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerManagementCapabilityPac body = new TapiPhotonicMediaPowerManagementCapabilityPac();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaMediaChannelServiceInterfacePointSpec body = new TapiPhotonicMediaMediaChannelServiceInterfacePointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidMediaChannelServiceInterfacePointSpecPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidNamevalueNameDelete(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextServiceInterfacePointuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidNamevalueNamePut(uuid, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaOtsiServiceInterfacePointSpec> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilityGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaOtsiCapabilityPac> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilityGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilitySupportableApplicationIdentifierapplicationCodeGetTest() throws Exception {
        String uuid = "uuid_example";
        String applicationCode = "applicationCode_example";
        ResponseEntity<TapiPhotonicMediaApplicationIdentifier> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilitySupportableApplicationIdentifierapplicationCodeGet(uuid, applicationCode);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilitySupportableCentralFrequencyBandFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilitySupportableCentralFrequencyBandFrequencyConstraintGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilitySupportableCentralFrequencyBandGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaCentralFrequencyBand> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilitySupportableCentralFrequencyBandGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilityTotalPowerWarnThresholdGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaTotalPowerThresholdPac> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecOtsiCapabilityTotalPowerWarnThresholdGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaOtsiServiceInterfacePointSpec body = new TapiPhotonicMediaOtsiServiceInterfacePointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaPowerManagementCapabilityPac> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerManagementCapabilityPac body = new TapiPhotonicMediaPowerManagementCapabilityPac();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerManagementCapabilityPac body = new TapiPhotonicMediaPowerManagementCapabilityPac();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMaximumOutputPowerPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilitySupportableMinimumOutputPowerPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMaximumInputPowerPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaPowerProperties body = new TapiPhotonicMediaPowerProperties();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPowerManagementCapabilityTolerableMinimumInputPowerPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiPhotonicMediaOtsiServiceInterfacePointSpec body = new TapiPhotonicMediaOtsiServiceInterfacePointSpec();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidOtsiServiceInterfacePointSpecPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonContextServiceInterfacePoint body = new TapiCommonContextServiceInterfacePoint();
        ResponseEntity<Void> responseEntity = api.dataContextServiceInterfacePointuuidPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidTotalPotentialCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextServiceInterfacePointuuidTotalPotentialCapacityGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextServiceInterfacePointuuidTotalPotentialCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextServiceInterfacePointuuidTotalPotentialCapacityTotalSizeGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextDeleteTest() throws Exception {
        ResponseEntity<Void> responseEntity = api.dataContextTopologyContextDelete();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextGetTest() throws Exception {
        ResponseEntity<TapiTopologyTopologyContext> responseEntity = api.dataContextTopologyContextGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextNwTopologyServiceGetTest() throws Exception {
        ResponseEntity<TapiTopologyNetworkTopologyService> responseEntity = api.dataContextTopologyContextNwTopologyServiceGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextNwTopologyServiceNamevalueNameGetTest() throws Exception {
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextTopologyContextNwTopologyServiceNamevalueNameGet(valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextNwTopologyServiceTopologytopologyUuidGetTest() throws Exception {
        String topologyUuid = "topologyUuid_example";
        ResponseEntity<TapiTopologyTopologyRef> responseEntity = api.dataContextTopologyContextNwTopologyServiceTopologytopologyUuidGet(topologyUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextPostTest() throws Exception {
        TapiTopologyTopologyContext body = new TapiTopologyTopologyContext();
        ResponseEntity<Void> responseEntity = api.dataContextTopologyContextPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextPutTest() throws Exception {
        TapiTopologyTopologyContext body = new TapiTopologyTopologyContext();
        ResponseEntity<Void> responseEntity = api.dataContextTopologyContextPut(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidBoundaryNodeEdgePointtopologyUuidnodeUuidnodeEdgePointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String topologyUuid = "topologyUuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiTopologyNodeEdgePointRef> responseEntity = api.dataContextTopologyContextTopologyuuidBoundaryNodeEdgePointtopologyUuidnodeUuidnodeEdgePointUuidGet(uuid, topologyUuid, nodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiTopologyTopologycontextTopology> responseEntity = api.dataContextTopologyContextTopologyuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidLinklinkUuidAvailableCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String linkUuid = "linkUuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextTopologyContextTopologyuuidLinklinkUuidAvailableCapacityGet(uuid, linkUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidLinklinkUuidAvailableCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String linkUuid = "linkUuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextTopologyContextTopologyuuidLinklinkUuidAvailableCapacityTotalSizeGet(uuid, linkUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidLinklinkUuidCostCharacteristiccostNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String linkUuid = "linkUuid_example";
        String costName = "costName_example";
        ResponseEntity<TapiTopologyCostCharacteristic> responseEntity = api.dataContextTopologyContextTopologyuuidLinklinkUuidCostCharacteristiccostNameGet(uuid, linkUuid, costName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidLinklinkUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String linkUuid = "linkUuid_example";
        ResponseEntity<TapiTopologyLink> responseEntity = api.dataContextTopologyContextTopologyuuidLinklinkUuidGet(uuid, linkUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidLinklinkUuidLatencyCharacteristictrafficPropertyNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String linkUuid = "linkUuid_example";
        String trafficPropertyName = "trafficPropertyName_example";
        ResponseEntity<TapiTopologyLatencyCharacteristic> responseEntity = api.dataContextTopologyContextTopologyuuidLinklinkUuidLatencyCharacteristictrafficPropertyNameGet(uuid, linkUuid, trafficPropertyName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidLinklinkUuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String linkUuid = "linkUuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextTopologyContextTopologyuuidLinklinkUuidNamevalueNameGet(uuid, linkUuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidLinklinkUuidNodeEdgePointtopologyUuidnodeUuidnodeEdgePointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String linkUuid = "linkUuid_example";
        String topologyUuid = "topologyUuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiTopologyNodeEdgePointRef> responseEntity = api.dataContextTopologyContextTopologyuuidLinklinkUuidNodeEdgePointtopologyUuidnodeUuidnodeEdgePointUuidGet(uuid, linkUuid, topologyUuid, nodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidLinklinkUuidRiskCharacteristicriskCharacteristicNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String linkUuid = "linkUuid_example";
        String riskCharacteristicName = "riskCharacteristicName_example";
        ResponseEntity<TapiTopologyRiskCharacteristic> responseEntity = api.dataContextTopologyContextTopologyuuidLinklinkUuidRiskCharacteristicriskCharacteristicNameGet(uuid, linkUuid, riskCharacteristicName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidLinklinkUuidTotalPotentialCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String linkUuid = "linkUuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextTopologyContextTopologyuuidLinklinkUuidTotalPotentialCapacityGet(uuid, linkUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidLinklinkUuidTotalPotentialCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String linkUuid = "linkUuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextTopologyContextTopologyuuidLinklinkUuidTotalPotentialCapacityTotalSizeGet(uuid, linkUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidLinklinkUuidValidationMechanismvalidationMechanismGetTest() throws Exception {
        String uuid = "uuid_example";
        String linkUuid = "linkUuid_example";
        String validationMechanism = "validationMechanism_example";
        ResponseEntity<TapiTopologyValidationMechanism> responseEntity = api.dataContextTopologyContextTopologyuuidLinklinkUuidValidationMechanismvalidationMechanismGet(uuid, linkUuid, validationMechanism);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextTopologyContextTopologyuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidAggregatedNodeEdgePointtopologyUuidaggregatedNodeEdgePointNodeUuidnodeEdgePointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String topologyUuid = "topologyUuid_example";
        String aggregatedNodeEdgePointNodeUuid = "aggregatedNodeEdgePointNodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiTopologyNodeEdgePointRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidAggregatedNodeEdgePointtopologyUuidaggregatedNodeEdgePointNodeUuidnodeEdgePointUuidGet(uuid, nodeUuid, topologyUuid, aggregatedNodeEdgePointNodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidAvailableCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidAvailableCapacityGet(uuid, nodeUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidAvailableCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidAvailableCapacityTotalSizeGet(uuid, nodeUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidCostCharacteristiccostNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String costName = "costName_example";
        ResponseEntity<TapiTopologyCostCharacteristic> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidCostCharacteristiccostNameGet(uuid, nodeUuid, costName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidEncapTopologyGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        ResponseEntity<TapiTopologyTopologyRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidEncapTopologyGet(uuid, nodeUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        ResponseEntity<TapiTopologyTopologyNode> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidGet(uuid, nodeUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidLatencyCharacteristictrafficPropertyNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String trafficPropertyName = "trafficPropertyName_example";
        ResponseEntity<TapiTopologyLatencyCharacteristic> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidLatencyCharacteristictrafficPropertyNameGet(uuid, nodeUuid, trafficPropertyName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNamevalueNameGet(uuid, nodeUuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAggregatedNodeEdgePointtopologyUuidaggregatedNodeEdgePointNodeUuidaggregatedNodeEdgePointNodeEdgePointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String topologyUuid = "topologyUuid_example";
        String aggregatedNodeEdgePointNodeUuid = "aggregatedNodeEdgePointNodeUuid_example";
        String aggregatedNodeEdgePointNodeEdgePointUuid = "aggregatedNodeEdgePointNodeEdgePointUuid_example";
        ResponseEntity<TapiTopologyNodeEdgePointRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAggregatedNodeEdgePointtopologyUuidaggregatedNodeEdgePointNodeUuidaggregatedNodeEdgePointNodeEdgePointUuidGet(uuid, nodeUuid, nodeEdgePointUuid, topologyUuid, aggregatedNodeEdgePointNodeUuid, aggregatedNodeEdgePointNodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAvailableCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAvailableCapacityGet(uuid, nodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAvailableCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAvailableCapacityTotalSizeGet(uuid, nodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAvailableCepLayerProtocollayerProtocolQualifierGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String layerProtocolQualifier = "layerProtocolQualifier_example";
        ResponseEntity<TapiTopologyNepLayerProtocolCapability> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidAvailableCepLayerProtocollayerProtocolQualifierGet(uuid, nodeUuid, nodeEdgePointUuid, layerProtocolQualifier);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidAggregatedConnectionEndPointtopologyUuidaggregatedConnectionEndPointNodeUuidaggregatedConnectionEndPointNodeEdgePointUuidaggregatedConnectionEndPointConnectionEndPointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        String topologyUuid = "topologyUuid_example";
        String aggregatedConnectionEndPointNodeUuid = "aggregatedConnectionEndPointNodeUuid_example";
        String aggregatedConnectionEndPointNodeEdgePointUuid = "aggregatedConnectionEndPointNodeEdgePointUuid_example";
        String aggregatedConnectionEndPointConnectionEndPointUuid = "aggregatedConnectionEndPointConnectionEndPointUuid_example";
        ResponseEntity<TapiConnectivityConnectionEndPointRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidAggregatedConnectionEndPointtopologyUuidaggregatedConnectionEndPointNodeUuidaggregatedConnectionEndPointNodeEdgePointUuidaggregatedConnectionEndPointConnectionEndPointUuidGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid, topologyUuid, aggregatedConnectionEndPointNodeUuid, aggregatedConnectionEndPointNodeEdgePointUuid, aggregatedConnectionEndPointConnectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidClientNodeEdgePointtopologyUuidclientNodeEdgePointNodeUuidclientNodeEdgePointNodeEdgePointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        String topologyUuid = "topologyUuid_example";
        String clientNodeEdgePointNodeUuid = "clientNodeEdgePointNodeUuid_example";
        String clientNodeEdgePointNodeEdgePointUuid = "clientNodeEdgePointNodeEdgePointUuid_example";
        ResponseEntity<TapiTopologyNodeEdgePointRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidClientNodeEdgePointtopologyUuidclientNodeEdgePointNodeUuidclientNodeEdgePointNodeEdgePointUuidGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid, topologyUuid, clientNodeEdgePointNodeUuid, clientNodeEdgePointNodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacFilterConfigGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiEthControlFrameFilter> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacFilterConfigGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiEthEthCtpCommonPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        Integer queueId = 56;
        ResponseEntity<TapiEthTrafficConditioningConfiguration> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficConditioningPacCondConfigListqueueIdGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficConditioningPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiEthTrafficConditioningPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficConditioningPacGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        Integer queueId = 56;
        ResponseEntity<TapiEthPriorityConfiguration> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficConditioningPacPrioConfigListqueueIdGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficShapingPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiEthTrafficShapingPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficShapingPacGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        Integer queueId = 56;
        ResponseEntity<TapiEthPriorityConfiguration> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficShapingPacPrioConfigListqueueIdGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        Integer queueId = 56;
        ResponseEntity<TapiEthQueueConfiguration> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpEthCtpCommonPacTrafficShapingPacQueueConfigListqueueIdGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid, queueId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiEthEthCtpPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthCtpGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthTermEthTerminationCommonPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiEthEthTerminationCommonPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthTermEthTerminationCommonPacGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthTermEthTerminationCommonPacPriorityRegenerateGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiEthPriorityMapping> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthTermEthTerminationCommonPacPriorityRegenerateGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthTermGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiEthEthTerminationPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEthTermGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEtyTermEtyTerminationCommonPacGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiEthEtyTerminationCommonPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEtyTermEtyTerminationCommonPacGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEtyTermGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiEthEtyTerminationPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecEtyTermGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiEthEthConnectionEndPointSpec> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidEthConnectionEndPointSpecGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiConnectivityCeplistConnectionEndPoint> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaMediaChannelConnectionEndPointSpec> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaMediaChannelPropertiesPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelMeasuredPowerEgressGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelMeasuredPowerEgressGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelMeasuredPowerIngressGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelMeasuredPowerIngressGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelOccupiedSpectrumFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelOccupiedSpectrumFrequencyConstraintGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelOccupiedSpectrumGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaSpectrumBand> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMediaChannelConnectionEndPointSpecMediaChannelOccupiedSpectrumGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMepMipListGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiOamMepMipList> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMepMipListGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMepMipListMepmegUuidmepLocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        String megUuid = "megUuid_example";
        String mepLocalId = "mepLocalId_example";
        ResponseEntity<TapiOamMepRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMepMipListMepmegUuidmepLocalIdGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid, megUuid, mepLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMepMipListMipmegUuidmipLocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        String megUuid = "megUuid_example";
        String mipLocalId = "mipLocalId_example";
        ResponseEntity<TapiOamMipRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidMepMipListMipmegUuidmipLocalIdGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid, megUuid, mipLocalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidNamevalueNameGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiAssemblyConnectionEndPointSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiAssemblyConnectionEndPointSpecGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiAssemblyConnectionEndPointSpecOtsiAdapterFecParametersGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaFecProperties> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiAssemblyConnectionEndPointSpecOtsiAdapterFecParametersGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiAssemblyConnectionEndPointSpecOtsiAdapterGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaOtsiServerAdaptationPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiAssemblyConnectionEndPointSpecOtsiAdapterGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaOtsiConnectionEndPointSpec> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaOtsiTerminationPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationLaserPropertiesGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaLaserProperties> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationLaserPropertiesGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationReceivedPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationReceivedPowerGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedApplicationIdentifierGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaApplicationIdentifier> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedApplicationIdentifierGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedCentralFrequencyFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedCentralFrequencyFrequencyConstraintGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedCentralFrequencyGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaCentralFrequency> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedCentralFrequencyGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedSpectrumFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedSpectrumFrequencyConstraintGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedSpectrumGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaSpectrumBand> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationSelectedSpectrumGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationTransmitedPowerGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiPhotonicMediaPowerProperties> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidOtsiConnectionEndPointSpecOtsiTerminationTransmitedPowerGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidParentNodeEdgePointGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String connectionEndPointUuid = "connectionEndPointUuid_example";
        ResponseEntity<TapiTopologyNodeEdgePointRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListConnectionEndPointconnectionEndPointUuidParentNodeEdgePointGet(uuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidCepListGet(uuid, nodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiTopologyNodeNodeEdgePoint> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidGet(uuid, nodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMappedServiceInterfacePointserviceInterfacePointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String serviceInterfacePointUuid = "serviceInterfacePointUuid_example";
        ResponseEntity<TapiCommonServiceInterfacePointRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMappedServiceInterfacePointserviceInterfacePointUuidGet(uuid, nodeUuid, nodeEdgePointUuid, serviceInterfacePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiPhotonicMediaMediaChannelNodeEdgePointSpec> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecGet(uuid, nodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(uuid, nodeUuid, nodeEdgePointUuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaSpectrumBand> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolAvailableSpectrumupperFrequencylowerFrequencyGet(uuid, nodeUuid, nodeEdgePointUuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiPhotonicMediaMediaChannelPoolCapabilityPac> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolGet(uuid, nodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(uuid, nodeUuid, nodeEdgePointUuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaSpectrumBand> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolOccupiedSpectrumupperFrequencylowerFrequencyGet(uuid, nodeUuid, nodeEdgePointUuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaFrequencyConstraint> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyFrequencyConstraintGet(uuid, nodeUuid, nodeEdgePointUuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        Integer upperFrequency = 56;
        Integer lowerFrequency = 56;
        ResponseEntity<TapiPhotonicMediaSpectrumBand> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidMediaChannelNodeEdgePointSpecMcPoolSupportableSpectrumupperFrequencylowerFrequencyGet(uuid, nodeUuid, nodeEdgePointUuid, upperFrequency, lowerFrequency);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidNamevalueNameGet(uuid, nodeUuid, nodeEdgePointUuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidTotalPotentialCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidTotalPotentialCapacityGet(uuid, nodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidTotalPotentialCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeEdgePointnodeEdgePointUuidTotalPotentialCapacityTotalSizeGet(uuid, nodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidAvailableCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidAvailableCapacityGet(uuid, nodeUuid, nodeRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidAvailableCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidAvailableCapacityTotalSizeGet(uuid, nodeUuid, nodeRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidComposedRuleGrouptopologyUuidcomposedRuleGroupNodeUuidcomposedRuleGroupNodeRuleGroupUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String topologyUuid = "topologyUuid_example";
        String composedRuleGroupNodeUuid = "composedRuleGroupNodeUuid_example";
        String composedRuleGroupNodeRuleGroupUuid = "composedRuleGroupNodeRuleGroupUuid_example";
        ResponseEntity<TapiTopologyNodeRuleGroupRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidComposedRuleGrouptopologyUuidcomposedRuleGroupNodeUuidcomposedRuleGroupNodeRuleGroupUuidGet(uuid, nodeUuid, nodeRuleGroupUuid, topologyUuid, composedRuleGroupNodeUuid, composedRuleGroupNodeRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidCostCharacteristiccostNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String costName = "costName_example";
        ResponseEntity<TapiTopologyCostCharacteristic> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidCostCharacteristiccostNameGet(uuid, nodeUuid, nodeRuleGroupUuid, costName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        ResponseEntity<TapiTopologyNodeRuleGroup> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidGet(uuid, nodeUuid, nodeRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidAssociatedNodeRuleGrouptopologyUuidassociatedNodeRuleGroupNodeUuidassociatedNodeRuleGroupNodeRuleGroupUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        String topologyUuid = "topologyUuid_example";
        String associatedNodeRuleGroupNodeUuid = "associatedNodeRuleGroupNodeUuid_example";
        String associatedNodeRuleGroupNodeRuleGroupUuid = "associatedNodeRuleGroupNodeRuleGroupUuid_example";
        ResponseEntity<TapiTopologyNodeRuleGroupRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidAssociatedNodeRuleGrouptopologyUuidassociatedNodeRuleGroupNodeUuidassociatedNodeRuleGroupNodeRuleGroupUuidGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid, topologyUuid, associatedNodeRuleGroupNodeUuid, associatedNodeRuleGroupNodeRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidAvailableCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidAvailableCapacityGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidAvailableCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidAvailableCapacityTotalSizeGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidCostCharacteristiccostNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        String costName = "costName_example";
        ResponseEntity<TapiTopologyCostCharacteristic> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidCostCharacteristiccostNameGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid, costName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        ResponseEntity<TapiTopologyInterRuleGroup> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidLatencyCharacteristictrafficPropertyNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        String trafficPropertyName = "trafficPropertyName_example";
        ResponseEntity<TapiTopologyLatencyCharacteristic> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidLatencyCharacteristictrafficPropertyNameGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid, trafficPropertyName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidNamevalueNameGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidRiskCharacteristicriskCharacteristicNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        String riskCharacteristicName = "riskCharacteristicName_example";
        ResponseEntity<TapiTopologyRiskCharacteristic> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidRiskCharacteristicriskCharacteristicNameGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid, riskCharacteristicName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidRulelocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiTopologyRule> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidRulelocalIdGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidRulelocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidRulelocalIdNamevalueNameGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidTotalPotentialCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidTotalPotentialCapacityGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidTotalPotentialCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String interRuleGroupUuid = "interRuleGroupUuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidInterRuleGroupinterRuleGroupUuidTotalPotentialCapacityTotalSizeGet(uuid, nodeUuid, nodeRuleGroupUuid, interRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidLatencyCharacteristictrafficPropertyNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String trafficPropertyName = "trafficPropertyName_example";
        ResponseEntity<TapiTopologyLatencyCharacteristic> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidLatencyCharacteristictrafficPropertyNameGet(uuid, nodeUuid, nodeRuleGroupUuid, trafficPropertyName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidNamevalueNameGet(uuid, nodeUuid, nodeRuleGroupUuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidNodeEdgePointtopologyUuidnodeEdgePointNodeUuidnodeEdgePointUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String topologyUuid = "topologyUuid_example";
        String nodeEdgePointNodeUuid = "nodeEdgePointNodeUuid_example";
        String nodeEdgePointUuid = "nodeEdgePointUuid_example";
        ResponseEntity<TapiTopologyNodeEdgePointRef> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidNodeEdgePointtopologyUuidnodeEdgePointNodeUuidnodeEdgePointUuidGet(uuid, nodeUuid, nodeRuleGroupUuid, topologyUuid, nodeEdgePointNodeUuid, nodeEdgePointUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidRiskCharacteristicriskCharacteristicNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String riskCharacteristicName = "riskCharacteristicName_example";
        ResponseEntity<TapiTopologyRiskCharacteristic> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidRiskCharacteristicriskCharacteristicNameGet(uuid, nodeUuid, nodeRuleGroupUuid, riskCharacteristicName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidRulelocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiTopologyRule> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidRulelocalIdGet(uuid, nodeUuid, nodeRuleGroupUuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidRulelocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidRulelocalIdNamevalueNameGet(uuid, nodeUuid, nodeRuleGroupUuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidTotalPotentialCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidTotalPotentialCapacityGet(uuid, nodeUuid, nodeRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidTotalPotentialCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        String nodeRuleGroupUuid = "nodeRuleGroupUuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidNodeRuleGroupnodeRuleGroupUuidTotalPotentialCapacityTotalSizeGet(uuid, nodeUuid, nodeRuleGroupUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidTotalPotentialCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidTotalPotentialCapacityGet(uuid, nodeUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextTopologyContextTopologyuuidNodenodeUuidTotalPotentialCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String nodeUuid = "nodeUuid_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextTopologyContextTopologyuuidNodenodeUuidTotalPotentialCapacityTotalSizeGet(uuid, nodeUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextDeleteTest() throws Exception {
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextDelete();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextGetTest() throws Exception {
        ResponseEntity<TapiVirtualNetworkVirtualNetworkContext> responseEntity = api.dataContextVirtualNetworkContextGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextPostTest() throws Exception {
        TapiVirtualNetworkVirtualNetworkContext body = new TapiVirtualNetworkVirtualNetworkContext();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextPutTest() throws Exception {
        TapiVirtualNetworkVirtualNetworkContext body = new TapiVirtualNetworkVirtualNetworkContext();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextPut(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServicePostTest() throws Exception {
        TapiVirtualNetworkVirtualNetworkService body = new TapiVirtualNetworkVirtualNetworkService();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiVirtualNetworkVirtualNetworkServiceEndPoint body = new TapiVirtualNetworkVirtualNetworkServiceEndPoint();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiVirtualNetworkVirtualNetworkServiceEndPoint> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamevalueNameDelete(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdNamevalueNamePut(uuid, localId, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiVirtualNetworkVirtualNetworkServiceEndPoint body = new TapiVirtualNetworkVirtualNetworkServiceEndPoint();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdServiceInterfacePointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonServiceInterfacePointRef> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidEndPointlocalIdServiceInterfacePointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiVirtualNetworkVirtualNetworkService> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidNamePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidNamePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidNamevalueNameDelete(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidNamevalueNameGet(uuid, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidNamevalueNamePut(uuid, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidPutTest() throws Exception {
        String uuid = "uuid_example";
        TapiVirtualNetworkVirtualNetworkService body = new TapiVirtualNetworkVirtualNetworkService();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidPut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidScheduleDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidScheduleDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidScheduleGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiCommonTimeRange> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidScheduleGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidSchedulePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonTimeRange body = new TapiCommonTimeRange();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidSchedulePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidSchedulePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonTimeRange body = new TapiCommonTimeRange();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidSchedulePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidStateDeleteTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidStateDelete(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidStateGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiCommonAdminStatePac> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidStateGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidStatePostTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonAdminStatePac body = new TapiCommonAdminStatePac();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidStatePost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidStatePutTest() throws Exception {
        String uuid = "uuid_example";
        TapiCommonAdminStatePac body = new TapiCommonAdminStatePac();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidStatePut(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidTopologyGetTest() throws Exception {
        String uuid = "uuid_example";
        ResponseEntity<TapiTopologyTopologyRef> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidTopologyGet(uuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintPostTest() throws Exception {
        String uuid = "uuid_example";
        TapiVirtualNetworkVirtualNetworkConstraint body = new TapiVirtualNetworkVirtualNetworkConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintPost(uuid, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristicPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiTopologyCostCharacteristic body = new TapiTopologyCostCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristicPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristiccostNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String costName = "costName_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristiccostNameDelete(uuid, localId, costName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristiccostNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String costName = "costName_example";
        ResponseEntity<TapiTopologyCostCharacteristic> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristiccostNameGet(uuid, localId, costName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristiccostNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String costName = "costName_example";
        TapiTopologyCostCharacteristic body = new TapiTopologyCostCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdCostCharacteristiccostNamePut(uuid, localId, costName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdDiversityExclusionvirtualNwServiceUuidGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String virtualNwServiceUuid = "virtualNwServiceUuid_example";
        ResponseEntity<TapiVirtualNetworkVirtualNwServiceRef> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdDiversityExclusionvirtualNwServiceUuidGet(uuid, localId, virtualNwServiceUuid);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiVirtualNetworkVirtualNetworkConstraint> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristicPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiTopologyLatencyCharacteristic body = new TapiTopologyLatencyCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristicPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristictrafficPropertyNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String trafficPropertyName = "trafficPropertyName_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristictrafficPropertyNameDelete(uuid, localId, trafficPropertyName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristictrafficPropertyNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String trafficPropertyName = "trafficPropertyName_example";
        ResponseEntity<TapiTopologyLatencyCharacteristic> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristictrafficPropertyNameGet(uuid, localId, trafficPropertyName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristictrafficPropertyNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String trafficPropertyName = "trafficPropertyName_example";
        TapiTopologyLatencyCharacteristic body = new TapiTopologyLatencyCharacteristic();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdLatencyCharacteristictrafficPropertyNamePut(uuid, localId, trafficPropertyName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamevalueNameDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamevalueNameDelete(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamevalueNameGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        ResponseEntity<TapiCommonNameAndValue> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamevalueNameGet(uuid, localId, valueName);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamevalueNamePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        String valueName = "valueName_example";
        TapiCommonNameAndValue body = new TapiCommonNameAndValue();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdNamevalueNamePut(uuid, localId, valueName, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiVirtualNetworkVirtualNetworkConstraint body = new TapiVirtualNetworkVirtualNetworkConstraint();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonCapacity> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityPostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacity body = new TapiCommonCapacity();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityPost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityPutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacity body = new TapiCommonCapacity();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityPut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizeDeleteTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizeDelete(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizeGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonCapacityValue> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizeGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizePostTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacityValue body = new TapiCommonCapacityValue();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizePost(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizePutTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        TapiCommonCapacityValue body = new TapiCommonCapacityValue();
        ResponseEntity<Void> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdRequestedCapacityTotalSizePut(uuid, localId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdSinkServiceEndPointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonServiceInterfacePointRef> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdSinkServiceEndPointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdSrcServiceEndPointGetTest() throws Exception {
        String uuid = "uuid_example";
        String localId = "localId_example";
        ResponseEntity<TapiCommonServiceInterfacePointRef> responseEntity = api.dataContextVirtualNetworkContextVirtualNwServiceuuidVnwConstraintlocalIdSrcServiceEndPointGet(uuid, localId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
