//Boo!!

import java.util.Scanner;

public class Main {
    //Global objects & classes:
    static Data data = new Data();
    static Calculator calc = new Calculator();
    static Scanner scanner = new Scanner(System.in);

    //Global variables:
    static final String LASTUPDATE = "15.01.25";
    static final String VERSION = "1.0";
    static final String DIVIDER = "----------------------------------------";
    static final String NAME = "FitnessCalculatorPlus";

    public static void main(String[] args) {
        System.out.println("++++" + NAME + "++++");
        System.out.println("Version: " + VERSION + " / Last Updated: " + LASTUPDATE);
    }
}