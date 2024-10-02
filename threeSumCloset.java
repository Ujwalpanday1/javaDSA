import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Arrays.sort(nums);
        // int closest = Integer.MAX_VALUE / 2;

        // for (int i = 0; i < nums.length - 2; i++) {
        //     int left = i + 1, right = nums.length - 1;

        //     while (left < right) {
        //         int sum = nums[i] + nums[left] + nums[right];

        //         if (Math.abs(target - sum) < Math.abs(target - closest)) {
        //             closest = sum;
        //         }

        //         if (sum < target) {
        //             left++;
        //         } else {
        //             right--;
        //         }
        //     }
        // }
        // return closest;

        //the most brute force method is to calculate the sum of all triplets and return the closet one 

        // int ans=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             int currentSum=nums[i]+nums[j]+nums[k];
        //             int diff=Math.abs(currentSum-target);
        //             if(diff<Math.abs(ans-target))
        //             ans=currentSum;
        //         }
        //     }
        // }
        // return ans;

        //yeah this works perfectly but i need to work on its time complexity 
        //what i am thinking is that to reduce this problem to use 2 pointer approach 
        //for every element in the array i will do two pointer approach so the time comeplexity reduce 
        //from O(n^3) to O(n^2)
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        int i=0;
        while(i<nums.length){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                while(j<k&&nums[i]+nums[j]+nums[k]<target){
                int currentSum=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(currentSum-target);
                if(diff<Math.abs(ans-target))
                ans=currentSum;
                j++;
                System.out.println(ans+"  "+currentSum);
            }
            while(j<k&&(nums[i]+nums[j]+nums[k])>target){
                int currentSum=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(currentSum-target);
                if(diff<Math.abs(ans-target))
                ans=currentSum;
                k--;
                // System.out.println(ans+"  "+currentSum);
            }
            }
            
            if(j<k&&nums[i]+nums[j]+nums[k]==target)
            return target;
            i++;
        }
        return ans;
    }
}
public class threeSumCloset {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.threeSumClosest(new int[]{-1000,-5,-5,-5,-5,-5,-5,-1,-1,-1}, -14));
    }
}
