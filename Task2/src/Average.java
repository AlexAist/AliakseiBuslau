public class Average {

    private double number;
    private int number1;

    public Average() {
    }

    public void enterNumberAndCalc(){
        InputOutputData inputOutputData = new InputOutputData();
        do {
            inputOutputData.stringOutput("Введите шестизначное число: ");
            number = inputOutputData.addDoubleValue();
        }while (number < 100000 || number > 999999);
        calcAverageNoArrays();
    }

    private void calcAverageNoArrays(){
        double first = number % 10;
        number = number / 10;
        double second = number % 10;
        number = number / 10;
        double third = number % 10;
        number /= 10;
        double fourth = number % 10;
        number /= 10;
        double fives = number % 10;
        number /= 10;
        double six = number % 10;
        double arAv = first + second + third + fourth + fives + six;
        double arRes = arAv/6;
        InputOutputData inputOutputData = new InputOutputData();
        inputOutputData.stringOutput("Среднее арифметическое = " + arRes);
        double geomAv = first * second * third * fourth * fives * six;
        double geomRes = root(geomAv, 6);
        inputOutputData.stringOutput("Среднее геометрическое = " + geomRes);
    }

    private void calcAverage(){
        int[] num = WorkWithTypes.intToArray(number1);
        int sum = 0;
        int count = 0;
        double composition = num[0];
        for(int i = 0; i < num.length; i++){
            sum += num[i];
            count++;
            if(i > 0){
                composition *= num[i];
            }
        }
        double arithmAverage = sum/count;
        double geomAverage = root( composition, (double) count);
        InputOutputData inputOutputData = new InputOutputData();
        inputOutputData.stringOutput("Среднее арифметическое = " + arithmAverage);
        inputOutputData.stringOutput("Среднее геометрическое = " + geomAverage);
    }

    public double root( double n, double i ) {
        return Math.pow( n, 1.0 / i );
    }
}
