//Boo!!

public class Data {
    //Global variables:
    private boolean weightAvailable;
    private double weight;
    private boolean heightAvailable;
    private double height;

    public void reset(){
        //Somehow doesnt reset the availability, needs rework
        this.weightAvailable = false;
        this.heightAvailable = false;
        //Add other booleans
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
