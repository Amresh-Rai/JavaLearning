package Oops;
import java .util.Arrays;


public class Marks {
    public static class StudentRecord{
        String name;
        int rno; 
        int [] marks;
        StudentRecord(int [] x){
            marks=x;
          //  marks= Arrays.copyOf(x,x.length);
        }

    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,};
        StudentRecord s1= new StudentRecord(arr);
        s1.marks[0]=40;
        System.out.println(arr[0]);
        // StudentRecord s2= new StudentRecord(3);

        // s1.marks[0]=1;
        // s1.marks[1]=2;
        // s1.marks[2]=3;
        // s1.marks[3]=4;


        
    }
    
}
