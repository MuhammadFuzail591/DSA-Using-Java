public class BubbleSortDescending {
    public static void bubbleSortDes(int arr[]){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
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
        int array[]={15,18,8,6,25};
        System.out.println("The Array before Sorting:");
        printArray(array);

        bubbleSortDes(array);

        System.out.println("Your Sorted array in Descending order is:");
        printArray(array);
    }
}
