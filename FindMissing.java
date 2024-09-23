import java.util.Arrays;

class Solution {
    public int find(int[] nums,int s,int e){
        if(s>=e){
            if(s>=0&&)
            return s;

        }
        
        int mid=s+(e-s)/2;
        if(mid==nums[mid])//missing number is towards right 
        return find(nums,mid+1,e);
        return find(nums,s,mid-1);
    }
    public int missingNumber(int[] nums) {
        //missing number
        Arrays.sort(nums);
        if(nums[nums.length-1]==nums.length-1)
        return nums.length;
        return find(nums,0,nums.length-1);
    }
}
public class FindMissing {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.missingNumber(new int[]{0,2,3}));
    }
}
