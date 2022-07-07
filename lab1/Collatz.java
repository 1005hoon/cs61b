/**
 * Class that prints the Collatz sequence starting from a given number.
 *
 * @author Seunghoon Oh
 */
public class Collatz {

    /**
     * takes the number n and return the next number according to Collatz Sequence
     * if n is even, returns n/2
     * if n is odd, returns 3*n + 1
     */
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }

        return 3 * n + 1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

