import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    // Generic method to find elements matching a condition
    public static <T> List<T> findMatching(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Exception Handling
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero! " + e.getMessage());
        }

        // Generics and Lambda Function
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Lambda expression to filter even numbers
        List<Integer> evenNumbers = findMatching(numbers, num -> num % 2 == 0);
        System.out.println("Even numbers: " + evenNumbers);
    }
}
