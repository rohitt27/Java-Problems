public class Abc {
    int x =10;
    void m1(){
        System.out.println("In abc m1");
        System.out.println(this.x);

    }
    static void m2(){
        System.out.println("In abc m2");
    }
    void m3(){
        System.out.println("In xyz m3");
    }
}

class xyz extends Abc{
static void m2(){
    System.out.println("In xyz child"); // method hidding
}
void m1(){
    System.out.println("in xyz m1");
}
}
class Top{
    public static void main(String[] args) {
        Abc ab = new Abc();
        ab.m1();
        Abc.m2();  
        Abc obj = new xyz();
//        obj.m1();
        obj.m2(); // concept of method hide
//        obj.m1();

    }
}
