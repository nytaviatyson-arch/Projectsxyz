public class TestScoreAverage {
    public static void main(String[] args) {
        double[] scores = {75.2, 91.0, 84.8};

        double average = (scores[0] + scores[1] + scores[2] ) / 3;
        System.out.println("The average score is: " + average);
        System.out.println("Test Score 1: " + scores[0]);
        System.out.println("Test Score 2: " + scores[1]);
        System.out.println("Test Score 3: " + scores[2]);
        System.out.println("Average Score: " + average);
    }
}