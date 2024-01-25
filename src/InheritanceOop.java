public class InheritanceOop {
    static {
        System.out.println("Enter the room");
    }
    InheritanceOop(){
        for (int i=1;i<10;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
//        System.out.println("In the Inheristance constructor");
    }
    void v3(){
        System.out.println("Turn on the light");
    }
}
class Childd extends InheritanceOop{
    static void v2() {
        System.out.println("Press the  button");
    }

    Childd(){
        System.out.println("In the child constructor");
    }
    void v4(){
        System.out.println("Check the button properly");
    }

    public static void main(String[] args) {
        Childd obj1 = new Childd();
//        InheritanceOop obj = new InheritanceOop();

//        InheritanceOop.v1();
//        He.v2();
//        InheritanceOop obj = new InheritanceOop();
//        obj.v3();
//        He obj1= new He();
//        obj1.v4();



    }
}
