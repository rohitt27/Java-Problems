package Polymorphism;

public class Overloading {
    void m1(){
        int a = 40, b=30,c;
        c = a*b;
        System.out.println(c);
    }
    void m1(double x, int y){
        double t;
        t=x+y;
        System.out.println(t);
    }
    void m1(long q, int e){
        long l;
        l=q-e;
        System.out.println(l);
    }

    public static void main(String[] args) {
        Overloading oo = new Overloading();
        oo.m1();
        oo.m1(22.3,10);
        oo.m1(20,10);
    }

}
