import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {
        List<List<Character>> list=new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }
        int i=0;
        while(i<s.length()){
            int rowCounter=0;
            while(i<s.length()&&rowCounter<numRows){
                list.get(rowCounter).add(s.charAt(i));
                i++;
                rowCounter++;
            }
            //now going up 
            rowCounter-=2;
            while(i<s.length()&&rowCounter>0){
                list.get(rowCounter).add(s.charAt(i));
                i++;
                rowCounter--;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(i=0;i<list.size();i++){
            int j=0;
            while(j<list.get(i).size()){
                sb.append(list.get(i).get(j));
                j++;
            }
        }
        return sb.toString();
    }
}
public class zigzag {
    public static void main(String[] args) {
        Solution sol= new Solution();
        System.out.println(sol.convert("abcdefghijklmnopqrstuvwxyz", 6));
    }
}
