public class Recursion {
    public static void main(String[] args) {
        //System.out.println(factorial(7));
        System.out.println(fib(8));
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1; // 0! = 1
        else
            return n * factorial(n - 1); // n! = n*(n-1)!
    }

    public static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
}
