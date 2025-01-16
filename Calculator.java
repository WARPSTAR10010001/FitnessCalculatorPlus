//Boo!!

import java.util.Scanner;

public class Calculator {
    //Global objects & classes:
    static Scanner scanner = new Scanner(System.in);

    public void bmi(){
        System.out.println("++ Body-Mass-Index Calculator ++\n");

        if(!(Data.isHeightAvailable() || Data.isWeightAvailable())){
            System.out.println("Please enter following data:\n");

            if(!(Data.isHeightAvailable())){
                System.out.print("Height [cm]: ");
                Data.setHeight((scanner.nextDouble() / 100));
                Data.setHeightAvailable(true);
            }

            if (!Data.isWeightAvailable()){
                System.out.print("Weight [kg]: ");
                Data.setWeight(scanner.nextDouble());
                Data.setWeightAvailable(true);
            }

            System.out.println();
        }

        double result = Data.getWeight() / Math.pow(Data.getHeight(), 2);

        System.out.printf("Result: %.1f%n", result);
        System.out.println("Interpretation: " + bmiInterpretation(result));

        Main.restart();
    }

    public String bmiInterpretation(double bmi){
        return "not implemented yet";
    }

    public void bmr(){
        
    }
}
