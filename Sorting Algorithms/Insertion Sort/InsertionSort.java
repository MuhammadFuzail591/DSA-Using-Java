public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
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
        int array[]={15,18,8,6,25};
        System.out.println("The Array before Sorting:");
        printArray(array);

        insertionSort(array);

        System.out.println("Your Sorted array is:");
        printArray(array);
    }

}
