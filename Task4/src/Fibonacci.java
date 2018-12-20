public class Fibonacci {

    public static long calc(long n){
        long a = 0;
        long b = 1;
        if(n > 1) {
            for (int i = 2; i <= n; ++i) {
                long next = a + b;
                a = b;
                b = next;
            }
        }else if(n == 0) {
            b = 0;
        }
        return b;
    }
}
