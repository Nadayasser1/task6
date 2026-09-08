import java.util.ArrayList;
import java.util.Iterator;

public class Student {

    private String id;
    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Grade> grades;


    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Register a course
    public void addCourse(Course course) {

        // A student can register a maximum of 5 courses
        if (courses.size() < 5) {

            if (!courses.contains(course)) {
                courses.add(course);
                course.addStudent(this);
            }

        } else {
            System.out.println("A student cannot register more than 5 courses.");
        }
    }

    // Remove a course from the student
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    // Add a grade
    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    // Calculate the total marks of all courses
    public double calculateTotal() {

        double total = 0;

        Iterator<Grade> iterator = grades.iterator();

        while (iterator.hasNext()) {
            Grade grade = iterator.next();
            total += grade.calculateTotal();
        }

        return total;
    }

    // Calculate year mark
    public double calculateYearMark() {
        if (grades.size() == 0) return 0;
        return calculateTotal() / grades.size();
    }

    // assign year grade

    public String calculateYearGrade() {
        double mark = calculateYearMark();

        if (mark >= 85) return "A+";
        else if (mark >= 80) return "A";
        else if (mark >= 75) return "B+";
        else if (mark >= 70) return "B";
        else if (mark >= 65) return "C+";
        else if (mark >= 60) return "C";
        else if (mark >= 50) return "D";
        else return "F";
    }

    public String getStudentType() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student ID: " + id +
                "\nStudent Name: " + name +
                "\nStudent Type: " + getStudentType();
    }
}