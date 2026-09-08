public class UndergraduateStudent extends Student {

    private int year;


    public UndergraduateStudent(String id, String name, int year) {
        super(id, name);
        this.year = year;
    }

    // Getter
    public int getYear() {
        return year;
    }

    // Setter
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nYear: " + year;
    }
}