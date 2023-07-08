# Infractions detection system

The Infractions Detection System is a web-based application built using Spring Boot and Angular. It aims to detect and track radar violations, providing real-time notifications and reporting for efficient traffic management. The backend is built using Spring Boot, while the front end is built using Angular with Bootstrap for the user interface.

The application allows users to perform various operations, such as submitting a speeding violation, viewing violations of a vehicle owner, modifying and viewing radar data, and modifying and viewing vehicle and owner data.

The backend services include the Registration Service, Radar Service, Infraction Service, Eureka Discovery Service, Gateway Service, and Road Radar. Each service handles specific functionalities and interacts with the corresponding data repositories.

The front end is developed using Angular, providing a user-friendly interface for interacting with the system.

The application utilizes technologies such as Spring Boot, Angular, Bootstrap, H2, and various web services integrations like REST, GraphQL, SOAP, and gRPC.

#Overall, the Infraction Detection System provides a comprehensive solution for managing radar violations and ensuring efficient traffic management.




## Getting Started
### Prerequisites
Before running this application, you need to have the following software installed on your system :

```java
- Node.js version 18.2 or later
- Angular CLI version 14 or later
```

### Installation
Follow these steps to install and run the application :

1. Clone the repository :
```
git clone https://github.com/abdelkhalek-haddany/infraction-detection-project
```
2. Navigate to the backend directory and run the following command to start each Spring Boot project :
```
./mvnw spring-boot: run
```
3. Navigate to the frontend directory and run the following command to install the required packages :
```
npm install
```
4. After the packages are installed, run the following command to start the Angular application :
```
ng serve
```
5. Open your browser and navigate to `http://localhost:4200` to access the application.

## Technologies Used
I use the languages and the frameworks below:
•	Spring Boot
•	Spring Cloud
•	Eureka Descovery
•	Angular
•	Bootstrap
•	H2
## Functionalities
The application allows performing the following operations:
•	Submit a speeding violation.
•	View violations of a vehicle owner.
•	Modify and view radar data.
•	Modify and view vehicle and owner data.
•	Modify and view infraction data.


## Technical Architecture

<img src="https://github.com/el-moudni-hicham/radar-violation-detection-system/assets/85403056/f49b19b6-7f95-4f45-8b65-1060db7d9dc7">

## Class Diagram 

<img src="https://github.com/el-moudni-hicham/radar-violation-detection-system/assets/85403056/3f6bacdd-84ea-4e1e-9c9f-0ae69cca8202" width="70%">

## Backend Services
The backend consists of five services:


### Registration Service
The Registration microservice handles the management of vehicles owned by owners. Each vehicle is associated with a single owner. An owner is defined by their ID, name, date of birth, and email. A vehicle is defined by its ID, registration number, brand, fiscal power, and model.
#### Service Structure:
Entities:
  -Owner.java
  -OwnerRequest.java
  -Vehicle.java
Repositories:
  -OwnerRepository.java
  -VehicleRepository.java
Web:
  -GraphQL:
    --OwnerGraphqlController.java
    --VehicleGraphqlController.java
  gRPC:
    --GrpcConfig.java
    --OwnerGrpcService.java
  Stub:
    --OwnerGrpcServiceGrpc.java
    --OwnerService.java
  REST:
    --OwnerRestController.java
    --VehicleRestController.java
  SOAP:
    --CXFSoapWebServiceConfig.java
    --OwnerSoapController.java
    --OwnerSoapService.java
Resources:
  -application.properties
  -owner-service.proto
  -xsd-schema.xsd
GraphQL:
  -schema.graphqls


### Radar Service
The Radar microservice is responsible for managing radars. It handles radar entities defined by their ID, maximum speed limit, and coordinates (longitude and latitude).
#### Service Structure:
Entities:
  -Radar.java
Feign:
  -InfractionRestClient.java
Models:
  -Infraction.java
  -NewData.java
Repositories:
  -RadarRepository.java
Web:
  -RadarRestController.java
Resources:
  -application.properties
  -radar-service.proto
  


#### Infraction Service
The Infraction microservice is responsible for managing violations. It handles each violation, which is defined by its ID, date, the radar number that detected the offense, the vehicle registration number, the vehicle's speed, the radar's maximum speed limit, and the fine amount.
#### Service Structure:
Entities:
  -Infraction.java
Feign:
  -RadarRestClient.java
  -VehicleRestClient.java
Models:
  -NewData.java
  -Owner.java
  -Radar.java
  -Vehicle.java
Repositories:
  -InfractionRepository.java
Web:
  -InfractionRestController.java
Resources:
  -application.properties


### Eureka Discovery Service
The Eureka Discovery Service is a server-side component in the Netflix OSS stack. It allows services to register and discover each other in a microservices architecture.
#### Service Structure:
Application:
  -EurekaDiscoveryApplication.java
Resources:
  -application.properties
  
### Gateway Service
The Gateway Service is implemented using Spring Cloud Gateway. It provides a centralized entry point for routing and filtering requests to microservices in a distributed system. It enables dynamic and scalable routing based on various criteria.
#### Service Structure:
Application:
  -GatewayApplication.java
Resources:
  -application.properties
  -application.yml

### Road Radar
The Road Radar is a Java application that simulates a radar system. It generates random speeding violations and sends them to the Radar-Service.
#### Service Structure:
Application:
  -RadarDetectionService.java
  -RadarRoadApplication.java
Models:
  -NewData.java
  -Radar.java
  -Vehicle.java
Resources:
  -application.properties
  
# Test API (BackEnd)
## eureka-discovery


