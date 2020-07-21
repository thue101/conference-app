# Conference App
## Introduction
Conference App is a conference scheduling app, which holds different sessions and allow speakers to be assigned as the presenter of a session. The speaker can present more than one session. This app plans and organise conference topics and sessions for the organizers. It is built using Maven Project type, Java languange and Spring Boot.

## Frameworks
### Back-end
#### Spring Boot
One of the hassles while creating web applications using the Spring Framework is that it involves a lot of configuration. Spring Boot makes it possible to write configuration-less web application because it does a lot for you out of the box. For example, if you add HSQLDB as a dependency to your application, it will automatically provide a datasource to it. If you add the spring-boot-starter-web dependency, then you can start writing controllers for creating a web application
#### Spring Data JPA
Spring Data JPA allows you to create repositories for your data without even having to write a lot of code. The only code you need is a simple interface that extends from another interface and then you're done. With Spring Boot you can even leave the configuration behind for configuring Spring Data JPA, so now it's even easier.

## Installation
#### Setting Up Database
MySQL is used which is an Open Source, high performance , feature-rich relational database management software and  is a freely available open source Relational Database Management System (RDBMS) that uses Structured Query Language (SQL). The foundation for any good well-built application begins with the data and the database layout, MySql schema and sample data is provided for installation into your local server to use for the application. There are a lot tables there but the main focus is the speakers and sessions and their relationships.Connect the DB to your app using MySql connector dependecy and configuring your datasource in the application properties.
#### JPA Models
Add some JPA entities so that you talk to the database structures, the model classes will be Session and Speaker class. These two entities are tied together with a JPA relationship that matches the database table relationship, they are connected via a join table by a many to many relationship.
#### JPA Repository
Add JPA repositories interfaces for Sessions and Speakers and extend JpaRepository.
#### API REST Controllers
Create controllers which will handle the API endpoints which are based on REST (Representational State Transfer). By adding RestController annotation the Spring Model View Controller will know that these are controllers. CRUD API endpoints for speakers and sessions are also created.

## Running the App
#### Swagger
It is and a set of open- source tool that allows you to work with REST API endpoints.The goal of Swagger is to enable client and documentation systems to update at the same pace as the server. Enable Swagger by adding Swagger dependency into your pom.xml and then create Swagger java Configuration class. Run your app and connect to the Swagger UI and test your endpoints. 
#### Testing
Testing REST APIs using Junit and Spring Boot with in memory H2 Database
