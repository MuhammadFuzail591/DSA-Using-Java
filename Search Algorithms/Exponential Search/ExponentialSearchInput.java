import java.util.Arrays;
import java.util.Scanner;
public class ExponentialSearchInput {
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

            //Getting Input from User
            Scanner scr=new Scanner(System.in);
            System.out.println("Enter length of array");
            int lnth=scr.nextInt(); 
            //Declaring an array of length given by user
            int array[]=new int[lnth];
            //Getting Input from User
            //Variable count to use to aid user for element number during entering
            int count=0;
            for(int i=0;i<array.length;i++){
                count=i+1;
                System.out.println("Enter element No "+ count + ":");
                array[i]=scr.nextInt();
            }
    
            System.out.println("Your Array is:");
            //Calling Function to print array
            printArray(array);
            //Calling function to sort an array
            Arrays.sort(array);
            System.out.println("The array after sorting is: ");
            //Print array after sorting
            printArray(array);
            System.out.println("Enter Number to find from array");
            int numToFind=scr.nextInt();
    
            //Calling Search method
            int result = exponentialSearch(array, numToFind);
            //Result will be -1 if element is not found
            if (result <0){
                System.out.println("Number not found");
            }
            //Result will be index if element is found
            else{
                System.out.println("Number is found at index " + result);
            }
            //Closing an object explicitly
            scr.close();
        }

}
