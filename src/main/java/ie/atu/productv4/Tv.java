package ie.atu.productv4;

public class Tv extends Product {
    private String manufacture;
    private double screenSize;

    public Tv() {
        super();
        manufacture = "";
        screenSize = 0.0;
        count++;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public double getScreenSize() {
        return screenSize;
    }
    @Override
    public String toString() {
        return super.toString() + " by " + manufacture;
    }

    public static int getCount() {
        return count;
    }
}
