//Boo!!

import java.util.Scanner;

public class Main {
    //Global objects:
    static Scanner scanner = new Scanner(System.in);
    static Calculator calc = new Calculator();

    //Global variables:
    static final String LASTUPDATE = "16.01.25";
    static final String VERSION = "1.2";
    static final String DIVIDER = "\n--------------------------------------------\n";

    public static void main(String[] args) {
        System.out.println("++++ FitnessCalculatorPlus ++++");
        System.out.println("Version: " + VERSION + " / Last Updated: " + LASTUPDATE);
        System.out.println(DIVIDER);

        Data.set();
        selection(true);
    }

    public static void selection(boolean isFirstRun){
        System.out.println("Select one of the modes listed below:");

        int modeIndex = 0;

        if(!isFirstRun){
            modeIndex++;
        }

        boolean unlockAdmin = true;
        int nonAdminModeCount = 0;

        for(int i = 0; i < Data.getModeSelection().length; i++){
            if(Data.getModeAvailability()[i] == true){
                nonAdminModeCount++;
            }
        }

        if(Data.getModeSelection().length == nonAdminModeCount){
            unlockAdmin = false;
        }
        
        for(int i = modeIndex; i < Data.getModeSelection().length; i++){
            if(!(Data.isAdmin())){
                if(Data.getModeAvailability()[i] == true){
                    if(unlockAdmin){
                        System.out.println("[" + i + "]: " + Data.getModeSelection()[i]);
                    } else {
                        if(i != 0){
                            System.out.println("[" + i + "]: " + Data.getModeSelection()[i]);
                        }
                    }
                }
            } else {
                if(Data.getModeAvailability()[i] == true){
                    System.out.println("[" + i + "]: " + Data.getModeSelection()[i]);
                } else {
                    System.out.println("[" + i + "]: " + Data.getModeSelection()[i] + " [Admin Mode]"); 
                }
            }
        }

        if(Data.isAdmin()){
            System.out.print("\nSelection [1-" + (Data.getModeSelection().length - 1) + "]: ");
        } else {
            System.out.print("\nSelection [" + modeIndex + "-" + (nonAdminModeCount - 1) + "]: ");
        }
        int selection = scanner.nextInt();

        if(selection >= modeIndex && selection < Data.getModeSelection().length){
            System.out.println(DIVIDER);
        }

        switch (selection){
            case 0 -> {
                if(isFirstRun && unlockAdmin){
                    Data.setAdmin(true);
                    System.out.println("Admin Mode: " + Data.isAdmin());
                    System.out.println(DIVIDER);
                    selection(false);
                } else {
                    exit(true, 1);
                }
            }
            //Implement other calculators here
            default -> calc.exec(selection);
        }
    }

    public static void restart(){
        scanner.nextLine();

        System.out.println(DIVIDER);
        System.out.print("Calculate another value? [Y/N]: ");
        char restart = Character.toUpperCase(scanner.nextLine().charAt(0));
        switch (restart) {
            case 'N' -> exit(false, 0);
            case 'Y' -> {
                System.out.print("Keep current values? [Y/N]: ");
                char reset = Character.toUpperCase(scanner.nextLine().charAt(0));
                switch (reset) {
                    case 'N' -> {
                        Data.resetAvailability();
                        selection(false);
                }
                    case 'Y' -> {
                        System.out.println(DIVIDER);
                        selection(false);
                    }
                    default -> exit(true, 1);
                }
            }

            default -> exit(true, 1);
        }
    }

    public static void exit(boolean isError, int exitCode){
        if(isError){
            String errorMessage = "\nError: ";
            switch (exitCode){
                case 1 -> errorMessage += "Invalid input.";
                case 2 -> errorMessage += "Mode Unavailable";
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