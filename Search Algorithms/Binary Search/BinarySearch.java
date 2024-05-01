public class BinarySearch {
    //Defining function for BinarySearch
    public static int binarySearch(int arr[],int x){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid = (start + end)/2;
            //Check if element is at mid
            if(arr[mid]==x){
                return mid;
            }
            //If element is greater than the mid then move to Right Side
            else if(arr[mid]<x){
                start = mid +1;
            }
            //If element is Less than the mid then move to Left Side
            else if(arr[mid]>x){
                end = mid -1;
            }
        }
        return -1;
    }
    //Defining function for Sorting
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
    //Defining function for Printing an array
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
//Main Function to call the search method
    public static void main(String[] args) {
        //int[] arr=new int[5];
        //Declaring and Defining an array
        int arr[]={34,23,22,12,45};
        //Calling Sort method 
        bubbleSort(arr);
        //Printing array after sorting
        System.out.println("The array after sorting is ");
        printArray(arr);
        //Variable result will hold the returned value of function
        int result=binarySearch(arr, 23);

        //Result will be -1 if element is not found
            if (result == -1){
                System.out.println("Number not found");
            }
        //Result will be index if element is found
            else{
                System.out.println("Number is found at index " + result);
            }


    }   
}
