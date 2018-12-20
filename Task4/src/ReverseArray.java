public class ReverseArray {

    public static int[] reverse(int[] array, boolean check){
        if(check) {
            for (int i = 0; i < array.length / 2; i++) {
                int tmp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = tmp;
            }
        }
        return array;
    }

    public static boolean checkSize(int size){
        return size > 0;
    }
}
