package Tathastu_Internship;

public class program_6
{
   // Java to print Diamond Pattern.
    static void printDiamond(int n)
    {
        int space = n - 1;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }

        space = 0;

        // run loop (parent loop) till number of rows
        for (int i = n; i > 0; i--)
        {
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space++;
        }
    }

    public static void main(String[] args)
    {
        printDiamond(5);

    }
}