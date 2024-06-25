
public class IterativeFibonacci {
    public static int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 0;
        for (int i = 2; i <= n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 6;
        int result = iterativeFibonacci(n);
        System.out.println("Iterative Fibonacci of " + n + " is " + result);
    }
}
