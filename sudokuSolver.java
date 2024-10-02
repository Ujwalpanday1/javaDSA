class Solution {

    public  void printArrayWithCurlyBracesAndSingleQuotes(char[][] array) {
        System.out.println("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  {");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("'" + array[i][j] + "'");
                if (j < array[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i < array.length - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.println("}");
    }

    public boolean addNumbers(int sCol, int sRow, char[][] board, boolean[][] row, boolean[][] col, boolean[][] box) {
        printArrayWithCurlyBracesAndSingleQuotes(board);
        if (sRow >= 9) // Base case: if we finished all rows
            return true;

        // Move to the next cell
        if (board[sRow][sCol] != '.') {
            if (sCol < 8)
                return addNumbers(sCol + 1, sRow, board, row, col, box);
            else
                return addNumbers(0, sRow + 1, board, row, col, box);
        }

        int boxIndex = (sRow / 3) * 3 + (sCol / 3); // Calculate box index

        for (int i = 0; i < 9; i++) { // Try placing each number from 1 to 9
            if (row[sRow][i] || col[sCol][i] || box[boxIndex][i]) 
                continue; // Skip if the number is already in the row, column, or box

            // Place the number
            row[sRow][i] = col[sCol][i] = box[boxIndex][i] = true;
            board[sRow][sCol] = (char) ((int) '0' + i + 1);

            // Recur to place the next number
            if (addNumbers(sCol < 8 ? sCol + 1 : 0, sCol < 8 ? sRow : sRow + 1, board, row, col, box))
                return true;

            // Backtrack: remove the number and try the next
            row[sRow][i] = col[sCol][i] = box[boxIndex][i] = false;
            board[sRow][sCol] = '.';
        }
        return false; // If no valid number can be placed, return false
    }

    public void solveSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9]; // Tracks numbers in each row
        boolean[][] col = new boolean[9][9]; // Tracks numbers in each column
        boolean[][] box = new boolean[9][9]; // Tracks numbers in each 3x3 box

        // Initialize the boolean arrays based on the initial board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1; // Convert character to index (0-based)
                    row[i][num] = true;
                    col[j][num] = true;
                    box[(i / 3) * 3 + (j / 3)][num] = true; // Calculate box index
                }
            }
        }

        // Solve the Sudoku
        addNumbers(0, 0, board, row, col, box);
    }
}

public class sudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Solution sol = new Solution();
        sol.solveSudoku(board);
        sol.printArrayWithCurlyBracesAndSingleQuotes(board);
    }
}
