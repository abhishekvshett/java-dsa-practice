
// Find maximum element
// Time: O(n)
// Space: O(1)

public class FindMaximum {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
}
