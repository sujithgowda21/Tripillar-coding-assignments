package Module6;

public class Sum {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66,77,88,99};
        int sum=0;
        for (int i=0; i< arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of elements of an Array: "+sum );
    }
}
