class Solution {
    public boolean bSearch(int [][] matrix,int s, int e, int target){
        int mid=s+(e-s)/2;
        int row=mid/matrix[0].length;
        int col=mid%matrix[0].length;
        if(matrix[row][col]==target)
        return true;
        if(s>=e)
        return false;//last remaing element was also not the answer so return false or the or the target is 
                    //smaller than the elment at s i.e end of search space
        

        if(matrix[row][col]>target)//search towards left 
        return bSearch(matrix,s,mid-1,target);
        return bSearch(matrix,mid+1,e,target);
        
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            //if the target lies in this interval search here otherwise not 
            if(target>=matrix[0][0]&&target<=matrix[n-1][m-1])//means lies in the interval 
            return bSearch(matrix,0,m*n,target);//do search here
            
            //if otherwise do nothing 
        }
        return false; //if the the target doesnt lie in the interval
    }
}
public class binarySearchIn2DArray {
    public static void main(String[] args) {
        Solution sol= new Solution();
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=12;
        System.out.println(sol.searchMatrix(matrix,target));   
    }
}
