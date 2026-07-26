public class Student {

    // Fields
    private final int rollNumber;
    private String name;
    private double marks;
    private String grade;

    // Parameterized Constructor
    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    // Getters
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    // Grade Calculation Method
    private String calculateGrade(double marks) {

        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }

    }

    // Display Student Details
    @Override
    public String toString() {

        return "\n----------------------------------" +
                "\nRoll Number : " + rollNumber +
                "\nName        : " + name +
                "\nMarks       : " + marks +
                "\nGrade       : " + grade +
                "\n----------------------------------";

    }

}