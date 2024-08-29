class Solution {
    public boolean canBeAnswer(int [] nums,int mid,int k){
        int noOfSubArray=0;
        int i=0;
        while(i<nums.length){
            int current=nums[i];
            while(i<nums.length-1&&current+nums[i+1]<=mid){
                
                i++;
                current+=nums[i];
            }
            i++;
            noOfSubArray++;
          
        }
        // if(mid==8)
        // System.out.println(noOfSubArray);
        if(noOfSubArray<=k)//check if the answer is possible for the given max sum
        return true;
        return false;
    }
    public int findMax(int [] nums,int s,int e,int k){
        if(s==e)
        return s;
        int mid=s+(e-s)/2;
        //can mid be my answer ??
        if(canBeAnswer(nums,mid,k))
        return findMax(nums,s,mid,k);//narrow down till i get the best possible answer evenif mid can be my answer
        return findMax(nums,mid+1,e,k);//otherwise go on increasing the sum 
    }
    public int splitArray(int[] nums, int k) {
        if(k>nums.length)
        return -1;//its no possible to have no of subarray more than the length of the array
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            sum+=nums[i];
        }
        return findMax(nums,max,sum,k);
    }
}
public class subArray {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int [] nums={1,2,3,4,5};
        int k=2;
        int res=sol.splitArray(nums,k);
        System.out.println(res);

        
    }
}
