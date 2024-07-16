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

public class longestPrefix {
public static void main(String[] args){

    Solution sol=new Solution();
    String[] strs={"ujwal","ujwrerer","ujrres"};
    System.out.println(  sol.longestCommonPrefix(strs));

}
}
