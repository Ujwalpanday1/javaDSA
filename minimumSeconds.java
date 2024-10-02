class Solution {
    public boolean checkFeasiability(long curr,int mountainHeight,int[] workerTimes){
        long total=0;
        for(int i=0;i<workerTimes.length;i++){
            long start=workerTimes[i];
            // long running=start;
            // long runningTotal=start;
            // while(runningTotal<=curr){
            //     total++;
            //     running+=start;
            //     runningTotal+=running;
            // }
            //above using a loop causes additional time 
            //so we will use the formula to get the required ans 

            long ans=(long)(-1+Math.sqrt(1+4*(2*curr/start)))/2;
            total+=ans;
        }
        if(total>=mountainHeight)
        return true;
        return false;
    }
    public long binarySearch(int mountainHeight,int[] workerTimes,long s,long e){
        if(s>=e)
        return s;
        long mid=s+(e-s)/2;
        if(checkFeasiability(mid,mountainHeight,workerTimes))
        return binarySearch(mountainHeight,workerTimes,s,mid);
        return binarySearch(mountainHeight,workerTimes,mid+1,e);
    }
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long highest=Integer.MIN_VALUE;
        long smallest=Integer.MAX_VALUE;
        for(int i=0;i<workerTimes.length;i++){
            if(workerTimes[i]>highest)
            highest=workerTimes[i];
            if(workerTimes[i]<smallest)
            smallest=workerTimes[i];
        }
        

        long upperBound=smallest*mountainHeight*(mountainHeight+1)/2;//all the work done by the slowest worker
        //now linearly searching to find the answer 
        // for(int i=smallest;i<=upperBound;i++){
        //     if(checkFeasiability(i,mountainHeight,workerTimes))
        //     return (long)i;
        // }
        //the linear method is not optimal so we go for binary search
        return binarySearch(mountainHeight,workerTimes,smallest,upperBound);
        
    }
}
public class minimumSeconds {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.minNumberOfSeconds(5, new int[] {1}));
    }
}
