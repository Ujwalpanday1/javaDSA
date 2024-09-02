import java.util.*;
class Solution {
    public void putChar(int [] arr,String s){
        for(int i=0;i<s.length();i++){
            arr[(int)s.charAt(i)]++;
        }
    }
    public String frequencySort(String s) {
        //the straight forward method is very easy 
        //calculate the frequency of the character and store it in the hashmap 
        int[] arr=new int[128];
        //put everything in map 
        putChar(arr,s);

        
    
        List<Character> ch= new ArrayList<Character>(); 
        for (int i = 0; i < 128; i++) {
            if (arr[i] > 0) {
                ch.add((char) i);
            }
        }
        
        //now i have the frequency int array and character in the list 
        //now i will sort the character according to the frequency 

        ch.sort((a,b)->arr[b]-arr[a]);

        //make a string according to the array
        StringBuilder sb= new StringBuilder(); 
        
        for(int i=0;i<ch.size();i++){
            for(int k=0;k<arr[ch.get(i)];k++){
                sb.append((char)ch.get(i));
            }
        }

        return sb.toString();
    }
}

public class sortBYfreqency {
    public static void main(String[] args) {
        Solution sol= new Solution();
        System.out.println(sol.frequencySort("tree"));
    }
}
