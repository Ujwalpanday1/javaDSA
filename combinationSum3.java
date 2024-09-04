import java.util.ArrayList;
import java.util.List;

class Solution {
    public void findCombination(List<Integer> l,List<List<Integer>> list,int k,int n,int sum,int start){
        if(sum>n)
        return;
        if(sum==n)
        {
            if(l.size()==k){
                list.add(new ArrayList<>(l));
            }           
            return;
        }
        for(int i=start;i<=9;i++){
            l.add(i);
            findCombination(l,list,k,n,sum+i,i+1);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list =new ArrayList<>();
        findCombination(new ArrayList<>(),list,k,n,0,1);
        return list;
    }
}

public class combinationSum3 {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.combinationSum3(10, 100));
        
    }
}
