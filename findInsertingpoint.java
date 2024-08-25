
class Solution {

    public int bSearch(int [] nums , int start ,int end ,int target ){
     
     //base case or when to stop
     int mid=(start+end)/2;
     if(mid==0)
     return 1;
     if(target==nums[mid])
     return mid;
     if(target<nums[mid+1]&&target>nums[mid-1]){
         if(nums[mid]>target)
         return mid;
         return mid+1;
     }
     
     
     if(nums[mid]>target)
     return bSearch(nums,start,mid-1,target);
     return bSearch(nums,mid+1,end,target);
 
 
    } 
     public int searchInsert(int[] nums, int target) {
     if(target<=nums[0])
     return 0;
     if(target>nums[nums.length-1])
     return nums.length;
         // applying bSearch
     return bSearch(nums ,0,nums.length-1,target);
     }   
 
 }
public class findInsertingpoint {
    public static void main(String[] args) {
        
    }
}
