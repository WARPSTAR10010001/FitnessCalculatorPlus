//Boo!!

import java.util.Scanner;

public class IDW {
    static Scanner scanner = new Scanner(System.in);

    public static void calculate() {
        System.out.println("++ Ideal Weight Calculator ++\n");
        Data.setWantedWeightAvailable(false);

        if(!(Data.isHeightAvailable())){
            System.out.println("Please enter following data:\n");

            if(!(Data.isHeightAvailable())){
                System.out.print("Height [cm]: ");
                double temp = scanner.nextDouble();
                if(temp == -1){
                    Main.RTM();
                } else {
                    Data.setHeight(temp / 100);
                }
                scanner.nextLine();
                Data.setHeightAvailable(true);
            }

            System.out.println();
        }

        System.out.println("Choose a target level for your ideal weight:");
        System.out.println("[1]: Lower BMI\n[2]: Moderate BMI\n[3]: Higher BMI\n");
        System.out.print("Selection [1-3]: ");
        int level = scanner.nextInt();

        if(level == -1){
            Main.RTM();
        }
        
        scanner.nextLine();
        System.out.println();

        double idealWeight = calculateIdealWeight(Data.getHeight(), level);
        Data.setWantedWeight(idealWeight);
        Data.setWantedWeightAvailable(true);

        System.out.printf("Result: %.1f kg%n", Data.getWantedWeight());
        
        Main.restart();
    }

    private static double calculateIdealWeight(double height, int level) {
        double bmi;
        switch (level) {
            case 1 -> bmi = 18.5;
            case 2 -> bmi = 22;
            case 3 -> bmi = 25;
            default -> {
                return -1;
            }
        }

        return bmi * Math.pow(height, 2);
    }
}