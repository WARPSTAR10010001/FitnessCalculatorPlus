//Boo!!

import java.util.Scanner;

public class BMI{
    static Scanner scanner = new Scanner(System.in);

    public static void calculate(){
        System.out.println("++ Body-Mass-Index Calculator ++\n");

        if(!(Data.isHeightAvailable() && Data.isWeightAvailable())){
            System.out.println("Please enter following data:\n");

            if(!(Data.isHeightAvailable())){
                System.out.print("Height [cm]: ");
                Data.setHeight((scanner.nextDouble() / 100));
                scanner.nextLine();
                Data.setHeightAvailable(true);
            }

            if (!Data.isWeightAvailable()){
                System.out.print("Weight [kg]: ");
                Data.setWeight(scanner.nextDouble());
                scanner.nextLine();
                Data.setWeightAvailable(true);
            }

            System.out.println();
        }

        double result = Data.getWeight() / Math.pow(Data.getHeight(), 2);

        System.out.printf("Result: %.1f%n", result);
        System.out.println("Interpretation: " + result(result));

        Main.restart();
    }

    public static String result(double bmi) {
        if (bmi < 18.5) {
            return "Underweight - Your BMI is below the normal range. It might be helpful to consult a doctor or nutritionist to plan healthy weight gain.";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight - Your BMI is within the healthy range. Keep it up, make sure to maintain a balanced diet and regular physical activity!";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight - Your BMI falls into the overweight category. A healthy weight loss plan through diet and exercise would be advisable.";
        } else if (bmi >= 30 && bmi < 35) {
            return "Obesity (Grade 1) - Your BMI indicates mild obesity. It is recommended to consult a doctor to discuss personalized treatment options.";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obesity (Grade 2) - Your BMI shows moderate obesity. Medical supervision is strongly advised to reduce health risks.";
        } else {
            return "Obesity (Grade 3) - Your BMI falls under severe obesity. Immediate medical consultation is important to determine necessary steps for weight loss and health care.";
        }
    }
}