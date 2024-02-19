import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(2);
        num.add(8);
        num.add(1);

        // Shuffling the list
        Collections.shuffle(num);
        System.out.println("Shuffled List: " + num);

        // Sorting the list
        Collections.sort(num);
        System.out.println("Sorted List: " + num);

        // Reversing the list
        Collections.reverse(num);
        System.out.println("Reversed List: " + num);
    }
}