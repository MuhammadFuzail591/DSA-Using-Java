import java.util.Scanner;

public class BubbleSortInput {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //Swapping
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            if(i==0){
                System.out.print("[");
            }
            System.out.print(" " + arr[i] + " ");
            if(i==arr.length-1){
                System.out.println("]");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
            System.out.println("Enter length of array");
            int lnth=scr.nextInt(); 

            int array[]=new int[lnth];
            //Getting Input from User
            int count=0;
            for(int i=0;i<array.length;i++){
                count=i+1;
                System.out.println("Enter element No "+ count + ":");
                array[i]=scr.nextInt();
            }
            System.out.println("Your Array is:");
            printArray(array);

        //Calling sorting Function
        bubbleSort(array);

        System.out.println("Your Sorted array is:");
        printArray(array);
        scr.close();
    }
}
