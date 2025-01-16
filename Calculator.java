//Boo!!

public class Calculator {

    public void exec(int selection){
        if(!Data.isAdmin()){
            if(Data.getModeAvailability()[selection] == false){
                Main.exit(true, 2);
            }
        }
        switch (selection){
            case 1 -> BMI.calculate();
            case 2 -> BMR.calculate();
            default -> Main.exit(true, 1);
        }
    }
}
