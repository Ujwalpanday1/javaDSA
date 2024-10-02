import java.util.Stack;

class Solution {
    public boolean checker(StringBuilder sb,int n){
        //base case
        if(n>=sb.length()){
            return isValid(sb.toString());
        }
        if(sb.charAt(n)!='*')
        return checker(sb,n+1);
        sb.setCharAt(n,'(');
        if(checker(sb,n+1))
        return true;
        sb.setCharAt(n,')');
        if(checker(sb,n+1))
        return true;
        sb.deleteCharAt(n);
        if(checker(sb,n+1))
        return true;
        sb.insert(n,'*');
        return false;
    }
    public boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
                continue;
            }
            if(stack.isEmpty())
            return false;
            stack.pop();
        }
        if(stack.isEmpty())
        return true;
        return false;
    }
    public boolean checkValidString(String s) {
        
        //what i am thinking is replacing * with both ( and ) and if overall it leads to valid then we will return true
        StringBuilder sb=new StringBuilder(s);
        return checker(sb,0);
    }
}
public class validParanthesisTwo {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
    }
}
