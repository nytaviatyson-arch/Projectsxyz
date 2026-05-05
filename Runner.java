import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Towers towers = new Towers();

        System.out.print("Enter the number of disks: ");
        int n = input.nextInt();

        System.out.println("\nSteps to solve the Towers of Hanoi:\n");
        towers.solve(n, 'A', 'C', 'B');

        input.close();
    }
}