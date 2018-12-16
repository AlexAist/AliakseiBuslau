public class Dragon {

    private static void mesForInput (){
        IOData.printMes("Enter age: ");
    }

    public static int inputAge () {
        mesForInput();
       return IOData.addIntValue();
    }

    private static int before200(int age){
        return age * 3 + 3;
    }

    private static int before300(int age){
        int before200 = before200(199);
        int after200 = (age - 199) * 2;
        return before200 + after200;
    }

    private static int after300(int age){
        int before300 = before300(299);
        return before300 + (age - 299);
    }

    private static void printNumOfHeads(int value){
        IOData.printMes("Number of heads = " + value);
    }

    public static void heads(int age){
        int firstStage = 200;
        int secStage = 300;
        if(age < firstStage){
            printNumOfHeads(before200(age));
        }
        else if(age > firstStage && age < secStage){
            printNumOfHeads(before300(age));
        }
        else if (age > secStage){
            printNumOfHeads(after300(age));
        }
    }
}
