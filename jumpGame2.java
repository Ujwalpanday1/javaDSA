class Solution {
    public int findIndex(int destination,int[] nums,int steps){
        if(destination==0){
            return steps;
        }
        for(int i=0;i<destination;i++){
            if(i+nums[i]>=destination){
                steps++;
                return findIndex(i,nums,steps);
            }
        }
        return steps;
    }
    public int jump(int[] nums) {
        //what i am thinking 
        //i am thinking if a could directly jump and cross the array then it will be great and 
        //cost less steps 
        //so my task is to find the index from where i can directly jump over 
        //if i find that then i will recursively find the next index from where i can quicky get to that 
        //destination index 
        return findIndex(nums.length-1,nums,0);
    }
}

public class jumpGame2 {
    public static void main(String[] args) {
        
    }
}
