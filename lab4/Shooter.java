public class Shooter implements Game, Object {
    private int numberOfLevels;
    private String typeOfWeapon;
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

    public String name() {
        return "CoD 3";
    }

    public int getNumberOfLevels() {
        return numberOfLevels;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public Shooter(String os, String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
        this.os = os;
    }

    public Shooter(int releaseYear, int rate, String os, int numberOfLevels, String typeOfWeapon) {
        this.numberOfLevels = numberOfLevels;
        this.typeOfWeapon = typeOfWeapon;
        this.releaseYear = releaseYear;
        this.rate = rate;
        this.os = os;
    }

    public Shooter() {
    }

    public void print() {
        System.out.println("Name : " + name() + ", release year : " + releaseYear + ", rate : "
                + rate + ", os : " + os + ", number of levels : " + numberOfLevels + ", type of weapon : " + typeOfWeapon);

    }

}
