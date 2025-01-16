//Boo!!

public class Data {
    //Global variables:
    private boolean adminMode;
    private boolean weightAvailable;
    private double weight;
    private boolean heightAvailable;
    private double height;

    public Data(){
        this.adminMode = false;
        this.weightAvailable = false;
        this.weight = 0;
        this.heightAvailable = false;
        this.height = 0;
    }

    public void resetAvailability(){
        this.weightAvailable = false;
        this.heightAvailable = false;
    
        System.out.println("weightAvailable: " + weightAvailable);
        System.out.println("heightAvailable: " + heightAvailable);
    
        if (!(weightAvailable && heightAvailable)) {
            System.out.println("WORKS");
        } else {
            System.out.println("FAULTY");
        }
    }    

    public boolean isAdminMode() {
        return adminMode;
    }

    public void setAdminMode(boolean adminMode) {
        this.adminMode = adminMode;
    }

    public boolean isWeightAvailable() {
        return weightAvailable;
    }

    public void setWeightAvailable(boolean weightAvailable) {
        this.weightAvailable = weightAvailable;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHeightAvailable() {
        return heightAvailable;
    }

    public void setHeightAvailable(boolean heightAvailable) {
        this.heightAvailable = heightAvailable;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
