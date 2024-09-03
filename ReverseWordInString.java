

class Solution {
    public String reverseWords(String s) {
        int i=s.length()-1;
        StringBuilder str=new StringBuilder();
        while(i>=0){
            
            while(i>=0&&s.charAt(i)==' '){
                i--;
            }
            int end=i;
            while(i>=0 && s.charAt(i)!=' '){
               
                i--;
            }
            str.append(s.substring(i+1,end+1));
            str.append(" ");

            while(i>=0&&s.charAt(i)==' '){  //this loop is to exhaust i when there is only white spaces left so that the most outer loop doesnt run so that 
                                            //str.append(" ") wil run again 
                i--;
            }
        }
        str.deleteCharAt(str.length() - 1);
        
        return str.toString();
    }
}


public class ReverseWordInString {
    public static void main(String[] args) {
        Solution sol= new Solution();
        System.out.println(sol.reverseWords(" hello      world     ")+"s");
    }
}
