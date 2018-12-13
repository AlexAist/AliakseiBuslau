public class ReverseNumber {

    private int number;

    public ReverseNumber() {
    }

    public void EnterNumberAndReverse(){
        InputOutputData inputOutputData = new InputOutputData();
        do{
            inputOutputData.stringOutput("Введите семизначное число: ");
            number = inputOutputData.addIntValue();
        }while (number < 1000000 || number > 9999999);
        reverseNumNoString();
    }

    private void reverseNumNoString(){
        int first = number % 10;
        first *= 1000000;
        number /= 10;
        int sec = number % 10;
        sec *=100000;
        number /= 10;
        int third = number % 10;
        third *= 10000;
        number /= 10;
        int fourth = number % 10;
        fourth *= 1000;
        number /= 10;
        int fives = number % 10;
        fives *= 100;
        number /= 10;
        int six = number % 10;
        six *= 10;
        number /= 10;
        int seventh = number % 10;
        int res = seventh + six + fives + fourth + third + sec + first;
        InputOutputData inputOutputData = new InputOutputData();
        inputOutputData.stringOutput("Реверс: " + res);

    }
    private void reverseNum(){
        String intToStr = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(intToStr);
        InputOutputData inputOutputData = new InputOutputData();
        inputOutputData.stringOutput("Реверс: " + stringBuilder.reverse());
    }
}
