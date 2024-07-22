import java.util.*;/**
 * Lcm_gcd
 */
public class Lcm_gcd {
    public static int getGCD(int n1, int n2) {
        while(n1 % n2 != 0)  {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        
        int GCD = getGCD(n1, n2);

        int lcm = (n1 * n2)/GCD;

        System.out.println("LCM "+lcm + "\nGCD "+GCD);
    }
}