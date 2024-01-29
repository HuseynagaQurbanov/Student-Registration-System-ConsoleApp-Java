package util;

import beans.Student;
import main.Main.Config;

public class StudentUtil {

    public static Student fillStudent() {
        String name = InputUtil.requireText("Enter name");
        String surname = InputUtil.requireText("Enter surname");
        byte age = InputUtil.requireNumber("Enter age");
        String className = InputUtil.requireText("Enter class");

        Student st = new Student(name, surname, age, className);

        System.out.println("\n" + name + " added");

        return st;
    }

    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println(st.getName() + " " + st.getSurname() + " " + st.getAge() + " " + st.getClassName() + ".");
        }
    }

    public static void registerStudents() {
        byte count = InputUtil.requireNumber("How many students you will add?");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nRegister " + (i + 1) + ". student.");

            Config.students[i] = StudentUtil.fillStudent();

            System.out.println("\n======================");
        }
    }
}
