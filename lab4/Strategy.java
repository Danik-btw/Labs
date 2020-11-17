public abstract class Strategy implements Game, Object {
    private int maxNumberOfUnits;
    private int numberOfMaps;
    private boolean mapCreateAbility;
    private int releaseYear;
    private int rate;
    private String os;

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getRate() {
        return rate;
    }

    public String getOs() {
        return os;
    }

    public int getMaxNumberOfUnits() {
        return maxNumberOfUnits;
    }

    public int getNumberOfMaps() {
        return numberOfMaps;
    }

    public boolean isMapCreateAbility() {
        return mapCreateAbility;
    }

    public Strategy(int releaseYear, int rate, String os, int maxNumberOfUnits, int numberOfMaps, boolean mapCreateAbility) {
        this.maxNumberOfUnits = maxNumberOfUnits;
        this.numberOfMaps = numberOfMaps;
        this.mapCreateAbility = mapCreateAbility;
        this.releaseYear = releaseYear;
        this.rate = rate;
        this.os = os;
    }

    public Strategy() {
    }

}
