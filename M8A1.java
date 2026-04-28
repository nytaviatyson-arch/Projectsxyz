import java.io;
import java.text.DecimalFormat;

public class Payroll {
    public static void main(String[] args) {

        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                int empId = Integer.parseInt(parts[0]);
                double rate = Double.parseDouble(parts[1]);
                double hours = Double.parseDouble(parts[2]);

                double weeklyPay;

                if (hours > 40) {
                    double overtime = hours - 40;
                    weeklyPay = (40 * rate) + (overtime * rate * 1.5);
                } else {
                    weeklyPay = rate * hours;
                }

                DecimalFormat df = new DecimalFormat("0.00");
                String payString = df.format(weeklyPay);

                String outputLine = empId + "," + rate + "," + hours + "," + payString;

                writer.write(outputLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Done writing to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}