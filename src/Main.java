import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n Student Grade Tracker ");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Calculate Average Marks");
            System.out.println("4. Find Highest Marks");
            System.out.println("5. Find Lowest Marks");
            System.out.println("6. Display Summary Report");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll Number: ");
                    int rollNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student student = new Student(rollNumber, name, marks);
                    students.add(student);

                    System.out.println("Student Added Successfully.");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No Student Records Found.");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }

                    break;

                case 3:

                    if (students.isEmpty()) {
                        System.out.println("No Student Records Found.");
                    } else {

                        double total = 0;

                        for (Student s : students) {
                            total += s.getMarks();
                        }

                        double average = total / students.size();

                        System.out.println("Average Marks = " + average);
                    }

                    break;

                case 4:

                    if (students.isEmpty()) {
                        System.out.println("No Student Records Found.");
                    } else {

                        Student highest = students.get(0);

                        for (Student s : students) {

                            if (s.getMarks() > highest.getMarks()) {
                                highest = s;
                            }

                        }

                        System.out.println("Highest Marks Student:");
                        System.out.println(highest);

                    }

                    break;

                case 5:

                    if (students.isEmpty()) {
                        System.out.println("No Student Records Found.");
                    } else {

                        Student lowest = students.get(0);

                        for (Student s : students) {

                            if (s.getMarks() < lowest.getMarks()) {
                                lowest = s;
                            }

                        }

                        System.out.println("Lowest Marks Student:");
                        System.out.println(lowest);

                    }

                    break;

                case 6:

                    if (students.isEmpty()) {
                        System.out.println("No Student Records Found.");
                    } else {

                        double total = 0;

                        Student highest = students.get(0);
                        Student lowest = students.get(0);

                        for (Student s : students) {

                            total += s.getMarks();

                            if (s.getMarks() > highest.getMarks()) {
                                highest = s;
                            }

                            if (s.getMarks() < lowest.getMarks()) {
                                lowest = s;
                            }

                        }

                        double average = total / students.size();

                        System.out.println("\n========== Summary Report ==========");
                        System.out.println("Total Students : " + students.size());
                        System.out.println("Average Marks  : " + average);
                        System.out.println("\nHighest Scorer:");
                        System.out.println(highest);
                        System.out.println("\nLowest Scorer:");
                        System.out.println(lowest);

                    }

                    break;

                case 7:

                    System.out.println("Thank You for Using Student Grade Tracker.");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice. Please Try Again.");

            }

        }

    }

}