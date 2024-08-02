import java.util.*;

public class power {

    public static int powerOfTwo(int n) {
        if(n == 0) {
            return 1;
        }
        return powerOfTwo(n-1) * 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        System.out.println(powerOfTwo(n));

    }
}