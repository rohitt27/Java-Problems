package Pratice;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int rr = sc.nextInt();
        int[] arr = new int[rr];
//
//

//        int [] arr = {10,9,45,35,88,65};
        int add=0;
        for(int i = 0; i< arr.length;i++){

            for (int j =i +1; j< arr.length;j++){
                if (arr[i]>arr[j]){
                add=arr[i];
                arr[i]=arr[j];
                arr[j]=add;
              }
            }
            System.out.println(arr[i]+" ");
        }

    }
}
