

//my bruteforce approch 

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {

         if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder sb=new StringBuilder();
        String travellingstr=strs[0];
        for(int i=1;i<strs.length;i++){
            
            int j=0;
            while(j<strs[i].length()&&j<travellingstr.length()){
                if(strs[i].charAt(j)==travellingstr.charAt(j)){
                    
                    sb.append(travellingstr.charAt(j));
                    
                    j++;

                }
                else{
                    break;
                }
                
            }
            
            travellingstr=sb.toString();
            sb.setLength(0);
            if(travellingstr.length()==0){
                break;
            }
        }
        
        return travellingstr;
    }
}

//most optimal way 

//sorting the array to that the first and last string have the significant diff 
// like if i have the sorted array then the string with lot of common prefix character are nearer to it and the element which is far has least common prefix character
 class SimpleSolution{
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
           return "";
       }

       Arrays.sort(strs);
       int i=0;
       int length=strs.length;
       StringBuilder sb=new StringBuilder();
       while(i<strs[0].length()&&i<strs[length-1].length()){
        if(strs[0].charAt(i)==strs[length-1].charAt(i)){
         sb.append(strs[0].charAt(i))   ;
         i++;

        }
      
        else{
            return sb.toString();
        }

       }
    
       return sb.toString();
       
   }
}


public class longestPrefix {
    
public static void main(String[] args){

    Solution sol=new Solution();
    SimpleSolution sSol=new SimpleSolution();
    String[] strs={"ujwal","ujwrerer","ujrres"};
    System.out.println(  sol.longestCommonPrefix(strs));
    System.out.println(  sSol.longestCommonPrefix(strs));
}
}
