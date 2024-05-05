public class SelectionSortDes {
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
        int array[]={15,18,8,6,25};
        System.out.println("The Array before Sorting:");
        printArray(array);

        selectionSortDes(array);

        System.out.println("Your Sorted array in Descending order is:");
        printArray(array);
    }
}
