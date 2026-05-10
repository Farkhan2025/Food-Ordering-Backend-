Food Ordering System - Backend

A backend REST API application developed using Spring Boot for managing food ordering operations, hotel management, and order processing using MySQL database integration.

Features
Add, update, delete, and retrieve food items
Manage hotel details
Place and cancel food orders
Automatic food quantity management
Search food items by food name
RESTful API architecture
Layered architecture using Controller, Service, Repository, and Model
MySQL database integration using Spring Data JPA
Technologies Used
Java
Spring Boot
Spring Data JPA
MySQL
Maven
Lombok
REST APIs
Project Structure
src/main/java/com/example/FoodOrder
│
├── Controller
│   ├── FoodOrderController.java
│   ├── FoodsController.java
│   └── HotelController.java
│
├── Model
│   ├── FoodOrder.java
│   ├── Foods.java
│   └── Hotels.java
│
├── Repository
│   ├── FoodsOrderRepo.java
│   ├── FoodsRepo.java
│   └── HotelsRepo.java
│
├── Service
│   ├── FoodOrderService.java
│   ├── FoodsService.java
│   └── HotelsService.java
│
└── FoodOrderApplication.java
API Endpoints
Food APIs
Method	Endpoint	Description
POST	/food	Add a new food item
GET	/food	Retrieve all food items
GET	/food/{id}	Retrieve food item by ID
GET	/order/foodname?foodName=	Search food item by name
PUT	/food	Update food item
DELETE	/food/{id}	Delete food item by ID
DELETE	/food	Delete all food items
Hotel APIs
Method	Endpoint	Description
POST	/hotel	Add a new hotel
GET	/hotel	Retrieve all hotels
GET	/hotel/{id}	Retrieve hotel by ID
PUT	/hotel	Update hotel details
DELETE	/hotel/{id}	Delete hotel by ID
Order APIs
Method	Endpoint	Description
POST	/order	Place a food order
GET	/order	Retrieve all orders
GET	/order/{id}	Retrieve order by ID
PUT	/order	Update order details
DELETE	/order/{id}	Cancel order
Database Configuration

Configure MySQL in:

src/main/resources/application.properties
spring.application.name=FoodOrder

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/foodorder
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
How to Run the Project
1. Clone the Repository
git clone <repository-url>
2. Open the Project

Open the project using any Java IDE:

IntelliJ IDEA
Eclipse
VS Code
3. Create MySQL Database

Execute the following SQL command:

CREATE DATABASE foodorder;
4. Configure Database Credentials

Update your MySQL username and password in:

src/main/resources/application.properties
5. Run the Application

Run the main application file:

FoodOrderApplication.java

Or run using Maven:

mvn spring-boot:run
Server URL
http://localhost:8080
Key Functionalities
Food Management
Hotel Management
Order Processing
Automatic Inventory Quantity Update
CRUD Operations
Search Functionality
Future Enhancements
JWT Authentication
User Login & Registration
Payment Gateway Integration
Frontend Integration
Admin Dashboard
Order Tracking System
Author

Mohamed Farkhan N
