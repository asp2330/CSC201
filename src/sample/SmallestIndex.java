package sample;
import java.util.Scanner;

public class SmallestIndex
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        final int CAP = 10;
        double [] array = new double[CAP];

        System.out.println("Enter " + CAP + " integers");

        for (int i = 0; i < CAP; i++) array[i] = input.nextDouble();

        System.out.println("The index of the smallest number is: " + SmallestMethod.indexOfSmallestElement(array));
    }
}