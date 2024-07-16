import java.util.HashMap;
public class integerToRoman{
    public static void main(String[] args){

        int num=3343;
        HashMap<Integer,String> m= new HashMap<>();
        m.put(1000, "M");
        m.put(900, "CM");
        m.put(500, "D");
        m.put(400, "CD");
        m.put(100, "C");
        m.put(90, "XC");
        m.put(50, "L");
        m.put(40, "XL");
        m.put(10, "X");
        m.put(9, "IX");
        m.put(5, "V");
        m.put(4, "IV");
        m.put(1, "I");
        int[] arr={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int i=0;
        String a="";
        while(num!=0){
           
            if(num>=arr[i]){
                int q=num/arr[i];
                for(int j=0;j<q;j++){
                    a=a+m.get(arr[i]);
                }
                num=num%arr[i];
            }
            else{
                i++;
            }
        }
        System.out.println(a);

    }
}