import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;

        while(i<j){
            if(nums[i]+nums[j]==target){
                int[] arr={i,j};
                return arr;
            }
            else{
                if(nums[i]+nums[j]<target){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        int[] arr={-1};
        return arr;
    }
}

public class twoSum {
    public static void main(String[] args) {
        
    }
}
