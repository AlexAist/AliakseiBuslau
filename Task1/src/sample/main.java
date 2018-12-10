package sample;

public class main {
    public static void main(String[] args) {
        functions.testInt();
        functions.testFloat();
        functions.testDouble();
        functions.testLong();
        functions.testChar();
        functions.testShort();
        functions.testByte();
        functions.testBoolean();
        functions.testString();
        Student st = new Student("Petr", 5);
        functions.testStringStudent(st.toString());
    }
}
