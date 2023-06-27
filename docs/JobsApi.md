# JobsApi

All URIs are relative to *https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJob**](JobsApi.md#createJob) | **POST** /jobs |  |
| [**getJobById**](JobsApi.md#getJobById) | **GET** /jobs/{jobId} |  |


<a id="createJob"></a>
# **createJob**
> MediatorJob createJob(jobMediatorInput)



Submit a new job to the Dalet Media Mediator

### Example
```java
// Import classes:
import com.dalet.mediator.cortex.ApiClient;
import com.dalet.mediator.cortex.ApiException;
import com.dalet.mediator.cortex.Configuration;
import com.dalet.mediator.cortex.auth.*;
import com.dalet.mediator.cortex.models.*;
import com.dalet.mediator.cortex.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");
    
    // Configure API key authorization: tokenSignature
    ApiKeyAuth tokenSignature = (ApiKeyAuth) defaultClient.getAuthentication("tokenSignature");
    tokenSignature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenSignature.setApiKeyPrefix("Token");

    JobsApi apiInstance = new JobsApi(defaultClient);
    JobMediatorInput jobMediatorInput = new JobMediatorInput(); // JobMediatorInput | Object describing the Job to be executed.
    try {
      MediatorJob result = apiInstance.createJob(jobMediatorInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#createJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobMediatorInput** | [**JobMediatorInput**](JobMediatorInput.md)| Object describing the Job to be executed. | |

### Return type

[**MediatorJob**](MediatorJob.md)

### Authorization

[tokenSignature](../README.md#tokenSignature)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success response |  -  |
| **400** | Bad request |  -  |
| **401** | Authorization request fail |  -  |
| **502** | Failed request.  Reason is most likely quota violation. |  -  |

<a id="getJobById"></a>
# **getJobById**
> MediatorJob getJobById(jobId)



Get job

### Example
```java
// Import classes:
import com.dalet.mediator.cortex.ApiClient;
import com.dalet.mediator.cortex.ApiException;
import com.dalet.mediator.cortex.Configuration;
import com.dalet.mediator.cortex.auth.*;
import com.dalet.mediator.cortex.models.*;
import com.dalet.mediator.cortex.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");
    
    // Configure API key authorization: tokenSignature
    ApiKeyAuth tokenSignature = (ApiKeyAuth) defaultClient.getAuthentication("tokenSignature");
    tokenSignature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenSignature.setApiKeyPrefix("Token");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String jobId = "5b166783-7ab5-39b8-fcb5-6255dd115412"; // String | ID of the job as returned in JobMediatorEntity
    try {
      MediatorJob result = apiInstance.getJobById(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getJobById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| ID of the job as returned in JobMediatorEntity | |

### Return type

[**MediatorJob**](MediatorJob.md)

### Authorization

[tokenSignature](../README.md#tokenSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |
| **404** | Job with required ID does not exist |  -  |

