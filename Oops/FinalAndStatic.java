package Oops;

class Cricketer{
    final String country ="india";
    int run;
    String name;
    double avg;

    static void  greet(){
        System.out.println("hello bachoooo!!!!!");
    }
}

public class FinalAndStatic {
    public static void main(String[] args) {

        Cricketer c1=new Cricketer();
        System.out.println(c1.country);
        c1.greet();
        
    }
    
}
