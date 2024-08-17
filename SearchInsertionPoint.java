class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=nums.length/2;
        while(i>=0&&i<nums.length){
            System.out.println((i==0||target>nums[i-1])&&target<nums[i]);
            
            if(nums[i]==target)
            return i;
            if((i==0||target>nums[i-1])&&target<nums[i])
            return i;
            if(i==nums.length-1&&nums[i]<target)
            return ++i;
            if(nums[i]>target){
                i=i/2;
            }
            else{
                if(i/2==0)
                i++;
                i=i+i/2;
            }
        }   
        return -1; 
    }   

}

public class SearchInsertionPoint {
    public static void main(String[] args){
        int[] nums={1,3,5};
        int target=4;
        Solution s=new Solution();
      
        System.out.println(  s.searchInsert(nums,target));
    }
}
