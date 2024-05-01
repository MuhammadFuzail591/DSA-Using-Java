public class BubbleSort {

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
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[]={15,18,8,6,25};

        bubbleSort(array);

        System.out.println("Your Sorted array is:");
        printArray(array);
    }
}