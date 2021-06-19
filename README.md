## Java Canvas-LMS API
> Author : Cameron Thacker (University of Delaware)

![dependencies](https://img.shields.io/badge/dependencies-up%20to%20date-brightgreen)
![Retrofit](https://img.shields.io/badge/retrofit-2.7.2-green)
![Gson](https://img.shields.io/badge/gson-2.9.0-green)
![Selenium](https://img.shields.io/badge/selenium-4.0.0-green)
![WebdriverManager](https://img.shields.io/badge/WebdriverManager-3.7.1-green)

#### Description :
This project includes brief implementation of the Canvas-LMS(Learning Management System) API using Java. The dependencies utilized are Retrofit, Gson, Selenium, and Webdriver Manager(Selenium and Webdriver Manager are mainly used for the Oauth2 methods)

##### Project Structure :
- All the Json response payloads are structured to be converted into Pojo(Plain old java object), in the [Controller](https://github.com/cthacker-udel/Java-Canvas-LMS-API/tree/master/src/main/java/Controller) folder.
- The [Model](https://github.com/cthacker-udel/Java-Canvas-LMS-API/tree/master/src/main/java/Model) folder contains all the main Rest API requests, the functions that make the initial request to receive the response.
- The [getRequests](https://github.com/cthacker-udel/Java-Canvas-LMS-API/tree/master/src/main/java/getRequests) folder contains all the extensions of the [CanvasClient](https://github.com/cthacker-udel/Java-Canvas-LMS-API/blob/master/src/main/java/Client/CanvasClient.java) class that adds more of a structured implementation, each class in the [getRequests](https://github.com/cthacker-udel/Java-Canvas-LMS-API/tree/master/src/main/java/getRequests) folder represents an implementation of each API(Admin API, Accounts API, for example)
- The [Client](https://github.com/cthacker-udel/Java-Canvas-LMS-API/blob/master/src/main/java/Client/CanvasClient.java) folder contains the most crucial implementation, the [CanvasClient](https://github.com/cthacker-udel/Java-Canvas-LMS-API/blob/master/src/main/java/Client/CanvasClient.java) class that ties together all the other classes to implement multiple apis from one source. The [CanvasRestAPI](https://github.com/cthacker-udel/Java-Canvas-LMS-API/blob/master/src/main/java/Client/CanvasRestAPI.java) class that contains all the methods to implement the requests, forms the proper requests and makes the request, collects the converted response, and returns the object in the method.


### Implementation

- Oauth2 Methods
- Account Domain API
- Account Notifications API
- Account Reports API
- Accounts API
- Admins API
- Analytics API
- Account External Feeds API
