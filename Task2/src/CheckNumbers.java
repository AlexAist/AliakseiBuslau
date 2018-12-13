public class CheckNumbers {

    private int number1;
    private int number2;
    private int number3;

    public CheckNumbers() {

    }

    public void enterAndComp(){
        InputOutputData inputOutputData = new InputOutputData();
        inputOutputData.stringOutput("Введите первое число: ");
        number1 = inputOutputData.addIntValue();
        inputOutputData.stringOutput("Введите второе число: ");
        number2 = inputOutputData.addIntValue();
        inputOutputData.stringOutput("Введите третье число: ");
        number3 = inputOutputData.addIntValue();
        if(number1 == number2 && number2 == number3){
            inputOutputData.stringOutput("Числа одинаковы");
        }
        else {
            inputOutputData.stringOutput("Числа различны");
        }
    }
}
