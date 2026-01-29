
// Remove duplicates from sorted array
// Time: O(n)
// Space: O(1)

public class RemoveDuplicatesSorted {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }
        return index;
    }
}
