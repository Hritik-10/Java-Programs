package Tathastu_Internship;

import java.util.Scanner;

//java program to find out given string is palindrome or not
public class program_4
{
    public static boolean is_palindrome(String str)
    {
        String st="";
        for(int i=0;i<str.length();i++)
        {
            st=str.charAt(i)+st;
        }

        if(st.equalsIgnoreCase(str))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.next();
        boolean ans=is_palindrome(str);
        if(ans==true)
            System.out.println("string is palindrome");
        else
            System.out.println("string is not palindrome");
    }
}
