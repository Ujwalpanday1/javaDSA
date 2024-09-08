import java.util.*;

class Solution {
    public void find(List<List<String>> list,int n,int row,List<String> l,boolean[] usedCol,boolean[] major,boolean[] minor){

        if(row==n){
            
            list.add(new ArrayList<>(l));
            return;
        }
        
        for(int i=0;i<n;i++){
            if(usedCol[i]){
                continue;
            }
            if(major[i-row+n-1]){
                continue;
            }
            if(minor[row+i])
            continue;
            minor[i+row]=true;
            major[i-row+n-1]=true;
            usedCol[i]=true;
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<i;j++){
                sb.append('.');
            }
            sb.append('Q');
            for(int j=i;j<n-1;j++){
                sb.append('.');
            }
            l.add(sb.toString());
            find(list,n,row+1,l,usedCol,major,minor);
            l.remove(l.size()-1);
            usedCol[i]=false;
            major[i-row+n-1]=false;
            minor[i+row]=false;
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        boolean[] major=new boolean[2*n-1];
        boolean[] minor=new boolean[2*n-1];
        boolean[] usedCol=new boolean[n];
        find(list,n,0,new ArrayList<>(),usedCol,major,minor);   
        return list;

    }
}


public class nQueenProblem {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.solveNQueens(1));
    }
}
