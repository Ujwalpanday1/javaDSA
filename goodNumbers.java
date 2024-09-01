class Solution {
    // Using iterative approach for power calculation to avoid recursion depth issues
    public long pow(long x, long n) {
        long result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long oddPossibilities = 4;
        long evenPossibilities = 5;

        // Determine how many ways to fill the odd and even positions
        long oddWays, evenWays;

        if (n % 2 == 0) {
            oddWays = pow(oddPossibilities, n / 2);
            evenWays = pow(evenPossibilities, n / 2);
        } else {
            oddWays = pow(oddPossibilities, n / 2);
            evenWays = pow(evenPossibilities, n / 2 + 1);
        }

        return (int)(oddWays * evenWays);
    }
}

public class goodNumbers {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int ans=sol.countGoodNumbers(5);
        System.out.println(ans);
    }
}
