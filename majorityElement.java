import java.util.Arrays;



class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int currentHighest=1;
        int majorityElement=nums[0];
        int i=0;
        while(i<nums.length-1){
            currentHighest=1;
            while(i<nums.length-1&&nums[i]==nums[i+1]){
                currentHighest++;
                i++;
              
            }
            if(currentHighest>nums.length/2){
                majorityElement=nums[i];
            }
            i++;
        }





        return majorityElement;

        

    }
}

public class majorityElement {
    public static void main(String[] args) {
        
    }
}
