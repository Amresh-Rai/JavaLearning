package Oops;
import java .util.*;


public class UserDefinedDataType {
    public static class Student{
        String name ;
        int rno;
        double cgpa;
        
        void print(){
            System.out.println(name+" "+rno+" "+cgpa);
        }


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        Student s1 =new Student();
        s1.name ="khusi";
        s1.rno= sc.nextInt();
        s1.cgpa= 8.5;

        Student s2 =new Student();
        s1.name ="amresh";
        s1.rno= sc.nextInt();
        s1.cgpa= 8.37;

        Student s3 =new Student();
        s1.name ="prince";
        s1.rno= sc.nextInt();
        s1.cgpa= 9.5;

        s1.print();
        s2.print();
        s3.print();

        //System.out.println(s1.name +" " + s1.cgpa + " " + s1.rno);
        

        

        

    }
    
}
