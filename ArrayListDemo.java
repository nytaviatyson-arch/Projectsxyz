import java.util.ArrayList;

public class ArrayListDemo {
     public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        System.out.println("Original Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nOriginal Numbers List:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        fruits.remove("Banana");
        numbers.remove(2);

        fruits.add(1, "Mango");
        numbers.add(1, 12);

        System.out.println("\nUpdated Fruits List:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("\nUpdated Numbers List:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}