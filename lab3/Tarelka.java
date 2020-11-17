package Posuda;

public class Tarelka extends Posuda {
    private int diametr;
    private String nameTarelki;

    public Tarelka(String creator, int price, String style, int diametr) {
        super(creator, price, style);

        this.diametr = diametr;
    }

    public Tarelka(String creator, int price, String style) {
        super(creator, price, style);

        this.diametr = 0;
    }

    public Tarelka() {
        super();

        this.diametr = 0;
    }

    public int getDiametr() {
        return diametr;
    }

    public String getNameTarelki() {
        return nameTarelki;
    }

    @Override
    public void name(String name) {
        this.nameTarelki = name;
    }

    @Override
    public void printInfo(Posuda object) {
        System.out.printf("Тарелка.\n" +
                "Имя: %s;\n", getNameTarelki());
        super.printInfo(object);
        System.out.printf("Диаметр: %d;\n",
                getDiametr());
        System.out.println("");
    }
}
