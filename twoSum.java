import java.util.Arrays;
import java.util.HashMap;

// when we have to return only the value
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;

        while(i<j){
            if(nums[i]+nums[j]==target){
                int[] arr={nums[i],nums[j]};
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

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        
       HashMap <Integer,Integer> map=new HashMap<>();

       for(int i=0;i<nums.length;i++){

        if(map.containsKey(target-nums[i]))
            return new int[] {map.get(target-nums[i]),i};
        else map.put(nums[i],i);
       }
       return new int[] {0,0};
}
}

public class twoSum {
    public static void main(String[] args) {
        
    }
}
