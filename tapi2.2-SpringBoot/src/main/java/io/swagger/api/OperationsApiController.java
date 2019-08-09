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
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
@Controller
public class OperationsApiController implements OperationsApi {

    private static final Logger log = LoggerFactory.getLogger(OperationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OperationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<TapiPathComputationComputeP2PPath> operationsComputeP2PPathPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationComputeP2PPath>(objectMapper.readValue("{ \"output\" : { \"service\" : \"\" } }", TapiPathComputationComputeP2PPath.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationComputeP2PPath>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationComputeP2PPath>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityCreateConnectivityService> operationsCreateConnectivityServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityCreateConnectivityService>(objectMapper.readValue("{ \"output\" : { \"service\" : \"\" } }", TapiConnectivityCreateConnectivityService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityCreateConnectivityService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityCreateConnectivityService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationCreateNotificationSubscriptionService> operationsCreateNotificationSubscriptionServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationCreateNotificationSubscriptionService>(objectMapper.readValue("{ \"output\" : { \"subscription-service\" : \"\" } }", TapiNotificationCreateNotificationSubscriptionService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationCreateNotificationSubscriptionService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationCreateNotificationSubscriptionService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamCreateOamJob> operationsCreateOamJobPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamCreateOamJob>(objectMapper.readValue("{ \"output\" : { \"oam-job\" : \"\" } }", TapiOamCreateOamJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamCreateOamJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamCreateOamJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamCreateOamProfile> operationsCreateOamProfilePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamCreateOamProfile>(objectMapper.readValue("{ \"output\" : { \"oam-profile\" : \"\" } }", TapiOamCreateOamProfile.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamCreateOamProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamCreateOamProfile>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamCreateOamServicePoint> operationsCreateOamServicePointPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamCreateOamServicePoint>(objectMapper.readValue("{ \"output\" : { \"oam-service-point\" : \"\" } }", TapiOamCreateOamServicePoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamCreateOamServicePoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamCreateOamServicePoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamCreateOamService> operationsCreateOamServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamCreateOamService>(objectMapper.readValue("{ \"output\" : { \"oam-service\" : \"\" } }", TapiOamCreateOamService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamCreateOamService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamCreateOamService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiVirtualNetworkCreateVirtualNetworkService> operationsCreateVirtualNetworkServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiVirtualNetworkCreateVirtualNetworkService>(objectMapper.readValue("{ \"output\" : { \"service\" : \"\" } }", TapiVirtualNetworkCreateVirtualNetworkService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiVirtualNetworkCreateVirtualNetworkService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiVirtualNetworkCreateVirtualNetworkService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> operationsDeleteConnectivityServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> operationsDeleteNotificationSubscriptionServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> operationsDeleteOamJobPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> operationsDeleteOamProfilePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> operationsDeleteOamServicePointPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> operationsDeleteOamServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationDeleteP2PPath> operationsDeleteP2PPathPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationDeleteP2PPath>(objectMapper.readValue("{ \"output\" : { \"service\" : \"\" } }", TapiPathComputationDeleteP2PPath.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationDeleteP2PPath>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationDeleteP2PPath>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiVirtualNetworkDeleteVirtualNetworkService> operationsDeleteVirtualNetworkServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiVirtualNetworkDeleteVirtualNetworkService>(objectMapper.readValue("{ \"output\" : { \"service\" : \"\" } }", TapiVirtualNetworkDeleteVirtualNetworkService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiVirtualNetworkDeleteVirtualNetworkService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiVirtualNetworkDeleteVirtualNetworkService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityGetConnectionDetails> operationsGetConnectionDetailsPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityGetConnectionDetails>(objectMapper.readValue("{ \"output\" : { \"connection\" : \"\" } }", TapiConnectivityGetConnectionDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityGetConnectionDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityGetConnectionDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityGetConnectionEndPointDetails> operationsGetConnectionEndPointDetailsPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityGetConnectionEndPointDetails>(objectMapper.readValue("{ \"output\" : { \"connection-end-point\" : \"\" } }", TapiConnectivityGetConnectionEndPointDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityGetConnectionEndPointDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityGetConnectionEndPointDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityGetConnectivityServiceDetails> operationsGetConnectivityServiceDetailsPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityGetConnectivityServiceDetails>(objectMapper.readValue("{ \"output\" : { \"service\" : \"\" } }", TapiConnectivityGetConnectivityServiceDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityGetConnectivityServiceDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityGetConnectivityServiceDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityGetConnectivityServiceList> operationsGetConnectivityServiceListPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityGetConnectivityServiceList>(objectMapper.readValue("{ \"output\" : { \"service\" : [ \"\", \"\" ] } }", TapiConnectivityGetConnectivityServiceList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityGetConnectivityServiceList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityGetConnectivityServiceList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyGetLinkDetails> operationsGetLinkDetailsPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyGetLinkDetails>(objectMapper.readValue("{ \"output\" : { \"link\" : \"\" } }", TapiTopologyGetLinkDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyGetLinkDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyGetLinkDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamGetMeg> operationsGetMegPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamGetMeg>(objectMapper.readValue("{ \"output\" : { \"meg\" : \"\" } }", TapiOamGetMeg.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamGetMeg>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamGetMeg>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyGetNodeDetails> operationsGetNodeDetailsPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyGetNodeDetails>(objectMapper.readValue("{ \"output\" : { \"node\" : \"\" } }", TapiTopologyGetNodeDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyGetNodeDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyGetNodeDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyGetNodeEdgePointDetails> operationsGetNodeEdgePointDetailsPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyGetNodeEdgePointDetails>(objectMapper.readValue("{ \"output\" : { \"node-edge-point\" : \"\" } }", TapiTopologyGetNodeEdgePointDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyGetNodeEdgePointDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyGetNodeEdgePointDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationGetNotificationList> operationsGetNotificationListPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationGetNotificationList>(objectMapper.readValue("{ \"output\" : { \"notification\" : [ \"\", \"\" ] } }", TapiNotificationGetNotificationList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationGetNotificationList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationGetNotificationList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationGetNotificationSubscriptionServiceDetails> operationsGetNotificationSubscriptionServiceDetailsPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationGetNotificationSubscriptionServiceDetails>(objectMapper.readValue("{ \"output\" : { \"subscription-service\" : \"\" } }", TapiNotificationGetNotificationSubscriptionServiceDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationGetNotificationSubscriptionServiceDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationGetNotificationSubscriptionServiceDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationGetNotificationSubscriptionServiceList> operationsGetNotificationSubscriptionServiceListPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationGetNotificationSubscriptionServiceList>(objectMapper.readValue("{ \"output\" : { \"subscription-service\" : [ \"\", \"\" ] } }", TapiNotificationGetNotificationSubscriptionServiceList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationGetNotificationSubscriptionServiceList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationGetNotificationSubscriptionServiceList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamGetOamJobList> operationsGetOamJobListPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamGetOamJobList>(objectMapper.readValue("{ \"output\" : { \"oam-job\" : [ \"\", \"\" ] } }", TapiOamGetOamJobList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamGetOamJobList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamGetOamJobList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamGetOamJob> operationsGetOamJobPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamGetOamJob>(objectMapper.readValue("{ \"output\" : { \"oam-job\" : \"\" } }", TapiOamGetOamJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamGetOamJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamGetOamJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamGetOamProfileList> operationsGetOamProfileListPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamGetOamProfileList>(objectMapper.readValue("{ \"output\" : { \"oam-profile\" : [ \"\", \"\" ] } }", TapiOamGetOamProfileList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamGetOamProfileList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamGetOamProfileList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamGetOamProfile> operationsGetOamProfilePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamGetOamProfile>(objectMapper.readValue("{ \"output\" : { \"oam-profile\" : \"\" } }", TapiOamGetOamProfile.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamGetOamProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamGetOamProfile>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamGetOamServiceList> operationsGetOamServiceListPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamGetOamServiceList>(objectMapper.readValue("{ \"output\" : { \"oam-service\" : [ \"\", \"\" ] } }", TapiOamGetOamServiceList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamGetOamServiceList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamGetOamServiceList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamGetOamServicePoint> operationsGetOamServicePointPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamGetOamServicePoint>(objectMapper.readValue("{ \"output\" : { \"oam-service-point\" : \"\" } }", TapiOamGetOamServicePoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamGetOamServicePoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamGetOamServicePoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamGetOamService> operationsGetOamServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamGetOamService>(objectMapper.readValue("{ \"output\" : { \"oam-service\" : \"\" } }", TapiOamGetOamService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamGetOamService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamGetOamService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonGetServiceInterfacePointDetails> operationsGetServiceInterfacePointDetailsPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonGetServiceInterfacePointDetails>(objectMapper.readValue("{ \"output\" : { \"sip\" : \"\" } }", TapiCommonGetServiceInterfacePointDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonGetServiceInterfacePointDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonGetServiceInterfacePointDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiCommonGetServiceInterfacePointList> operationsGetServiceInterfacePointListPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiCommonGetServiceInterfacePointList>(objectMapper.readValue("{ \"output\" : { \"sip\" : [ \"\", \"\" ] } }", TapiCommonGetServiceInterfacePointList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiCommonGetServiceInterfacePointList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiCommonGetServiceInterfacePointList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationGetSupportedNotificationTypes> operationsGetSupportedNotificationTypesPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationGetSupportedNotificationTypes>(objectMapper.readValue("{ \"output\" : { \"supported-object-types\" : [ \"supported-object-types\", \"supported-object-types\" ], \"supported-notification-types\" : [ \"supported-notification-types\", \"supported-notification-types\" ] } }", TapiNotificationGetSupportedNotificationTypes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationGetSupportedNotificationTypes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationGetSupportedNotificationTypes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyGetTopologyDetails> operationsGetTopologyDetailsPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyGetTopologyDetails>(objectMapper.readValue("{ \"output\" : { \"topology\" : \"\" } }", TapiTopologyGetTopologyDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyGetTopologyDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyGetTopologyDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiTopologyGetTopologyList> operationsGetTopologyListPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiTopologyGetTopologyList>(objectMapper.readValue("{ \"output\" : { \"topology\" : [ \"\", \"\" ] } }", TapiTopologyGetTopologyList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiTopologyGetTopologyList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiTopologyGetTopologyList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiVirtualNetworkGetVirtualNetworkServiceDetails> operationsGetVirtualNetworkServiceDetailsPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiVirtualNetworkGetVirtualNetworkServiceDetails>(objectMapper.readValue("{ \"output\" : { \"service\" : \"\" } }", TapiVirtualNetworkGetVirtualNetworkServiceDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiVirtualNetworkGetVirtualNetworkServiceDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiVirtualNetworkGetVirtualNetworkServiceDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiVirtualNetworkGetVirtualNetworkServiceList> operationsGetVirtualNetworkServiceListPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiVirtualNetworkGetVirtualNetworkServiceList>(objectMapper.readValue("{ \"output\" : { \"service\" : [ \"\", \"\" ] } }", TapiVirtualNetworkGetVirtualNetworkServiceList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiVirtualNetworkGetVirtualNetworkServiceList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiVirtualNetworkGetVirtualNetworkServiceList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiPathComputationOptimizeP2PPath> operationsOptimizeP2PPathPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiPathComputationOptimizeP2PPath>(objectMapper.readValue("{ \"output\" : { \"service\" : \"\" } }", TapiPathComputationOptimizeP2PPath.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiPathComputationOptimizeP2PPath>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiPathComputationOptimizeP2PPath>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiConnectivityUpdateConnectivityService> operationsUpdateConnectivityServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiConnectivityUpdateConnectivityService>(objectMapper.readValue("{ \"output\" : { \"service\" : \"\" } }", TapiConnectivityUpdateConnectivityService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiConnectivityUpdateConnectivityService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiConnectivityUpdateConnectivityService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiNotificationUpdateNotificationSubscriptionService> operationsUpdateNotificationSubscriptionServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiNotificationUpdateNotificationSubscriptionService>(objectMapper.readValue("{ \"output\" : { \"subscription-service\" : \"\" } }", TapiNotificationUpdateNotificationSubscriptionService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiNotificationUpdateNotificationSubscriptionService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiNotificationUpdateNotificationSubscriptionService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamUpdateOamJob> operationsUpdateOamJobPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamUpdateOamJob>(objectMapper.readValue("{ \"output\" : { \"oam-job\" : \"\" } }", TapiOamUpdateOamJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamUpdateOamJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamUpdateOamJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamUpdateOamProfile> operationsUpdateOamProfilePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamUpdateOamProfile>(objectMapper.readValue("{ \"output\" : { \"oam-profile\" : \"\" } }", TapiOamUpdateOamProfile.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamUpdateOamProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamUpdateOamProfile>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamUpdateOamServicePoint> operationsUpdateOamServicePointPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamUpdateOamServicePoint>(objectMapper.readValue("{ \"output\" : { \"oam-service-point\" : \"\" } }", TapiOamUpdateOamServicePoint.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamUpdateOamServicePoint>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamUpdateOamServicePoint>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TapiOamUpdateOamService> operationsUpdateOamServicePost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TapiOamUpdateOamService>(objectMapper.readValue("{ \"output\" : { \"oam-service\" : \"\" } }", TapiOamUpdateOamService.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TapiOamUpdateOamService>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TapiOamUpdateOamService>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> operationsUpdateServiceInterfacePointPost(@ApiParam(value = ""  )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
