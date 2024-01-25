package Pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problems {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Array size");
        int arr = Integer.parseInt(br.readLine());
        int[] arr1 = new int[arr];

        // Peak Element
        System.out.println("Enter the Array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        int temp = 0;

        for (int i = 0; i < arr1.length; i++) {

//
            if (arr1[i] > temp){
                temp=arr1[i];
            }
            }
            System.out.println("peak element" + temp);

        }
    }

