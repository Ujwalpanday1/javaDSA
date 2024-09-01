import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else
            map.put(s.charAt(i),1);
        }
        for(int i=0;i<t.length();i++){
            
            if(map.containsKey(t.charAt(i))){
                int current=map.get(t.charAt(i));
                current--;

                if(current==0)
                map.remove(t.charAt(i));
                else
                map.put(t.charAt(i),current);
                
                continue;
            }
            return false;
        }
        return true;
    }
}
public class Anagram{
    public static void main(String[] args) {
        SakurakoExam sol=new SakurakoExam();
       System.out.println(sol.isAnagram("anagram","nagaram")); 
    }
}