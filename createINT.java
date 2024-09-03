class Solution {
    public int myAtoi(String s) {
        //lets write rules first 
        //first i will get rid of leading spaces 
        //right after that there should be either leading 0 or number 
        //if any other things are there then i will just return 0
        //after removing leading 0 i must get either + or - or number 
        //if not i will just return 0
        // after that i will get the number and if i encounter anything extra i will just return upto that 
        
        //removing leading space at first 
        int i=0;
        int sign=0;//let 0 is positive 
        while(i<s.length()&&s.charAt(i)==' '){
            i++;
        }
        if(i<s.length()&&s.charAt(i)=='-'){
            sign=1;
            i++;
        }
        else if(i<s.length()&&s.charAt(i)=='+'){
            sign=0;
            i++;
        }

        //leading 0s 
        while(i<s.length()&&s.charAt(i)=='0'){
            i++;
        }
        //now i am left of with actual numbers 
        //upto where i get the number i will just take upto there and then i will stop taking and return ans
        int num=0;
        while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
            num*=10;
            num+=s.charAt(i)-'0';
            i++;
            if(i<s.length()-1)
           System.out.println(num+"   "+(Integer.MAX_VALUE/10-s.charAt(i+1)));
           if(i<s.length()-1&&num>=Integer.MAX_VALUE/10-s.charAt(i+1)){
           System.out.println("inside the if ");
           if(sign==0)
           return Integer.MAX_VALUE;
           return Integer.MIN_VALUE;
           }   
        }
        return sign==0?num:-num;
    }
}
public class createINT {
    public static void main(String[] args) {
        Solution sol= new Solution();
        System.out.println(sol.myAtoi("2147483648"));

    }
}
