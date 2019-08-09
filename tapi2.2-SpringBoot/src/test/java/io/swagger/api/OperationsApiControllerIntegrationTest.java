package io.swagger.api;

import io.swagger.model.TapiCommonGetServiceInterfacePointDetails;
import io.swagger.model.TapiCommonGetServiceInterfacePointList;
import io.swagger.model.TapiConnectivityCreateConnectivityService;
import io.swagger.model.TapiConnectivityGetConnectionDetails;
import io.swagger.model.TapiConnectivityGetConnectionEndPointDetails;
import io.swagger.model.TapiConnectivityGetConnectivityServiceDetails;
import io.swagger.model.TapiConnectivityGetConnectivityServiceList;
import io.swagger.model.TapiConnectivityUpdateConnectivityService;
import io.swagger.model.TapiNotificationCreateNotificationSubscriptionService;
import io.swagger.model.TapiNotificationGetNotificationList;
import io.swagger.model.TapiNotificationGetNotificationSubscriptionServiceDetails;
import io.swagger.model.TapiNotificationGetNotificationSubscriptionServiceList;
import io.swagger.model.TapiNotificationGetSupportedNotificationTypes;
import io.swagger.model.TapiNotificationUpdateNotificationSubscriptionService;
import io.swagger.model.TapiOamCreateOamJob;
import io.swagger.model.TapiOamCreateOamProfile;
import io.swagger.model.TapiOamCreateOamService;
import io.swagger.model.TapiOamCreateOamServicePoint;
import io.swagger.model.TapiOamGetMeg;
import io.swagger.model.TapiOamGetOamJob;
import io.swagger.model.TapiOamGetOamJobList;
import io.swagger.model.TapiOamGetOamProfile;
import io.swagger.model.TapiOamGetOamProfileList;
import io.swagger.model.TapiOamGetOamService;
import io.swagger.model.TapiOamGetOamServiceList;
import io.swagger.model.TapiOamGetOamServicePoint;
import io.swagger.model.TapiOamUpdateOamJob;
import io.swagger.model.TapiOamUpdateOamProfile;
import io.swagger.model.TapiOamUpdateOamService;
import io.swagger.model.TapiOamUpdateOamServicePoint;
import io.swagger.model.TapiPathComputationComputeP2PPath;
import io.swagger.model.TapiPathComputationDeleteP2PPath;
import io.swagger.model.TapiPathComputationOptimizeP2PPath;
import io.swagger.model.TapiTopologyGetLinkDetails;
import io.swagger.model.TapiTopologyGetNodeDetails;
import io.swagger.model.TapiTopologyGetNodeEdgePointDetails;
import io.swagger.model.TapiTopologyGetTopologyDetails;
import io.swagger.model.TapiTopologyGetTopologyList;
import io.swagger.model.TapiVirtualNetworkCreateVirtualNetworkService;
import io.swagger.model.TapiVirtualNetworkDeleteVirtualNetworkService;
import io.swagger.model.TapiVirtualNetworkGetVirtualNetworkServiceDetails;
import io.swagger.model.TapiVirtualNetworkGetVirtualNetworkServiceList;

import java.util.*;

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
public class OperationsApiControllerIntegrationTest {

    @Autowired
    private OperationsApi api;

    @Test
    public void operationsComputeP2PPathPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiPathComputationComputeP2PPath> responseEntity = api.operationsComputeP2PPathPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsCreateConnectivityServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiConnectivityCreateConnectivityService> responseEntity = api.operationsCreateConnectivityServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsCreateNotificationSubscriptionServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiNotificationCreateNotificationSubscriptionService> responseEntity = api.operationsCreateNotificationSubscriptionServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsCreateOamJobPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamCreateOamJob> responseEntity = api.operationsCreateOamJobPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsCreateOamProfilePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamCreateOamProfile> responseEntity = api.operationsCreateOamProfilePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsCreateOamServicePointPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamCreateOamServicePoint> responseEntity = api.operationsCreateOamServicePointPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsCreateOamServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamCreateOamService> responseEntity = api.operationsCreateOamServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsCreateVirtualNetworkServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiVirtualNetworkCreateVirtualNetworkService> responseEntity = api.operationsCreateVirtualNetworkServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsDeleteConnectivityServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.operationsDeleteConnectivityServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsDeleteNotificationSubscriptionServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.operationsDeleteNotificationSubscriptionServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsDeleteOamJobPostTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.operationsDeleteOamJobPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsDeleteOamProfilePostTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.operationsDeleteOamProfilePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsDeleteOamServicePointPostTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.operationsDeleteOamServicePointPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsDeleteOamServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.operationsDeleteOamServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsDeleteP2PPathPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiPathComputationDeleteP2PPath> responseEntity = api.operationsDeleteP2PPathPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsDeleteVirtualNetworkServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiVirtualNetworkDeleteVirtualNetworkService> responseEntity = api.operationsDeleteVirtualNetworkServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetConnectionDetailsPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiConnectivityGetConnectionDetails> responseEntity = api.operationsGetConnectionDetailsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetConnectionEndPointDetailsPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiConnectivityGetConnectionEndPointDetails> responseEntity = api.operationsGetConnectionEndPointDetailsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetConnectivityServiceDetailsPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiConnectivityGetConnectivityServiceDetails> responseEntity = api.operationsGetConnectivityServiceDetailsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetConnectivityServiceListPostTest() throws Exception {
        ResponseEntity<TapiConnectivityGetConnectivityServiceList> responseEntity = api.operationsGetConnectivityServiceListPost();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetLinkDetailsPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiTopologyGetLinkDetails> responseEntity = api.operationsGetLinkDetailsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetMegPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamGetMeg> responseEntity = api.operationsGetMegPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetNodeDetailsPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiTopologyGetNodeDetails> responseEntity = api.operationsGetNodeDetailsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetNodeEdgePointDetailsPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiTopologyGetNodeEdgePointDetails> responseEntity = api.operationsGetNodeEdgePointDetailsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetNotificationListPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiNotificationGetNotificationList> responseEntity = api.operationsGetNotificationListPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetNotificationSubscriptionServiceDetailsPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiNotificationGetNotificationSubscriptionServiceDetails> responseEntity = api.operationsGetNotificationSubscriptionServiceDetailsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetNotificationSubscriptionServiceListPostTest() throws Exception {
        ResponseEntity<TapiNotificationGetNotificationSubscriptionServiceList> responseEntity = api.operationsGetNotificationSubscriptionServiceListPost();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetOamJobListPostTest() throws Exception {
        ResponseEntity<TapiOamGetOamJobList> responseEntity = api.operationsGetOamJobListPost();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetOamJobPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamGetOamJob> responseEntity = api.operationsGetOamJobPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetOamProfileListPostTest() throws Exception {
        ResponseEntity<TapiOamGetOamProfileList> responseEntity = api.operationsGetOamProfileListPost();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetOamProfilePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamGetOamProfile> responseEntity = api.operationsGetOamProfilePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetOamServiceListPostTest() throws Exception {
        ResponseEntity<TapiOamGetOamServiceList> responseEntity = api.operationsGetOamServiceListPost();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetOamServicePointPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamGetOamServicePoint> responseEntity = api.operationsGetOamServicePointPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetOamServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamGetOamService> responseEntity = api.operationsGetOamServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetServiceInterfacePointDetailsPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiCommonGetServiceInterfacePointDetails> responseEntity = api.operationsGetServiceInterfacePointDetailsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetServiceInterfacePointListPostTest() throws Exception {
        ResponseEntity<TapiCommonGetServiceInterfacePointList> responseEntity = api.operationsGetServiceInterfacePointListPost();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetSupportedNotificationTypesPostTest() throws Exception {
        ResponseEntity<TapiNotificationGetSupportedNotificationTypes> responseEntity = api.operationsGetSupportedNotificationTypesPost();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetTopologyDetailsPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiTopologyGetTopologyDetails> responseEntity = api.operationsGetTopologyDetailsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetTopologyListPostTest() throws Exception {
        ResponseEntity<TapiTopologyGetTopologyList> responseEntity = api.operationsGetTopologyListPost();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetVirtualNetworkServiceDetailsPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiVirtualNetworkGetVirtualNetworkServiceDetails> responseEntity = api.operationsGetVirtualNetworkServiceDetailsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsGetVirtualNetworkServiceListPostTest() throws Exception {
        ResponseEntity<TapiVirtualNetworkGetVirtualNetworkServiceList> responseEntity = api.operationsGetVirtualNetworkServiceListPost();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsOptimizeP2PPathPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiPathComputationOptimizeP2PPath> responseEntity = api.operationsOptimizeP2PPathPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsUpdateConnectivityServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiConnectivityUpdateConnectivityService> responseEntity = api.operationsUpdateConnectivityServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsUpdateNotificationSubscriptionServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiNotificationUpdateNotificationSubscriptionService> responseEntity = api.operationsUpdateNotificationSubscriptionServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsUpdateOamJobPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamUpdateOamJob> responseEntity = api.operationsUpdateOamJobPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsUpdateOamProfilePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamUpdateOamProfile> responseEntity = api.operationsUpdateOamProfilePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsUpdateOamServicePointPostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamUpdateOamServicePoint> responseEntity = api.operationsUpdateOamServicePointPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsUpdateOamServicePostTest() throws Exception {
        Object body = null;
        ResponseEntity<TapiOamUpdateOamService> responseEntity = api.operationsUpdateOamServicePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void operationsUpdateServiceInterfacePointPostTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.operationsUpdateServiceInterfacePointPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
