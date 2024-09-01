class Solution {
    public double pow(double x, int n){
        if(n==0)
        return 1;
        return x*pow(x,n-1);
    }
    public double myPow(double x, int n) {
        return pow(x,n);
    }
}
public class powerWithRecursion {
    public static void main(String[] args) {
        Solution sol= new Solution();
        System.out.println(sol.myPow(2, 10));
    }
}
