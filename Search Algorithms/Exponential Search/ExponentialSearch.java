import java.util.Arrays;

public class ExponentialSearch{
    
    public static int exponentialSearch(int arr[],int x){
        int n=arr.length;
        if(arr[0]==x){
            return 0;
        }
        int i=1;
        while (i<n && arr[i]<=x) {
            i=i*2;
        }

        return Arrays.binarySearch(arr, i/2,n, x);
    }
    public static void printArray(int arr[]){
        for(int i = 0;i<arr.length;i++){

            //Just putting square brackets around the elements
            if(i==0){
                System.out.print("[");
            }
            System.out.print(" " + arr[i] + " ");
            //Printing closing bracket after the elements
            if(i==arr.length-1){
                System.out.println("]");
            }
        }
    }
    
    public static void main(String[] args) {
        //int[] arr=new int[5];
        //Declaring and Defining an array
        int arr[]={34,23,22,12,45};
        //Calling Sort method 
        Arrays.sort(arr);
        //Printing array after sorting
        System.out.println("The array after sorting is ");
        printArray(arr);
        //Variable result will hold the returned value of function   
        int result = exponentialSearch(arr, 11);
        if(result<0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element is found at index:" + result);
        }
    }
}