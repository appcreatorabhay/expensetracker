# AI Usage Notes - Smart Expense Tracker API

## Overview

AI tools were used during this assignment as a development assistant for reviewing approaches, debugging issues, suggesting improvements, and improving documentation.

AI was used as a supporting tool only. The final implementation, design decisions, testing, and validation were completed by me.

---

# 1. AI-Generated vs My Work

## MY Work

I implemented the core application functionality, including:

### Project Development

- Created the Spring Boot project structure.
- Configured Maven dependencies.
- Designed the package structure.
- Implemented the `Expense` model with:
    - ID
    - Title
    - Amount
    - Category
    - Date

### Backend Implementation

Developed the service and controller layers for:

- Adding expenses
- Viewing all expenses
- Filtering expenses by category
- Calculating total expenses
- Calculating category-wise totals
- Deleting expenses

The service layer logic and application flow were mainly designed and implemented by me.

### Testing

Created JUnit 5 test cases:

**ExpenseServiceTest**
- Tested business logic such as adding, filtering, calculating totals, and deleting expenses.

**ExpenseControllerTest**
- Tested REST API endpoints and verified API responses.

### Documentation

Prepared:

- README.md
- AI_NOTES.md

with setup instructions, API documentation, and project details.

---

## **AI-Assisted Work**

AI was used for:

- Reviewing Spring Boot structure and REST API design.
- Suggesting controller test scenarios and edge cases.
- Helping debug testing and configuration issues.
- Improving documentation formatting.

For controller testing, AI suggestions helped me understand additional API testing scenarios. I reviewed those suggestions, modified them where required, and implemented the final test cases.

The service layer implementation and business logic were mainly developed by me.

---

# **2. Validation, Testing, and Changes Made**

AI suggestions were reviewed before using them. They were not directly copied into the project.

I validated the implementation by:

- Running the Spring Boot application successfully.
- Testing all required API endpoints.
- Verifying expense creation, retrieval, filtering, calculations, and deletion.
- Running automated tests using:

```bash
./mvnw test
```

Changes made after reviewing AI suggestions:

- Simplified approaches that added unnecessary complexity.
- Added meaningful assertions in test cases.
- Removed unnecessary features and dependencies.
- Ensured the implementation matched the assignment requirements.

---

# 3. AI Suggestions Not Used and Reasons

## Database Integration

AI suggested using database solutions such as MySQL or PostgreSQL.

I decided not to use a database because:

- The assignment allowed in-memory storage.
- A database was not required.
- Keeping the solution simple improved maintainability.

---

## Authentication Features

AI suggested adding authentication features such as JWT and user management.

I did not implement them because:

- Authentication was outside the assignment scope.
- It would introduce unnecessary complexity.

---

## Additional Features

Features such as advanced search and complex analytics were considered but not implemented because the priority was completing the required functionality with clean and maintainable code.

---

# Final Reflection

AI helped improve productivity by providing suggestions, debugging support, and review assistance.

However, I maintained ownership of the architecture, implementation, testing, and final technical decisions.

This assignment helped me use AI effectively while maintaining a clear understanding of the code and engineering practices.