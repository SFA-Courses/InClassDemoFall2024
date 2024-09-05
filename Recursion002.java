public class Recursion002 {
   

    public static int factorial(int n) {
        if (n==0)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static int sum(int n) {
        if (n==1)
            return 1;
        else
            return n + sum(n-1);
    }
    /**
     * 
     * @param n - positive integer
     * @return - nth fibonacci number
     */
    public static int fib(int n) {
        if (n == 1 || n == 2) // first or second Fibonacci number
            return 1;         // is 1
         
        return fib(n-1) + fib(n-2);  // add previous 2 Fibonacci numbers
    }

    public static void head(int n) {
        if (n==0)
            System.out.println(n);
        else {
            head(n-1);
            System.out.println(n);
        }
    }

    public static void tail(int n) {
        if (n==0)
            System.out.println(n);
        else {           
            System.out.println(n);
            tail(n-1);
        }
    }

    public static void main(String[] args) {
        head(5);
        System.out.println();
        tail(5);
    }
}
