class Solution {
    public boolean checkFeasiability(int curr,int mountainHeight,int[] workerTimes){
        int total=0;
        for(int i=0;i<workerTimes.length;i++){
            int start=workerTimes[i];
            int running=start;
            int runningTotal=start;
            while(runningTotal<=curr){
                total++;
                running+=start;
                runningTotal+=running;
            }
        }
        if(total>=mountainHeight)
        return true;
        return false;
    }
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int highest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<workerTimes.length;i++){
            if(workerTimes[i]>highest)
            highest=workerTimes[i];
            if(workerTimes[i]<smallest)
            smallest=workerTimes[i];
        }
        

        int upperBound=smallest*mountainHeight*(mountainHeight+1)/2;//all the work done by the slowest worker
        //now linearly searching to find the answer 
        for(int i=smallest;i<=upperBound;i++){
            if(checkFeasiability(i,mountainHeight,workerTimes))
            return (long)i;
        }
        return -1;
    }
}
public class minimumSeconds {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.minNumberOfSeconds(5, new int[] {1}));
    }
}
