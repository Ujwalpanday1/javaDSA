class Solution {
    public boolean find(char[][] board,String word,int placed ,boolean[][] visited,int row,int col){
        System.out.println(row+"   "+col+"  "+board[row][col]+"  "+ placed);
        if(placed==word.length()){
            return true;    
        }
        //go toward left 
        //come back if answer not found 
        //go down 
        //come back if answer not found 
        //go right 
        //come back if answer not found 
        //go up 
        //come back if answer not found
        if(col<board[0].length-1&&board[row][col+1]==word.charAt(placed)&&!visited[row][col+1]){
            System.out.println("going right");
            visited[row][col+1]=true;
            if(find(board,word,placed+1,visited,row,col+1))
            return true;
            visited[row][col+1]=false;
        }
        if(row<board.length-1&&board[row+1][col]==word.charAt(placed)&&!visited[row+1][col]){
            System.out.println("going down");
            visited[row+1][col]=true;
           if(find(board,word,placed+1,visited,row+1,col))
           return true;
            visited[row+1][col]=false;
        }
        if(col>0&&board[row][col-1]==word.charAt(placed)&&!visited[row][col-1]){
            System.out.println("going left");
            visited[row][col-1]=true;
            if(find(board,word,placed+1,visited,row,col-1))
            return true;
            visited[row][col-1]=false;
        }
        if(row>0&&board[row-1][col]==word.charAt(placed)&&!visited[row-1][col]){
            System.out.println("going top");
            visited[row-1][col]=true;
            if(find(board,word,placed+1,visited,row-1,col))
            return true;
            visited[row-1][col]=false;
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        //since the constraints are very small so we can do backtracking and explore every possibilities till 
        //we get answer or get in position from where answer is not possible we backtrack to previous 
        //situation and expore another possibilities 

        //first we go towards left if anwer is not possible we go toward down 
        //even if ans is not possible we go towards right and then to top
        boolean[][] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    visited[i][j]=true;
                    if(find(board,word,1,visited,i,j))
                    return true;
                    visited[i][j]=false;
                }
                
            }
        }
        //do this for every elements 
        
        return false;
    }
}

public class wordSearch {
    public static void main(String[] args) {
        Solution sol= new Solution();
        System.out.println(sol.exist(new char[][]{
            {'C', 'A', 'A'},
            {'A', 'A', 'A'},
            {'B', 'C', 'D'}
        },"AAB"));
    }
}
