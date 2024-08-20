/**
 * Problem: Duplicate Zeros
 * 
 * You are given a fixed-length integer array `arr`. Duplicate each occurrence of zero,
 * shifting the remaining elements to the right. Note that elements beyond the length of 
 * the original array should not be written. Modify the input array in-place and do not 
 * return anything.
 *
 * Example:
 * - Input: [1,0,2,3,0,4,5,0]
 * - Output: [1,0,0,2,3,0,0,4]
 * 
 * The array has been modified in-place with no additional space used. After encountering 
 * a zero, all elements to the right are shifted one position to the right, and another zero 
 * is inserted right after the original zero.
 */

 class Solution {
    public void duplicateZeros(int[] arr) {
        // Iterate over the array except for the last element to avoid index out of bound errors
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if the current element is zero
            if (arr[i] == 0) {
                // Shift all elements to the right starting from the end to make space for the duplicated zero
                for (int j = arr.length - 1; j > i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                // Duplicate the zero by setting the next element to zero
                arr[i + 1] = 0;
                // Skip the next element as it's already processed
                i++;
            }
        }
    }
}

public class DuplicateZero {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        Solution s = new Solution();
        s.duplicateZeros(arr);
        // Output the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
