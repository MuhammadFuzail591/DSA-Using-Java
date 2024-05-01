import java.util.Scanner;

public class LinearSearchInput {
    //Defining function for LinearSearch
        public static int linearSearch(int arr[],int x){
            for (int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    return i;
                }
            }
            return -1;
        }
        //Function For printing an array
        
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
            //Getting Input from User
            Scanner scr=new Scanner(System.in);
            System.out.println("Enter length of array");
            int lnth=scr.nextInt(); 
            //Declaring an array of length given by user
            int array[]=new int[lnth];

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
            //Getting input for number to search
            System.out.println("Enter Number to find from array");
            int numToFind=scr.nextInt();

            //Calling Search method
            int result = linearSearch(array, numToFind);
            //Result will be -1 if element is not found
            if (result == -1){
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

