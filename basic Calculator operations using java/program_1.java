package Tathastu_Internship;

import java.util.Scanner;

//Java program to perform basic Calculator operations.
public class program_1
{
    public static int addition(int a,int b)
    {
        int c=a+b;
        return c;
    }

    public static int subtraction(int a,int b)
    {
        int c=a-b;
        return c;
    }
    public static int multiplication(int a,int b)
    {
        int c=a*b;
        return c;
    }
    public static int division(int a,int b)
    {
        int c=a/b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Basic calculator operations");
        while (true) {
            System.out.println("\nWhat you would like to do?");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the first number:");
                    num1=sc.nextInt();
                    System.out.print("Enter the second number:");
                    num2=sc.nextInt();
                    System.out.println("Addition of two numbers is:"+addition(num1,num2));
                    break;

                case 2:
                    System.out.print("Enter the first number:");
                    num1=sc.nextInt();
                    System.out.print("Enter the second number:");
                    num2=sc.nextInt();
                    System.out.println("Subtraction of two numbers is:"+subtraction(num1,num2));
                    break;

                case 3:
                    System.out.print("Enter the first number:");
                    num1=sc.nextInt();
                    System.out.print("Enter the second number:");
                    num2=sc.nextInt();
                    System.out.println("multiplication of two numbers is:"+multiplication(num1,num2));
                    break;

                case 4:
                    System.out.print("Enter the divident:");
                    num1=sc.nextInt();
                    System.out.print("Enter the divisor:");
                    num2=sc.nextInt();
                    if(num2==0)
                    {
                        System.out.println("Divisor cannot be zero");
                        break;
                    }
                    System.out.println("Dvision is:"+division(num1,num2));
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");

            }
        }
    }
}
