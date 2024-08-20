import java.util.Arrays;
import java.util.HashSet;

/**
 * Problem: Set Matrix Zeroes
 * 
 * Given an `m x n` integer matrix, if an element is 0, set its entire row and column to 0. 
 * You must do it in place.
 *
 * Example:
 * - Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * - Output: [[1,0,1],[0,0,0],[1,0,1]]
 *
 * Constraints:
 * - The matrix could be of any size, but its dimensions (m and n) are not necessarily the same.
 */

class Solution {
    /**
     * Approach 1: Using HashSet to Track Rows and Columns with Zeros
     * 
     * In this approach, we first find all the rows and columns that contain zeros and store 
     * their indices in two HashSets to avoid duplicates. Then, we iterate over the matrix 
     * again and set the corresponding rows and columns to zero.
     * 
     * This approach is straightforward and easy to understand but requires additional space 
     * for storing the indices in the sets.
     */
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> columnSet = new HashSet<>();
        
        // First pass: Identify rows and columns to be zeroed
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);   // Mark the row
                    columnSet.add(j); // Mark the column
                }
            }
        }

        // Second pass: Zero out identified rows
        for (Integer i : rowSet) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
        
        // Third pass: Zero out identified columns
        for (Integer j : columnSet) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}

class Solution2 {
    /**
     * Approach 2: Optimized In-Place Solution
     * 
     * This approach optimizes space by using the first row and column of the matrix itself to 
     * track which rows and columns need to be zeroed. Additionally, a separate variable `col` 
     * is used to track whether the first column should be zeroed out.
     * 
     * This approach reduces space complexity from O(m + n) to O(1) but maintains the time 
     * complexity at O(m * n).
     */
    public void setZeroes(int[][] matrix) {
        int col = 1;

        // First pass: Use the first row and column as markers
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (j != 0) {
                        matrix[i][0] = 0; // Mark row
                        matrix[0][j] = 0; // Mark column
                    } else {
                        col = 0; // Mark the first column separately
                    }
                }
            }
        }

        // Second pass: Zero out cells based on markers, skipping the first row and column
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Third pass: Zero out the first row if necessary
        if (matrix[0][0] == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // Fourth pass: Zero out the first column if necessary
        if (col == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

public class SetMatrixZero {
    public static void main(String[] args) {
        // Example usage
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        
        // Using Solution1 (HashSet approach)
        Solution solution1 = new Solution();
        solution1.setZeroes(matrix);
        System.out.println("Matrix after setting zeros using Solution1:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        
        // Using Solution2 (Optimized in-place approach)
        int[][] matrix2 = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        Solution2 solution2 = new Solution2();
        solution2.setZeroes(matrix2);
        System.out.println("Matrix after setting zeros using Solution2:");
        for (int[] row : matrix2) {
            System.out.println(Arrays.toString(row));
        }
    }
}

