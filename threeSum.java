import java.util.*;

// Brute Force Approach
class ThreeSumBruteForce {
    /**
     * Brute force approach to find all unique triplets that sum to zero.
     * Intuition: Try every possible combination of three numbers.
     * Time Complexity: O(n^3)
     * Space Complexity: O(k) where k is the number of unique triplets.
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> setOfLists = new HashSet<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(list);
                        setOfLists.add(list);
                    }
                }
            }
        }
        
        return new ArrayList<>(setOfLists);
    }
}

// HashMap Approach
class ThreeSumHashMap {
    /**
     * HashMap approach to find all unique triplets that sum to zero.
     * Intuition: For each number, find the other two numbers using a HashMap.
     * Time Complexity: O(n^2)
     * Space Complexity: O(n) for storing elements in the HashMap.
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> setOfLists = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                int lookingFor = -(nums[i] + nums[j]);
                if (map.containsKey(lookingFor)) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], lookingFor);
                    Collections.sort(list);
                    setOfLists.add(list);
                }
                map.put(nums[j], j);
            }
        }
        
        return new ArrayList<>(setOfLists);
    }
}

// Two-Pointer Approach (Optimal)
class ThreeSumTwoPointer {
    /**
     * Two-pointer approach to find all unique triplets that sum to zero.
     * Intuition: Sort the array and use two pointers to find pairs that sum to the negative of the current element.
     * Time Complexity: O(n^2)
     * Space Complexity: O(k) where k is the number of unique triplets.
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> wrapperList = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    wrapperList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    
                    // Skip duplicates for the second and third elements
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return wrapperList;
    }
}

// Main class to test the implementations
public class threeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Test Brute Force Approach
        ThreeSumBruteForce bruteForceSolution = new ThreeSumBruteForce();
        List<List<Integer>> bruteForceResult = bruteForceSolution.threeSum(nums);
        System.out.println("Brute Force Result: " + bruteForceResult);
        // Output: [[-1, -1, 2], [-1, 0, 1]]

        // Test HashMap Approach
        ThreeSumHashMap hashMapSolution = new ThreeSumHashMap();
        List<List<Integer>> hashMapResult = hashMapSolution.threeSum(nums);
        System.out.println("HashMap Result: " + hashMapResult);
        // Output: [[-1, -1, 2], [-1, 0, 1]]

        // Test Two-Pointer Approach
        ThreeSumTwoPointer twoPointerSolution = new ThreeSumTwoPointer();
        List<List<Integer>> twoPointerResult = twoPointerSolution.threeSum(nums);
        System.out.println("Two-Pointer Result: " + twoPointerResult);
        // Output: [[-1, -1, 2], [-1, 0, 1]]
    }
}
