# Java JDBC - Employee Database App

[cite_start]This repository contains a Java console application that demonstrates how to connect to a PostgreSQL database and perform **CRUD** (Create, Read, Update, Delete) operations on an employee database[cite: 4, 8]. [cite_start]This project was completed as part of the Elevate Labs Java Developer Internship[cite: 2].

### 🛠️ Tools & Technologies Used
* [cite_start]**Java**: The programming language for the application[cite: 4].
* [cite_start]**PostgreSQL**: The relational database used to store employee data[cite: 4].
* [cite_start]**JDBC (Java Database Connectivity)**: The Java API used to connect to and query the database[cite: 12, 22].
* [cite_start]**PostgreSQL JDBC Driver**: The specific driver that enables the Java application to communicate with PostgreSQL[cite: 4].
* [cite_start]**IntelliJ IDEA / VS Code**: The IDE used for development[cite: 4].

***

### ✨ Key Concepts Demonstrated
* [cite_start]**JDBC Connectivity**: Establishing a connection to a database using the `DriverManager` class[cite: 17].
* [cite_start]**CRUD Operations**: Implementing the four fundamental database operations[cite: 8, 22]:
    * **C**reate: Adding new employee records.
    * **R**ead: Viewing existing employee records.
    * **U**pdate: Modifying employee information.
    * **D**elete: Removing employee records.
* [cite_start]**PreparedStatement**: Using `PreparedStatement` to execute parameterized SQL queries, which is a key method for preventing **SQL injection attacks**[cite: 13, 16].
* [cite_start]**ResultSet**: Handling query results and iterating through them to retrieve data[cite: 19].
* [cite_start]**Resource Management**: Properly managing and closing JDBC resources to prevent memory leaks[cite: 18].

***

### 🚀 How to Run the Application
1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/your-username/your-repo-name.git](https://github.com/your-username/your-repo-name.git)
    cd your-repo-name
    ```
2.  **Set up the Database**:
    * Ensure you have PostgreSQL installed and running.
    * Open your PostgreSQL client and create a new database named `empdb`.
    * Create the `employees` table using the following SQL script:
        ```sql
        CREATE TABLE employees (
            id SERIAL PRIMARY KEY,
            name VARCHAR(100) NOT NULL,
            department VARCHAR(100),
            salary DECIMAL(10, 2)
        );
        ```
3.  **Configure the JDBC Driver**:
    * Download the PostgreSQL JDBC driver (`postgresql-<version>.jar`).
    * [cite_start]Add the `.jar` file to your project's classpath in IntelliJ IDEA or VS Code[cite: 4].
4.  **Update Database Credentials**:
    * Open `EMP_DB_APP.java`.
    * Update the `url`, `user`, and `password` variables to match your PostgreSQL setup.
5.  **Compile and Run**:
    * Run the `EMP_DB_APP.java` file. The application will launch in the console, providing a menu to perform CRUD operations on the database.

***

### 📄 Submission
* [cite_start]Create a new GitHub repository for this task[cite: 40].
* [cite_start]Add your code, any screenshots, and this `README.md` file to the repository[cite: 41].
* [cite_start]Submit the GitHub repository link via the provided submission form[cite: 24, 43].
