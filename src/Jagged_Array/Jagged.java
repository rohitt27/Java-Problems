package Jagged_Array;

import java.util.Scanner;

public class Jagged {
    public static void main(String[] args) {
        //Declare and initiate arr
        int[][] arr = new int[3][];
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{4, 5, 6, 7};
        arr[2] = new int[]{8, 9};
        //Access element in the arr
        System.out.println("Element at arr[0][1]:" + arr[0][1]);
        System.out.println("Element at arr[1][2]:" + arr[1][2]);
        System.out.println("Element at arr[2][0]:" + arr[2][0]);
        //iterate through the arr
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        //Take value from users
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();

        //Declare the arr
        int[][] arr1 = new int[numRows][];
        // Input values for each row
        for (int i = 0; i < numRows; i++) {
            System.out.println("Enter the number of element in row" + (i + 1) + ": ");
            int rowLength = scanner.nextInt();
            // Initialize the sub-array with the specified length
            arr1[i] = new int[rowLength];

            for (int j = 0; j < numRows; j++) {
                System.out.println("Enter the element at row" + (i + 1) + ",colum " + (j + 1) + ": ");
                arr1[i][j] = scanner.nextInt();
            }
        }
        //Display the array
        System.out.println("arr:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
