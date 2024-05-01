public class LinearSearch {

    public static int linearSearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
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

//Main Function to call the search method
    public static void main(String[] args) {
        //int[] arr=new int[5];
        int arr[]={34,23,22,12,45};

        //Calling function to print an array
        System.out.println("Your Array is: ");
        printArray(arr);

        int numtoSearch=22;
        //Printing number to search
        System.out.println("The Number to search is " + numtoSearch);
        //Calling LinearSearch method to search the given element
        int result=linearSearch(arr, numtoSearch);
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