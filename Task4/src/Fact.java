import java.util.Scanner;

public class Fact {

    static int calculateFactorial(int n) {
        int result = 1;
        if (check(n)) {

            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        return result;
    }

    static boolean check(int num) {
        return num >= 0;
    }
}
