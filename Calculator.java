//Boo!!

public class Calculator {

    public void exec(int selection){
        if(!Data.isAdmin()){
            if(selection <= (Data.getModeAvailability().length - 1)){
                if(Data.getModeAvailability()[selection] == false){
                    Main.exit(true, 2);
                }
            } else {
                Main.exit(true, 1);
            }
        }
        switch (selection){
            case 1 -> BMI.calculate();
            case 2 -> BMR.calculate();
            case 3 -> BFP.calculate();
            case 4 -> WHR.calculate();
            case 5 -> IDW.calculate();
            case 6 -> CAL.calculate();
            case 7 -> WLT.calculate();
            default -> Main.exit(true, 1);
        }
    }
}