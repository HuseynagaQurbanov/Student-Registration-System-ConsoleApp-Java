package beans;

public class Student {
    private int id;
    private String name;
    private String surname;
    private byte age;
    private String className;

    public Student() {
    }

    public Student(String name, String surname, byte age, String className, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
        this.id = id;
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
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFullInfo() {
        return this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getClassName();
    }
}
