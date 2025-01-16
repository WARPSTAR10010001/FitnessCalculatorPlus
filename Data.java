//Boo!!

import java.util.Arrays;

public class Data {
    //Global variables:
    private static boolean admin;
    private static boolean weightAvailable;
    private static double weight;
    private static boolean heightAvailable;
    private static double height;

    //Global mode variables:
    private static String[] modeSelection;
    private static boolean[] modeAvailability;

    //Parameterless constructor:
    public static void set(){
        //Global variable declaration:
        Data.admin = false;
        Data.weightAvailable = false;
        Data.weight = 0;
        Data.heightAvailable = false;
        Data.height = 0;

        //Global mode variables declaration:
        Data.modeSelection = new String[3];
        Data.modeAvailability = new boolean[Data.modeSelection.length];
        Arrays.fill(modeAvailability, true);

        //Mode configuration:
        Data.modeSelection[0] = "Admin Mode";
        Data.modeSelection[1] = "BMI Calculator";
        Data.modeAvailability[2] = false;
        Data.modeSelection[2] = "BMR Calculator";
    }

    public static void resetAvailability(){
        Data.weightAvailable = false;
        Data.heightAvailable = false;
    }    

    //Getter & Setter:
    public static boolean isAdmin() {
        return admin;
    }

    public static void setAdmin(boolean admin) {
        Data.admin = admin;
    }

    public static String[] getModeSelection() {
        return modeSelection;
    }

    public static boolean[] getModeAvailability() {
        return modeAvailability;
    }

    public static boolean isWeightAvailable() {
        return weightAvailable;
    }

    public static void setWeightAvailable(boolean weightAvailable) {
        Data.weightAvailable = weightAvailable;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Data.weight = weight;
    }

    public static boolean isHeightAvailable() {
        return heightAvailable;
    }

    public static void setHeightAvailable(boolean heightAvailable) {
        Data.heightAvailable = heightAvailable;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Data.height = height;
    }
}