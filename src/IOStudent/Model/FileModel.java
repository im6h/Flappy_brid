package IOStudent.Model;

import IOStudent.Controller.FileManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileModel {
    public FileManager path = new FileManager();

    public void writeFile(List listArr, String name){
        try(FileOutputStream fos = new FileOutputStream(new File(name))) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listArr);
        }catch (Exception o){
            System.out.println("Error");
        }
    }
    public ArrayList readFile(String name){
        ArrayList<People> arrayList = new ArrayList<People>();
        try(FileInputStream fos = new FileInputStream(new File(name))) {
            ObjectInputStream ois = new ObjectInputStream(fos);
            arrayList = (ArrayList) ois.readObject();
        }catch (Exception e){
            System.out.println("Error");
        }
        return arrayList;
    }
}
