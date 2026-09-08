import java.util.ArrayList;

public class Instructor {

    private String id;
    private String name;
    private ArrayList<Course> courses; // for each instructor


    public Instructor(String id, String name) {
        this.id = id;
        this.name = name;
        courses = new ArrayList<>();
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

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Add course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Remove course
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public String toString() {
        return "Instructor ID: " + id +
                "\nInstructor Name: " + name;
    }
}