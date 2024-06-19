public class adpt_2_solidRhombus {
    public static void main(String[] args)
    {
        int n = 5;
        for(int i = 1; i <= 5; i++)
        {
            int spaces = n-i;
            for(int j = 1; j <= spaces; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <=5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
