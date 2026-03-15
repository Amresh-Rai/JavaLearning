package Oops;

public class PolyMorphism {     // polymorphism ka mtlb hota hai naam ake kaam aanek

   public static class dog{
    void speak(){
        System.out.println("bhau" +"bhau");
    }
   }
   public static class cat{
     void speak(){
        System.out.println("meau");
    }
   }
    public static class human{
     void speak(){
        System.out.println("hello");
    }
   }
   public static class pikachu{
     void speak(){
        System.out.println("pika pika pikachu");
    }
   }


    public static void main(String[] args) {

        human h=new human();
        cat c=new cat();
        dog d=new dog();
        pikachu p=new pikachu();

        c.speak();



        
    }
    
}
