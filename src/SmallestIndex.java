

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

        System.out.println("The index of the smallest number is: " + indexOfSmallestElement(array));
    }
    public static int indexOfSmallestElement(double[] array)
    {
        int index = 0;
        double smallest = array[index];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < smallest)
            {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
}
