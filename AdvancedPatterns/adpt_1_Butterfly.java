public class adpt_1_Butterfly {
    public static void main(String[] args)
    {
        int n = 4;
        //upper half
        for(int i = 0; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            int spaces = 2 * (n-i);

            for(int j = 1; j <= spaces; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //lower half
        for(int i = n; i >=1; i--)
        {
            for(int j = i; j >= 1; j--)
            {
                System.out.print("*");
            }

            int spaces = 2 * (n-i);
            for(int j = spaces; j >=1; j--)
            {
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
