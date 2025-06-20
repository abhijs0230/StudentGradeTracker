// Student Grade Tracker 
import java.util.*;

public class StudentGradeTracker {
    class Student {
        private String name;
        private double grade;

        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public double getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        StudentGradeTracker tracker = new StudentGradeTracker(); 

        System.out.println("***Welcome to the Student Grade Tracker!***");
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline from nextInt()

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter student grade: ");
            double grade = sc.nextDouble();
            sc.nextLine(); // Consume newline after nextDouble()

            students.add(tracker.new Student(name, grade));
        }

        System.out.println("\nStudent Grades:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade());
        }

        // Calculate average grade
        double total = 0;
        for (Student student : students) {
            total += student.getGrade();
        }
        double average = total / students.size();
        System.out.println("\nAverage Grade: " + average);

        // Find highest and lowest grades
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        for (Student student : students) {
            if (student.getGrade() > highest) {
                highest = student.getGrade();
            }
            if (student.getGrade() < lowest) {
                lowest = student.getGrade();
            }
        }

        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        sc.close();
    }
}
