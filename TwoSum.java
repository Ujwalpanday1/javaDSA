import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem: Two Sum
 * 
 * Given an array of integers `nums` and an integer `target`, return the indices of the two numbers 
 * such that they add up to `target`. You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 *
 * Example:
 * - Input: nums = [2,7,11,15], target = 9
 * - Output: [0,1] (because nums[0] + nums[1] = 2 + 7 = 9)
 *
 * Note: You can return the result in any order.
 */

class Solution {
    /**
     * Approach 1: Two Pointers after Sorting
     * 
     * This approach first sorts the array and then uses two pointers (one starting from the beginning
     * and the other from the end) to find the two numbers that add up to the target.
     * 
     * Note: This approach returns the values of the numbers rather than their original indices.
     */
    public int[] twoSum(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;

        // Use two pointers to find the target sum
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                // Return the two numbers that sum to the target
                return new int[] {nums[i], nums[j]};
            } else if (nums[i] + nums[j] < target) {
                i++; // Move the left pointer rightward to increase the sum
            } else {
                j--; // Move the right pointer leftward to decrease the sum
            }
        }

        // If no solution is found, return -1
        return new int[] {-1};
    }
}

class Solution2 {
    /**
     * Approach 2: HashMap for Faster Lookup
     * 
     * This approach uses a HashMap to store the complement of each number (target - nums[i]) and its
     * index as we iterate through the array. If a complement is found in the HashMap, it means the 
     * corresponding numbers add up to the target, and their indices are returned.
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the complement exists in the map
            if (map.containsKey(target - nums[i])) {
                // Return the indices of the two numbers
                return new int[] {map.get(target - nums[i]), i};
            }
            // Store the number and its index in the map
            map.put(nums[i], i);
        }

        // Return [0,0] if no solution is found (though the problem guarantees one solution)
        return new int[] {0, 0};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        // Using Solution1
        Solution solution1 = new Solution();
        System.out.println(Arrays.toString(solution1.twoSum(nums, target)));  // Outputs the actual numbers
        
        // Using Solution2
        Solution2 solution2 = new Solution2();
        System.out.println(Arrays.toString(solution2.twoSum(nums, target)));  // Outputs the indices
    }
}
