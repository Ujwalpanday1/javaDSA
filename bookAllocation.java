import java.util.ArrayList;


 class Solution {
    public static int find(ArrayList<Integer> arr,int s,int e ,int n, int m){
    if(s==e)
    return s;
    //find the no.of groups possible with that no.of pages 
    int mid=s+(e-s)/2;
    int noOfGroups=0;
    int i=0;
    
    while (i < n) {
        if(mid==104)
        System.out.println(i);
        int currentStudentPages = arr.get(i); // Start with the pages of the current book
        int j = i; // Use a separate index to traverse the books for the current group
    
        // Expand the current group while the total pages are within the allowed limit
        while (j < n - 1 && currentStudentPages + arr.get(j + 1) <= mid) {
            j++; // Move to the next book
            currentStudentPages += arr.get(j); // Add the pages of the next book
        }
    
        // After the inner loop ends, `j` is the last book in the current group
        i = j + 1; // Move `i` to the next book for the next group
        noOfGroups++; // Count this group
    }
    if(mid==104)
    System.out.println(noOfGroups);
    
    if(noOfGroups>m)// groups of books formed is greater than the no .of student so we should increase the size of pages
    return find(arr,mid+1,e,n,m);
    return find(arr,s,mid,n,m);
}
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(n<m)
        return -1;
        //find the min and max 
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr.get(i);
            max=Math.max(arr.get(i),max);
        }
        return find(arr,max,sum,n,m);
    }
}
public class bookAllocation {
    public static void main(String[] args) {
        ArrayList<Integer> books = new ArrayList<>();
        books.add(12);
        books.add(34);
        books.add(67);
        books.add(90);
        int m = 2;  // Number of students
        int n = books.size(); // Number of books

        int result = Solution.findPages(books, n, m); // Call the static find method
        System.out.println("The minimum number of pages is: " + result);
    }
}
