package lab1;
import java.util.*;
import java.lang.*;

public class Student {
    private String name ;// modules;
    // creating array list
    private ArrayList<String> modules;
    private int age;
    //default constructor
    public Student(){

        this.name = "";
        this.age = 0;
        this.modules = new ArrayList<String>();

    }

    //parametirized constructor
    public Student(String name, int age) {
        this.name = name;
        this.modules = new ArrayList<String>();
        this.age = age;
    }

    //get method for name
    public String getName() {
        return name;
    }
    //set method for name
    public void setName(String name) {
        this.name = name;
    }
    //get method for modules
    public ArrayList<String> getModules() {
        return this.modules;
    }

    //set method for modules
    public void setModules(String modules) {
        this.modules.add(modules);
    }
    //get method for age
    public int getAge() {
        return age;
    }
    //set method for age
    public void setAge(int age) {
        this.age = age;
    }
    //to string method
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' +
                ", modules='" + modules + '\'' +
                ", age=" + age +
                '}';
    }
}
