import java.util.ArrayList;

class Solution {
    public String reverseWords(String s) {
        int i=s.length()-1;
        StringBuilder str=new StringBuilder();
        ArrayList<String> strings=new ArrayList<String>();
        while(i>=0){
            
            while(i>=0&&s.charAt(i)==' '){
                i--;
            }
            int end=i;
            while(i>=0 && s.charAt(i)!=' '){
               
                i--;
            }
            
            strings.add(s.substring(i+1,end+1));

            while(i>=0&&s.charAt(i)==' '){
                i--;
            }
        }

        for(i=strings.size()-1;i>=0;i--){
            str.append(strings.get(i));
            if(i!=0)
            str.append(" ");
        }
        
        return str.toString();
    }
}

public class reverseString {
    public static void main(String[] args) {
        Solution sol=new Solution();
        String str=sol.reverseWords("  hello world  ");
        System.out.println(str);
    }
}
