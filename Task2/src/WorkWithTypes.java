public class WorkWithTypes {

    public static int[] intToString(int number){
        String strWithInt = String.valueOf(number);
        int[] num = new int[strWithInt.length()];
        for (int i = 0; i < strWithInt.length(); i++){
            num[i] = strWithInt.charAt(i) - '0';
        }
        return num;
    }
}
