class Solution {
    public int SearchMin(int [] nums ,int s,int e){
        if(s>=e)  //if only one element is left it must be the answer 
        return nums[s];
        //base case is if previous is greater than the current return current element 
        int mid=s+(e-s)/2;
        if(mid!=s&&(nums[mid]<nums[mid-1]))
            return nums[mid];
        //eliminating half of the array 
        // if we find that if the array is sorted then we will eliminate right part cause right part cannot
        //contain the minimum 
        // else eliminate the left part 
        if(nums[s]<nums[e])// ie array is sorted so we will eliminate the right part 
        return SearchMin(nums,s,mid-1);
        if(nums[mid]>=nums[s])
        return SearchMin(nums,mid+1,e);//eliminate the left part 
        return SearchMin(nums,s,mid-1);


    }
    public int findMin(int[] nums) {
        return SearchMin(nums ,0,nums.length-1);
    }
}
public class FindMinInRotatedArray {
    public static void main(String[] args) {
        
    }
}
