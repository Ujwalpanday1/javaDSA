import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public void findPermutation(List<List<Integer>> list, List<Integer> l,int[] nums,HashSet<Integer> set){
        System.out.println(l);
        if(l.size()==nums.length)
        {   
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
            continue;
            set.add(nums[i]);
            l.add(nums[i]);
            findPermutation(list,l,nums,set);
            l.remove(l.size()-1);
            set.remove(nums[i]);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        findPermutation(list,new ArrayList<>(),nums,new HashSet<>());
        return list;
    }
}

public class Permutation {
    public static void main(String[] args) {
        Solution sol= new Solution();
        System.out.println(sol.permute(new int[]{1,2,3}));
    }    
}
