public class kaprekarNumber {

    static int getLength(int n) {
        int c = 0;
        while(n != 0) {
            n /= 10;
            c++;
        }
        return c;
    }
   
    
    static int divideInHalfAndCheck(int n, int k) {
        String s = Integer.toString(n);
        int s_len = s.length();
        String left = s.substring(0,s_len/2);
        String right = s.substring(s_len/2,s_len);
        
        int leftInt = Integer.parseInt(left);
        int rightInt = Integer.parseInt(right);
        
        if(leftInt == 0) {
            return 0;
        } else if(rightInt == 0) {
            return 0;
        }
        
        if(leftInt + rightInt == k) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 45;
        int sq_n = n * n;
        System.out.println(divideInHalfAndCheck(sq_n,n));
    }
}