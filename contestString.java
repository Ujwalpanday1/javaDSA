class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");
        
        for(int i=0;i<10;i++){
            String curr="";
            for(int j=0;j<sb.length();j++){
                if(sb.charAt(j)!='z')
                {
                    curr+=(char)((int)sb.charAt(j)+1);
                }
                else{
                    curr+="a";
                }
            }
            sb.append(curr);
            System.out.println(sb.toString());
        }
        return sb.charAt(k);
    }
}

public class contestString {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.kthCharacter(5));
    }    
}
