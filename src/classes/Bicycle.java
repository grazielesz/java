package classes;

public abstract class Bicycle implements CarbonFootprint {
    private double yearlyKM;
    private final int caloriesPerKM = 34;

    public Bicycle(double KM) { 
        yearlyKM = KM;
    }

    public double getYearlyKM() {
        return yearlyKM;
    }

    public void setYearlyMiles(double KM) {
        yearlyKM = KM;
    }

    @Override
    public int getCarbonFootprint() {
        return (int) (yearlyKM * caloriesPerKM);
    }

}