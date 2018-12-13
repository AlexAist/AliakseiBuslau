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
        reverseNum();
    }

    private void reverseNum(){
        String intToStr = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(intToStr);
        InputOutputData inputOutputData = new InputOutputData();
        inputOutputData.stringOutput("Реверс: " + stringBuilder.reverse());
    }
}
