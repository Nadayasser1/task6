# Student Management System

## Project Overview

This project is a simple Java-based Student Management System developed using Object-Oriented Programming (OOP).

The system is designed to manage students, courses, instructors, and student grades. It allows the administrator to store student and course information, register students in courses, record their exam marks, and calculate their final marks and grades.

The project was built based on the idea of managing a student's registered courses and calculating the student's final result for the academic year.

---

## Main Idea

Each student has:

* Student ID
* Student name
* Student type
* Academic year
* Registered courses
* Grades for the registered courses

A student can register for a maximum of **5 courses**.

Each course has a total mark of **100 marks**, divided into:

* First Exam: 25 marks
* Second Exam: 25 marks
* Final Exam: 50 marks

The total mark for each course is calculated from the three exams.

The student's final mark for the academic year is calculated from the marks of all registered courses, resulting in a mark out of **100**.

The final grade is then calculated based on the student's final year mark.

---

## Classes

### Student

The `Student` class represents a student and contains the student's basic information, registered courses, and grades.

It provides methods to:

* Add a course
* Remove a course
* Add a grade
* Calculate the total marks
* Calculate the final year mark
* Calculate the final year grade

The student can register for a maximum of 5 courses.

---

### UndergraduateStudent

`UndergraduateStudent` inherits from the `Student` class.

It adds the student's academic year and overrides methods such as `getStudentType()` and `toString()`.

This class is used to demonstrate **Inheritance** and **Polymorphism**.

---

### Course

The `Course` class represents a course.

Each course contains:

* Course ID
* Course name
* Instructor
* Total mark
* Weekly hours
* Registered students

The class provides methods to add and remove students and to calculate the number of registered students.

---

### Instructor

The `Instructor` class represents an instructor.

Each instructor has:

* Instructor ID
* Instructor name
* Courses taught

An instructor can have multiple courses.

---

### Grade

The `Grade` class stores the marks of a student in a specific course.

It contains:

* Course
* First exam mark
* Second exam mark
* Final exam mark

The class calculates:

* Total mark out of 100
* Letter grade

The grading system is:

| Mark     | Grade |
| -------- | ----- |
| 85 - 100 | A+    |
| 80 - 84  | A     |
| 75 - 79  | B+    |
| 70 - 74  | B     |
| 65 - 69  | C+    |
| 60 - 64  | C     |
| 50 - 59  | D     |
| Below 50 | F     |

---

## OOP Concepts Used

### Encapsulation

All important attributes in the classes are declared as `private`.

Getters and setters are used to access or modify the data.

### Inheritance

`UndergraduateStudent` inherits from `Student`.

```text
Student
   ↑
   |
UndergraduateStudent
```

### Polymorphism

An `UndergraduateStudent` object can be stored in a `Student` reference:

```java
Student student1 =
        new UndergraduateStudent("S01", "Nada", 2);
```

The overridden methods of `UndergraduateStudent` are then used.

---

## Main Program

The `Main` program is used to create and manage the system data.

It creates objects for:

* Students
* Courses
* Instructors
* Grades

The program also:

1. Registers students in courses.
2. Prevents a student from registering for more than 5 courses.
3. Records exam marks for each course.
4. Calculates the total mark for each course.
5. Calculates the final mark for the academic year.
6. Calculates the final grade for the academic year.
7. Allows searching for a student by name.
8. Displays the student's information, courses, marks, and grades.
9. Allows searching for a course by name.
10. Displays the course information, instructor information, weekly hours, total mark, and number of registered students.

---

## Example

For example, if a student is registered in five courses and gets:

* Java: 87/100 → A+
* Database: 85/100 → A+
* Software Testing: 79/100 → B+
* Web Development: 84/100 → A
* Mathematics: 92/100 → A+

The final year mark is calculated from these course marks:

```text
Final Year Mark = 85.4 / 100
Final Year Grade = A+
```

---

## Technologies

* Java
* Object-Oriented Programming (OOP)
* ArrayList
* Iterator
* Scanner

---

## Purpose

The purpose of this project is to practice the basic Object-Oriented Programming concepts in Java and apply them in a simple real-world Student Management System.
