
class Solution {
    public int ship(int[] weights,int s,int e,int days){
        if(s==e)
        return s;
        int mid=s+(e-s)/2;
        //now i need to find the no. of days 
        
        int i=0;
        int requiredDays=0;
        while(i<weights.length){
            int total=0;
            while(i<weights.length&&total+weights[i]<=mid){
            total+=weights[i];
            i++;
        }
        requiredDays++;
        }
        if(requiredDays>days)
            //increase the capacity 
            return ship(weights,mid+1,e,days);
            return ship(weights,s,mid,days);

    }
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight=Integer.MIN_VALUE;
        int totalWeight=0;
        for(int i=0;i<weights.length;i++){
            maxWeight=Math.max(maxWeight,weights[i]);
            totalWeight+=weights[i];
        }
        return ship(weights,maxWeight,totalWeight,days);
    }
}
public class shipingPackageProblem {
    public static void main(String[] args) {
        
    }
}
