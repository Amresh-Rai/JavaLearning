package Oops;

public class passingClassesToMethord {
    public static class Car{   // class car yha pr user defined data type hai jiske khd ke apne kuch attributes hai ki kya kya hon chea 
        int seats ;              // iis class ke ander humne jokuch bhindeclare kiyea hai yhi attributes 
        String name;
        double length;
        String type;
        int torque;

        void print(){
            System.out.println(seats+ " "+name+" "+length+" "+type+" "+torque+"nm");
        }


    }

    public static void main(String[] args) {
        
        Car c= new Car();
        c.length= 3.99;
        c.name= "Kia Sonet";
        c.seats=5;
        c.torque= 178;
        c.type= "SUV";
        change(c);

        System.out.println(c.seats);

        c.print();

    }

    public static void change (Car c){   // agar object ko hum functions me bhjte hai to vo passs by refernce hota hai pass by value nhi hai iisme car jo hai ake datatype ki tarah behave kr rha hai 
        c.seats=4;

    }
    
}
