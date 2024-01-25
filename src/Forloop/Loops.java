package Forloop;

public class Loops {

    public static void main(String[] args) {


    int sum = 0;

    int num = 5;
         for(int i = 1; i<=10; i++ ){
        if(i%2==0){
            sum = sum + (i*num);

        }
    }
        System.out.println(sum);

}

    // Nested for loop
//
//        for(int i = 1; i<=4; i++){                          // row
//
//            for(int j =1; j<=4;j++){                      // column
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }

}
