public class Grade {

    private Course course;
    private double firstExam;
    private double secondExam;
    private double finalExam;


    public Grade(Course course, double firstExam,
                 double secondExam, double finalExam) {

        this.course = course;
        this.firstExam = firstExam;
        this.secondExam = secondExam;
        this.finalExam = finalExam;
    }

    // Getters
    public Course getCourse() {
        return course;
    }

    public double getFirstExam() {
        return firstExam;
    }

    public double getSecondExam() {
        return secondExam;
    }

    public double getFinalExam() {
        return finalExam;
    }

    // Calculate the total mark for the course
    public double calculateTotal() {
        return firstExam + secondExam + finalExam;
    }

    // Assign the grade
    public String calculateGrade() {

        double total = calculateTotal();

        if (total >= 85) {
            return "A+";
        } else if (total >= 80) {
            return "A";
        } else if (total >= 75) {
            return "B+";
        } else if (total >= 70) {
            return "B";
        } else if (total >= 65) {
            return "C+";
        } else if (total >= 60) {
            return "C";
        } else if (total >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    @Override
    public String toString() {
        return "Course: " + course.getName() +
                "\nFirst Exam: " + firstExam + "/25" +
                "\nSecond Exam: " + secondExam + "/25" +
                "\nFinal Exam: " + finalExam + "/50" +
                "\nTotal: " + calculateTotal() + "/100" +
                "\nGrade: " + calculateGrade();
    }
}