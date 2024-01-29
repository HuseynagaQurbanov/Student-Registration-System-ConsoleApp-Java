package main.Main;

import util.InputUtil;
import util.StudentUtil;

public class Main {

    public static void main(String[] args) {
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
