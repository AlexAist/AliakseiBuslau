public class ChangeValues {

    private double num1;
    private double num2;

    public ChangeValues() {
    }

    public void enterValues(){
        InputOutputData inputOutputData = new InputOutputData();
            inputOutputData.stringOutput("Введите первое число: ");
            num1 = inputOutputData.addDoubleValue();
            inputOutputData.stringOutput("Введите второе число");
            num2 = inputOutputData.addDoubleValue();
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
