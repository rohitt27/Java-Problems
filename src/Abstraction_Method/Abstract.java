package Abstraction_Method;

 abstract public class Abstract {

     abstract void percaution();

     void concrete(){
         System.out.println("This is concrete method");
     }

}
class caution extends Abstract{
     void percaution(){
         System.out.println("Peace");
    }

    void concrete(){
        System.out.println("In concrete");
    }
}

class Super{
    public static void main(String[] args) {
        Abstract obj=new caution();
        obj.percaution();
        obj.concrete();
    }
}
