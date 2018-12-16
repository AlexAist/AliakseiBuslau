import java.util.Scanner;

public class IOData {

    public static int addIntValue (){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void printMes(String msg){
        System.out.println(msg);
    }
}
