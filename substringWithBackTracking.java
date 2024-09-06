import java.util.ArrayList;
import java.util.List;

class Solution{
    public void find(List<String> list,StringBuilder sb,String s,int start){
        list.add(sb.toString());
        if(start>=s.length())
        {
            return;
        }
        sb.append(s.charAt(start));
            find(list,sb,s,start+1);
            sb.deleteCharAt(sb.length()-1);
        
    }
    public List<String> findSubstring(String s)
    {
    List<String> list =new ArrayList<>();
    for(int i=0;i<s.length();i++)
    find(list,new StringBuilder(),s,i);
        return list;
    }
}

public class substringWithBackTracking {

    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.findSubstring("abcd"));
    }
    
}
