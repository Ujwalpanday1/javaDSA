class Solution {
    public boolean check(int[] nums) {
        int breakPoint=0;

        for(int i=0;i<nums.length-1;i++){

            if(nums[i+1]<nums[i]){
                breakPoint++;
            }
            if(breakPoint>1)
            break;

        }
        if(breakPoint==0||(breakPoint==1 && nums[0]>=nums[nums.length-1]))
        return true;
        else
        return false;
    }
}

public class IsSortedArrayRotated {
    public static void main(String[] args) {
        
    }
}
