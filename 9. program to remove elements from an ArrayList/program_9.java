package Tathastu_Internship;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Java program to remove elements from an ArrayList
public class program_9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        List<Integer> alist = new ArrayList<>();

        alist.add(10);
        alist.add(20);
        alist.add(30);
        alist.add(1);
        alist.add(2);

        System.out.println(alist);

        System.out.print("Enter the index of removing element:");
        int ind=sc.nextInt();
        alist.remove(ind);
        System.out.println("Elements in list after removing given element: "+alist);
    }
}


