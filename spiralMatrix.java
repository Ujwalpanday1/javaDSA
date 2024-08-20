import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top=0;
        int left=0;
        int buttom=matrix.length;
        int right=matrix[0].length;
        while(top<buttom&&left<right){
            //going towards right 
            for(int i=left;i<right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            //going downward
            for(int i=top;i<buttom;i++){
                list.add(matrix[i][right-1]);
            }
            right--;
            //going left only if i had remaining row
            if(top<buttom){
                for(int i=right-1;i>=left;i--){
                    list.add(matrix[buttom-1][i]);
                }
                
                buttom--;
            }
            //going upward only if i had remaining colums
            if(left<right){
                for(int i=buttom-1;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }
        return list;
    }
}
public class spiralMatrix {
    public static void main(String[] args) {
        
    }
}
