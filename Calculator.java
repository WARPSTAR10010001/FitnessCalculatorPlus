//Boo!!

import java.util.Scanner;

public class Calculator {
    //Global objects & classes:
    static Data data = new Data();
    static Scanner scanner = new Scanner(System.in);

    public void bmi(){
        System.out.println("++Body-Mass-Index Calculator++\n");

        if(!(data.isHeightAvailable() || data.isWeightAvailable())){
            System.out.println("Please enter following data:\n");

            if(!(data.isHeightAvailable())){
                System.out.print("Height [cm]: ");
                data.setHeight((scanner.nextDouble() / 100));
                data.setHeightAvailable(true);
            }

            if (!data.isWeightAvailable()){
                System.out.print("Weight [kg]: ");
                data.setWeight(scanner.nextDouble());
                data.setWeightAvailable(true);
            }

            System.out.println();
        }

        double result = data.getWeight() / Math.pow(data.getHeight(), 2);

        System.out.printf("Result: %.1f%n", result);
        System.out.println("Interpretation: " + bmiInterpretation(result));

        Main.restart();
    }

    public String bmiInterpretation(double bmi){
        return "not implemented yet";
    }
}
