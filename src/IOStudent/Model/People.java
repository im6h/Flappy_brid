package IOStudent.Model;

import java.io.Serializable;

public class People implements Serializable {
    private String name;
    private String code;
    private int score;
    public People(){

    }

    public People(String name, String code, int score) {
        this.name = name;
        this.code = code;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "People"+"\t"+name+"\t"+code+"\t"+score;
    }
}
