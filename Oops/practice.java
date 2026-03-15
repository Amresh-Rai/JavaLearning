package Oops;

public class practice {
    String name ;
    int age;
    int rno;
    void print(){
        System.out.println("name :"+ name + " age :"+ age + " rno :"+ rno);
    }
    public static void main(String[] args) {
        practice p=new practice();
        p.name ="prince";
        p.age= 23;
        p.rno=120;
        change(p);
        p.print();

        System.out.println(p.name);
    }

    public static void change(practice p){
        p.name="amresh";
    }
    
}
