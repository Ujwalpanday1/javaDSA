import java.util.Scanner;

public class MinimumNoOfDoors {
    public static int closeDoor(int l,int r,int L,int R){
        if(r<L)
        return 1;//like if they are at 1-10 and 11-20 then they can be easily separated by closing only one door there is no over lapping
        //if there is overlapping ,find the point were they overlap 
        int start=Math.max(l,L);
        int end=Math.min(r,R);
        
        if((L==l)&&(R==r))
        return end-start;
        if(L==l||r==R)
        return end-start+1;
        return end-start+2;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            //take each test cases 
            int l=sc.nextInt();
            int r=sc.nextInt();
            int L=sc.nextInt();
            int R=sc.nextInt();
            int result=closeDoor(l,r,L,R);
            System.out.println(result);
        }
    }
}
