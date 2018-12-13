public class Ring {

    private int R1;
    private int R2;
    private double PI = 3.14159265;

    public Ring() {
    }

    public void enterNumbers(){
        InputOutputData inputOutputData = new InputOutputData();
        do {
            inputOutputData.stringOutput("Введите малый радиус:");
            R1 = inputOutputData.addIntValue();
            inputOutputData.stringOutput("Введите больший радиус");
            R2 = inputOutputData.addIntValue();
            if(R1 >= R2){
                inputOutputData.stringOutput("Повторите ввод");
            }
        }while (R1 >= R2);
        square();
    }

    public void square(){
        double firstSq = PI*R1*R1;
        double secondSq = PI*R2*R2;
        double resultsq = secondSq - firstSq;
        InputOutputData inputOutputData = new InputOutputData();
        inputOutputData.stringOutput("Площадь кольца = " + resultsq);
    }
}
