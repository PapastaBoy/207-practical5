import java.util.Scanner;

public class Main {
    static final double phi = (1 + Math.sqrt(5)) / 2;

    public static long fib_funni(int input) {
        return Math.round((Math.pow(phi, input) - Math.pow((1 - phi), input))/Math.sqrt(5));
    }

    public static int fib_iter(int input) {
        int[] fib = {1, 1};
        for (int i = 1; i < input; i++) {
            int temp = fib[1];
            fib[1] = fib[0];
            fib[0] += temp;
        }
        return fib[1];
    }

    public static int fib_rec(int input) {
        if (input < 2) return input;
        return (fib_rec(input - 1) + fib_rec(input - 2));
    }

    public static void main(String[] args) {
        System.out.print("Enter input here:  ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Fib Funni = " + fib_funni(input));
        System.out.println("Fib Iterative = " + fib_iter(input));
        System.out.println("Fib Recursive = " + fib_rec(input));
    }
}