import java.util.Scanner;

public class TemperatureAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take the number of temperatures as input from user
        System.out.print("Enter the number of temperature values: ");
        int n = scanner.nextInt();

        // Step 2: Create an array to store the temperature values
        double[] temperatures = new double[n];

        // Step 2: Prompt  user to enter all the temperature values
        System.out.println("Enter " + n + " temperature values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Step 3: Calculate average temperature
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += temperatures[i];
        }
        double average = sum / n;

        // Step 4: Determine how many temperatures are above the average
        int countAboveAverage = 0;
        for (int i = 0; i < n; i++) {
            if (temperatures[i] > average) {
                countAboveAverage++;
            }
        }

        // Output results
        System.out.println("\nAverage Temperature: " + average);
        System.out.println("Number of days with temperatures above the average: " + countAboveAverage);

        // Close scanner
        scanner.close();
    }
}
