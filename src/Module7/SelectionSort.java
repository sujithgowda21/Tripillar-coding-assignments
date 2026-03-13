package Module7;

public class SelectionSort {
    static void SelectionSort(int[] arr){
        for (int i=0; i< arr.length-1; i++){
            int min=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,25,22,3,9,2,11};
        SelectionSort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
