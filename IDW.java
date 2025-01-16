//Boo!!

import java.util.Scanner;

public class IDW {
    static Scanner scanner = new Scanner(System.in);

    public static void calculate() {
        System.out.println("++ Ideal Weight Calculator ++\n");

        if(!(Data.isHeightAvailable())){
            System.out.println("Please enter following data:\n");

            if(!(Data.isHeightAvailable())){
                System.out.print("Height [cm]: ");
                Data.setHeight((scanner.nextDouble() / 100));
                scanner.nextLine();
                Data.setHeightAvailable(true);
            }

            System.out.println();
        }

        System.out.println("Choose a target level for your ideal weight:");
        System.out.println("[1]: Lower BMI\n[2]: Moderate BMI\n[3]: Higher BMI\n");
        System.out.print("Selection [1-3]: ");
        int level = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        double idealWeight = calculateIdealWeight(Data.getHeight(), level);

        System.out.printf("Result: %.1fkg%n", idealWeight);
        
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