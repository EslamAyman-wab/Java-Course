# GEMINI.md - Instructional Context

## Project Overview
This is a **Java Learning Repository** structured as an IntelliJ IDEA project. It contains a vast collection of coding challenges, exercises, and experimental test files designed to teach Java from fundamentals to advanced Object-Oriented Programming (OOP).

### Main Technologies
- **Java**: Standard Edition (likely Java 8+ given the use of modern syntax and conventions).
- **IntelliJ IDEA**: The project is pre-configured for this IDE (`.idea` folder and `Java_Course.iml`).

### Core Architecture
The repository is divided into several logical sections:
- **`src/A_Course/A_Challenges`**: Contains categorized challenges (A, B, C) ranging from basic conversions to complex OOP simulations like Bank Accounts, Smart Kitchens, and Car systems.
- **`src/A_Course/B_Coding_Exercise`**: Structured exercises (A-E) following a progressive learning path, focusing on logic, control flow, and deep OOP concepts.
- **`src/B_Exercises`**: Specialized practice areas including CodingBat (Arrays) and W3resource (OOP, Constructors, Polymorphism).
- **`src/D_Test_Area`**: A playground for quick experimentation and testing of specific concepts outside the structured curriculum.

## Building and Running
As a collection of independent exercises, most files contain their own `main` method or are meant to be used by a `Main` class within the same package.

### Key Commands (Inferred)
- **Compile a file**: `javac src/path/to/File.java`
- **Run a file**: `java -cp src A_Course.A_Challenges.A_Ch.Ch_01` (Note: Must use full package name)
- **IDE**: Open the root directory in IntelliJ IDEA and use the built-in "Run" icons.

## Development Conventions
- **Packaging**: Rigorous use of package declarations matching the directory structure (e.g., `package A_Course.A_Challenges.A_Ch;`).
- **Naming**: 
  - Classes: Usually PascalCase (e.g., `SimpleCalculator`), though some challenges use `Ch_XX` or `Ex_XX` patterns.
  - Fields/Methods: Typically camelCase.
- **OOP Principles**: Extensive use of:
  - **Encapsulation**: Private fields with public getters and setters.
  - **Inheritance**: Using `extends` for specialized classes (e.g., `Worker` -> `Employee` -> `Salaried_Emplyee`).
  - **Composition**: Building complex objects from simpler ones (e.g., `SmartKitchen` has a `Refrigerator`).
  - **Polymorphism**: Overriding methods in subclasses to provide specific behavior.

## Usage for Gemini CLI
When helping the user with this project:
- **Contextual Awareness**: Always check the package declaration when creating or moving files.
- **Explain Concepts**: When modifying challenges (especially in `B_Ch` or `D_Ex`), provide pedagogical explanations of the underlying Java concepts being practiced.
- **Standard Library**: Favor built-in Java libraries (e.g., `java.util.Scanner`, `java.util.Arrays`) unless otherwise specified.
