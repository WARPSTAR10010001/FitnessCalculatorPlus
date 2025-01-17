//Boo!!

import java.util.Scanner;

public class CAL{
    static Scanner scanner = new Scanner(System.in);

    public static void calculate(){
        System.out.println("++ Calorie-Deficit Calculator ++\n");


        if(!(Data.isCalorieDifferenceAvailable())){
            System.out.println("Please enter following data:\n");

            System.out.print("Burnt calories [kcal]: ");
            int burnt = scanner.nextInt();
            if(burnt == -1){
                Main.RTM();
            }
            scanner.nextLine();

            System.out.print("Consumed calories [kcal]: ");
            int consumed = scanner.nextInt();
            if(consumed == -1){
                Main.RTM();
            }
            scanner.nextLine();

            int result = burnt - consumed;
            Data.setCalorieDifference(result);
            Data.setCalorieDifferenceAvailable(true);

            System.out.println();
        }

        System.out.println("Result: " + Data.getCalorieDifference());

        if(Data.getCalorieDifference() != 0){
            System.out.printf("Interpretation: %s%.2f%s%n", result(Data.getCalorieDifference()), weightDifference(Data.getCalorieDifference()), " kgs today.");
        } else {
            System.out.printf("Interpretation: %s%n", result(Data.getCalorieDifference()));
        }

        Main.restart();
    }

    public static String result(int cal) {
        if(cal > 0){
            return "Calorie Deficit - You have theoretically lost ";
        } else if (cal < 0){
            return "Calorie Surplus - You have theoretically gained ";
        } else {
            return "Calorie Balance - You theoretically didn't gain nor lose any weight today.";
        }
    }

    public static double weightDifference(int cal){
        return cal / 7700.;
    }
}