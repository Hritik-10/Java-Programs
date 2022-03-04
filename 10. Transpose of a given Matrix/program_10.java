package Tathastu_Internship;

//Java Program to find the Transpose of a given Matrix.
public class program_10
{
    public static void main(String args[])
    {
        int original[][]={{1,7,4},{3,4,5},{4,5,5}};
        int transpose[][]=new int[3][3];  //3 rows and 3 columns
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                transpose[i][j]=original[j][i];
            }
        }

        System.out.println("Printing Matrix without transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();//new line
        }
        System.out.println("Printing Matrix After Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();//new line
        }
    }
}
