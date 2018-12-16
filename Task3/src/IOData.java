import java.util.Scanner;

public class IOData {

    public static int addIntValue (){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static double addDoubleValue(){
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

    public static void printMes(String msg){
        System.out.println(msg);
    }

    public static char addCharValue(){
        Scanner in = new Scanner(System.in);
        return in.next(".").charAt(0);
    }
}
