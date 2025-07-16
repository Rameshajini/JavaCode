

public class LogicalOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Logical AND
        boolean andResult = (a > 5 && b < 10);
        System.out.println("a > 5 && b < 10: " + andResult); // true

        // Logical OR
        boolean orResult = (a < 5 || b < 10);
        System.out.println("a < 5 || b < 10: " + orResult); // true

        // Logical NOT
        boolean notResult = !(a == 10);
        System.out.println("!(a == 10): " + notResult); // false

        // Combined example
        if ((a > b) && !(b == 5)) {
            System.out.println("Complex logic is true");
        } else {
            System.out.println("Complex logic is false");
        }
    }
}
