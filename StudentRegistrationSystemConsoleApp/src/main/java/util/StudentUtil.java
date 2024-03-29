package util;

import beans.Student;
import main.Main.Config;

public class StudentUtil {

    public static Student fillStudent() {
        int id = InputUtil.requireNumber("Enter id");
        String name = InputUtil.requireText("Enter name");
        String surname = InputUtil.requireText("Enter surname");
        byte age = InputUtil.requireNumber("Enter age");
        String className = InputUtil.requireText("Enter class");

        Student st = new Student(name, surname, age, className, id);

        System.out.println("\n" + name + " added");

        return st;
    }

    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println(st.getFullInfo() + ".");
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

    public static void findStudentsAndPrint() {
        String txt = InputUtil.requireText("Type name, surname or classname");
        Student[] foundedStudents = findStudents(txt);
        for (int i = 0; i < foundedStudents.length; i++) {
            System.out.println(foundedStudents[i].getFullInfo());
        }
    }

    public static Student[] findStudents(String txt) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(txt) || st.getSurname().contains(txt) || st.getClassName().contains(txt)) {
                count++;
            }
        }

        Student[] res = new Student[count];
        int fount = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(txt) || st.getSurname().contains(txt) || st.getClassName().contains(txt)) {
                res[fount++] = st;
            }
        }

        return res;
    }

    public static void updateStudent(int id) {
        boolean haveStudent = false;
        
        for (int i = 0; i < Config.students.length; i++) {
            if (Config.students[i].getId() == id) {
                Student st = Config.students[i];
                Student newSt = fillStudent();
                
                st.setId(newSt.getId());
                st.setAge(newSt.getAge());
                st.setName(newSt.getName());
                st.setSurname(newSt.getSurname());
                st.setClassName(newSt.getClassName());
                haveStudent = true;
            }
        }
        
        if (haveStudent == false) {
            System.out.println("No one has this id: " + id);
        }
    }
}
