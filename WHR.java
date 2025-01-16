import java.util.Scanner;

public class WHR {
    static Scanner scanner = new Scanner(System.in);

    public static void calculate() {
        System.out.println("++ Waist-Hip-Ratio Calculator ++\n");

        if (!(Data.isHipAvailable() && Data.isWaistAvailable() && Data.isGenderAvailable())) {
            System.out.println("Please enter the following data:\n");

            if(!(Data.isGenderAvailable())){
                System.out.print("Gender [M/F]: ");
                String tempLine = scanner.nextLine();
                char temp = Character.toUpperCase(tempLine.charAt(0));
                if(tempLine.equals("-1")){
                    Main.RTM();
                } else {
                    Data.setGender(temp);
                }
                if(temp != 'M' && temp  != 'F'){
                    Main.exit(true, 1);
                }
                Data.setGenderAvailable(true);
            }

            if (!(Data.isHipAvailable())) {
                System.out.print("Hip [cm]: ");
                double temp = scanner.nextDouble();
                if(temp == -1){
                    Main.RTM();
                } else {
                    Data.setHip(temp);
                }
                scanner.nextLine();
                Data.setHipAvailable(true);
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
