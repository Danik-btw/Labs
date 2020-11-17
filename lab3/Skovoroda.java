package Posuda;

public class Skovoroda extends Posuda {
    private int lenght;
    private String pokritie;
    private String nameSkovorodi;

    public Skovoroda(String creator, int price, String style, int lenght, String pokritie) {
        super(creator, price, style);

        this.lenght = lenght;
        this.pokritie = pokritie;
    }

    public Skovoroda(String creator, int price, String style) {
        super(creator, price, style);

        this.lenght = 0;
        this.pokritie = "Norm";
    }

    public Skovoroda() {
        super();

        this.lenght = 0;
        this.pokritie = "Norm";
    }

    public int getLenght() {
        return lenght;
    }

    public String getPokritie() {
        return pokritie;
    }

    public String getNameSkovorodi() {
        return nameSkovorodi;
    }

    @Override
    public void name(String name) {
        this.nameSkovorodi = name;
    }

    @Override
    public void printInfo(Posuda object) {
        System.out.printf("Сковорода.\n" +
                "Имя: %s;\n", getNameSkovorodi());
        super.printInfo(object);
        System.out.printf("Длина ручки: %d;\n" +
                        "Тип покрытия: %s;\n",
                getLenght(), getPokritie());
        System.out.println("");
    }
}
