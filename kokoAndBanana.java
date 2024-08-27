
class Solution {
    //here what i am thinking is that if there was no time bound 
    //then how fast and how slow can koko eat banana 
    //if the koko has to finish as soon as possible then he has to eat the each pile per hour as he can eat 
    //only one pile per hour at max 
    //so the pile which has the max banana has to be eaten at once 
    //that means k=m (max no. of bananas in a pile )
    //now how slow can he eat the banana 
    //he can eat 1 banana per hour 
    // so k=1
    //so if there are 70 bananas than has 70 hour to eat then koko will eat 1 banana per hour 
    // but if he has only 50 hours to eat he has to eat faster i.e k must be greater than earlier 
    //so any value between 1 and m(where m is max no of banana in a pile ) is our answer 
    // what is the actual ans 
    // actual ans is that for which no. of meal is equal to given hour 
    //like if there is 13 bananas in a pile and k =4 then no of meal to eat 13 is 4 which is the ceiling value of 13/4
    // so if the total no. of meal == hour we got our ans 
    // for every k between 1 and m we will find no .of meal 
    //k=1
    // while(k<m){
    //    meal=0;
    //    for every pile 
    //      meal+=no.of banana in that pile/k  (take its ceiling value)

    //if meal==hour it is our ans  
    // else k++;
    //here we searching linearly for k but so can easily identify the part in which we should search for k 
    //so we can eliminate the half of tha array in each search 
    // so we can think something as binary search  
    // so then we will implement binary search 
    //which side to eliminate ??
    // but if meal is less than koko is eating faster so reduce the eating speed so search for smaller value of k by searching toward left 
    //else search greater value of k by searching toward right 
    //}
    
    //lets implement it 
    public int findK(int [] piles ,int s,int e,int h){
        if(s>=e)
        return s;
        int k=s+(e-s)/2;
        
        int total=0;
        for(int i=0;i<piles.length;i++){
            total+=(piles[i]+k-1)/k;
        }
        System.out.println("k:"+k);
        System.out.println("total:"+total);
        if(total>h)//eating speed is slower so increase the speed by increasing the value k 
        return findK(piles,k+1,e,h);
        return findK(piles,s,k,h);
    }
}

public class kokoAndBanana {
    public static void main(String[] args) {
        int [] piles={3,6,7,11};
        int h=8;
        Solution sol= new Solution();
        sol.findK(piles, 1, 11, h);
    }
}
