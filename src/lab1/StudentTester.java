package lab1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StudentTester {
    public static void main(String[] args) {
        //creating Student object
        Student a = new Student("Phephisa", 20);
        Student b = new Student("Tabelo", 21);
        Student c = new Student("Nkhosi", 22);
        //setting modules for specific student
        a.setModules("Comp301");
        a.setModules("Comp311");
        a.setModules("Comp321");

        b.setModules("Comp331");
        b.setModules("Comp321");
        b.setModules("Comp311");

        c.setModules("Comp301");
        c.setModules("Comp302");
        c.setModules("Comp351");
        //creating arraylist for student objects
        ArrayList<Student> sl = new ArrayList<Student>();
        //adding objects to the arraylist
        sl.add(a);
        sl.add(b);
        sl.add(c);

        //printing students in the list
       /* for( Student s: sl){
            System.out.println(s.getName() + s.getAge() + s.getModules());
        }
        System.out.println(sl.isEmpty());

        //calling to string method to print objects
       // System.out.println(a.toString() +  "\n" + b.toString() + "\n" + c.toString());

        */
        //creating the stack
        Stack st = new Stack();
        //check elements in th stack
        if(st!=null){
            System.out.println("There are elements");
        }
        else {
            System.out.println("no elements");
        }
        //pushing items into the stack
        st.push(a);
        st.push(b);
        st.push(c);

        //poping elements out of the stack
        //System.out.println(st.peek());

        //searching in the stack
        //System.out.println( st.search(c));

        //creating a queue
        Queue<Student> q1 = new LinkedList();
        //adding objexts to queue
        q1.add(a);
        q1.add(b);
        q1.add(c);

        //printing the first object in queue
        System.out.println(q1.peek());

        //removing element from queue the printing new elemnt
        q1.remove();
        System.out.println(q1.peek());





    }
}
