import java.util.Scanner;

public class Tests {

    private double average;
    private int count;

    public Tests() {
        average = 0.0;
        count = 0;
    }

    public void getAverage() {

        Scanner input = new Scanner(System.in);
        double sum = 0.0;
        count = 0;

        System.out.println("Enter test scores (-1 to quit):");

        double score = input.nextDouble();   // prime the loop

        while (score != -1) {
            sum += score;
            count++;
            score = input.nextDouble();
        }

        if (count > 0) {
            average = sum / count;
        } else {
            average = Double.NaN;
        }
    }

    @Override
    public String toString() {
        return String.format(
                "The average of the %d score%s entered is %.2f.",
                count,
                (count == 1 ? "" : "s"),
                average
        );
    }
}