//Boo!!

import java.util.Scanner;

public class BMR{
    static Scanner scanner = new Scanner(System.in);

    public static void calculate(){
        System.out.println("++ Basal-Metabolic-Rate Calculator ++\n");

        if(!(Data.isAgeAvailable() && Data.isGenderAvailable() && Data.isWeightAvailable() && Data.isHeightAvailable())){
            System.out.println("Please enter following data:\n");

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

            if(!(Data.isAgeAvailable())){
                System.out.print("Age [1-99]: ");
                int temp = scanner.nextInt();
                if(temp == -1){
                    Main.RTM();
                } else {
                    Data.setAge(temp);
                }
                scanner.nextLine();
                if(temp < 1 || temp > 99){
                    Main.exit(true, 1);
                }
                Data.setAgeAvailable(true);
            }

            if(!(Data.isHeightAvailable())){
                System.out.print("Height [cm]: ");
                double temp = scanner.nextDouble();
                if(temp == -1){
                    Main.RTM();
                } else {
                    Data.setHeight(temp / 100);
                }
                scanner.nextLine();
                Data.setHeightAvailable(true);
            }

            if (!Data.isWeightAvailable()){
                System.out.print("Weight [kg]: ");
                double temp = scanner.nextDouble();
                if(temp == -1){
                    Main.RTM();
                } else {
                    Data.setWeight(temp);
                }
                scanner.nextLine();
                Data.setWeightAvailable(true);
            }

            System.out.println();
        }

        int result;

        if(Data.getGender() == 'M'){
            result = (int) ((int) (10 * Data.getWeight()) + (6.25 * (Data.getHeight() * 100)) - (5 * Data.getAge()) + 5);
        } else {
            result = (int) ((int) (10 * Data.getWeight()) + (6.25 * (Data.getHeight() * 100)) - (5 * Data.getAge()) - 161);
        }

        System.out.println("Result: " + result + " calories");

        Main.restart();
    }
}