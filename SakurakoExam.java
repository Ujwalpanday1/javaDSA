import java.util.Scanner;

public class SakurakoExam { // Rename class to 'Solution'
    public boolean check(int[] nums) {
        if (nums[0] % 2 == 1) // If there is an odd number of 1s, it's never possible 
            return false;
        if (nums[1] % 2 != 0) {
            if (nums[0] < 2)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int n = scanner.nextInt();

        // Loop through each test case
        for (int i = 0; i < n; i++) {
            // Read two integers for each test case
            int[] arr = new int[2];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();

            // Process the array or perform operations here
            Solution sol = new Solution();
            System.out.println(sol.check(arr) ? "YES" : "NO");
        }
        scanner.close();
    }
}
