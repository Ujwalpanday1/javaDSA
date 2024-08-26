class Solution {
    public int find(int [] nums,int s,int e){

        if(s>=e)
        return nums[e];
        int mid=s+(e-s)/2;
        if(mid%2==0){
        if(nums[mid]==nums[mid+1])//if dublicate occur toward right then i will search towards right \
        return find(nums,mid+2,e);
        if(nums[mid]==nums[mid-1])//if dublicate occur toward left then i will search towards left
        return find(nums,s,mid-2);
        return nums[mid];
        }
        if(nums[mid]==nums[mid-1])//if dublicate occur toward left then i will search towards right \
        return find(nums,mid+1,e);
        if(nums[mid]==nums[mid+1])//if dublicate occur toward right then i will search towards left
        return find(nums,s,mid-1);
        return nums[mid];


    }
    public int singleNonDuplicate(int[] nums) {
        return find(nums,0,nums.length-1);
    }
}

public class FindSingleElement {
    public static void main(String[] args) {
        
    }
}
