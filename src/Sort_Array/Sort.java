package Sort_Array;

public class Sort {
            public static void printArray(int arr[]){
                for (int i=0; i< arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
            }
    public static void main(String[] args) {
    // Bubble sort array

        int arr[]={9,7,3,2,1,4};

        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}
