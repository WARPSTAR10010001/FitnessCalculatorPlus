//Boo!!

import java.util.Scanner;

/*
 * private static boolean weightAvailable;
    private static double weight;
    private static boolean heightAvailable;
    private static double height;

    private static char gender;
    private static boolean genderAvailable;
    private static int age;
    private static boolean ageAvailable;
    private static double waist;
    private static boolean waistAvailable;
    private static double neck;
    private static boolean neckAvailable;
    private static double hip;
    private static boolean hipAvailable;
    private static int calorieDifference;
    private static boolean calorieDifferenceAvailable;
    private static int averageCalorieDeficit;
    private static boolean averageCalorieDeficitAvailable;
    private static double wantedWeight;
    private static boolean wantedWeightAvailable;
 */

public class VTX {
    static Scanner scanner = new Scanner(System.in);

    public static void main(){
        System.out.println("++ Vortex Mode ++\n");

        System.out.println("Please enter following data:\n");

        System.out.print("Height [cm]: ");
        double tempD = scanner.nextDouble();
        Data.setHeight(tempD);
        Data.setHeightAvailable(true);
        scanner.nextLine();

        System.out.print("Weight [kg]: ");
        tempD = scanner.nextDouble();
        Data.setWeight(tempD);
        Data.setWeightAvailable(true);
        scanner.nextLine();

        System.out.print("Gender [M/F]: ");
        char tempC = Character.toUpperCase(scanner.nextLine().charAt(0));
        Data.setGender(tempC);
        Data.setGenderAvailable(true);


        System.out.println();

        BMI.calculate();
        BMR.calculate();
        BFP.calculate();
        WHR.calculate();
        IDW.calculate();
        CAL.calculate();
        WLT.calculate();
    }
}