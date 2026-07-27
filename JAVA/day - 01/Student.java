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
        Student student[] ={new Student("Ram",1,"cse"),new Student("Pavan",2,"CSC")};
        
        for(Student s:student){
            s.display();
        }
        System.out.println("Branch before update: "+student[1].branch);
        student[1].updatebranch("ECE");
         System.out.println("Branch after update: "+student[1].branch);
        if(student[1].isSameBranch(student[0])){
            System.out.println(student[0].name+" and "+student[1].name+" are Same branch");
        }
        else{
            System.out.println(student[0].name+" and "+student[1].name+" are not Same branch");
        }
        }
    }
