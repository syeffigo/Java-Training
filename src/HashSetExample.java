import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a set of integers
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        // Adding duplicate element (won't be added in a set)
        numbers.add(2);

        System.out.println("HashSet: " + numbers);

        // Checking if an element is present
        System.out.println("Is 5 present? " + numbers.contains(5));

        // Removing an element
        numbers.remove(2);
        System.out.println("HashSet after removal: " + numbers);
    }
}