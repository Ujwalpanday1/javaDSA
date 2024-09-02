class Solution {
    public boolean isPalindrome(String str){
        int s=0;
        int e=str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e))
            return false;
            e--;
            s++;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        // the most brute force is that i will find all the substring and which subsring is palindrome and 
        //is also the longest that will be answer 
        int longest=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                System.out.println(sb.toString());
                if(isPalindrome(sb.toString())){
                // System.out.println(sb.toString());
                if(sb.length()>longest){
                    longest=sb.length();
                    ans=sb.toString();
                }
            }
            }
            //check if it is the palindrome 
            
        }
        return ans;
    }
}

public class longestPalindrome {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.longestPalindrome("xaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaa"));
    }
}
