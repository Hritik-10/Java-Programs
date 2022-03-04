package Tathastu_Internship;

public class program_8
{
    //program to check whether the given array is mirror inverse or not
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            // If condition fails for any element
            if (arr[arr[i]] != i)
                return false;
        }

            // Given array is mirror-inverse
            return true;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 4, 3 };
        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

