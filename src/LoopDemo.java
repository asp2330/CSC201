/**
 * Created by tkanchanawanchai6403 on 1/23/2017.
 */
public class LoopDemo {
    public static void main(String [] args) {
        final int SIZE = 200;
        int i=1;
        do {
            if(isPrime(i)) {
                System.out.print(i + ", ");
            }
            i++;
        } while(i<=SIZE);
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,

    }

    public static boolean isPrime(int number) {
        boolean prime = false;
        int i=1;
        int count=0;
        do {
            if(number%i == 0) { //if it is not divided by it self and get 0
                if(number==1) {
                    prime= false;
                } else if(i==number && count==1){
                    prime = true;
                } else {
                    prime = false;
                    count++;
                }
            }
            i++;
        } while (i<=number);
        return prime;
    }
}
