import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        Pet2 pet0 = new Pet2();
        System.out.println("pet0");
        System.out.println(pet0);

        Pet2 pet1 = new Pet2("Dumbo", "Elephant", 10);
        System.out.println("pet1");
        System.out.println(pet1);

        Pet2 pet2 = new Pet2("Ally", "Wolf", 5);
        System.out.println("pet2");
        System.out.println(pet2);

        System.out.println("Enter a pet name:");
        String name = scanner.nextLine();
        System.out.println("Enter a pet type:");
        String type = scanner.nextLine();
        System.out.println("Enter a pet age:");
        int age = scanner.nextInt();
        Pet2 pet4 = new Pet2(name, type, age);
        System.out.println("pet4");

        scanner.close();
    }
}