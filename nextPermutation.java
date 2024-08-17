class Solution {
    public void nextPermutation(int[] nums) {
        // first finding the break point
        int i=nums.length-1;
        while(i>0 && !(nums[i]>nums[i-1])){
            i--;
        }
        int j=nums.length-1;
        if(i!=0){
             while(!(nums[i-1]<nums[j])){
            j--;
        }
        //swapping nums[i-1] and nums[j];
        int temp=nums[i-1];
        nums[i-1]=nums[j];
        nums[j]=temp;
        }
        //reversing from i to n-1
        int k=nums.length-1;
        while(i<k){
            int temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
            i++;
            k--;
        }
        
    }
}


public class nextPermutation {
    public static void main(String[] args) {
        int []nums={1,2,3};
        Solution sol=new Solution();
        sol.nextPermutation(nums);
    }
    
}
