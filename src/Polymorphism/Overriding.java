package Polymorphism;

public class Overriding {
   private void r1(){
        int x =10; int y=10, z;
        z = x + y;
        System.out.println(z);
        System.out.println("In Overriding");
    }
   void aa(){
       r1();
   }
}
class Ride extends Overriding{
     private void  r2(){
//        super.r1();
        int t =10; int s=12, g;
        g = t + s;

        System.out.println(g);
        System.out.println("Ride");
    }
    void bb(){
         r2();
    }


    public static void main(String[] args) {
        Overriding oo= new Ride();
        oo.aa();
    }
}