class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ans=new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            int result=0;

            int left=queries[i][0];
            while(left<=queries[i][1]){
                result=result^arr[left];
                left++;
            }
            System.out.println(i);
            ans[i]=result;
        }
        return ans;
    }
}

public class Xor {
    
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.xorQueries(new int[]{16},new int[][]{{0,0},{0,0},{0,0},{0,0}}));
    }
}
