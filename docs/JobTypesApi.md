# JobTypesApi

All URIs are relative to *https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllJobTypes**](JobTypesApi.md#getAllJobTypes) | **GET** /job-types |  |


<a id="getAllJobTypes"></a>
# **getAllJobTypes**
> List&lt;JobType&gt; getAllJobTypes(projectServiceId)



Get all job types including their metadata.

### Example
```java
// Import classes:
import com.dalet.mediator.cortex.ApiClient;
import com.dalet.mediator.cortex.ApiException;
import com.dalet.mediator.cortex.Configuration;
import com.dalet.mediator.cortex.auth.*;
import com.dalet.mediator.cortex.models.*;
import com.dalet.mediator.cortex.api.JobTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");
    
    // Configure API key authorization: tokenSignature
    ApiKeyAuth tokenSignature = (ApiKeyAuth) defaultClient.getAuthentication("tokenSignature");
    tokenSignature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenSignature.setApiKeyPrefix("Token");

    JobTypesApi apiInstance = new JobTypesApi(defaultClient);
    String projectServiceId = "projectServiceId_example"; // String | Project service id of the client which associated to the request
    try {
      List<JobType> result = apiInstance.getAllJobTypes(projectServiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTypesApi#getAllJobTypes");
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
| **projectServiceId** | **String**| Project service id of the client which associated to the request | |

### Return type

[**List&lt;JobType&gt;**](JobType.md)

### Authorization

[tokenSignature](../README.md#tokenSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |

