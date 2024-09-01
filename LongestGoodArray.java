import java.util.Scanner;

public class LongestGoodArray { // Rename class to 'Solution'
    public boolean check(int c,int i,int e) { 
        if((c+2*i+1)<=e)
        return true;
        return false;
    }
    public int findLength(int start,int end){
        if(start==end)
        return 1;
        int current=start;
        int increaser=1;
        while(check(current,increaser,end)){
            current+=increaser;
            increaser++;
        }

        return increaser+1;
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
            LongestGoodArray sol = new LongestGoodArray();
            System.out.println(sol.findLength(arr[0], arr[1]));
        }
        scanner.close();
    }
}
