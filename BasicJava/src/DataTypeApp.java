

/**
 * Hello world!
 *
 */
public class DataTypeApp 
{
    public static void main( String[] args )
    {
        // 1. byte - 8 bits
        byte age = 25;
        System.out.println("Byte value (age): " + age);

        // 2. short - 16 bits
        short year = 2025;
        System.out.println("Short value (year): " + year);

        // 3. int - 32 bits
        int salary = 500000;
        System.out.println("Int value (salary): " + salary);

        // 4. long - 64 bits (use L at the end)
        long population = 8000000000L;
        System.out.println("Long value (population): " + population);

        // 5. float - 32 bits (use f at the end)
        float pi = 3.1415f;
        System.out.println("Float value (pi): " + pi);

        // 6. double - 64 bits (default for decimal)
        double gravity = 9.80665;
        System.out.println("Double value (gravity): " + gravity);

        // 7. char - 16 bits (single character)
        char grade = 'A';
        System.out.println("Char value (grade): " + grade);

        // 8. boolean - 1 bit (true or false)
        boolean isJavaFun = true;
        System.out.println("Boolean value (isJavaFun): " + isJavaFun);

        System.out.println( "Hello World!" );
    }
}
