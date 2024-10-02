import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countOfSubstrings(String word, int k) {
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int total=0;
        for(int i=0;i<word.length();i++){
            int c=0;
            int v=0;
            HashMap<Character,Boolean> map=new HashMap<>();
            for(int j=i;j<word.length();j++){
                if(set.contains(word.charAt(j))){

                    if(!map.containsKey(word.charAt(j))){
                        v++;
                        map.put(word.charAt(j),true);
                    }   
                }
                else
                c++;
                if(v==5&&c==k)
                total++;
            }
        }
        return total;
    }
}

public class noOfVowel {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.countOfSubstrings("eauiuo", 0));
    }
}
