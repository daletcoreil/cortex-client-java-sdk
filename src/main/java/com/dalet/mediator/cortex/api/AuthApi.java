/*
 * Dalet Media Cortex API
 * # Scope Dalet Mediator API allows you to submit long running media jobs managed by Dalet services.  Long running media jobs include: - **Media processing** such as transcoding or automatic QC. - **Automatic metadata extraction** such as automatic speech transcription or face detection.  The Dalet Mediator API is a REST API with typed schema for the payload. # Architecture Job processing is performed on the cloud via dynamic combination of microservices. Dalet Mediator adopts the [EBU MCMA] architecture.  The key objectives of this architecture are to support: - Job management and monitoring - Long running transactions - Event based communication pattern - Service registration and discovery - Horizontal scalability in an elastic manner  The architecture is implemented using the serverless approach - relying on  independent microservices accessible through well documented REST endpoints and sharing a common object model. ## Roles The following services are involved in the processing of media jobs exposed through the Dalet Media Mediator API: - **Mediator**: this is the main entry point to the architecture; this API endpoint supports: 1. Checking authentication using an API key and a token mechanism 2. Verifying quota restrictions before accepting a submitted job 3. Keeping track of usage so that job processing can be tracked and billed 4. Keeping track of jobs metadata as a job repository - **Job Processor**: once a job request is accepted by the mediator, it is assigned to a Job Processor. The Job Processor dispatches the job to an appropriate Job Worker (depending on the job profile and other criteria such as load on the system and cost of operation).  It then keeps track of the progress of the job and its status until completion and possible failures and timeout.  It reports progress to the Mediator through notifications. - **Job Worker**: The Job Worker performs the actual work on the media object, for example, AI metadata extraction (AME) or essence transcoding.  It reports progress to the Job Processor through notifications. - **Service Registry**: The Service Registry keeps track of all active services in the architecture. It is queried by the Mediator and by Processors to discover candidate services to perform jobs.  It is updated whenever a new service is launched or stopped.  The Service Registry also stores the list of all job profiles supported by one of the Job Workers deployed in the architecture. The Dalet Mediator API abstracts away from the complexity of this orchestration and provides a simple endpoint to submit long running jobs and monitor the progress of their execution.  It serves as a facade for the additional technical services for authentication, usage monitoring and service registry.  [EBU MCMA]: /https://tech.ebu.ch/groups/mcma 'EBU MCMA' ## Job Lifecycle ![Job Lifecyle Diagram](./job_lifecycle.svg 'Job Lifecycle Diagram')  ## Authentication To use the Dalet Mediator API - you must obtain an APIKey from Dalet.  This key comes in the form of two parameters: * client ID * secret  Given these two parameters, a client program must first obtain an access token (GET /auth/access-token) and then associate this token to every subsequent calls.  When the token expires, the API will return a 401 error code.  In this case, the client must request a new token and resubmit the request. 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: cortexsupport@dalet.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dalet.mediator.cortex.api;

import com.dalet.mediator.cortex.ApiCallback;
import com.dalet.mediator.cortex.ApiClient;
import com.dalet.mediator.cortex.ApiException;
import com.dalet.mediator.cortex.ApiResponse;
import com.dalet.mediator.cortex.Configuration;
import com.dalet.mediator.cortex.Pair;
import com.dalet.mediator.cortex.ProgressRequestBody;
import com.dalet.mediator.cortex.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.dalet.mediator.cortex.model.Token;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getAccessToken
     * @param client client_id of the application (required)
     * @param secret secret_key of the application (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid secret or client </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccessTokenCall(String client, String secret, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/access-token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (client != null) {
            localVarHeaderParams.put("client", localVarApiClient.parameterToString(client));
        }

        if (secret != null) {
            localVarHeaderParams.put("secret", localVarApiClient.parameterToString(secret));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAccessTokenValidateBeforeCall(String client, String secret, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new ApiException("Missing the required parameter 'client' when calling getAccessToken(Async)");
        }

        // verify the required parameter 'secret' is set
        if (secret == null) {
            throw new ApiException("Missing the required parameter 'secret' when calling getAccessToken(Async)");
        }

        return getAccessTokenCall(client, secret, _callback);

    }

    /**
     * 
     * Generate new access token
     * @param client client_id of the application (required)
     * @param secret secret_key of the application (required)
     * @return Token
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid secret or client </td><td>  -  </td></tr>
     </table>
     */
    public Token getAccessToken(String client, String secret) throws ApiException {
        ApiResponse<Token> localVarResp = getAccessTokenWithHttpInfo(client, secret);
        return localVarResp.getData();
    }

    /**
     * 
     * Generate new access token
     * @param client client_id of the application (required)
     * @param secret secret_key of the application (required)
     * @return ApiResponse&lt;Token&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid secret or client </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Token> getAccessTokenWithHttpInfo(String client, String secret) throws ApiException {
        okhttp3.Call localVarCall = getAccessTokenValidateBeforeCall(client, secret, null);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Generate new access token
     * @param client client_id of the application (required)
     * @param secret secret_key of the application (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid secret or client </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccessTokenAsync(String client, String secret, final ApiCallback<Token> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccessTokenValidateBeforeCall(client, secret, _callback);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
