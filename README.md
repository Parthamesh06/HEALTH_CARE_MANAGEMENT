# HEALTH_CARE_MANAGEMENT
The healthcare Management System is a web-based application designed to allow users to manage their healthcare activities online. Developed as a university project, this system utilizes Java Spring Boot for backend services, HTML, CSS, and JavaScript for frontend development, and JDBC with MySQL for database operations. This System offers separate functionalities for Admin, Doctor, and Patient users.




### USAGE AND FUNCTIONALITIES

## User Functionalities

- **Register**: New users (patients) can create accounts.
- **Login**: Access account details and manage profile information.
- **Book Appointment**: Patients can book appointments with doctors for specific dates and times.
- **View Medical History**: Patients can view their previous consultations and medical records.

## Doctor Functionalities

- **Schedule Management**: Doctors can manage their availability and appointments.
- **Patient Records**: View and update medical records of patients.
- **Appointment Management**: Confirm and manage appointments with patients.

## Admin Functionalities

- **User Management**: Admin can manage user accounts for patients and doctors, including adding, editing, and deleting accounts.
- **Appointment Oversight**: Admin can view and manage all system appointments.
- **System Settings**: Configure system settings as needed, including roles and permissions.
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
- **SQL Queries**: SQL queries will be used within repository interfaces for CRUD operations. Here’s an example of how to manage appointments with Spring Data JPA.

```
java
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDoctorId(Long doctorId);
    List<Appointment> findByPatientId(Long patientId);
}
```
- **Transaction Management**: For critical operations, such as booking and managing appointments, Spring’s transaction management will ensure data consistency:

```
java
@Service
public class AppointmentService {
    
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Transactional
    public Appointment bookAppointment(Appointment appointment) {
        // Logic to handle appointment booking
        return appointmentRepository.save(appointment);
    }
}
```


### Frontend: HTML and CSS
Each user type (Admin, Doctor, and Patient) will have separate HTML templates under `src/main/resources/templates/` with corresponding styling in `src/main/resources/static/`.


```
css

src/main/resources/
├── templates/
│   ├── admin/
│   │   ├── dashboard.html
│   │   ├── user_management.html
│   └── patient/
│       ├── dashboard.html
│       ├── appointment_booking.html
│       └── medical_history.html
└── static/
    ├── css/
    │   └── styles.css
    ├── js/
    │   └── scripts.js
    └── images/
```
    
## Admin Dashboard (dashboard.html)

Displays a summary of users, appointments, and system settings.

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <h1>Welcome to Admin Dashboard</h1>
    <div class="dashboard-section">
        <h2>Manage Users</h2>
        <!-- User management table -->
    </div>
    <div class="dashboard-section">
        <h2>Appointments</h2>
        <!-- Appointment management table -->
    </div>
</body>
</html>
```

## Testing
Unit and integration tests are located in the src/test/ directory to ensure each functionality works correctly.
