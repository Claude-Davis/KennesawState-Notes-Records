//package Fibonacci;

public class FibIteration implements FindFib{

    @Override
    public int calculateFib(int n) {
        if (n < 1) {
            return n;
        }

        int x = 0;
        int y = 1;
        int fib = 0;

        for (int i=2; i<=n; i++){
            fib = x+y;
            x = y;
            y = fib;
        }

        return fib;
    }
}
