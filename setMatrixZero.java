import java.util.HashSet;

//in this question i have to replace all the 1 in the row and column where the 0 is present with 0


//this is the optimal way to solve this problem 



//this is my better approach 
//i think that i will first find out the index where 0 is present and store it in set so that we dont get dublicate value 
// and then will replace all the 1 with 0 in that row and column .. pretty simple and easily understandable approach 
class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowSet=new HashSet<>();
        HashSet<Integer> columnSet=new HashSet<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    columnSet.add(j);
                }
            }
        }

         for (Integer i : rowSet) {
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
        }
        for (Integer j : columnSet) {
            for(int i=0;i<matrix.length;i++){
                matrix[i][j]=0;
            }
        }

        
    }
}

public class setMatrixZero {
    public static void main(String[] args) {
        
    }
}
