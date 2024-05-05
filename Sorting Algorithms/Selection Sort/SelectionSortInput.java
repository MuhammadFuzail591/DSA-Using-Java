import java.util.Scanner;

public class SelectionSortInput {
    public static void selectionSort(int arr[]){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            int smallest = i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            //Swapping
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

    }

    public static void selectionSortDes(int arr[]){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            int largest = i;

            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[largest]){
                    largest = j;
                }
            }
            //Swapping
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
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

        //Taking input from user to choose which type of sorting he wanna perform
        
        System.out.println("Enter the type of sorting you want:");
        System.out.println("1. Ascending Order\n2. Descending Order");
        int choice = scr.nextInt();
        //If user choose 1 then Ascending order will be done
        //If user choose 2 then Descending order will be performed
        if(choice==1){
            //Calling sorting Function
            System.out.println("You have choosen Ascending order");
            selectionSort(array);
            System.out.println("Your Sorted array in Ascending order is:");
            printArray(array);
        }
        else{
            System.out.println("You have choosen Descending order");
            selectionSortDes(array);
            System.out.println("Your Sorted array in Descending order is:");
            printArray(array);
        }
        
        
        scr.close();
    }
}
