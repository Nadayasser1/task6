import java.util.ArrayList;

public class Course {

    private String id;
    private String name;
    private Instructor instructor;
    private final int totalMark = 100; // Every course has a total of 100 marks
    private int hoursPerWeek;
    private ArrayList<Student> students;


    public Course(String id, String name, Instructor instructor, int hoursPerWeek) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.hoursPerWeek = hoursPerWeek;

        students = new ArrayList<>();

        // Add this course to the instructor's courses
        instructor.addCourse(this);
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    // Add student to the course
    public void addStudent(Student student) {

        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Remove student from the course
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Return the number of registered students
    public int getNumberOfStudents() {
        return students.size();
    }

    @Override
    public String toString() {
        return "Course ID: " + id +
                "\nCourse Name: " + name +
                "\nInstructor: " + instructor.getName() +
                "\nTotal Mark: " + totalMark +
                "\nHours Per Week: " + hoursPerWeek +
                "\nNumber of Students: " + students.size();
    }
}