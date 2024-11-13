# HEALTH_CARE_MANAGEMENT
The healthcare Management System is a web-based application designed to allow users to manage their healthcare activities online. Developed as a university project, this system utilizes Java Spring Boot for backend services, HTML, CSS, and JavaScript for frontend development, and JDBC with MySQL for database operations.



The Healthcare Management System offers separate functionalities for Admin, Doctor, and Patient users.





### Usage and Functionalities

## User Functionalities
-**Register**: New users (patients) can create accounts.
-**Login**: Access account details and manage profile information.
-**Book Appointment**: Patients can book appointments with doctors for specific dates and times.
-**View Medical History**: Patients can view their previous consultations and medical records.

## Doctor Functionalities
-**Schedule Management**: Doctors can manage their availability and appointments.
-**Patient Records**: View and update medical records of patients.
-**Appointment Management**: Confirm and manage appointments with patients.

## Admin Functionalities
-**User Management**: Admin can manage user accounts for patients and doctors, including adding, editing, and deleting accounts.
-**Appointment Oversight**: Admin can view and manage all system appointments.
-**System Settings**: Configure system settings as needed, including roles and permissions.
- **Security Features**: Data protection via encryption and access control.

## Technology Stack

- **Backend**: Java, Spring Boot, JDBC
- **Frontend**: HTML, CSS, JavaScript
- **Database**: MySQL
- **Tools & Libraries**: 
  - Spring Security (for authentication and authorization)
  - JDBC (for database connectivity and operations)

## Prerequisites

To set up this project locally, you’ll need:

- **Java Development Kit (JDK)**: Version 11 or later
- **Maven**: For dependency management
- **MySQL**: Database management system
- **IDE**: Recommended IntelliJ IDEA or Eclipse
- **Git**: For version control

## Installation

### 1. Clone the Repository

```bash
git clone https://github.com/Parthamesh06/HEALTH_CARE_MANAGEMENT.git
cd HEALTH_CARE_MANAGEMENT
```

### 2. Configure the Database 

Create a new database in MySQL, then update your `application.properties` file to configure the database connection.

```properties
# application.properties

# Database configuration for MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/healthcare
spring.datasource.username=root
spring.datasource.password=Pratham@8969


spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

# Show SQL in logs (optional)
spring.jpa.show-sql=true
```

### 3. Build the Project

Use Maven to install dependencies and build the project:

```bash
mvn clean install
```

### 4. Run the Application

Run the application using Maven:

```bash
mvn spring-boot:run
```

### 5. Access the Application

Open your browser and go to `http://localhost:8080` to access the Online Banking Management System.

## Project Structure

```
healthcare-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/yourorg/healthcare/ # Java classes for controllers, services, repositories, and JDBC operations
│   │   │       ├── controller/         # Controllers for handling HTTP requests
│   │   │       ├── service/            # Services for business logic
│   │   │       ├── repository/         # Repositories for database access
│   │   │       └── model/              # Entities representing database tables
│   │   ├── resources/
│   │   │   ├── templates/              # HTML templates for views
│   │   │   └── static/                 # CSS, JS, and images for the frontend
│   └── test/                           # Unit and integration tests
├── pom.xml                             # Maven configuration file
└── README.md                           # Documentation for the project

```


## JDBC Implementation Notes

- **Database Connection**: Uses Spring's `JdbcTemplate` to connect to MySQL.
- **SQL Queries**: SQL queries are used to insert, update, and retrieve data.
- **Transaction Management**: Ensures data consistency, especially for fund transfers, with transaction handling via Spring.

## Testing
Unit and integration tests are located in the src/test/ directory to ensure each functionality works correctly.
