class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        int no=n/k;
        System.out.println("no  :::"+no);
        int i=0;
        StringBuilder sb= new StringBuilder();
        for(int j=0;j<=no;j++){
            int sum=0;
            int count=0;
            while(count<k){
                sum+=s.charAt(i)-'a';
                i++;
                count++;
            }
            sum=sum%26;
            int ascii=sum+'a';
            sb.append((char)ascii);
    
            
        }
        return sb.toString();
    }
}

public class buildString {
    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="abcd";
        int k=2;
       System.out.println(sol.stringHash(s,k)); 
    }
}
