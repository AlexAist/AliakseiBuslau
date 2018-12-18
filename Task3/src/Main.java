public class Main {
    public static void main(String[] args) {
        int headsDragon = Dragon.heads(Dragon.inputAge());
        int eyesDragon = Dragon.calcEyes(headsDragon);
        Dragon.printNumOfHeads(headsDragon, eyesDragon);
        Triangle.AddCoordAndCalc();
        MoodStatus.face();
        Date.inputValue();
        Letters.enterAndComp();
    }
}
