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
        int n1;
        int n2;
        try (Scanner sc = new Scanner(System.in)) {
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        }
        
        int GCD = getGCD(n1, n2);

        int lcm = (n1 * n2)/GCD;

        System.out.println("LCM "+lcm + "\nGCD "+GCD);
    }
}