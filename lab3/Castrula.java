package Posuda;

public class Castrula extends Posuda {      //Наследование от Posuda
    private int volume;
    private boolean hasCrishka;
    private String nameCastruli;

    public Castrula(String creator, int price, String style, int volume, boolean hasCrishka) {
        super(creator, price, style);               //вызов конструктора класса родителя

        this.volume = volume;
        this.hasCrishka = hasCrishka;
    }

    public Castrula(String creator, int price, String style) {
        super(creator, price, style);

        this.volume = 0;
        this.hasCrishka = false;
    }

    public Castrula() {
        super();

        this.volume = 0;
        this.hasCrishka = false;
    }

    public int getVolume() {
        return volume;
    }

    public boolean hasCrishka() {
        return hasCrishka;
    }

    public String getNameCastruli() {
        return nameCastruli;
    }

    @Override
    public void name(String name) {
        this.nameCastruli = name;
    }      //переопределение метода родителя

    @Override
    public void printInfo(Posuda object) {
        System.out.printf("Кастрюля.\n" +
                "Имя: %s;\n", getNameCastruli());
        super.printInfo(object);                      //вызов метода класса родителя
        System.out.printf("Объём: %d;\n" +
                        "Наличие крышки: %s;\n",
                getVolume(), hasCrishka());
        System.out.println("");
    }
}
