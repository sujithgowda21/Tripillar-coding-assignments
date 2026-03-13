package Module7;

public class TimeComplexity {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        // Linear Search
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Linear Search: Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Linear Search: Element not found");
        }

        // Binary Search (array must be sorted)
        int low = 0;
        int high = arr.length - 1;
        boolean foundBinary = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Binary Search: Element found at index " + mid);
                foundBinary = true;
                break;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if (!foundBinary) {
            System.out.println("Binary Search: Element not found");
        }
    }
}
