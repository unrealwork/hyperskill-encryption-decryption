import java.util.*;

public class Main {

    public static int convert(Double val) {
        // write your code here
        if (val.isNaN()) {
            return 0;
        }
        if (val.isInfinite()) {
            return val > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return val.intValue();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double doubleVal = new Double(scanner.nextDouble() / scanner.nextDouble());
        System.out.println(convert(doubleVal));
    }
}