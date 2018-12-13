import java.util.Scanner;

public class InputOutputData {

    public InputOutputData() {
    }

    public void stringOutput(String msg){
        System.out.println(msg);
    }

    public double addDoubleValue(){
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

    public int addIntValue (){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
