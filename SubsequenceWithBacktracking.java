import java.util.ArrayList;
import java.util.List;

class Solution {
    // Helper function to recursively find subsequences
    public void find(List<String> list, StringBuilder sb, String s, int start) {
        System.out.println(sb.toString()+"  "+start  );
        // Base case: Add the current subsequence to the list
        if (start == s.length()) {
            list.add(sb.toString());
            return;
        }
        
        // Case 1: Include the current character in the subsequence
        sb.append(s.charAt(start));
        find(list, sb, s, start + 1); // Move to the next character
        sb.deleteCharAt(sb.length() - 1); // Backtrack to explore other options
        
        // Case 2: Exclude the current character and move to the next
        find(list, sb, s, start + 1);
    }

    // Main function to start finding subsequences
    public List<String> findSubsequences(String s) {
        List<String> list = new ArrayList<>();
        find(list, new StringBuilder(), s, 0);
        return list;
    }
}

public class SubsequenceWithBacktracking {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> subsequences = sol.findSubsequences("abcd");
        System.out.println(subsequences);
    }
}
