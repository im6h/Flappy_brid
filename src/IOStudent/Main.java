package IOStudent;

import IOStudent.Model.ListStudent;

import java.util.Scanner;

/**
 * @author Vu
 */

public class Main {
    public static void main(String[] args) {
        ListStudent studentList = new ListStudent();
        while (true) {
            System.out.println("1.Input student");
            System.out.println("2.Output student");
            System.out.println("0.Exit");
            System.out.print("Your choice:");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    studentList.inputStudent();
                    break;
                case 2:
                    studentList.output();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("0->2");
                    break;

            }
        }
    }
}
