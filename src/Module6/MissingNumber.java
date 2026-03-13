package Module6;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7};
        int n=7;
        int expectedsum=n*(n+1)/2;
        int actualsum=0;

        for(int i=0; i<arr.length; i++){
            actualsum=actualsum+arr[i];
        }
        int Missing=expectedsum-actualsum;
        System.out.println("Missing Number is : "+Missing);
    }
}
