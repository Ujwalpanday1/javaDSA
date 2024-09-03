import java.util.ArrayList;
import java.util.List;

class Solution {
    public void findParentheses(String str,int open,int close,List<String> s,int n){
        //try adding open 
        if(open>n||close>n)
        return;
        if(close==n&&open==n)
        {
            s.add(str);
            return;
        }
        findParentheses((str+'('),open+1,close,s,n);
        if(open>close){
            findParentheses((str+')'),open,close+1,s,n);
        }
        else{
            return;
        }

        
    }
    public List<String> generateParenthesis(int n) {
        List<String> s=new ArrayList<>();
        findParentheses("",0,0,s,n);
        return s;
    }
}
public class generateValidParentheses {
    public static void main(String[] args) {
        
    }
}
