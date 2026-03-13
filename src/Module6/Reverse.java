package Module6;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,13,15,17,19,21};
        int start=0, end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
