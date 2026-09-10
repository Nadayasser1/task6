import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

void main() {

    Scanner input = new Scanner(System.in);

    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Instructor> instructors = new ArrayList<>();

    Instructor instructor1 = new Instructor("I01", "Ahmed Ali");
    Instructor instructor2 = new Instructor("I02", "Sara Mohamed");

    instructors.add(instructor1);
    instructors.add(instructor2);

    Course course1 = new Course("C01", "Java", instructor1, 3);
    Course course2 = new Course("C02", "Database", instructor2, 2);
    Course course3 = new Course("C03", "Software Testing", instructor1, 3);
    Course course4 = new Course("C04", "Web Development", instructor2, 2);
    Course course5 = new Course("C05", "Mathematics", instructor1, 3);
    Course course6 = new Course("C06", "OOP", instructor2, 3);

    courses.add(course1);
    courses.add(course2);
    courses.add(course3);
    courses.add(course4);
    courses.add(course5);
    courses.add(course6);

    Student student1 = new UndergraduateStudent("S01", "Nada", 2);
    Student student2 = new UndergraduateStudent("S02", "Mona", 1);
    Student student3 = new UndergraduateStudent("S03", "Omar", 3);

    students.add(student1);
    students.add(student2);
    students.add(student3);

    //handling

    try {
        student1.addCourse(course1);
        student1.addCourse(course2);
        student1.addCourse(course3);
        student1.addCourse(course4);
        student1.addCourse(course5);
        student1.addCourse(course6);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    student2.addCourse(course1);
    student2.addCourse(course2);

    student3.addCourse(course3);
    student3.addCourse(course4);

    Grade grade1 = new Grade(course1, 20, 22, 45);
    Grade grade2 = new Grade(course2, 23, 20, 42);
    Grade grade3 = new Grade(course3, 18, 21, 40);
    Grade grade4 = new Grade(course4, 20, 20, 44);
    Grade grade5 = new Grade(course5, 22, 23, 47);

    student1.addGrade(grade1);
    student1.addGrade(grade2);
    student1.addGrade(grade3);
    student1.addGrade(grade4);
    student1.addGrade(grade5);

    student2.setName("Mona Ahmed");

    course4.setName("Web Development");
    course4.setHoursPerWeek(3);

    System.out.println("=================================");
    System.out.println("Student Management System");
    System.out.println("=================================");

    System.out.print("Enter student name: ");
    String studentName = input.nextLine();

    Student selectedStudent = null;

    for (Student student : students) {
        if (student.getName().equalsIgnoreCase(studentName)) {
            selectedStudent = student;
            break;
        }
    }

    if (selectedStudent != null) {

        System.out.println("\nStudent Information:");
        System.out.println(selectedStudent);

        System.out.println("\nRegistered Courses:");

        Iterator<Course> iterator = selectedStudent.getCourses().iterator();

        while (iterator.hasNext()) {

            Course course = iterator.next();

            System.out.println("\nCourse: " + course.getName());

            for (Grade grade : selectedStudent.getGrades()) {

                if (grade.getCourse() == course) {

                    System.out.println("First Exam: "
                            + grade.getFirstExam() + "/25");

                    System.out.println("Second Exam: "
                            + grade.getSecondExam() + "/25");

                    System.out.println("Final Exam: "
                            + grade.getFinalExam() + "/50");

                    System.out.println("Total: "
                            + grade.calculateTotal() + "/100");

                    System.out.println("Grade: "
                            + grade.calculateGrade());
                }
            }
        }

        System.out.println("\nStudent Total: "
                + selectedStudent.calculateTotal());

        System.out.println("\nFinal Year Mark: "
                + selectedStudent.calculateYearMark() + "/100");

        System.out.println("Final Year Grade: "
                + selectedStudent.calculateYearGrade());

    } else {
        System.out.println("Student not found.");
    }

    System.out.print("\nEnter course name: ");
    String courseName = input.nextLine();

    Course selectedCourse = null;

    for (Course course : courses) {
        if (course.getName().equalsIgnoreCase(courseName)) {
            selectedCourse = course;
            break;
        }
    }

    if (selectedCourse != null) {

        System.out.println("\nCourse Information:");
        System.out.println("Course Name: "
                + selectedCourse.getName());

        System.out.println("Instructor: "
                + selectedCourse.getInstructor().getName());

        System.out.println("Instructor ID: "
                + selectedCourse.getInstructor().getId());

        System.out.println("Weekly Hours: "
                + selectedCourse.getHoursPerWeek());

        System.out.println("Total Mark: "
                + selectedCourse.getTotalMark());

        System.out.println("Number of Students: "
                + selectedCourse.getNumberOfStudents());

    } else {
        System.out.println("Course not found.");
    }
}