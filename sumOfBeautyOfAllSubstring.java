class Solution {

    public int findBeauty(String s){
        //find the maxfrequency and least freuency 
        if(s.length()<2)
        return 0;
        int [] ch=new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
            
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ch.length;i++){
            max=Math.max(max,ch[i]);
            if(ch[i]!=0)
            min=Math.min(min,ch[i]);

        }
    
        return max-min;

    }

    public int beautySum(String s) {
        int total=0;
        //the extreme bruteforce 
        //find all the substring and then finding its beauty 
        for(int i=0;i<s.length();i++){
            StringBuilder sb= new StringBuilder();
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                //find the beauty here 
                int beauty=findBeauty(sb.toString());
                total+=beauty;
            }
        }
        return total;
    }
}
public class sumOfBeautyOfAllSubstring {
    public static void main(String[] args) {
        Solution sol= new Solution();
        System.out.println(sol.beautySum("pgljlqegfyqhs"));
    }
}
