# CustomerServicesApi

All URIs are relative to *https://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerPost**](CustomerServicesApi.md#createCustomerPost) | **POST** /createCustomer | Create a Customer
[**deleteCustomerIdDelete**](CustomerServicesApi.md#deleteCustomerIdDelete) | **DELETE** /deleteCustomer/{id} | Delete a Customer
[**displayAllCustomersGet**](CustomerServicesApi.md#displayAllCustomersGet) | **GET** /displayAllCustomers | Display All Customers
[**pingGet**](CustomerServicesApi.md#pingGet) | **GET** /ping | Server heartbeat operation
[**updateContactNumberIdContactNumberPost**](CustomerServicesApi.md#updateContactNumberIdContactNumberPost) | **POST** /updateContactNumber/{id}/{contactNumber} | Update Partial Customer Information
[**updateCustomerPost**](CustomerServicesApi.md#updateCustomerPost) | **POST** /updateCustomer | Update a Customer

<a name="createCustomerPost"></a>
# **createCustomerPost**
> Customer createCustomerPost(name, address, contactNumber, email)

Create a Customer

This API will create a customer in customer database

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerServicesApi;


CustomerServicesApi apiInstance = new CustomerServicesApi();
String name = "name_example"; // String | Name of the Customer
String address = "address_example"; // String | Name of the Customer
String contactNumber = "contactNumber_example"; // String | Name of the Customer
String email = "email_example"; // String | Name of the Customer
try {
    Customer result = apiInstance.createCustomerPost(name, address, contactNumber, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerServicesApi#createCustomerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the Customer |
 **address** | **String**| Name of the Customer |
 **contactNumber** | **String**| Name of the Customer |
 **email** | **String**| Name of the Customer |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteCustomerIdDelete"></a>
# **deleteCustomerIdDelete**
> deleteCustomerIdDelete(id)

Delete a Customer

This API delete a customer from customer database

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerServicesApi;


CustomerServicesApi apiInstance = new CustomerServicesApi();
Integer id = 56; // Integer | id of the customer, which user wants to delete from customer database
try {
    apiInstance.deleteCustomerIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerServicesApi#deleteCustomerIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the customer, which user wants to delete from customer database |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="displayAllCustomersGet"></a>
# **displayAllCustomersGet**
> Customers displayAllCustomersGet(bodyLimit, pageLimit)

Display All Customers

This API fetch and display all custmers information from customer database

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerServicesApi;


CustomerServicesApi apiInstance = new CustomerServicesApi();
Integer bodyLimit = 56; // Integer | The number of customers return in a page
Integer pageLimit = 56; // Integer | The pages to return customer information
try {
    Customers result = apiInstance.displayAllCustomersGet(bodyLimit, pageLimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerServicesApi#displayAllCustomersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bodyLimit** | **Integer**| The number of customers return in a page | [optional] [enum: ]
 **pageLimit** | **Integer**| The pages to return customer information | [optional] [enum: ]

### Return type

[**Customers**](Customers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="pingGet"></a>
# **pingGet**
> pingGet()

Server heartbeat operation

This API will do a application health check

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerServicesApi;


CustomerServicesApi apiInstance = new CustomerServicesApi();
try {
    apiInstance.pingGet();
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerServicesApi#pingGet");
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateContactNumberIdContactNumberPost"></a>
# **updateContactNumberIdContactNumberPost**
> Customer updateContactNumberIdContactNumberPost(id, contactNumber)

Update Partial Customer Information

This API update a customer&#x27;s partial information, e.g. update only contact number

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerServicesApi;


CustomerServicesApi apiInstance = new CustomerServicesApi();
Integer id = 56; // Integer | id of the customer, which user wants to update
String contactNumber = "contactNumber_example"; // String | contact number of the customer, which user wants to update
try {
    Customer result = apiInstance.updateContactNumberIdContactNumberPost(id, contactNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerServicesApi#updateContactNumberIdContactNumberPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the customer, which user wants to update |
 **contactNumber** | **String**| contact number of the customer, which user wants to update |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateCustomerPost"></a>
# **updateCustomerPost**
> Customer updateCustomerPost(body)

Update a Customer

This API update all details of a customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerServicesApi;


CustomerServicesApi apiInstance = new CustomerServicesApi();
Customer body = new Customer(); // Customer | 
try {
    Customer result = apiInstance.updateCustomerPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerServicesApi#updateCustomerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)|  |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updateCustomerPost"></a>
# **updateCustomerPost**
> Customer updateCustomerPost(body)

Update a Customer

This API update all details of a customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerServicesApi;


CustomerServicesApi apiInstance = new CustomerServicesApi();
Customer body = new Customer(); // Customer | 
try {
    Customer result = apiInstance.updateCustomerPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerServicesApi#updateCustomerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)|  |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

