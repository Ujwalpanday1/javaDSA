class Solution {
    // public boolean isPalindrome(String str){
    //     int s=0;
    //     int e=str.length()-1;
    //     while(s<e){
    //         if(str.charAt(s)!=str.charAt(e))
    //         return false;
    //         e--;
    //         s++;
    //     }
    //     return true;
    // }
    public String longestPalindrome(String s) {
        // the most brute force is that i will find all the substring and which subsring is palindrome and 
        // is also the longest that will be answer 
        // int longest=0;
        // String ans="";
        // for(int i=0;i<s.length();i++){
        //     StringBuilder sb=new StringBuilder();
        //     for(int j=i;j<s.length();j++){
        //         sb.append(s.charAt(j));
        //         if(isPalindrome(sb.toString())){
        //              if(sb.length()>longest){
        //             longest=sb.length();
        //             ans=sb.toString();
        //             }
        //         }
        //     }
        // }
        // return ans;

        // this works perfectly with the small string but 
        // for the longest string this method is not a great choice as it has time complexisity of O(n^3)
        // now what i am thinking is to find what is the longest palindrome that i can make by standing
        // at a point by making it a center
        //i will go at a point and consider it as center for a palindrome and expand from that 
        int longest=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            //expand thinking this is the center of palindrom 
            int left=i;
            int right=i;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            if(2*(right-i)-1>longest)
            {
                longest=(right-i)*2-1;
                sb.setLength(0);
                sb.append(s.substring(left+1,right));
            }
        }
        return sb.toString();
    }
}

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.longestPalindrome("babad"));
    }
}
