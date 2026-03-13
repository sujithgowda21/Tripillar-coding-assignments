package Module6;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 13, 5, 17, 2, 16, 8, 21};
        int largest = 0, secondlargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        System.out.println("Second lasrgest Element is : " + secondlargest);
    }
}