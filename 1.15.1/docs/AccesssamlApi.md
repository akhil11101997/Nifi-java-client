# AccesssamlApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**samlLocalLogout**](AccesssamlApi.md#samlLocalLogout) | **GET** /access/saml/local-logout | Local logout when SAML is enabled, does not communicate with the IDP.
[**samlLoginExchange**](AccesssamlApi.md#samlLoginExchange) | **POST** /access/saml/login/exchange | Retrieves a JWT following a successful login sequence using the configured SAML identity provider.
[**samlLoginHttpPostConsumer**](AccesssamlApi.md#samlLoginHttpPostConsumer) | **POST** /access/saml/login/consumer | Processes the SSO response from the SAML identity provider for HTTP-POST binding.
[**samlLoginHttpRedirectConsumer**](AccesssamlApi.md#samlLoginHttpRedirectConsumer) | **GET** /access/saml/login/consumer | Processes the SSO response from the SAML identity provider for HTTP-REDIRECT binding.
[**samlLoginRequest**](AccesssamlApi.md#samlLoginRequest) | **GET** /access/saml/login/request | Initiates an SSO request to the configured SAML identity provider.
[**samlMetadata**](AccesssamlApi.md#samlMetadata) | **GET** /access/saml/metadata | Retrieves the service provider metadata.
[**samlSingleLogoutHttpPostConsumer**](AccesssamlApi.md#samlSingleLogoutHttpPostConsumer) | **POST** /access/saml/single-logout/consumer | Processes a SingleLogout message from the configured SAML identity provider using the HTTP-POST binding.
[**samlSingleLogoutHttpRedirectConsumer**](AccesssamlApi.md#samlSingleLogoutHttpRedirectConsumer) | **GET** /access/saml/single-logout/consumer | Processes a SingleLogout message from the configured SAML identity provider using the HTTP-REDIRECT binding.
[**samlSingleLogoutRequest**](AccesssamlApi.md#samlSingleLogoutRequest) | **GET** /access/saml/single-logout/request | Initiates a logout request using the SingleLogout service of the configured SAML identity provider.


<a name="samlLocalLogout"></a>
# **samlLocalLogout**
> samlLocalLogout()

Local logout when SAML is enabled, does not communicate with the IDP.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.akhil11101997.nifi.client.ApiException;
//import com.github.akhil11101997.nifi.client.api.AccesssamlApi;


AccesssamlApi apiInstance = new AccesssamlApi();
try {
    apiInstance.samlLocalLogout();
} catch (ApiException e) {
    System.err.println("Exception when calling AccesssamlApi#samlLocalLogout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="samlLoginExchange"></a>
# **samlLoginExchange**
> String samlLoginExchange()

Retrieves a JWT following a successful login sequence using the configured SAML identity provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.akhil11101997.nifi.client.ApiException;
//import com.github.akhil11101997.nifi.client.api.AccesssamlApi;


AccesssamlApi apiInstance = new AccesssamlApi();
try {
    String result = apiInstance.samlLoginExchange();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccesssamlApi#samlLoginExchange");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: text/plain

<a name="samlLoginHttpPostConsumer"></a>
# **samlLoginHttpPostConsumer**
> samlLoginHttpPostConsumer()

Processes the SSO response from the SAML identity provider for HTTP-POST binding.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.akhil11101997.nifi.client.ApiException;
//import com.github.akhil11101997.nifi.client.api.AccesssamlApi;


AccesssamlApi apiInstance = new AccesssamlApi();
try {
    apiInstance.samlLoginHttpPostConsumer();
} catch (ApiException e) {
    System.err.println("Exception when calling AccesssamlApi#samlLoginHttpPostConsumer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: */*

<a name="samlLoginHttpRedirectConsumer"></a>
# **samlLoginHttpRedirectConsumer**
> samlLoginHttpRedirectConsumer()

Processes the SSO response from the SAML identity provider for HTTP-REDIRECT binding.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.akhil11101997.nifi.client.ApiException;
//import com.github.akhil11101997.nifi.client.api.AccesssamlApi;


AccesssamlApi apiInstance = new AccesssamlApi();
try {
    apiInstance.samlLoginHttpRedirectConsumer();
} catch (ApiException e) {
    System.err.println("Exception when calling AccesssamlApi#samlLoginHttpRedirectConsumer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="samlLoginRequest"></a>
# **samlLoginRequest**
> samlLoginRequest()

Initiates an SSO request to the configured SAML identity provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.akhil11101997.nifi.client.ApiException;
//import com.github.akhil11101997.nifi.client.api.AccesssamlApi;


AccesssamlApi apiInstance = new AccesssamlApi();
try {
    apiInstance.samlLoginRequest();
} catch (ApiException e) {
    System.err.println("Exception when calling AccesssamlApi#samlLoginRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="samlMetadata"></a>
# **samlMetadata**
> samlMetadata()

Retrieves the service provider metadata.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.akhil11101997.nifi.client.ApiException;
//import com.github.akhil11101997.nifi.client.api.AccesssamlApi;


AccesssamlApi apiInstance = new AccesssamlApi();
try {
    apiInstance.samlMetadata();
} catch (ApiException e) {
    System.err.println("Exception when calling AccesssamlApi#samlMetadata");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/samlmetadata+xml

<a name="samlSingleLogoutHttpPostConsumer"></a>
# **samlSingleLogoutHttpPostConsumer**
> samlSingleLogoutHttpPostConsumer()

Processes a SingleLogout message from the configured SAML identity provider using the HTTP-POST binding.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.akhil11101997.nifi.client.ApiException;
//import com.github.akhil11101997.nifi.client.api.AccesssamlApi;


AccesssamlApi apiInstance = new AccesssamlApi();
try {
    apiInstance.samlSingleLogoutHttpPostConsumer();
} catch (ApiException e) {
    System.err.println("Exception when calling AccesssamlApi#samlSingleLogoutHttpPostConsumer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="samlSingleLogoutHttpRedirectConsumer"></a>
# **samlSingleLogoutHttpRedirectConsumer**
> samlSingleLogoutHttpRedirectConsumer()

Processes a SingleLogout message from the configured SAML identity provider using the HTTP-REDIRECT binding.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.akhil11101997.nifi.client.ApiException;
//import com.github.akhil11101997.nifi.client.api.AccesssamlApi;


AccesssamlApi apiInstance = new AccesssamlApi();
try {
    apiInstance.samlSingleLogoutHttpRedirectConsumer();
} catch (ApiException e) {
    System.err.println("Exception when calling AccesssamlApi#samlSingleLogoutHttpRedirectConsumer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="samlSingleLogoutRequest"></a>
# **samlSingleLogoutRequest**
> samlSingleLogoutRequest()

Initiates a logout request using the SingleLogout service of the configured SAML identity provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.akhil11101997.nifi.client.ApiException;
//import com.github.akhil11101997.nifi.client.api.AccesssamlApi;


AccesssamlApi apiInstance = new AccesssamlApi();
try {
    apiInstance.samlSingleLogoutRequest();
} catch (ApiException e) {
    System.err.println("Exception when calling AccesssamlApi#samlSingleLogoutRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

