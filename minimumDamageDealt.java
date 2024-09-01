class Solution {
    public long minDamage(int power, int[] damage, int[] health) {
        
       
        
        int count=0;
        int n=damage.length;
        long total=0;
        while(count<n){
             int maxp=Integer.MIN_VALUE;
            int index=-1;
            for(int i=0;i<n;i++){
                int s=(health[i]+power-1)/power;
                int sum=0;
                for(int j=0;j<n;j++){
                    sum+=damage[i]*s;
                }
                if(sum>maxp){
                    maxp=sum;
                    index=i;
                }
                
            }
            total+=(long)maxp;
            health[index]=0;
            damage[index]=0;
        }
        return total;
    }
}

public class minimumDamageDealt {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] health={4,5,6,8};
        int [] damage={1,2,3,4};
        int power=4;
        System.out.println(sol.minDamage(power, damage, health));
    }
}
