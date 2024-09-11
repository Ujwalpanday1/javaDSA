class Solution {
    public int strStr(String heystack, String needle) {
        int start=0;
        int end=needle.length();
        if(heystack.equals(needle))
        return 0;
        
        while(start<=heystack.length()-needle.length()){
            if(needle.equals(heystack.substring(start,end))){
                return start;
            }
            start++;
            end++;
        }

        return -1;
    }
}

public class firstOccurrence {
    public static void main(String[] args) {
        
    }
}
