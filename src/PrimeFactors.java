import java.util.Scanner;

/**
 * Created by Clue on 2/27/2017.
 */
public class PrimeFactors {
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers(20);

        int factor = 2;

        while (factor <= num) {
            if (num % factor == 0) {
                stack.push(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }



}
