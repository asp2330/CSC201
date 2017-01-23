/**
 * Created by Clue on 1/22/2017.
 */

import java.util.Scanner;

public class AverageTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double loopCounter = 0;
        int positiveCounter = 0;
        int negativeCounter = 0;
        double average = 0;
        double total = 0;

        System.out.print("Enter and interger, the input ends if it is 0: ");
        double number = input.nextDouble();

        while (number != 0) {
            if (number > 0) {
                loopCounter++;
                positiveCounter++;
                total += number;

                System.out.print("Enter and interger, the input ends if it is 0: ");
                number = input.nextDouble();
            } else if (number < 0) {
                loopCounter++;
                negativeCounter++;
                total += number;

                System.out.print("Enter and interger, the input ends if it is 0: ");
                number = input.nextDouble();
            }
        }

        if (loopCounter != 0) {
            average = total / loopCounter;

            System.out.printf("%n%s%d%n%s%d%n%s%.2f%n%s%.2f", "The number of positives is ", positiveCounter,
                    "The number of negatives is ", negativeCounter,
                    "The total is ", total,
                    "The average is ", average);

        } else
            System.out.print("No numbers are entered except 0");
    }
}
