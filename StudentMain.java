import java.util.Scanner;

class Student {
    String usn;
    String name;
    int credits[];
    int marks[];

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter USN: ");
        usn = sc.nextLine();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        credits = new int[n];
        marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nSubject " + (i + 1) + ":");
            System.out.print("Enter Credits: ");
            credits[i] = sc.nextInt();
            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }
    }

    int getGradePoint(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 40) return 5;
        else return 0;
    }

    double calculateSGPA() {
        int totalCredits = 0;
        int totalPoints = 0;
        for (int i = 0; i < marks.length; i++) {
            int gradePoint = getGradePoint(marks[i]);
            totalPoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }
        return (double) totalPoints / totalCredits;
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("\nSubject-wise details:");
        System.out.println("Subject\tCredits\tMarks");
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" + credits[i] + "\t" + marks[i]);
        }
        double sgpa = calculateSGPA();
        System.out.printf("\nSGPA: %.2f\n", sgpa);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.acceptDetails();
        s.displayDetails();
    }
}
