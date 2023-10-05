package StudentDatabaseApplication;

import java.util.Scanner;

public class studentDatabaseApp {

    public static void main(String[] args) {



        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for(int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());

        }
        if (numOfStudents > 1) {
            System.out.println("Students have been enrolled. Thank you.");
        }else {
            System.out.println("Thank you for enrolling new student");
        }
    }

}
