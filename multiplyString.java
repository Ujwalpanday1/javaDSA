class Solution {

   
    public String mul(String num1, char n, int zerosToAdd) {
        // Converting  char to int
        int num = n - '0';
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        // Multiplying each digit of num1 by num and handle carry
        for (int i = num1.length() - 1; i >= 0; i--) {
            int curr = num1.charAt(i) - '0';
            int product = curr * num + carry;
            carry = product / 10;
            sb.append(product % 10);
        }

        if (carry > 0) {
            sb.append(carry);
        }

       
        sb.reverse();

       
        for (int i = 0; i < zerosToAdd; i++) {
            sb.append('0');
        }

        return sb.toString();
    }

   
    public String add(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;

       
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            carry = sum / 10;
            sb.append(sum % 10);
        }

        return sb.reverse().toString();
    }

    public String multiply(String num1, String num2) {
       if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        String result = "0"; 
       
        for (int i = num2.length() - 1; i >= 0; i--) {
           
            String mulResult = mul(num1, num2.charAt(i), num2.length() - 1 - i);
            
           
            result = add(result, mulResult);
        }

        return result;
    }
}

public class multiplyString {
    public static void main(String[] args) {
        
    }
}
