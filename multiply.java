class Solution {
    public StringBuilder convertString(int pro,StringBuilder sb){
        // System.out.println(pro);
        if(pro==0)
        {
            return sb;
        }
        return convertString(pro/10,sb).append(pro%10);
    }
    public String multiply(String num1, String num2) {
        //first creating number iself
        int n1=0;
        int n2=0;
        for(int i=0;i<num1.length();i++){
            n1*=10;
            n1+=num1.charAt(i)-'0';
        }
        for(int i=0;i<num2.length();i++){
            n2*=10;
            n2+=num2.charAt(i)-'0';
        }
        int pro=n1*n2;
        System.out.println(pro+"  "+n1+"  "+n2);
        return convertString(pro,new StringBuilder()).toString();
    }
}

public class multiply {
    public static void main(String[] args) {
        System.out.println(new Solution().multiply("2","3"));
    }
}
