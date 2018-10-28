package IOStudent.Model;

import IOStudent.Controller.FileManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListStudent {
    ArrayList<Student> list;
    FileModel file = new FileModel();
    public ListStudent(){
        list = new ArrayList<Student>();
    }
    private int inputInt(){
        int n = 0;
        boolean check = true;
        Scanner in = new Scanner(System.in);
        while(!check){
            try {
                n = in.nextInt();
                check = false;
            }catch(Exception o){
                System.out.println("Again:");
                in.nextLine();
            }
        }
        return n;
    }
    private boolean isCode(String code){
        for (Student s : list ){
            if (s.getCode().equalsIgnoreCase(code)){
                return true;
            }
        }
        return false;
    }
    private People inputPeople(){
        String name, code;
        int score;
        People person = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Name: ");
        name = in.nextLine();
        while(true){
            System.out.println("Code:");
            code = in.nextLine();
            if (code.matches("^[A-Za-z]{1}\\d{2}$")){
                break;
            }
        }
        if (isCode(code)){
            return null;
        }
        System.out.println("score:");
        score = Integer.parseInt(in.nextLine());
        person = new People(name,code,score);
        return person;
    }
    public void inputStudent(){
        int age;
        String school;
        People p = inputPeople();
        Scanner in = new Scanner(System.in);
        System.out.println("Age:");
        age = Integer.parseInt(in.nextLine());
        System.out.println("School:");
        school = in.nextLine();
        list.add(new Student(p.getName(),p.getCode(),p.getScore(),age,school));
        file.writeFile(list,"Data.data");
    }
    public void output(){
        System.out.println("===========OUT PUT============");
        ArrayList<Student> smallList = file.readFile("Data.data");
        for (Student i: smallList){
            System.out.println(i.toString());
        }
    }
}
