import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IOData.print("Input factorial");
        int fact = IOData.inputInt();
        int resFact = Fact.calculateFactorial(fact);
        IOData.print(" Factorial of " + fact + " = " + resFact);

        IOData.print("Input for fibonacci");
        long fib = IOData.inputLong();
        long resFib = Fibonacci.calc(fib);
        IOData.print("Last fibonacci number = " + resFib);

        IOData.print("Input array size");
        int size = IOData.inputInt();
        IOData.print("Input array");
        int [] ar = IOData.inputIntArray(size);
        boolean b = ReverseArray.checkSize(size);
        ar = ReverseArray.reverse(ar, b);
        IOData.print(Arrays.toString(ar));
    }
}
