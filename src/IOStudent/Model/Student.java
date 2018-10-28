package IOStudent.Model;

import java.io.Serializable;

public class Student extends People implements Serializable {
    private int age;
    private String school;
    public Student(){

    }

    public Student(String name, String code, int score, int age, String school) {
        super(name, code, score);
        this.age = age;
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+age+"\t"+school;
    }
}
