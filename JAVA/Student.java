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
        Student s1=new Student("Ram",1,"cse");
        Student s2=new Student("Pavan",2,"CSC");
        
        s1.display();
        s2.display();
        System.out.println("Branch before update: "+s1.branch);
        s1.updatebranch("ECE");
         System.out.println("Branch after update: "+s1.branch);
        /*if(s1.isSameBranch(s2)){
            System.out.println(s1.name+" and "+s2.name+" are Same branch");
        }
        else{
            System.out.println(s1.name+" and "+s2.name+" are not Same branch");
        }*/
        }
    }
