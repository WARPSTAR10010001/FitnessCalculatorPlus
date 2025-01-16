//Boo!!

import java.util.Scanner;

public class Main {
    //Global objects & classes:
    static Calculator calc = new Calculator();
    static Data data = new Data();
    static Scanner scanner = new Scanner(System.in);

    //Global variables:
    static final String LASTUPDATE = "16.01.25";
    static final String VERSION = "1.1";
    static final String DIVIDER = "\n--------------------------------------------\n";
    static final String NAME = "FitnessCalculatorPlus";
    static final String[] mode = new String[2];

    public static void main(String[] args) {
        System.out.println("++++" + NAME + "++++");
        System.out.println("Version: " + VERSION + " / Last Updated: " + LASTUPDATE);
        System.out.println(DIVIDER);

        modeConfig();
        selection(true);
    }

    public static void selection(boolean isFirstRun){
        System.out.println("Select one of the calculators listed below:");

        int modeIndex = 0;

        if(!isFirstRun){
            modeIndex++;
        }
        
        for(int i = modeIndex; i < mode.length; i++){
            System.out.println("[" + i + "]: " + mode[i]);
        }

        System.out.print("\nSelection: ");
        int selection = scanner.nextInt();

        if(selection >= modeIndex && selection < mode.length){
            System.out.println(DIVIDER);
        }

        switch (selection){
            case 0 -> {
                if(isFirstRun){
                    data.setAdminMode(true);
                    System.out.println("Admin Mode: " + data.isAdminMode());
                    System.out.println(DIVIDER);
                    selection(false);
                } else {
                    exit(true, 1);
                }
            }
            case 1 -> calc.bmi();
            //Implement other calculators here
            default -> exit(true, 1);
        }
    }

    public static void restart(){
        scanner.nextLine();

        System.out.println(DIVIDER);
        System.out.print("Calculate another value? [Y/N]: ");
        char restart = scanner.nextLine().charAt(0);
        switch (restart) {
            case 78, 110 -> exit(false, 0);
            case 89, 121 -> {
                System.out.print("Keep data? [Y/N]: ");
                char reset = scanner.nextLine().charAt(0);
                switch (reset) {
                    case 78, 110 -> {
                        data.resetAvailability();
                        System.out.println(DIVIDER);
                        selection(false);
                    }
                    case 89, 121 -> {
                        System.out.println(DIVIDER);
                        selection(false);
                    }
                    default -> exit(true, 1);
                }
            }
            default -> exit(true, 1);
        }
    }

    public static void modeConfig(){
        mode[0] = "Admin Mode";
        mode[1] = "BMI Calculator";
    }

    public static void exit(boolean isError, int exitCode){
        if(isError){
            String errorMessage = "\nError: ";
            switch (exitCode){
                case 1 -> errorMessage += "Invalid input.";
                default -> errorMessage += "Internal system failure.";
                //Implement other error messages if needed
            }
            System.out.print(errorMessage);
        } else {
            System.out.print("\nSession terminated.");
        }

        System.exit(0);
    }
}