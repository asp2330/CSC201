package sample;
public class SmallestMethod
{
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
