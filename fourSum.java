import java.math.BigInteger;
import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //brute force approach 
        
        // Set<List<Integer>> set=new HashSet<>();
        // for(int i=0;i<nums.length-3;i++){
        //     for(int j=i+1;j<nums.length-2;j++){
        //         for(int k=j+1;k<nums.length-1;k++){
        //             for(int l=k+1;l<nums.length;l++){
        //                 if(i != j && i != k && i != l && j != k && j != l && k != l){
        //                     int sum=nums[i]+nums[j]+nums[k]+nums[l];
        //                     if(sum==target)
        //                     {
        //                         List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
        //                         Collections.sort(list);
        //                         set.add(list);

        //                     }
        //                 }
        //             }
        //         }
        //     }

        // }
        // return new ArrayList<>(set);

        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                Map<BigInteger,Integer> map=new HashMap<>();
                for(int k=j+1;k<nums.length;k++){
                   
                        BigInteger fourth=BigInteger.valueOf(target).subtract(BigInteger.valueOf(nums[i]));
                        fourth=fourth.subtract(BigInteger.valueOf(nums[j]));
                        fourth=fourth.subtract(BigInteger.valueOf(nums[k]));
                        

                        if(map.containsKey(fourth)){
                                List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k],fourth.intValue());
                                Collections.sort(list);
                                set.add(list);
                    }
                    map.put(BigInteger.valueOf(nums[k]),k);
                    
                }
            }

        }
        return new ArrayList<>(set);

    }
}

public class fourSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> result = sol.fourSum(nums, target);
        System.out.println(result);
    }
    
}
