import java.util.Scanner;

public class IOData {

    public static int inputInt(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static long inputLong(){
        Scanner in = new Scanner(System.in);
        return in.nextLong();
    }

    public static void print(String msg){
        System.out.println(msg);
    }

    public static int[] inputIntArray(int l){
        int[] tmp = new int[l];
        for (int i = 0; i < l; i++) {
            tmp[i] = inputInt();
        }
        return tmp;
    }
}
