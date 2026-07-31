# 💰 Smart Expense Tracker API

A RESTful API for managing personal expenses built using **Java Spring Boot**.

This project provides APIs to create, view, filter, calculate, and delete personal expenses.

---

# 🚀 Features

The application supports:

- ✅ Add a new expense
- ✅ View all expenses
- ✅ Filter expenses by category
- ✅ Calculate total expenses
- ✅ Calculate total expenses by category
- ✅ Delete an expense
- ✅ Interactive API documentation using Swagger/OpenAPI
- ✅ Automated testing using JUnit 5

---

# 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 17 | Programming Language |
| Spring Boot | Backend REST API Framework |
| Maven | Dependency Management & Build Tool |
| Spring Web | REST API Development |
| JUnit 5 | Unit Testing |
| MockMvc | Controller/API Testing |
| Swagger/OpenAPI | API Documentation |

---

# 📂 Project Structure

```
expensetracker
│
├── README.md
├── AI_NOTES.md
├── pom.xml
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/expensetracker/
│       │       │
│       │       ├── controller/
│       │       │   └── ExpenseController.java
│       │       │
│       │       ├── service/
│       │       │   └── ExpenseService.java
│       │       │
│       │       ├── model/
│       │       │   └── Expense.java
│       │       │
│       │       └── ExpenseTrackerApplication.java
│       │
│       └── resources/
│           └── application.properties
│
└── tests/
    ├── ExpenseControllerTest.java
    └── ExpenseServiceTest.java
```

---

# ⚙️ Setup Instructions

## Prerequisites

Make sure you have:

- Java 17 or above installed
- Maven (or use the included Maven Wrapper)

Check Java version:

```bash
java -version
```

---

# 📥 Installation

Clone the repository:

```bash
git clone <repository-url>
```

Move into the project directory:

```bash
cd expensetracker
```

Build the project:

### Linux / macOS

```bash
./mvnw clean install
```

### Windows

```bash
mvnw.cmd clean install
```

---

# ▶️ Running the Application

Start the Spring Boot application:

### Linux / macOS

```bash
./mvnw spring-boot:run
```

### Windows

```bash
mvnw.cmd spring-boot:run
```

The application will start on:

```
http://localhost:8082
```

---

# 🧪 Running Tests

Run all tests:

### Linux / macOS

```bash
./mvnw test
```

### Windows

```bash
mvnw.cmd test
```

---

## Test Coverage

### Service Layer Tests

`ExpenseServiceTest.java`

Tests business logic:

- ✅ Add expense
- ✅ Get all expenses
- ✅ Filter expenses by category
- ✅ Calculate total expenses
- ✅ Delete expense

---

### Controller/API Tests

`ExpenseControllerTest.java`

Tests REST endpoints:

- ✅ POST `/expenses`
- ✅ GET `/expenses`
- ✅ GET `/expenses/category/{category}`
- ✅ GET `/expenses/total`
- ✅ DELETE `/expenses/{id}`

---

# 🌐 API Documentation

## Base URL

```
http://localhost:8082
```

---

# 📌 API Endpoints

## 1. Add Expense

### POST

```
POST /expenses
```

### Request Body

```json
{
    "title": "Food",
    "amount": 500,
    "category": "Restaurant",
    "date": "2026-08-01"
}
```

---

## 2. Get All Expenses

### GET

```
GET /expenses
```

Returns all available expenses.

---

## 3. Filter Expenses By Category

### GET

```
GET /expenses/category/{category}
```

Example:

```
GET /expenses/category/Food
```

---

## 4. Calculate Total Expenses

### GET

```
GET /expenses/total
```

Returns the total amount spent.

---

## 5. Calculate Total Expenses By Category

### GET

```
GET /expenses/total/{category}
```

Example:

```
GET /expenses/total/Food
```

---

## 6. Delete Expense

### DELETE

```
DELETE /expenses/{id}
```

Example:

```
DELETE /expenses/1
```

---

# 📖 Swagger/OpenAPI Documentation

This project includes Swagger UI for interactive API testing.

Open:

```
http://localhost:8082/swagger-ui/index.html
```

Swagger UI allows you to:

- View all available endpoints
- Send API requests from the browser
- Check request and response formats
- Explore API documentation interactively

---

# 💾 Data Storage

The application uses **in-memory storage**.

No external database is required.

Expense data exists only while the application is running.

---

# 🏗️ Design Approach

The project follows a layered architecture:

```
Controller Layer
        |
        ↓
Service Layer
        |
        ↓
Model Layer
```

Design decisions:

- Implemented RESTful APIs using Spring Boot.
- Used service layer separation for business logic.
- Used dependency injection for maintainable code.
- Added automated tests for both service and API layers.
- Used in-memory storage as allowed by the assignment.
- Added Swagger documentation as a bonus feature.

---

# 👨‍💻 Author

**Abhay Rathore**