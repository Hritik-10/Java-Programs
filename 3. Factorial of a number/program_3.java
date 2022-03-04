package Tathastu_Internship;

import java.util.Scanner;

//Java program to calculate a Factorial of a number.
public class program_3
{
    static int factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return(n*factorial(n-1));
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Factorial of given number is: "+ factorial(num));
    }
}
