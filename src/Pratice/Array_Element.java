package Pratice;

import java.util.Scanner;

public class Array_Element {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size: ");
       int size=sc.nextInt();

       int a[] = new int[size+1];
        System.out.println("Enter array element: ");

        for (int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter array Location: ");
       int loc = sc.nextInt();
        System.out.println("enter new item: ");
        int item=sc.nextInt();

        for (int i=size;i>loc;i--){
            a[i]=a[i-1];
        }
        a[loc]=item;
        size++;
        for (int i=0;i<size;i++){
            System.out.print(a[i]+ " ");
        }
    }


}
