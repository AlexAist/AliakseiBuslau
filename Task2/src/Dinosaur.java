import java.util.Scanner;
import java.util.SplittableRandom;

public class Dinosaur {

    private double weight;

    public Dinosaur() {

    }

    private void stringOutput(String msg){
        System.out.println(msg);
    }

    public void addWeight(){
        Scanner in = new Scanner(System.in);
        stringOutput("Введите массу динозавра в килограммах");
        weight = in.nextDouble();
        calculate();
    }

    private void calculate(){
        double millis = weight*1000000;
        stringOutput("В миллиграммах: " + millis);
        double grams = weight*1000;
        stringOutput("В граммах: " + grams);
        double tons = weight/1000;
        stringOutput("Тонн: " + tons);
    }
}
