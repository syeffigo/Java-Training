
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //Creating a list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        //Accessing elements by index
        System.out.println("First Fruit: " + fruits.get(0));

        //Modifying an element
        fruits.set(1, "Grapes");
        System.out.println("Updated List: " + fruits);

        //Removing an element
        fruits.remove("Orange");
        System.out.println("List after removal: " + fruits);
    }
}