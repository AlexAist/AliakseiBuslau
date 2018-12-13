public class Average {

    private  int number;

    public Average() {
    }

    public void enterNumberAndCalc(){
        InputOutputData inputOutputData = new InputOutputData();
        do {
            inputOutputData.stringOutput("Введите шестизначное число: ");
            number = inputOutputData.addIntValue();
        }while (number < 100000 || number > 999999);
        calcAverage();
    }

    private void calcAverage(){
        int[] num = WorkWithTypes.intToString(number);
        int sum = 0;
        int count = 0;
        int composition = num[0];
        for(int i = 0; i < num.length; i++){
            sum += num[i];
            count++;
            if(i > 0){
                composition *= num[i];
            }
        }
        double arithmAverage = (double) sum/count;
        double geomAverage = root((double) composition, (double) count);
        InputOutputData inputOutputData = new InputOutputData();
        inputOutputData.stringOutput("Среднее арифметическое = " + arithmAverage);
        inputOutputData.stringOutput("Среднее геометрическое = " + geomAverage);
    }

    public double root( double n, double i ) {
        return Math.pow( n, 1.0 / i );
    }
}
