import java.util.*;

class Solution {
    public List<List<String>> find(int n, int row, List<List<String>> list, boolean[] col, boolean[] diag1, boolean[] diag2, char[][] board) {

        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            list.add(temp);
            return list;
        }
        
    
        for (int j = 0; j < n; j++) {
            if (!col[j] && !diag1[row - j + n - 1] && !diag2[row + j]) {
       
                board[row][j] = 'Q';
                col[j] = diag1[row - j + n - 1] = diag2[row + j] = true;
    
                find(n, row + 1, list, col, diag1, diag2, board);

                board[row][j] = '.';
                col[j] = diag1[row - j + n - 1] = diag2[row + j] = false;
            }
        }
        
        return list;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        boolean[] col = new boolean[n]; 
        boolean[] diag1 = new boolean[2 * n - 1]; 
        boolean[] diag2 = new boolean[2 * n - 1];  
        char[][] board = new char[n][n];  
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
       
        find(n, 0, list, col, diag1, diag2, board);
        
        return list;
    }
}


public class nQueenProblem {
    public static void main(String[] args) {
        
    }
}
