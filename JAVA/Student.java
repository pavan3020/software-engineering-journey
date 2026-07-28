import java.util.*;
public class Student {
    String name;
    int rollno;
    String branch;
    Scanner sc=new Scanner(System.in);
    Student(String name,int rollno,String branch){
        
        this.name=name;
        this.rollno=rollno;
        this.branch=branch;
    }
    void updatebranch(String New_branch){
        this.branch=New_branch;
    }
    void display(){

        System.out.println("Name: "+name+"\nRollno: "+rollno+"\nbranch: "+branch);
    }
    boolean isSameBranch(Student s4){
        return this.branch.equals(s4.branch);
    }
    public static void main(String[] abc){
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student("Ram",1,"CSE"));
         students.add(new Student("Pavan",2,"CST"));
        for(Student s:students){
            s.display();
        }
        System.out.println("Branch before update: "+students.get(1).branch);
        students.get(1).updatebranch("ECE");
         System.out.println("Branch after update: "+students.get(1).branch);
        if(students.get(1).isSameBranch(students.get(0))){
            System.out.println(students.get(0).name+" and "+students.get(1).name+" are Same branch");
        }
        else{
            System.out.println(students.get(0).name+" and "+students.get(1).name+" are not Same branch");
        }
        }
    }
