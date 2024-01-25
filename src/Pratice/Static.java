package Pratice;

import org.w3c.dom.ls.LSOutput;

public class Static{
    int a = 24;

    static {
        System.out.println("In static method");
    }

    Static(){
        System.out.println("It is constructor");
    }
}

class Block{
    void aa(){
        System.out.println("In block");

    }
 Static obj1=new Static();

}

class Call{
    public static void main(String[] args) {
         Block cc = new Block();
        System.out.println();

    }
}
