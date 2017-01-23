/**
 * Created by Clue on 1/22/2017.
 */
public class DisplayN
{
    public static void main(String args[])
    {
        int n = 3;
        displayPattern(n);

    }


    public static void displayPattern(int n)
    {
        int newN = n;

        System.out.println("\t\t\t  1");
        System.out.println("\t\t\t2 1");
        System.out.println("\t\t  3 2 1");
        System.out.println("...");
        System.out.printf("%d %d-1 ... 3 2 1", newN, newN);

    }
}
