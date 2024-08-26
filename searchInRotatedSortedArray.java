class Solution {

    // Standard binary search
    public boolean binarySearch(int[] nums, int start, int end, int target) {
       
       if(start>end)
       return false;
       int mid=start+(end-start)/2;
       //base case 
       if(nums[mid]==target)
       return true;
       if(nums[start]==nums[mid]&&nums[mid]==nums[end])// main problem is we cannot find which is sorted so 
       return binarySearch(nums,start+1,end-1,target);//when this condition comes we will exclude that value 
       if(nums[mid]>=nums[start]){  //left side is sorted 
            if(target>=nums[start]&&target<=nums[mid]) //lies in left part 
            return binarySearch(nums, start,mid-1,target);
            return binarySearch(nums,mid+1,end,target);
       }
       if(target>=nums[mid+1]&&target<=nums[end])//right side is sorted
       return binarySearch(nums,mid+1,end,target); //lies in right side 
       return binarySearch(nums,start,mid-1,target);//lies in left side 
    }

    public boolean search(int[] nums, int target) {
      
      return binarySearch(nums, 0, nums.length-1,target);
    }
}

public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        
    }
}
