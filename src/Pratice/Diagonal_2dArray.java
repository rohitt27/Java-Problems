package Pratice;

import java.util.Scanner;

public class Diagonal_2dArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("enter the row");

        int row = sc.nextInt();
        System.out.println("enter col");
        int col = sc.nextInt();

        int [][] arr = new int[row][col];
        System.out.println("enter row and col");
        for (int i = 0; i<row;i++){
            for (int j =0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int sum =0;
        for (int i = 0; i<row;i++){
            for (int j =0;j<col;j++){
                if (arr[i]==arr[j]){
                    sum=sum+arr[i][j];
                }
//                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(sum);
    }

}
