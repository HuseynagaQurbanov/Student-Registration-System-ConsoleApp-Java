package util;

import java.util.Scanner;

public class InputUtil {

    public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + ": ");
        String answer = sc.nextLine();
        return answer;
    }

    public static byte requireNumber(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + ": ");
        byte answer = sc.nextByte();
        return answer;
    }

    public static void menu() {
        byte menu;
        boolean loop = true;
        while (loop) {
            menu = InputUtil.requireNumber(
                    "What do you want to do?"
                    + "\n1. Register new student."
                    + "\n2. Show all students."
                    + "\n3. Find student."
                    + "\n4. Update student"
                    + "\n0. Exit. \n");

            switch (menu) {
                case 1:
                    StudentUtil.registerStudents();
                    break;

                case 2:
                    StudentUtil.printAllRegisteredStudents();
                    break;

                case 3:
                    StudentUtil.findStudentsAndPrint();
                    break;

                case 4:
                    StudentUtil.updateStudent(requireNumber("Please enter student's id: "));
                    break;

                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Choose correct number!!!");
                    break;
            }
        }
    }
}
