import java.util.Scanner;

public class BeautifulsqaureMatrix { // Rename class to 'Solution'
    public boolean check(String s) { 
        //count 1s 
        int i=0;
        int n=s.length();
        if(n==1)
        return true;
        int count1=0;
        int count0=0;
        while(i<n)
        {
            if(s.charAt(i)=='1')
            count1++;
            else
            count0++;
            i++;
        }
        int m=count1/4+1;
        if((m-2)*(m-2)==count0)
        return true;
        return false;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int n = scanner.nextInt();
        // Loop through each test case
        for (int i = 0; i < n; i++) {
            // Read two integers for each test case
            int number=scanner.nextInt();
            String s=scanner.next();
            Solution sol= new Solution();
            System.out.println(sol.check(s)?"Yes":"NO");
        }
        scanner.close();
    }
}
