package Oops;

class Student{
 String name;   // aagar hum koi value iisko na de to string hamesh null value intitialize hota hai 
    private int rno;        // default value 0 hoga 
    double cgpa;                    // default value 0.0 hoga ;

    int getrno(){     // getter to print the value 
        return rno;
    }

    void  setrno(int x){    // setter to set the value for thr rno 
        rno=x;
 
    }

    private void print(){    // getter
        System.out.println(name + " " + rno + " " + cgpa);
     }

     public void P(){      // ye print function hum log private print ko access kr ke liyea banaye hai kio ki private variable ya private methords ko within a class hi access kr skte hai uske bahar nhi 
        print();
     }

}

public class PrivateKeyword {

     public static void main(String[] args) {
        Student s =new Student();

        s.name ="amresh";
        //s.rno= 23;
        s.cgpa=6.6;
      //  s.P();
      s.setrno(120);


     
      System.out.println( s.getrno());

        //System.out.println(p.rno);
     }
    
}
