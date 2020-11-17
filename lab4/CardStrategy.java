public class CardStrategy extends Strategy {
    private int numberOfCards;

    public CardStrategy(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    public CardStrategy() {
    }

    public CardStrategy(int releaseYear, int rate, String os, int maxNumberOfUnits, int numberOfMaps, boolean mapCreateAbility, int numberOfCards) {
        super(releaseYear, rate, os, maxNumberOfUnits, numberOfMaps, mapCreateAbility);
        this.numberOfCards = numberOfCards;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public String name() {
        return "Card wars";
    }

    public void print() {
        System.out.println("Name : " + name() + ", release year : " + getReleaseYear()
                + ", rate : " + getRate() + ", os : " + getOs() + ", max number of units :" + getMaxNumberOfUnits() +
                ", number of maps : " + getNumberOfMaps() + ", ability to create maps : " + isMapCreateAbility() + ", number of cards : " + numberOfCards);
    }
}
