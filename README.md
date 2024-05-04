# Sprint Boot with Postgresql Demo Application

#### This is a simple Spring Boot application demonstrating the usage of PostgreSQL database with Spring Data JPA.

### Technologies Used:

#### Spring Boot:
Description: Spring Boot is an open-source Java-based framework used to create stand-alone, production-grade Spring-based Applications. It provides a rapid application development platform with sensible defaults and convention over configuration.
Purpose: In this application, Spring Boot is used to simplify the setup and configuration of the Spring-based application.

#### Spring Data JPA:
Description: Spring Data JPA is a part of the larger Spring Data family that provides easy and efficient data access for relational databases. It provides repository support, query abstractions, and automatic CRUD operations.
Purpose: The CourseRepo interface extends JpaRepository to enable basic CRUD operations for the Course entity without writing boilerplate code.
PostgreSQL Database
Description: PostgreSQL is a powerful, open-source relational database system known for its reliability, robustness, and advanced features such as ACID compliance, support for JSON data types, and extensibility.
Purpose: The application uses PostgreSQL as its database backend to store and manage data related to courses.

#### Lombok:
Description: Lombok is a Java library that helps reduce boilerplate code by providing annotations to generate getter, setter, constructor, and other methods during compilation.
Purpose: Lombok annotations (@Data, @NoArgsConstructor, @AllArgsConstructor) are used in the Course class to reduce the amount of repetitive code.

#### Jakarta Persistence API (JPA):
Description: Jakarta Persistence API, formerly known as Java Persistence API (JPA), is a Java specification for accessing, persisting, and managing data between Java objects/classes and a relational database.
Purpose: Annotations such as @Entity, @Table, @Id, and @Column from JPA are used to define the entity class and map it to the corresponding database table and columns.

#### Spring MVC:
Description: Spring MVC (Model-View-Controller) is a web application framework built on top of the Spring framework. It follows the MVC design pattern and provides features for building web applications.
Purpose: The CourseController class uses Spring MVC annotations (@RestController, @PostMapping) to define RESTful endpoints for adding courses.

#### Spring Framework:
Description: Spring Framework is a comprehensive programming and configuration model for modern Java-based enterprise applications. It provides infrastructure support for developing robust, scalable applications.
Purpose: Spring Framework forms the foundation for other Spring projects and provides features such as dependency injection, transaction management, and aspect-oriented programming.

#### PostgreSQL JDBC Driver:
Description: The PostgreSQL JDBC Driver is a Java library that enables Java applications to connect to and interact with PostgreSQL databases.
Purpose: It is used by Spring Boot to establish a connection to the PostgreSQL database specified in the application properties.

#### Application Configuration:

The application is configured using the following properties:

```lombok.config
spring.application.name: Specifies the name of the Spring Boot application.
spring.datasource.url: JDBC URL for connecting to the PostgreSQL database.
spring.datasource.username: Username for authenticating with the PostgreSQL database.
spring.datasource.password: Password for authenticating with the PostgreSQL database.
spring.datasource.driver-class-name: Fully qualified name of the JDBC driver class for PostgreSQL.
spring.jpa.properties.hibernate.dialect: Specifies the Hibernate dialect for PostgreSQL.
spring.jpa.hibernate.ddl-auto: Specifies the behavior of Hibernate's schema generation tool.
```
