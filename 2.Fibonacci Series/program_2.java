package Tathastu_Internship;

import java.util.Scanner;

//java program to calculate Fibonacci Series up to n numbers.
public class program_2
{
    public static void fibonacci(int num)
    {
       int n1=0,n2=1,i,n3,count=num;
        System.out.print(n1+" "+n2);  //for printing 0 and 1
        for(i=2;i<count;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args)
    {
        //java program to calculate fibonacii series upto n numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Fibonacci Series till given number is:");
        fibonacci(num);
    }
}
