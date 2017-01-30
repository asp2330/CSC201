/**
 * Created by Clue on 1/29/2017.
 */
import java.util.Scanner;
public class SmallestIndex
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int cap = 10;
        double [] array = new double[cap];

        System.out.println("Enter " + cap + " integers");

        for (int i = 0; i < cap; i++) array[i] = input.nextDouble();

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
