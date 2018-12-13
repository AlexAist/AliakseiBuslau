import java.util.Scanner;
import java.util.SplittableRandom;

public class Dinosaur {

    private double weight;

    public Dinosaur() {

    }

    public void addWeight(){
        InputOutputData inputOutputData = new InputOutputData();
        inputOutputData.stringOutput("Введите массу динозавра в килограммах");
        weight = inputOutputData.addDoubleValue();
        calculate();
    }

    private void calculate(){
        InputOutputData inputOutputData = new InputOutputData();
        double millis = weight*1000000;
        inputOutputData.stringOutput("В миллиграммах: " + millis);
        double grams = weight*1000;
        inputOutputData.stringOutput("В граммах: " + grams);
        double tons = weight/1000;
        inputOutputData.stringOutput("Тонн: " + tons);
    }
}
