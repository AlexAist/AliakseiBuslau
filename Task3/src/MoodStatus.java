import java.util.Random;

public class MoodStatus {

    private static int random(){
        int a;
        final Random random = new Random();
        return random.nextInt(2);
    }

    public static void face(){
        int ranRes = random();
        if (ranRes == 0){
            IOData.printMes(Character.toString ((char)1));
        }
        else{
            IOData.printMes(Character.toString((char)2));
        }
    }
}
