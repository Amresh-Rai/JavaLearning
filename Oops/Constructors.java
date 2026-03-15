package Oops;

public class Constructors {
    public static class Car{   // class car yha pr user defined data type hai jiske khd ke apne kuch attributes hai ki kya kya hon chea 
        int seats ;              // iis class ke ander humne jokuch bhindeclare kiyea hai yhi attributes 
        String name;
        double length;
        // String type;
        // int torque;

       
        Car(){
            // default constructor 
        }
        Car(int x, String s, double d){
            seats =x;
            name =s;
            length=d;



        }
         void print(){
            System.out.println(seats+ " "+name+" "+length);
        }
        


    }

    public static void main(String[] args) {
        Car c1 =new Car(5,"kia",3.99);
        Car c2=new Car(6,"maruti",3.33);
       c1.print();
       c2.print();

        
    }
    
}
