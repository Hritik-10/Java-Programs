package Tathastu_Internship;
import java.util.*;

//java program to calculate the permutation and combination of two numbers
public class program_5
{
    final static Scanner sc=new Scanner(System.in);
        static int fact(int number) {
                int f = 1;
                int j = 1;
                while (j <= number) {
                    f = f * j;
                    j++;
                }
                return f;
            }

            public static void main(String args[])
            {
                List<Integer> numbers = new ArrayList<Integer>();

                numbers.add(12);
                numbers.add(13);


                int n = numbers.size();
                System.out.println("n="+ n);
                System.out.print("Enter the value of r:");
                int r = sc.nextInt();
                int result;

                System.out.print("Given array is: ");
                for(int i=0;i<numbers.size();i++)
                {
                    System.out.print(numbers.get(i)+" ");
                }
                System.out.println();

                //permutation
                result = fact(n) / fact(n-r);
                System.out.println("The permutation value for "+n+"P"+r+" is: " + result);

                //combination
                result = fact(n) / (fact(r) * fact(n-r));
                System.out.println("The combination value for "+n+"C"+r+" is: " + result);
            }
}
