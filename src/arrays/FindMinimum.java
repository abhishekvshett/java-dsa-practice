// Find minimum element
// Time: O(n)
// Space: O(1)

public class FindMinimum {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
}
