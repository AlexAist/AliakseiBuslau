public class ChangeValues {

    private int num1;
    private int num2;

    public ChangeValues() {
    }

    public void enterValues(){
        InputOutputData inputOutputData = new InputOutputData();
            inputOutputData.stringOutput("Введите первое число: ");
            num1 = inputOutputData.addIntValue();
            inputOutputData.stringOutput("Введите второе число");
            num2 = inputOutputData.addIntValue();
            change();
    }

    private void change(){
        num1=num1+num2-(num2=num1);
        InputOutputData inputOutputData = new InputOutputData();
        inputOutputData.stringOutput("Замена:");
        inputOutputData.stringOutput("Первое число = " + num1);
        inputOutputData.stringOutput("Второе число = " + num2);
    }
}
