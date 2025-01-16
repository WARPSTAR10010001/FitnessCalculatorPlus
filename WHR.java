import java.util.Scanner;

public class WHR {
    static Scanner scanner = new Scanner(System.in);

    public static void calculate() {
        System.out.println("++ Waist-Hip-Ratio Calculator ++\n");

        if (!(Data.isHipAvailable() && Data.isWaistAvailable() && Data.isGenderAvailable())) {
            System.out.println("Please enter the following data:\n");

            if (!(Data.isGenderAvailable())) {
                System.out.print("Gender [m/f]: ");
                char temp = Character.toUpperCase(scanner.nextLine().charAt(0));
                if (temp != 'M' && temp != 'F') {
                    Main.exit(true, 1);
                }
                Data.setGender(temp);
                Data.setGenderAvailable(true);
            }

            if (!(Data.isHipAvailable())) {
                System.out.print("Hip [cm]: ");
                Data.setHip(scanner.nextDouble());
                scanner.nextLine();
                Data.setHipAvailable(true);
            }

            if (!Data.isWaistAvailable()) {
                System.out.print("Waist [cm]: ");
                Data.setWaist(scanner.nextDouble());
                scanner.nextLine();
                Data.setWaistAvailable(true);
            }

            System.out.println();
        }

        double result = Data.getWaist() / Data.getHip();

        System.out.printf("Result: %.2f%n", result);
        System.out.println("Interpretation: " + result(result));

        Main.restart();
    }

    public static String result(double whr) {
        if (Data.getGender() == 'M') {
            if (whr < 0.90) {
                return "Low Risk - Your Waist-Hip Ratio indicates a low risk of cardiovascular diseases.";
            } else if (whr <= 0.99) {
                return "Moderate Risk - Your Waist-Hip Ratio indicates a moderate risk of cardiovascular diseases.";
            } else {
                return "High Risk: Your Waist-Hip Ratio indicates a high risk of cardiovascular diseases.";
            }
        } else {
            if (whr < 0.80) {
                return "Low Risk - Your Waist-Hip Ratio indicates a low risk of cardiovascular diseases.";
            } else if (whr <= 0.84) {
                return "Moderate Risk - Your Waist-Hip Ratio indicates a moderate risk of cardiovascular diseases.";
            } else {
                return "High Risk - Your Waist-Hip Ratio indicates a high risk of cardiovascular diseases.";
            }
        }
    }
}
