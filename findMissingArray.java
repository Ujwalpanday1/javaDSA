import java.util.ArrayList;
import java.util.List;

class Solution {
    public void find(List<Integer> list, int n ,int sum,int requiredSum,int[] ans){
        if(sum==requiredSum&&list.size()==n){
            for(int i=0;i<n;i++){
                ans[i]=list.get(i);
            }
            return;
        }
        if(sum>requiredSum||list.size()>n)
        return;
        for(int i=1;i<=6;i++){
            list.add(i);
            find(list,n,sum+i,requiredSum,ans);
            list.remove(list.size()-1);
        }
        return;
    }
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int total=rolls.length+n;
        int sum=mean*total;
        int sumOfArray=0;
        for(int i=0;i<rolls.length;i++){
            sumOfArray+=rolls[i];
        }
        int requiredSum=sum-sumOfArray;
        //now i have to find the array of length n whose sum must be required sum 
        //lets do backtracking right ??
        List<Integer> list=new ArrayList<>();
        int [] ans=new int[n];
        find(list,n,0,requiredSum,ans);
    if(ans[0]==0)//answer was not possible 
    return  new int[0];
    return ans;

    }
}

public class findMissingArray {
    public static void main(String[] args) {
        Solution sol= new Solution();
        int [] ans=sol.missingRolls(new int[]{4,5,6,2,3,6,5,4,6,4,5,1,6,3,1,4,5,5,3,2,3,5,3,2,1,5,4,3,5,1,5}, 4, 4);
        System.out.println();
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
        System.out.println();
    }
}
