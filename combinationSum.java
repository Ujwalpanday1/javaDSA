import java.util.ArrayList;
import java.util.List;

class Solution {
    public void findCombination(List<Integer> list,int [] candidates,int target, int sum, List<List<Integer>> allList,int start){
        System.out.println(list);
        if(sum>target)
        return;
        if(sum==target){
            List<Integer>l = new ArrayList<>(list);
            allList.add(l);
            return;
        }
        for(int i=start;i<candidates.length;i++){
            list.add(candidates[i]);
            findCombination(list,candidates,target,sum+candidates[i],allList,i);
            list.remove(Integer.valueOf(candidates[i]));
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allList=new ArrayList<>();
        findCombination(new ArrayList<>() ,candidates,target,0,allList,0);
        return allList;
    }
}

public class combinationSum {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int [] arr={2,3,6,7};
        System.out.println(sol.combinationSum(arr,8));
    }
}
