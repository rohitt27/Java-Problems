package Interface;

import java.util.Scanner;

public interface  Abstract {
    void input();
    void output();
}
class Connect  implements Abstract{
    String name; double sal;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        name = sc.nextLine();

        System.out.println("Enter the Salary: ");
        sal =sc.nextDouble();
    }
     public void output(){
         System.out.println(name+" "+sal);
    }

    public static void main(String[] args) {
        Abstract ab = new Connect();
        ab.input();
        ab.output();


    }

}
