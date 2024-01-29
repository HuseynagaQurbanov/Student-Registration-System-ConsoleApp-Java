package beans;

public class Student {
    private String name;
    private String surname;
    private byte age;
    private String className;

    public Student() {
    }

    public Student(String name, String surname, byte age, String className) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    
    public String getFullInfo(){
        return this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getClassName();
    }
}
