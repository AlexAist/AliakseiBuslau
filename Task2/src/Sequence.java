public class Sequence {

    private int number;

    public Sequence() {

    }

    public void enterNumber(){
        InputOutputData inputOutputData = new InputOutputData();
        do {
            inputOutputData.stringOutput("Введите число для вычисления последовательности: ");
            number = inputOutputData.addIntValue();
        }while (number < 1000 || number > 9999);
        strToArrayAndComp();
    }


    private void strToArrayAndComp(){
        InputOutputData inputOutputData = new InputOutputData();
        int countInc = 0;
        int countDecr = 0;
        int[] num = WorkWithTypes.intToString(number);
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
