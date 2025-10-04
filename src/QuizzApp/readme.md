# Online Quiz App - Java Internship Task 8

This is a console-based quiz application developed in Java as part of the Elevate Labs Java Developer Internship program. The application reads quiz questions from an external file, presents them to the user, and calculates a final score.

## Features

- **Dynamic Quiz Content**: The application reads all quiz questions from a `QuestionBank.json` (or `.txt`) file, making it easy to add or modify questions without changing the code.
- **Randomized Questions**: The application shuffles the questions at the beginning of each round to provide a new experience for the user every time.
- **Interactive Console UI**: The user interacts with the application through the console, answering multiple-choice questions one at a time.
- **Monotonous Question Flow**: The quiz presents 10 questions from the shuffled list in each round. This ensures questions are not repeated in a single session.
- **Continuous Play**: After each round, the user can choose to play another round or exit the application.
- **Score Calculation**: The application tracks and displays the user's score at the end of each quiz round.

## Tools Used

- **Java**: The core programming language for the application logic.
- **Java Collections Framework**: Used to store and manage the quiz questions in memory (e.g., `List`, `ArrayList`).
- **`java.io` and `java.util.Scanner`**: Employed for file I/O operations to read questions from the external file.
- **`java.util.Collections`**: Used to shuffle the list of questions for randomization.

## How to Run the Application

1.  **Clone the Repository**: Clone this repository to your local machine.
    ```bash
    git clone [Your-GitHub-Repo-URL]
    ```
2.  **Navigate to the Project Directory**:
    ```bash
    cd <project-name>
    ```
3.  **Ensure the Question File Exists**: Make sure a file named `QuestionBank.json` (or whatever you named it) is in the root directory of your project. This file must contain the quiz questions in the specified format: `Question|Option1|Option2|Option3|CorrectAnswer`.
4.  **Compile and Run**:
    - **Using an IDE**: Open the project in your favorite Java IDE (e.g., IntelliJ, Eclipse, VS Code) and run the `Main.java` file.
    - **Using the Command Line**:
      ```bash
      # Compile the Java files
      javac *.java

      # Run the main class
      java Main
      ```

The application will launch in your console, and you can start playing the quiz!
