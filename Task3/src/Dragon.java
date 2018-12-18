import java.io.FileReader;

public class Dragon {

    public static int INITIAL_HEADS = 3;
    public static int FIRST_PERIOD_HEADS = 3;
    public static int SECOND_PERIOD_HEADS = 2;
    public static int FIRST_PERIOD = 200;
    public static int SECOND_PERIOD = 300;
    public static int BETWEEN_PERIODS = 100;
    public static int EYES = 2;

    private static void mesForInput() {
        IOData.printMes("Enter age: ");
    }

    public static int inputAge() {
        mesForInput();
        return IOData.addIntValue();
    }

    public static void printNumOfHeads(int heads, int eyes) {
        IOData.printMes("Number of heads = " + heads);
        IOData.printMes("Number of eyes = " + eyes);
    }

    public static int calcEyes(int heads){
        return heads * EYES;
    }

    public static int heads(int age) {
        int res = 0;
        if (age > 0) {
            if (age < FIRST_PERIOD) {
                res += INITIAL_HEADS + age * FIRST_PERIOD_HEADS;
            } else if (age < SECOND_PERIOD) {
                res += INITIAL_HEADS + FIRST_PERIOD * FIRST_PERIOD_HEADS;
                res += (age - FIRST_PERIOD) * SECOND_PERIOD_HEADS;
            } else {
                res += INITIAL_HEADS + FIRST_PERIOD * FIRST_PERIOD_HEADS;
                res += BETWEEN_PERIODS * SECOND_PERIOD_HEADS;
                res += age - SECOND_PERIOD;
            }
        }
        return res;
    }
}
