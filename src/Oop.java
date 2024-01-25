public class Oop {
    int var1 = 50;
    static int var2 = 100;
    void m1(){
        System.out.println("In M1");
    }
    static void m2(){
        System.out.println("In M2");
    }
}
class Child{
    int var3 = 50;
    static int var4 = 100;
    void n1(){
        System.out.println("In Child N1");
    }
    static void n2(){
        System.out.println("In Child N2");
    }

    public static void main(String[] args) {
        //Object creation
        Oop obj = new Oop();
        obj.m1();
        Oop.m2();
        System.out.println(obj.var1);
        System.out.println(Oop.var2);
    }
}
