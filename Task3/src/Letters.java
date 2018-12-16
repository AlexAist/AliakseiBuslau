import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Letters {

    private static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    private static boolean isVowel(char letter)
    {
        letter = Character.toLowerCase(letter);
        for (char a : vowels)
        {
            if (letter == a)
                return true;
        }
        return false;
    }

    private static boolean isVow(char letter){
        String[] vowelstr = {"а","я","у","ю","и", "ы", "э", "е", "о", "ё"};
        List<String> listOfLetters= Arrays.asList(vowelstr);
        String letStr = String.valueOf(letter);
        return listOfLetters.contains(letStr);
    }

    private static void outputMes(char letter){
        if(isVow(letter)){
            IOData.printMes("Vowel");
        }
        else{
            IOData.printMes("consonant");
        }
    }
    public static void enterAndComp(){
        IOData.printMes("Enter symbol: ");
        char letter = IOData.addCharValue();
        withIf(letter);
        forSwitch(letter);
        regular(letter);
        isVowel(letter);
        outputMes(letter);
    }

    private static boolean regular(char letter){
        String str = String.valueOf(Character.toLowerCase(letter));
        return str.matches("^(?i:[аоиэуюяеыё]).*");
    }

    private static boolean forIf(char let){
        char letter = Character.toLowerCase(let);
        if(letter == 'a' || letter == 'о' || letter == 'и' || letter == 'э' || letter == 'у' || letter == 'ю'
                || letter == 'я' || letter == 'е' || letter == 'ы' || letter == 'ё'){
            return true;
        }
        else {
            return false;
        }
    }

    private static void withIf(char let){
        char letter = Character.toLowerCase(let);
        IOData.printMes("IF");
        if(forIf(letter)){
            IOData.printMes("Vowel");
        }
        else {
            IOData.printMes("consonant");
        }
    }

    private static boolean withSwitch(char letter){
        IOData.printMes("SWITCH");
        char temp = Character.toLowerCase(letter);
        switch (temp){
            case 'а':
            case 'о':
            case 'э':
            case 'и':
            case 'у':
            case 'ю':
            case 'я':
            case 'е':
            case 'ы':
            case 'ё': return true;
            default: return false;
        }
    }

    private static void forSwitch(char letter){
        if(withSwitch(letter)){
            IOData.printMes("Vowel");
        }
        else{
            IOData.printMes("Consonant");
        }
    }
}