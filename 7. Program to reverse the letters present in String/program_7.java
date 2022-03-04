package Tathastu_Internship;
import java.io.*;
import java.util.Scanner;
public class program_7
{
    //Java Program to reverse the letters present in the given String.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str= sc.next() ,nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println(str); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}


