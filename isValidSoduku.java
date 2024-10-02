class Solution {
    //method to check if number is already present in the same row ,col or box
    public boolean checkIfPresentAlready(boolean[][] row,boolean[][] col,boolean[][] box,int number,int i,int j){
        //generating the box index based on i and j 
        int boxIndex=(i/3)*3+j/3;
        if(row[i][number-1]||col[j][number-1]||box[boxIndex][number-1])//if present in any return true 
        return true;
        else
        return false;
    }
    //method to mark the indicator in which row ,col and box is the number is present 
    public void markPresence(boolean[][] row,boolean[][] col,boolean[][] box,int number,int i,int j){
        //generating the box index based on i and j 
        int boxIndex=(i/3)*3+j/3;
        row[i][number-1]=true;
        col[j][number-1]=true;
        box[boxIndex][number-1]=true;
    }

    //method to convert char to number
    public int convertToNum(char ch){
        int num=ch;//the ascii value of ch is saved in the num
        num=ch-'0'; //substracting the ascii value of 0 form num gives the actual number;
        return num;
    }

    public boolean isValidSudoku(char[][] board) {
        //make the data available at first like what is present in each row ,col and boxes
        boolean[][] row=new boolean[9][9];
        boolean[][] col=new boolean[9][9];
        boolean[][] box=new boolean[9][9];
        //here in these 2d arrays first index determines which row , col or box it is 
        //like there are 9 rows ,9 cols and 9 boxes 
        //and second index means the number which is 0 based like to represent 1 , 0 is used 
        //so if i do row[0][8] is true means 9 is present in the first row 

        //start putting the number in them and in any moment you find that number is already present in any of these
        //there indicators then return false 
        //else return true
        
        //star putting the numbers
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                //if it is not a number then continue to ignore it 
                if(board[i][j]=='.')
                continue;

                
                //otherwise check if it is present in same row or col or box
                //generate the number form char to use it as index
                int number=convertToNum(board[i][j]);
                if(checkIfPresentAlready(row,col,box,number,i,j)){
                    //if it is already present then return false
                    return false;
                }
                else{
                    //mark the indicators about it presence 
                    markPresence(row,col,box,number,i,j);
                }
            }
        }
        return true;
    }
}
public class isValidSoduku {
    public static void main(String[] args) {
        
    }
}
