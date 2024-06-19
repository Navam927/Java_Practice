public class adpt_5_diamond {
    public static void main(String[] args)
    {
        int n = 5;
        //first half
        for(int i = 1; i <= n; i++)
        {
            int spaces = n-i;
            
            for(int j = 1; j <= spaces; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2*i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Second half
        for(int i = n; i >= 1; i--)
        {
            int spaces = n-i;
            
            for(int j = 1; j <= spaces; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2*(i-1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
