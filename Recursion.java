public class Recursion {
    public static void main(String[] args) {
        head(5);
        System.out.println();
        tail(5);
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

    public static void head(int n) {
        if (n == 0)
            System.out.println(n);
        else {
            head(n-1);
            System.out.println(n);
        }
    }
    /**
     * 
     * @param n
     */
    public static void tail(int n) {
        if (n == 0)
            System.out.println(n);
        else {            
            System.out.println(n);
            tail(n-1);
        }
    }

}
