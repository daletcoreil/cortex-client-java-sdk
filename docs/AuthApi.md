# AuthApi

All URIs are relative to *https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccessToken**](AuthApi.md#getAccessToken) | **POST** /auth/access-token |  |


<a id="getAccessToken"></a>
# **getAccessToken**
> Token getAccessToken(client, secret)



Generate new access token

### Example
```java
// Import classes:
import com.dalet.mediator.cortex.ApiClient;
import com.dalet.mediator.cortex.ApiException;
import com.dalet.mediator.cortex.Configuration;
import com.dalet.mediator.cortex.models.*;
import com.dalet.mediator.cortex.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String client = "client_example"; // String | client_id of the application
    String secret = "secret_example"; // String | secret_key of the application
    try {
      Token result = apiInstance.getAccessToken(client, secret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getAccessToken");
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
| **client** | **String**| client_id of the application | |
| **secret** | **String**| secret_key of the application | |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success response |  -  |
| **401** | Invalid secret or client |  -  |

