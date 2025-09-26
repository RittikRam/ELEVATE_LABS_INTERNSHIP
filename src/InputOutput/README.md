# Java Notes App

This is a simple, text-based notes manager built in Java. It allows a user to write notes and save them to a file, and to read all previously saved notes from the same file. The application demonstrates fundamental concepts of Java File I/O and exception handling.

---

### Key Features

* **Write Notes:** Users can write multiline notes and save them to a file named `myNotes.txt`. The notes are appended to the file, so existing notes are not overwritten.
* **Read Notes:** The application can read and display all notes from the `myNotes.txt` file.
* **Persistent Data:** All notes are saved to a file, so they remain available even after the application is closed.
* **Exception Handling:** The code includes robust exception handling to manage common issues like file not found errors (`FileNotFoundException`) and other I/O problems.
* **User-Friendly Interface:** A simple command-line menu guides the user to write, read, or exit the application.

---

### Technologies Used

* **Java:** The core programming language used to build the application.
* **`java.io` package:** Utilizes classes such as `FileWriter`, `FileReader`, and `BufferedReader` for file operations.
* **`java.util.Scanner`:** Used to handle user input from the console.

---

### How to Run

1.  **Clone the Repository:**
    ```bash
    git clone [your_github_repo_link]
    ```

2.  **Navigate to the Project Directory:**
    ```bash
    cd [your_project_directory]
    ```

3.  **Compile the Java File:**
    ```bash
    javac FileReaderWriter.java
    ```

4.  **Run the Application:**
    ```bash
    java InputOutput.FileReaderWriter
    ```
