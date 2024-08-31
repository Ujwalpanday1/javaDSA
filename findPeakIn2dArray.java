class Solution {
    public int [] findPeak(int[][] mat,int s,int e){
        int max=Integer.MIN_VALUE;
        int mid=s+(e-s)/2;
        int row=-1;
        int col=-1;
        for(int i=0;i<mat.length;i++){
            if(max<mat[i][mid]){
                row=i;
                col=mid;
                max=mat[i][mid];
            }
        }
        if(s>=e){
            int[] arr={row,col};
            return arr;
        }
        if((col==0||mat[row][col]>mat[row][col-1])&&(col==mat[0].length-1||mat[row][col]>mat[row][col+1]))
        {
            int[] arr={row,col};
            return arr;
        }
        if(mat[row][col]<mat[row][col+1])
        return findPeak(mat,mid+1,e);//answer will be at right side
        return findPeak(mat,s,mid-1);//asnwer will lie in left side

    }
    public int[] findPeakGrid(int[][] mat) {

        //this is the most brute force approach i can think of now 
        //very easy to understand and execute 

        // int n=mat.length;
        // int m=mat[0].length;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         //checking if right is greater than the current if yes then it is not our answer just continue 
        //         if(j<m-1&&mat[i][j]<mat[i][j+1])
        //         continue;

        //         //checking for top
        //         if(i>0&&mat[i][j]<mat[i-1][j])
        //         continue;
        //         //checking for left
        //         if(j>0&&mat[i][j]<mat[i][j-1])
        //         continue;
        //         //checking for buttom
        //         if(i<n-1&&mat[i][j]<mat[i+1][j])
        //         continue;

        //         int[] arr={i,j};
        //         return arr;

        //     }
        // }
        // int [] arr={-1,-1};
        // return arr;

        //now thinking of something out of the box and observing the question with more focus and try to find 
        // the answer in much optimized way 
        // i know in a 1 d array the max element will always be my peak element
        //so i want to kind of reduce the answer to something to 1 d array 
        //if i take a maximum element from a column 
        //then it is fixed that it is always greater than top and button 
        //now i have to figure out only horizontal side 
        //if both side is smaller then that will be my answer 
        //if left side is greater than my answer 
        //than what can i say is that there is a number in left side which is a peak element 
        //lly if right is greater then right side must contain peak element 

        int s=0;
        int e=mat[0].length-1;
        return findPeak(mat,s,e);
        

    }
}

public class findPeakIn2dArray {
    public static void main(String[] args) {
        
    }
}
