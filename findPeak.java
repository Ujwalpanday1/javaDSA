class Solution {

    //what i am thinking 
    //first linear seach is the brute 
    //means i will check each and one element
    //but what i have figured out is 
    // imagine i am in a slope and if is guantee that it has finite highest point and lowest point 
    // if you are going downhill then you must have approached at least one peak earlier 
    //and if you are going updill then you are approaching at least one peak 
    //so i can easily eliminate the half making it O(logN)

    public int PeakFinder(int[] nums,int s ,int e){
        if(s>=e)//end of search space or only one element 
        return s;
        //checking if it is the answer
        int mid=s+(e-s)/2;
        if(mid!=0&&nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1])
        return mid;
        //eliminating 
        if(nums[mid]<nums[mid+1])// i am going uphill and i will surely get to the peak 
        return PeakFinder(nums,mid+1,e);//so i will go towards the right 
        return PeakFinder(nums,s,mid-1);//i had crossed the peak so i will check from where i came from 



    }
    public int findPeakElement(int[] nums) {
        return PeakFinder(nums,0,nums.length-1);
    }
}

public class findPeak {
    public static void main(String[] args) {
        
    }
}
