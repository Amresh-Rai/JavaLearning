package Oops;
class ComplexNumber{
    int x;
    int y;
    ComplexNumber(int x,int y){
        this.x=x;
        this.y=y;
          }
        void print(){
         if(y>=0)System.out.println(x +"+"+ y +"i");
        else System.out.println(x +"-"+(-y)+"i");
    }
    void add(ComplexNumber z2){
        this.x +=z2.x;
        this.y +=z2.y;
    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1=new ComplexNumber(2, 05);
        ComplexNumber z2=new ComplexNumber(5, 03);
        z1.print();
        z2.print();
        z1.add(z2);
        z1.print();
        z2.print();

        
    }
    
}
