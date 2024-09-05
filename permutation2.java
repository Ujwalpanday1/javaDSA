import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public void findPermutation(int[] nums,List<List<Integer>> list,List<Integer> l,boolean [] used){
        if(l.size()==nums.length)
        {
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==true)
            continue;
            if(i>0&&nums[i]==nums[i-1]&&!used[i - 1])
            continue;
            used[i]=true;
            l.add(nums[i]);
            findPermutation(nums,list,l,used);
            l.remove(l.size()-1);
            used[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        List<List<Integer>> list=new ArrayList<>();
        findPermutation(nums,list,new ArrayList<>(),used);
        return list;
    }
}

public class permutation2 {
    public static void main(String[] args) {
        Solution sol= new Solution();
        System.out.println(sol.permuteUnique(new int[]{1,1,1,2}));
        
    }
}
