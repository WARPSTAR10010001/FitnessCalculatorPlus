//Boo!!

import java.util.Scanner;

public class BFP {
    static Scanner scanner = new Scanner(System.in);

    public static void calculate(){
        System.out.println("++ Body-Fat-Percentage Calculator ++\n");

        if(!(Data.isHeightAvailable() && Data.isWaistAvailable() && Data.isNeckAvailable())){
            System.out.println("Please enter following data:\n");

            if(!(Data.isHeightAvailable())){
                System.out.print("Height [cm]: ");
                double temp = scanner.nextDouble();
                if(temp == -1){
                    Main.RTM();
                } else {
                    Data.setHeight((temp / 100));
                }
                scanner.nextLine();
                Data.setHeightAvailable(true);
            }

            if(!(Data.isNeckAvailable())){
                System.out.print("Neck [cm]: ");
                double temp = scanner.nextDouble();
                if(temp == -1){
                    Main.RTM();
                } else {
                    Data.setNeck(temp);
                }
                scanner.nextLine();
                Data.setNeckAvailable(true);
            }

            if(!(Data.isWaistAvailable())){
                System.out.print("Waist [cm]: ");
                double temp = scanner.nextDouble();
                if(temp == -1){
                    Main.RTM();
                } else {
                    Data.setWaist(temp);
                }
                scanner.nextLine();
                Data.setWaistAvailable(true);
            }

            System.out.println();
        }

        int result = (int) (86.01 * Math.log10(Data.getWaist() - Data.getNeck()) - 70.041 * Math.log10((Data.getHeight() * 100)) + 36.76);

        System.out.println("Result: " + result + "%\n");
        System.out.println("Interpretation: " + result(result));

        Main.restart();
    }

    public static String result(double bfp) {
        if (bfp < 6) {
            return "Essential fat - Your body fat percentage is extremely low and may pose health risks.";
        } else if (bfp < 14) {
            return "Athletes - You have a very low body fat percentage, typical for athletes.";
        } else if (bfp < 18) {
            return "Fitness - Your body fat percentage is in a healthy and fit range.";
        } else if (bfp < 25) {
            return "Average - Your body fat percentage is within the average range.";
        } else {
            return "Obese: Your body fat percentage is high, and you may want to consider lifestyle changes.";
        }
    }
}