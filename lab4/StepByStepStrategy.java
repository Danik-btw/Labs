public class StepByStepStrategy extends Strategy {
    private double timeForStep;

    public double getTimeForStep() {
        return timeForStep;
    }

    public StepByStepStrategy(double timeForStep) {
        this.timeForStep = timeForStep;
    }

    public StepByStepStrategy() {
    }

    public StepByStepStrategy(int releaseYear, int rate, String os, int maxNumberOfUnits, int numberOfMaps, boolean mapCreateAbility, double timeForStep) {
        super(releaseYear, rate, os, maxNumberOfUnits, numberOfMaps, mapCreateAbility);
        this.timeForStep = timeForStep;
    }

    public String name() {
        return "XCOM";
    }

    public void print() {
        System.out.println("Name : " + name() + ", release year : " + getReleaseYear()
                + ", rate : " + getRate() + ", os : " + getOs() + ", max number of units :" + getMaxNumberOfUnits() +
                ", number of maps : " + getNumberOfMaps() + ", ability to create maps : " + isMapCreateAbility() + ", time for step : " + timeForStep);
    }
}
