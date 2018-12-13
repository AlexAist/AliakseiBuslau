public class CheckNumbers {

    private double number1;
    private double number2;
    private double number3;

    public CheckNumbers() {

    }

    public void enterAndComp(){
        InputOutputData inputOutputData = new InputOutputData();
        inputOutputData.stringOutput("Введите первое число: ");
        number1 = inputOutputData.addDoubleValue();
        inputOutputData.stringOutput("Введите второе число: ");
        number2 = inputOutputData.addDoubleValue();
        inputOutputData.stringOutput("Введите третье число: ");
        number3 = inputOutputData.addDoubleValue();
        comp();
    }

    public void comp(){
        InputOutputData inputOutputData = new InputOutputData();
        if(number1 == number2 && number2 == number3){
            inputOutputData.stringOutput("Числа одинаковы");
        }
        else {
            inputOutputData.stringOutput("Числа различны");
        }
    }
}
