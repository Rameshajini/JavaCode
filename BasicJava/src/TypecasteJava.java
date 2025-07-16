

public class TypecasteJava {
    public static void main( String[] args )
    {
    System.out.println("===== WIDENING (Automatic Type Conversion) =====");
    byte byteVal = 100;
    short shortVal = byteVal;         // byte -> short
    int intVal = shortVal;            // short -> int
    long longVal = intVal;            // int -> long
    float floatVal = longVal;         // long -> float
    double doubleVal = floatVal;      // float -> double
    char charVal = 'A';
    int charToInt = charVal;          // char -> int

    System.out.println("byte → short: " + shortVal);
    System.out.println("short → int: " + intVal);
    System.out.println("int → long: " + longVal);
    System.out.println("long → float: " + floatVal);
    System.out.println("float → double: " + doubleVal);
    System.out.println("char → int: " + charToInt);

    System.out.println("\n===== NARROWING (Manual Type Casting) =====");
    double d = 123.45;
    float f = (float) d;             // double -> float
    long l = (long) f;               // float -> long
    int i = (int) l;                 // long -> int
    short s = (short) i;             // int -> short
    byte b = (byte) s;               // short -> byte
    char c = (char) i;               // int -> char

    System.out.println("double → float: " + f);
    System.out.println("float → long: " + l);
    System.out.println("long → int: " + i);
    System.out.println("int → short: " + s);
    System.out.println("short → byte: " + b);
    System.out.println("int → char: " + c);

    System.out.println("\n===== PRIMITIVE → STRING CONVERSIONS =====");
    int num = 500;
    float pi = 3.14f;
    boolean status = true;
    char letter = 'Z';

    String strFromInt = String.valueOf(num);
    String strFromFloat = String.valueOf(pi);
    String strFromBool = Boolean.toString(status);
    String strFromChar = Character.toString(letter);

    System.out.println("int → String: " + strFromInt);
    System.out.println("float → String: " + strFromFloat);
    System.out.println("boolean → String: " + strFromBool);
    System.out.println("char → String: " + strFromChar);

    System.out.println("\n===== STRING → PRIMITIVE CONVERSIONS =====");
    String intStr = "123";
    String floatStr = "3.1416";
    String boolStr = "true";
    String charStr = "X";

    int parsedInt = Integer.parseInt(intStr);
    float parsedFloat = Float.parseFloat(floatStr);
    boolean parsedBoolean = Boolean.parseBoolean(boolStr);
    char parsedChar = charStr.charAt(0);

    System.out.println("String → int: " + parsedInt);
    System.out.println("String → float: " + parsedFloat);
    System.out.println("String → boolean: " + parsedBoolean);
    System.out.println("String → char: " + parsedChar);

    System.out.println("\n===== INVALID CONVERSIONS (Compile-Time Errors if uncommented) =====");
    // boolean to int or vice versa is not allowed
    // int to String using cast is not allowed
    // boolean b = (boolean) 1; // cannot execute
    // int i = (int) true;      // cannot execute
    // String s = (String) 100; // cannot execute
    System.out.println("NOTE: Boolean cannot be cast to or from numeric types.");
    }
}
