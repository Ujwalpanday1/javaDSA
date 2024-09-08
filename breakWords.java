import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    Map<Integer, Boolean> memo = new HashMap<>();

    public boolean separate(int finished, List<String> wordDict, String s) {
        System.out.println(memo);
        if (memo.containsKey(finished)) {
            return memo.get(finished);
        }
        if (finished >= s.length())
            return true;
        for (int i = 0; i < wordDict.size(); i++) {
            if (finished + wordDict.get(i).length() <= s.length()) {
                if (s.substring(finished, finished + wordDict.get(i).length()).equals(wordDict.get(i))) {
                    // word matched
                    // increase the finished and go for remaining parts
                    if (separate(finished + wordDict.get(i).length(), wordDict, s)) {
                        memo.put(finished,true);
                        return true;
                    }

                }

            }

        }
        memo.put(finished, false);
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        // i have to break the in the string s into the words present in wordDict
        // if the string can be broken into the words in wordDict then return true

        // so lets think of the solution
        // what i am thinking is lets try to find the fit the words from the wordDict in
        // the string s
        // one by one
        return separate(0, wordDict, s);

    }
}
public class breakWords {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", new ArrayList<>(Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"))));

    }
}
