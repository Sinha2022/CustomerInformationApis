# swagger-java-client

Customer Information Application
- API version: 1.0.0
  - Build date: 2022-08-21T07:32:37.492Z[GMT]

A set of RESTful API's that allow user to obtain all customer information, create a customer, update a customer, delete a customer

  For more information, please visit [https://www.linkedin.com/in/sukanta-sinha-a3356218/](https://www.linkedin.com/in/sukanta-sinha-a3356218/)


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CustomerServicesApi;

import java.io.File;
import java.util.*;

public class CustomerServicesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CustomerServicesApi;

import java.io.File;
import java.util.*;

public class CustomerServicesApiExample {

    public static void main(String[] args) {
        
        CustomerServicesApi apiInstance = new CustomerServicesApi();
        Integer id = 56; // Integer | id of the customer, which user wants to delete from customer database
        try {
            apiInstance.deleteCustomerIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerServicesApi#deleteCustomerIdDelete");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CustomerServicesApi;

import java.io.File;
import java.util.*;

public class CustomerServicesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CustomerServicesApi;

import java.io.File;
import java.util.*;

public class CustomerServicesApiExample {

    public static void main(String[] args) {
        
        CustomerServicesApi apiInstance = new CustomerServicesApi();
        try {
            apiInstance.pingGet();
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerServicesApi#pingGet");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CustomerServicesApi;

import java.io.File;
import java.util.*;

public class CustomerServicesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CustomerServicesApi;

import java.io.File;
import java.util.*;

public class CustomerServicesApiExample {

    public static void main(String[] args) {
        
        CustomerServicesApi apiInstance = new CustomerServicesApi();
        Customer body = new Customer(); // Customer | 
        try {
            Customer result = apiInstance.updateCustomerPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerServicesApi#updateCustomerPost");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8443*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CustomerServicesApi* | [**createCustomerPost**](docs/CustomerServicesApi.md#createCustomerPost) | **POST** /createCustomer | Create a Customer
*CustomerServicesApi* | [**deleteCustomerIdDelete**](docs/CustomerServicesApi.md#deleteCustomerIdDelete) | **DELETE** /deleteCustomer/{id} | Delete a Customer
*CustomerServicesApi* | [**displayAllCustomersGet**](docs/CustomerServicesApi.md#displayAllCustomersGet) | **GET** /displayAllCustomers | Display All Customers
*CustomerServicesApi* | [**pingGet**](docs/CustomerServicesApi.md#pingGet) | **GET** /ping | Server heartbeat operation
*CustomerServicesApi* | [**updateContactNumberIdContactNumberPost**](docs/CustomerServicesApi.md#updateContactNumberIdContactNumberPost) | **POST** /updateContactNumber/{id}/{contactNumber} | Update Partial Customer Information
*CustomerServicesApi* | [**updateCustomerPost**](docs/CustomerServicesApi.md#updateCustomerPost) | **POST** /updateCustomer | Update a Customer

## Documentation for Models

 - [Customer](docs/Customer.md)
 - [Customers](docs/Customers.md)
 - [Error](docs/Error.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

sukantasinha2003@gmail.com
