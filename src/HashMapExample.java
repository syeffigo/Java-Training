import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a map of student IDs and their names
        HashMap<Integer, String> student = new HashMap<>();
        student.put(1, "Anyam");
        student.put(2, "Abhinav");
        student.put(3, "Himanshu");

        //Accessing value by key
        System.out.println("Name of student with ID 2: " + student.get(2));

        //Modifying a value
        student.put(1, "Piyush");
        System.out.println("Updated HashMap: " + student);

        //Removing a key-value pair
        student.remove(3);
        System.out.println("HashMap after removal: " + student);
    }
}