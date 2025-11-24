# HealthCare Tracker (Java OOP Project)

A simple HealthCare Tracking System developed in Java using OOP concepts , custom exceptions, ArrayList from Java Collections, and basic input validation.

This project allows the user to register a patient, enter multiple health records, and display the summary of all readings. 

##Features

-Add patient details (name, age, problem )
-Add multiple health records (temperature, heart rate, blood pressure, fever, cold etc. )
-Uses **Person-> Patient (Inheritance)**
-Uses **RecordManager** to store and manage records 
-Uses **ArrayList** for storing multiple health entries
-Custom exception: 'WrongInputException' for handling invalid data
-Invalid validation using loops and condiional statements
-Displays all records and summary 

## Java Concepts Used

### OOP Concepts

-**Class and Object**
-**Inheritance**(`Patient` extends `Person`)
-**Encapsulation**(private fields + getters/setters)
-**Abstraction**(RecordManager hides internal logic)
-**Polymorphism(toString override)**

### Java Basics

-Loops (`for`, `while`)
-Conditional statements (`if-else`)
-Methods & constructors
-User input using `Scanner`


### Collection Framework

-**ArrayList** to store multiple health records 


### Error Handling

-Custom exception - `WrongInputException`
-Try-catch blocks


## Project Structure- 

HealthCareTracker/
|
|---src/
| |---Main.java
| |---Person.java
| |---Patient.java
| |---RecordManager.java
| |---WrongInputException.java
|
|---screenshots/
|  |---(output images)
|
|---README.md


## How to Run the Program 

###Using Command Line

1. Open a terminal and navigate to the project folder:
   ```bash

   cd path/to/project

2. Compile the java files:

     javac Main.java

3. Run the program:

     java Main



###Using an IDE 

1. Open the project in your IDE (Eclipse, IntelliJ, VS Code, etc.).
2. Locate the class containing the main method.
3. Right-click and select Run. 



### Sample Output 


---

## Future Enhancements

-Add database connectivity
-Add GUI using JavaFX/Swing
-Add more health parameters
-Generate automated health reports
-Add multiple patients

---

## Author

Created as part of the VIT Flipped Classroom Project
Java-based HealthCare Monitoring System




