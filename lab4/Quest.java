public class Quest implements Game, Object {
    private int age;
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

    public int getAge() {
        return age;
    }

    public String name() {
        return "Machinarium";
    }

    public Quest(int releaseYear, int rate, String os, int age) {
        this.age = age;
        this.releaseYear = releaseYear;
        this.rate = rate;
        this.os = os;
    }

    public Quest(String os) {
        this.os = os;
    }

    public Quest() {
    }

    public void print() {
        System.out.println("Name : " + name() + ", release year : " + releaseYear + ", rate : " + rate + ", os : " + os + ", age : " + age);
    }


}
