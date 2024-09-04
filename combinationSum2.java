import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Solution {
    public void findCombination(int[] nums,int start,int sum,int t,List<Integer> l,HashSet<List<Integer>> set){
        System.out.println(l+"      "+sum);
        if(sum>t)
        return;
        if(sum==t){
            ArrayList<Integer>li=new ArrayList<>(l);
            Collections.sort(li);
            set.add(li);
            return;
        }
        for(int i=start;i<nums.length;i++){
            l.add(nums[i]);
            findCombination(nums,i+1,sum+nums[i],t,l,set);
            l.remove(l.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> set=new HashSet<>();
        findCombination(candidates,0,0,target,new ArrayList<>(),set);
        return new ArrayList<>(set);
    }
}
public class combinationSum2 {
    public static void main(String[] args) {
        Solution sol= new Solution();
        int[] candidates={2,5,2,1,2};
        System.out.println(sol.combinationSum2(candidates,5));
    }
}
