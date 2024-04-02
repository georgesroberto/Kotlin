# Highlevel steps

1. Introduction to web services
2. Web services and Retrofit
3. Connecting to the Internet
4. Add Internet permission and Exception Handling
5. Parse the JSON response with kotlinx.serialization
6. Solution code

## Summary

### REST web services

A web service is software-based functionality, offered over the internet, that enables your app to make requests and get data back.

Common web services use a REST architecture. Web services that offer REST architecture are known as RESTful services. RESTful web services are built using standard web components and protocols.

You make a request to a REST web service in a standardized way via URIs.

To use a web service, an app must establish a network connection and communicate with the service. Then the app must receive and parse response data into a format the app can use.

The Retrofit library is a client library that enables your app to make requests to a REST web service.

Use converters to tell Retrofit what to do with the data it sends to the web service and gets back from the web service. For example, the

ScalarsConverter treats the web service data as a String or other primitive.

To enable your app to make connections to the internet, add the "android.permission.INTERNET" permission in the Android manifest.

Lazy initialization delegates the creation of an object to the first time it is used. It creates the reference but not the object. When an object is accessed for the first time, a reference is created and used every time thereafter.

### JSON parsing

The response from a web service is often formatted in JSON, a common format to represent structured data.

A JSON object is a collection of key-value pairs.

A collection of JSON objects is a JSON array. You get a JSON array as a response from a web service.

The keys in a key-value pair are surrounded by quotes. The values can be numbers or strings.

In Kotlin, data serialization tools are available in a separate component, kotlinx.serialization. The kotlinx.serialization provides sets of libraries that convert a JSON string into Kotlin objects.

There is a community developed Kotlin Serialization Converter library for Retrofit: retrofit2-kotlinx-serialization-converter.

The kotlinx.serialization matches the keys in a JSON response with properties in a data object that have the same name.

To use a different property name for a key, annotate that property with the @SerialName annotation and the JSON key value.
