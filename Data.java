//Boo!!

import java.util.Arrays;

public class Data {
    //Global settings:
    private static boolean admin;

    //Static data:
    private static boolean weightAvailable;
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

    //Global mode variables:
    private static String[] modeSelection;
    private static boolean[] modeAvailability;

    public static void setAvailability(boolean reset){
        //Set settings:
        Data.admin = false;

        //Set availability of static data:
        Data.weight = 0;
        Data.weightAvailable = false;
        Data.height = 0;
        Data.heightAvailable = false;
        Data.gender = '-';
        Data.genderAvailable = false;
        Data.age = 0;
        Data.ageAvailable = false;
        Data.waist = 0;
        Data.waistAvailable = false;
        Data.neck = 0;
        Data.neckAvailable = false;
        Data.hip = 0;
        Data.hipAvailable = false;
        Data.calorieDifference = 0;
        Data.calorieDifferenceAvailable = false;
        Data.averageCalorieDeficit = 0;
        Data.averageCalorieDeficitAvailable = false;
        Data.wantedWeight = 0;
        Data.wantedWeightAvailable = false;
        
        //Set mode selection and availability (if first run):
        if(!reset){
            configMode();
        }
    }

    public static void configMode(){
        Data.modeSelection = new String[8];
        Data.modeAvailability = new boolean[Data.modeSelection.length];
        Arrays.fill(modeAvailability, true);

        //Mode options:
        Data.modeSelection[0] = "Admin Mode";
        Data.modeSelection[1] = "Body-Mass-Index Calculator";
        Data.modeSelection[2] = "Basal-Metabolic-Rate Calculator";
        Data.modeSelection[3] = "Body-Fat-Percentage Calculator";
        Data.modeSelection[4] = "Waist-Hip-Ratio Calculator";
        Data.modeSelection[5] = "Ideal-Weight Calculator";
        Data.modeSelection[6] = "Calorie-Deficit Calculator";
        Data.modeSelection[7] = "Weight-Loss-Time Calculator";
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

    public static char getGender() {
        return gender;
    }

    public static void setGender(char gender) {
        Data.gender = gender;
    }

    public static boolean isGenderAvailable() {
        return genderAvailable;
    }

    public static void setGenderAvailable(boolean genderAvailable) {
        Data.genderAvailable = genderAvailable;
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

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Data.age = age;
    }

    public static boolean isAgeAvailable() {
        return ageAvailable;
    }

    public static void setAgeAvailable(boolean ageAvailable) {
        Data.ageAvailable = ageAvailable;
    }

    public static double getWaist() {
        return waist;
    }

    public static void setWaist(double waist) {
        Data.waist = waist;
    }

    public static boolean isWaistAvailable() {
        return waistAvailable;
    }

    public static void setWaistAvailable(boolean waistAvailable) {
        Data.waistAvailable = waistAvailable;
    }

    public static double getNeck() {
        return neck;
    }

    public static void setNeck(double neck) {
        Data.neck = neck;
    }

    public static boolean isNeckAvailable() {
        return neckAvailable;
    }

    public static void setNeckAvailable(boolean neckAvailable) {
        Data.neckAvailable = neckAvailable;
    }

    public static double getHip() {
        return hip;
    }

    public static void setHip(double hip) {
        Data.hip = hip;
    }

    public static boolean isHipAvailable() {
        return hipAvailable;
    }

    public static void setHipAvailable(boolean hipAvailable) {
        Data.hipAvailable = hipAvailable;
    }

    public static int getCalorieDifference() {
        return calorieDifference;
    }

    public static void setCalorieDifference(int calorieDifference) {
        Data.calorieDifference = calorieDifference;
    }

    public static boolean isCalorieDifferenceAvailable() {
        return calorieDifferenceAvailable;
    }

    public static void setCalorieDifferenceAvailable(boolean calorieDifferenceAvailable) {
        Data.calorieDifferenceAvailable = calorieDifferenceAvailable;
    }

    public static int getAverageCalorieDeficit() {
        return averageCalorieDeficit;
    }

    public static void setAverageCalorieDeficit(int averageCalorieDeficit) {
        Data.averageCalorieDeficit = averageCalorieDeficit;
    }

    public static boolean isAverageCalorieDeficitAvailable() {
        return averageCalorieDeficitAvailable;
    }

    public static void setAverageCalorieDeficitAvailable(boolean averageCalorieDeficitAvailable) {
        Data.averageCalorieDeficitAvailable = averageCalorieDeficitAvailable;
    }

    public static double getWantedWeight() {
        return wantedWeight;
    }

    public static void setWantedWeight(double wantedWeight) {
        Data.wantedWeight = wantedWeight;
    }

    public static boolean isWantedWeightAvailable() {
        return wantedWeightAvailable;
    }

    public static void setWantedWeightAvailable(boolean wantedWeightAvailable) {
        Data.wantedWeightAvailable = wantedWeightAvailable;
    }
}