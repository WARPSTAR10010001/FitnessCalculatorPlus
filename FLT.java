//Boo!!

import java.util.Scanner;

public class FLT {
    static Scanner scanner = new Scanner(System.in);

    public static void calculate() {
        System.out.println("++ Fat Loss Progress Tracker ++\n");

        if (!(Data.isWeightAvailable() && Data.isWantedWeightAvailable() && Data.isTimeFrameAvailable())) {
            System.out.println("Please enter the following data:\n");

            //Dont use weight variable!!
            if (!Data.isWeightAvailable()) {
                System.out.print("Starting Weight [kg]: ");
                double startWeight = scanner.nextDouble();
                if (startWeight == -1) {
                    Main.RTM();
                } else {
                    Data.setWeight(startWeight);
                }
                scanner.nextLine();
                Data.setWeightAvailable(true);
            }

            //Use ideal weight
            if (!Data.isTargetWeightAvailable()) {
                System.out.print("Target Weight [kg]: ");
                double targetWeight = scanner.nextDouble();
                if (targetWeight == -1) {
                    Main.RTM();
                } else {
                    Data.setTargetWeight(targetWeight);
                }
                scanner.nextLine();
                Data.setTargetWeightAvailable(true);
            }

            //Use timeframe from wlt
            if (!Data.isTimeFrameAvailable()) {
                System.out.print("Timeframe [weeks]: ");
                int timeFrame = scanner.nextInt();
                if (timeFrame == -1) {
                    Main.RTM();
                } else {
                    Data.setTimeFrame(timeFrame);
                }
                scanner.nextLine();
                Data.setTimeFrameAvailable(true);
            }

            System.out.println();
        }

        //take data if available
        System.out.print("Current Weight [kg]: ");
        double currentWeight = scanner.nextDouble();
        if (currentWeight == -1) {
            Main.RTM();
        }
        scanner.nextLine();

        /*
        double startWeight = Data.getWeight();
        double targetWeight = Data.getTargetWeight();
        int timeFrame = Data.getTimeFrame();

        double totalLossGoal = startWeight - targetWeight;
        double progress = startWeight - currentWeight;
        double remainingLoss = targetWeight - currentWeight;

        int weeksElapsed = (int) ((progress / totalLossGoal) * timeFrame);
        int weeksRemaining = timeFrame - weeksElapsed;

        double weeklyRateRequired = remainingLoss / weeksRemaining;

        // Ausgabe der Ergebnisse
        System.out.printf("Start Weight: %.1f kg\n", startWeight);
        System.out.printf("Target Weight: %.1f kg\n", targetWeight);
        System.out.printf("Current Weight: %.1f kg\n", currentWeight);
        System.out.printf("Total Weight Loss Goal: %.1f kg\n", totalLossGoal);
        System.out.printf("Progress: %.1f kg (%.1f%% of goal)\n", progress, (progress / totalLossGoal) * 100);
        System.out.printf("Remaining Weight: %.1f kg\n", remainingLoss);
        System.out.printf("Weeks Elapsed: %d weeks\n", weeksElapsed);
        System.out.printf("Weeks Remaining: %d weeks\n", weeksRemaining);
        System.out.printf("Required Weekly Loss Rate: %.2f kg/week\n", weeklyRateRequired);

        System.out.println("\nMotivation:");
        if (progress / totalLossGoal >= 0.75) {
            System.out.println("Amazing! You're almost there. Keep pushing!");
        } else if (progress / totalLossGoal >= 0.5) {
            System.out.println("Great progress! You're halfway to your goal!");
        } else if (progress / totalLossGoal > 0) {
            System.out.println("Good start! Stay consistent to hit your target.");
        } else {
            System.out.println("Let's get started on your journey to success!");
        }
            */

        Main.restart();
    }
}
