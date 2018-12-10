package sample;

public class functions {

    public functions() {
    }

    public static void testInt() {
        int a = 5, b = 2, c;
        System.out.println("\n\n INT TEST\n");
        System.out.println("\n***** Arithmetical Operators *****");

        c = a + b;// addition
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = a - b;// subtraction
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = a * b;// multiplication
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = a / b;// division
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = a % b;// modulus
        System.out.printf("%d %% %d = %d\n", a, b, c);
        a = 5;
        c = -a;// unary minus
        System.out.printf("-%d = %d\n", a, c);

        c = +a;// unary plus
        System.out.printf("+%d = %d\n", a, c);

        a = 5;// prefix increment
        System.out.printf("++%d = %d\n", a, ++a);
        a = 5;// postfix increment
        System.out.printf("%d++ = %d\n", a, a++);
        a = 5;// prefix decrement
        System.out.printf("--%d = %d\n", a, --a);
        a = 5;// postfix decrement
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
// logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
// bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
// logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
// logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
    }
    public static void testFloat() {
        System.out.println("\n\nTEST FLOAT");
        float a = 5.3f, b =  2.5f, c = 0.0f;
        System.out.println("\n***** Arithmetical Operators *****");

        c = a + b;// addition
        System.out.println(a + " + " + b + " = " + c);
        c = a - b;// subtraction
        System.out.println(a + " - " + b + " = " + c);
        c = a * b;// multiplication
        System.out.println(a + " * " + b + " = " + c);
        c = a / b;// division
        System.out.println(a + " / " + b + " = " + c);
        c = a % b;// modulus
        System.out.println(a + " %% " + b + " = " + c);
        a = 5;
        c = -a;// unary minus
        System.out.println("-" + a + " = " + c);

        c = +a;// unary plus
        System.out.println("+" + a + " = " + c);

        a = 5;// prefix increment
        System.out.println("++" + a + " = " + ++a);
        a = 5;// postfix increment
        System.out.println(a + "++ = " + a++);
        a = 5;// prefix decrement
        System.out.println("--" + a + " = " + --a);
        a = 5;// postfix decrement
        System.out.println(a + "-- = " + a--);
        System.out.println("\n***** Bitwise Operators *****");

        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
// logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
// bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
// logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
// logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        int f = 12;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c = (float) l;
        System.out.printf("float = long: c = (float)%d --> c = %f\n", l, c);
        c = (float) f;
        System.out.printf("float = int: c = (float)%d --> c = %f\n", f, c);
        c = (float) d;
        System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
        System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);
    }
    public static void testDouble() {
        double a = 5, b = 2, c;
        System.out.println("\n\n DOUBLE TEST\n");
        System.out.println("\n***** Arithmetical Operators *****");

        c = a + b;// addition
        System.out.println(a + " + " + b + " = " + c);
        c = a - b;// subtraction
        System.out.println(a + " - " + b + " = " + c);
        c = a * b;// multiplication
        System.out.println(a + " * " + b + " = " + c);
        c = a / b;// division
        System.out.println(a + " / " + b + " = " + c);
        c = a % b;// modulus
        System.out.println(a + " %% " + b + " = " + c);
        a = 5;
        c = -a;// unary minus
        System.out.println("-" + a + " = " + c);

        c = +a;// unary plus
        System.out.println("+" + a + " = " + c);

        a = 5;// prefix increment
        System.out.println("++" + a + " = " + ++a);
        a = 5;// postfix increment
        System.out.println(a + "++ = " + a++);
        a = 5;// prefix decrement
        System.out.println("--" + a + " = " + --a);
        a = 5;// postfix decrement
        System.out.println(a + "-- = " + a--);
        System.out.println("\n***** Bitwise Operators *****");

        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
// logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
// bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
// logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
// logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        int f = 12;
        float d = 1239.625f;
        boolean bool = true;
        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
        c = (double) l;
        System.out.printf("double = long: c = (float)%d --> c = %f\n", l, c);
        c = (double) f;
        System.out.printf("double = int: c = (float)%d --> c = %f\n", f, c);
        c = (double) d;
        System.out.printf("double = float: c = (float)%f --> c = %f\n", d, c);
        System.out.printf("double = boolean: c = (float)%b --> Compile Error\n", bool);
    }
    public static void testLong() {
        long a = 5, b = 2, c;
        System.out.println("\n\n LONG TEST\n");
        System.out.println("\n***** Arithmetical Operators *****");

        c = a + b;// addition
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = a - b;// subtraction
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = a * b;// multiplication
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = a / b;// division
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = a % b;// modulus
        System.out.printf("%d %% %d = %d\n", a, b, c);
        a = 5;
        c = -a;// unary minus
        System.out.printf("-%d = %d\n", a, c);

        c = +a;// unary plus
        System.out.printf("+%d = %d\n", a, c);

        a = 5;// prefix increment
        System.out.printf("++%d = %d\n", a, ++a);
        a = 5;// postfix increment
        System.out.printf("%d++ = %d\n", a, a++);
        a = 5;// prefix decrement
        System.out.printf("--%d = %d\n", a, --a);
        a = 5;// postfix decrement
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);

        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);

        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);

        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);

        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
// logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
// bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
// logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
// logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int l = 1000000;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = (long) l;
        System.out.printf("long = int: c = (long)%d --> c = %d\n", l, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
        System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool);
    }
    public static void testChar() {
        System.out.println("\n\n CHAR TEST\n");
        char a = 's', b = 'v', c;

        System.out.println("\n***** Assignment Operators *****");
        c = 'b';
        System.out.printf("%s += %s --> c = %s\n", c, a, c += a);
        System.out.printf("%s -= %s --> c = %s\n", c, a, c -= a);
        System.out.printf("%s *= %s --> c = %s\n", c, a, c *= a);
        System.out.printf("%s /= %s --> c = %s\n", c, a, c /= a);
        System.out.printf("%s %%= %s --> c = %s\n", c, a, c %= a);
        System.out.printf("%s |= %s --> c = %s\n", c, a, c |= a);
        System.out.printf("%s &= %s --> c = %s\n", c, a, c &= a);
        System.out.printf("%s ^= %s --> c = %s\n", c, a, c ^= a);
        System.out.printf("%s >>= 1 --> c = %s\n", c, c >>= 1);
        System.out.printf("%s <<= 1 --> c = %s\n", c, c <<= 1);
        System.out.printf("%s >>>= 1 --> c = %s\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%s > %s --> %b\n", a, b, a > b);
        System.out.printf("%s >= %s --> %b\n", a, b, a >= b);
        System.out.printf("%s < %s --> %b\n", a, b, a < b);
        System.out.printf("%s <= %s --> %b\n", a, b, a <= b);
        System.out.printf("%s == %s --> %b\n", a, b, a == b);
        System.out.printf("%s != %s --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%s > %s) && (%s > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%s > %s) & (%s > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
// logical OR
        System.out.printf("(%s >= %s) || (%s != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
// bitwise logical OR
        System.out.printf("(%s >= %s) | (%s != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
// logical XOR
        System.out.printf("(%s >= %s) | (%s != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
// logical NOT
        System.out.printf("!(%s >= %s) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%s > %s ? %s : %s --> %s\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        //char ch = '\u0002';
        int test = 2;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (char) bt;
        System.out.printf("char = byte: c = %s --> c = %s\n", bt, c);
        c = (char) sh;
        System.out.printf("char = short: c = %s --> c = %s\n", sh, c);
        c = (char) test;
        System.out.printf("char = char: c = '%c' --> c = %s\n", test, c);
        c = (char) l;
        System.out.printf("char = long: c = (char)%s --> c = %s\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char)%f --> c = %s\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (char)%s --> c = %s\n", d, c);
        System.out.printf("char = boolean: c = (char)%b --> Compile Error\n", bool);
    }
    public static void testShort() {
        short a = 5, b = 2, c;
        System.out.println("\n\n SHORT TEST\n");
        System.out.println("\n***** Arithmetical Operators *****");

        c = (short) (a + b);// addition
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = (short) (a - b);// subtraction
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = (short) (a * b);// multiplication
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = (short) (a / b);// division
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = (short) (a % b);// modulus
        System.out.printf("%d %% %d = %d\n", a, b, c);
        a = 5;
        c = (short) -a;// unary minus
        System.out.printf("-%d = %d\n", a, c);

        c = (short) +a;// unary plus
        System.out.printf("+%d = %d\n", a, c);
        a = 5;// prefix increment
        System.out.printf("++%d = %d\n", a, ++a);
        a = 5;// postfix increment
        System.out.printf("%d++ = %d\n", a, a++);
        a = 5;// prefix decrement
        System.out.printf("--%d = %d\n", a, --a);
        a = 5;// postfix decrement
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = (short) (a & b); // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) (a | b); // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) (a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        c = (short) (a << 1); // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (short) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = (short) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = 5;
        c = (short) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = (short) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
// logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
// bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
// logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
// logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        int sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
        c = (short) sh;
        System.out.printf("short = int: c = %d --> c = %d\n", sh, c);
        c = (short) ch;
        System.out.printf("short = char: c = '%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
        System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool);
    }
    public static void testByte() {
        byte a = 34, b = 12, c, temp;
        System.out.println("\n\n BYTE TEST\n");
        System.out.println("          Arithmetic          \n");

        //addition
        c = (byte)(a + b);
        System.out.printf("%d + %d = %d\n", a,b,c);

        //subtraction
        c = (byte)(a - b);
        System.out.printf("%d - %d = %d\n", a,b,c);

        //multiplication
        c = (byte)(a * b);
        System.out.printf("%d * %d = %d\n", a,b,c);

        //division
            c = (byte) (a / b);
            System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
            c = (byte)(a % b);
            System.out.printf("%d %% %d = %d\n", a,b,c);

        //unary minus
        c = (byte)-a;
        System.out.printf("-%d = %d\n", a,c);

        //unary plus
        c = (byte)+a;
        System.out.printf("+%d = %d\n", a,c);

        //prefix increment
        temp = a;
        a = ++a;
        System.out.printf("++%d = %d\n", temp,a);

        //postfix increment
        a = temp;
        a = a++;
        System.out.printf("%d++ = %d\n", a,temp);

        //prefix decrement
        a = temp;
        a = --a;
        System.out.printf("--%d = %d\n", temp,a);

        //postfix decrement
        a = temp;
        a = a--;
        System.out.printf("%d-- = %d\n", a,temp);

        a = temp;
        System.out.println("\n       Bitwise operators       \n");

        c = (byte)(a & b); // bitwise AND
        System.out.printf("%d & %d = %d\n", a,b,c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (byte)(a | b); // bitwise OR
        System.out.printf("%d | %d = %d\n", a,b,c);
        System.out.println("In binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (byte)(a ^ b); //bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a,b,c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                Integer.toBinaryString(c));

        c = (byte)(~a); //bitwise unary compliment
        System.out.printf("~%d = %d\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        temp = (byte)-a;
        c = (byte)(a << 1); //left shift
        System.out.printf("%d << 1 = %d\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = (byte)(temp << 1); //left shift
        System.out.printf("%d << 1 = %d\n", temp,c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(temp),
                Integer.toBinaryString(c));

        temp = (byte)-a;
        c = (byte)(temp >> 1); //right shift
        System.out.printf("%d >> 1 = %d\n", temp,c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(temp),
                Integer.toBinaryString(c));

        c = (byte)(a >>> 1); //zero right shift
        System.out.printf("%d >>> 1 = %d\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        temp = (byte)-a;
        c = (byte)(a >>> 1); //zero right shift
        System.out.printf("%d >>> 1 = %d\n", temp,c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(temp),
                Integer.toBinaryString(c));

        System.out.println("\n       Assignment operators       \n");

        temp = a;
        System.out.printf("%d += %d --> c = %d\n", a,b, temp +=b);
        temp = a;
        System.out.printf("%d -= %d --> c = %d\n", a,b, temp -=b);
        temp = a;
        System.out.printf("%d *= %d --> c = %d\n", a,b, temp *=b);

            temp = a;
            System.out.printf("%d /= %d --> c = %d\n", a, b, temp /= b);

            temp = a;
            System.out.printf("%d %%= %d --> c = %d\n", a,b, temp %=b);

        c = (byte)(a+b);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        c = (byte)(a+b);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        c = (byte)(a+b);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = (byte)(a+b);
        System.out.printf("%d >> 1 --> c = %d\n", c, c >> a);
        c = (byte)(a+b);
        System.out.printf("%d << 1 --> c = %d\n", c, c << a);
        c = (byte)(a+b);
        System.out.printf("%d >>> 1 --> c = %d\n", c, c >>> a);

        System.out.println("\n       Relational operators       \n");

        //greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        //lesser than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n       Logical operators       \n");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a,b,a, (a>b)&&(a>0));
        //bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a,b,a, (a>b)&(a>0));
        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a,b,a, (a>b)||(a>0));
        //bitwise logical OR
        System.out.printf("(%d > %d) | (%d > 0) --> %b\n", a,b,a, (a>b)|(a>0));
        //logical XOR
        System.out.printf("(%d > %d) ^ (%d > 0) --> %b\n", a,b,a, (a>b)^(a>0));
        //logical NOT
        System.out.printf("!(%d > %d) --> %b\n", a,b, !(a>b));

        System.out.println("\n       Misc operators       \n");

        System.out.println("     Condition operator     \n");
        System.out.printf("%d > %d ? %d --> %d\n", a,b,a,b, (a > b ? a : b));

        System.out.println("\nType cast operator:");
        byte bt = 1;
        short sh = -32000;
        char  ch = '\u0002';
        long l = 1000000000L;
        float f = 1.9F;
        double d = 123456.78;
        boolean bool = true;

        c = bt;
        System.out.printf("byte = byte: c = %d --> c = %d\n", bt, c);
        c = (byte)sh;
        System.out.printf("byte = short: c = %d --> c = %d\n", sh, c);
        c = (byte)ch;
        System.out.printf("byte = char: c = '%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
        // c = (byte)bool;
        System.out.printf("byte = boolean: c = (byte)%b --> Compile Error: You can't cast to boolean!\n",
                bool);
    }
    public static void testBoolean() {
        System.out.println("\n\n BOOLEAN TEST\n");
        boolean a = true, b = false, c;
        System.out.println("\n***** Bitwise Operators *****");
        c = a & b; // bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a | b; // bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b; // bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        System.out.println("\n***** Assignment Operators *****");
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
        System.out.printf("%b != %b --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        c = a && b; // logical AND
        System.out.printf("%b && %b = %b\n", a, b, c);
        c = a || b; // logical OR
        System.out.printf("%b || %b = %b\n", a, b, c);
        c = a ^ b; // logical XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        // logical NOT
        System.out.printf("!%b --> %b\n", a, !a);
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
        System.out.println("\nType Cast Operator:");
        boolean bool = true;;
        c = bool;
        System.out.println(bool);
    }
    public static void testStringStudent(String a) {
        String b = "qwer", c = "";
        System.out.println("\n\n STRING STUDENT TEST\n");
        System.out.println("\n***** Arithmetical Operators *****");

        System.out.printf("%s + %s = %s\n", a, b, c = a + b);

        System.out.println("\n***** Assignment Operators *****");
        c = "nbvc";
        System.out.printf("%s += %s --> c = %s\n", c, a, c += a);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%s == %s --> %b\n", a, b, a == b);
        System.out.printf("%s != %s --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = String.valueOf(bt);
        System.out.printf("String = byte: c = %s --> c = %s\n", bt, c);
        c = String.valueOf(sh);
        System.out.printf("String = short: c = %d --> c = %s\n", sh, c);
        c = String.valueOf(ch);
        System.out.printf("String = char: c = '%c' --> c = %s\n", ch, c);
        c = String.valueOf(l);
        System.out.printf("String = long: c = (String)%s --> c = %s\n", l, c);
        c = String.valueOf(f);
        System.out.printf("String = float: c = (String)%f --> c = %s\n", f, c);
        c = String.valueOf(d);
        System.out.printf("String = double: c = (String)%f --> c = %s\n", d, c);
        System.out.printf("String = boolean: c = (String)%b --> Compile Error\n", bool);
    }
    public static void testString() {
        String a = "asd", b = "qwer", c = "";
        System.out.println("\n\n STRING TEST\n");
        System.out.println("\n***** Arithmetical Operators *****");

        System.out.printf("%s + %s = %s\n", a, b, c = a + b);

        System.out.println("\n***** Assignment Operators *****");
        c = "nbvc";
        System.out.printf("%s += %s --> c = %s\n", c, a, c += a);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%s == %s --> %b\n", a, b, a == b);
        System.out.printf("%s != %s --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = String.valueOf(bt);
        System.out.printf("String = byte: c = %s --> c = %s\n", bt, c);
        c = String.valueOf(sh);
        System.out.printf("String = short: c = %d --> c = %s\n", sh, c);
        c = String.valueOf(ch);
        System.out.printf("String = char: c = '%c' --> c = %s\n", ch, c);
        c = String.valueOf(l);
        System.out.printf("String = long: c = (String)%s --> c = %s\n", l, c);
        c = String.valueOf(f);
        System.out.printf("String = float: c = (String)%f --> c = %s\n", f, c);
        c = String.valueOf(d);
        System.out.printf("String = double: c = (String)%f --> c = %s\n", d, c);
        System.out.printf("String = boolean: c = (String)%b --> Compile Error\n", bool);
    }
}
