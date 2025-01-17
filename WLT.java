//Boo!!

import java.util.Scanner;

public class WLT{
    static Scanner scanner = new Scanner(System.in);

    public static void calculate(){
        System.out.println("++ Calorie-Deficit Calculator ++\n");


        if(!(Data.isAverageCalorieDeficitAvailable() && Data.isWeightAvailable() && Data.isWantedWeightAvailable())){
            System.out.println("Please enter following data:\n");

            if (!Data.isWeightAvailable()){
                System.out.print("Weight [kg]: ");
                double temp = scanner.nextDouble();
                if(temp == -1){
                    Main.RTM();
                } else {
                    Data.setWeight(temp);
                }
                scanner.nextLine();
                Data.setWeightAvailable(true);
            }

            if(!Data.isWantedWeightAvailable()){
                System.out.print("Wanted weight [kg]: ");
                double temp = scanner.nextDouble();
                if(temp == -1){
                    Main.RTM();
                } else {
                    Data.setWantedWeight(temp);
                }
                scanner.nextLine();
                Data.setWantedWeightAvailable(true);
            }

            if(!Data.isAverageCalorieDeficitAvailable()){
                if(Data.isCalorieDifferenceAvailable() && Data.getCalorieDifference() > 0){
                    System.out.print("Use last calorie deficit [Last: " + Data.getCalorieDifference() + "]? [Y/N]: ");
                    String useLine = scanner.nextLine();
                    char use = Character.toUpperCase(useLine.charAt(0));
                    if(use == 'Y'){
                        Data.setAverageCalorieDeficit(Data.getCalorieDifference());
                        Data.setAverageCalorieDeficitAvailable(true);
                    } else if (use == 'N') {
                        System.out.print("Average daily calorie deficit [kcal]: ");
                        int temp = scanner.nextInt();
                        if(temp == -1){
                            Main.RTM();
                        } else {
                            Data.setAverageCalorieDeficit(temp);
                        }
                        scanner.nextLine();
                        Data.setAverageCalorieDeficitAvailable(true);
                    } else if (useLine.equals("-1")){
                        Main.RTM();
                    } else {
                        Main.exit(true, 1);
                    }
                }
                if(!Data.isAverageCalorieDeficitAvailable()){
                    System.out.print("Average daily calorie deficit [kcal]: ");
                    int temp = scanner.nextInt();
                    if(temp == -1){
                        Main.RTM();
                    } else {
                        Data.setAverageCalorieDeficit(temp);
                    }
                    scanner.nextLine();
                    Data.setAverageCalorieDeficitAvailable(true);
                }
            }
            System.out.println();
        }

        double weightDifference = Math.abs(Data.getWantedWeight() - Data.getWeight());
        int result = (int) ((weightDifference * 7700) / Data.getAverageCalorieDeficit());

        System.out.println("Result: " + result);
        System.out.println("Interpretation: " + result(result));

        Main.restart();
    }

    public static String result(int wlt) {
        return "Based on your current and wanted/ideal weight, it will take you " + wlt + " days to reach your goal.";
    }
}