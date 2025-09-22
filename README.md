````
# Elevate Labs - Java Developer Internship

This repository serves as a portfolio of my work and solutions for the tasks assigned during the Elevate Labs Java Developer Internship. Each task is organized into a dedicated section for clarity and easy navigation.

***

## Task 1: Java Console Calculator

### Project Overview
The objective of this task was to design and implement a fundamental console-based calculator using Java. The application interacts with the user via the terminal, allowing them to perform basic arithmetic operations: addition, subtraction, multiplication, and division.

### Key Features
* **Menu-Driven Interface:** The program presents a clear, numbered menu, guiding the user to select their desired operation.
* **Encapsulated Logic:** The calculator's logic is cleanly separated into its own `Calculator` class, demonstrating a basic understanding of Object-Oriented Programming (OOP) principles.
* **Continuous Operation:** A `while` loop allows the calculator to run continuously, enabling the user to perform multiple calculations without restarting the program.
* **Graceful Exit:** The loop is controlled by a boolean flag, allowing the program to terminate gracefully when the user selects the "EXIT" option.
* **Robust Input Handling:** The application uses the `java.util.Scanner` class to read user input.
* **Divide-by-Zero Protection:** A conditional check (`if (num2 == 0)`) is implemented within the `divide` method to prevent an `ArithmeticException` and display a user-friendly error message.

### Concepts Applied
This task allowed me to solidify my understanding of several core Java concepts:
* **Methods:** Creating and calling methods to perform specific functions (`add`, `subtract`, `multiply`, `divide`).
* **Loops:** Utilizing a `while` loop for repeated execution and controlled program flow.
* **Conditionals:** Using a `switch` statement to handle user choices and an `if` statement for error handling.
* **Input/Output (I/O):** Interacting with the user via the console using `Scanner` and `System.out.println`.
* **Object-Oriented Programming (OOP):** Implementing a basic class (`Calculator`) and instantiating an object to access its methods.

### How to Run
1.  **Clone the repository** to your local machine.
2.  Navigate to the `src` directory containing the `BasicCalculator.java` file.
3.  **Compile** the Java source code from your terminal.
    ```bash
    javac BasicCalculator.java
    ```
4.  **Execute** the compiled program.
    ```bash
    java BasicCalculator
    ```
5.  Follow the prompts in the console to use the calculator.

***

## Future Tasks

This section will be updated with details on subsequent tasks as they are completed.
````
