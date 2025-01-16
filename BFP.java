//Boo!!

import java.util.Scanner;

public class BFP {
    static Scanner scanner = new Scanner(System.in);

    public static void calculate(){
        System.out.println("++ Body-Fat-Percentage Calculator ++\n");

        if(!(Data.isHeightAvailable() && )){
            System.out.println("Please enter following data:\n");

            if(!(Data.isHeightAvailable())){
                System.out.print("Height [cm]: ");
                Data.setHeight((scanner.nextDouble() / 100));
                scanner.nextLine();
                Data.setHeightAvailable(true);
            }

            System.out.println();
        }

        double result;

        System.out.printf("Result: %.1f%n", result);
        System.out.println("Interpretation: " + result(result));

        Main.restart();
    }

    public static String result(double bfp) {
        return "-";
    }
}
}
