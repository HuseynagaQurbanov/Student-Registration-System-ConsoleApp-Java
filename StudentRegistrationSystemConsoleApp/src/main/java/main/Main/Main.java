package main.Main;

import beans.Student;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                "What do you want to do?"
                + "\n1. Register new student."
                + "\n2. Show all students."
                + "\n3. Find student."
                + "\n4. Update student");

        Scanner sc = new Scanner(System.in);
        byte menu = sc.nextByte();
        switch (menu) {
            case 1:
                registerStudent();
                break;

            case 2:
                showStudent();
                break;

            default:
                System.out.println("Choose correct number!!!");
                break;
        }
    }

    public static void registerStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students you will add?");
        byte count = sc.nextByte();
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nRegister " + (i + 1) + ". student.");

            sc = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            sc = new Scanner(System.in);
            System.out.print("Enter surname: ");
            String surname = sc.nextLine();

            sc = new Scanner(System.in);
            System.out.print("Enter age: ");
            byte age = sc.nextByte();

            sc = new Scanner(System.in);
            System.out.print("Enter class: ");
            String className = sc.nextLine();

            Student st = new Student(name, surname, age, className);
            Config.students[i] = st;

            System.out.println("\n======================");
        }
    }

    public static void showStudent() {
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println(st.getName() + " " + st.getSurname() + " " + st.getAge() + " " + st.getClassName() + ".");
        }
    }
}
