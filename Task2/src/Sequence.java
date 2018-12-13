public class Sequence {

    private double number;
    private int number1;

    public Sequence() {

    }

    public void enterNumber(){
        InputOutputData inputOutputData = new InputOutputData();
        do {
            inputOutputData.stringOutput("Введите четырехзначное число: ");
            number = inputOutputData.addIntValue();
        }while (number < 1000 || number > 9999);
        comp();
    }

    private void comp(){
        double first = number % 10;
        number = number/10;
        double sec = number % 10;
        number = number/10;
        double third = number % 10;
        number = number/10;
        double fourth = number %10;
        InputOutputData inputOutputData = new InputOutputData();
        if(first > sec && sec > third && third > fourth){
            inputOutputData.stringOutput("Возрастающая последовательность");
        }
        else if(first < sec && sec < third && third < fourth){
            inputOutputData.stringOutput("Убывающая последовательность");
        }
        else{
            inputOutputData.stringOutput("Просто цифры");
        }
    }

    private void strToArrayAndComp(){
        InputOutputData inputOutputData = new InputOutputData();
        int countInc = 0;
        int countDecr = 0;
        int[] num = WorkWithTypes.intToArray(number1);
        for(int i = 0; i < num.length - 1; i++){
            if(num[i] > num[i + 1]){
                inputOutputData.stringOutputWithoutLn(num[i] + " > " + num[i + 1] + "  ");
                countInc++;
            }
            else{
                inputOutputData.stringOutputWithoutLn(num[i] + " < " + num[i + 1] + "  ");
                countDecr++;
            }
        }
        if(countInc == num.length - 1){
            inputOutputData.stringOutput("Убывающая последовательность");
        }
        else if(countDecr == num.length - 1){
            inputOutputData.stringOutput("Возрастающая последовательность");
        }
        else {
            inputOutputData.stringOutput("Просто цифры!");
        }
    }


}
