package Posuda;

public class Posuda {
    protected String creator;
    protected int price;
    protected String style;

    public Posuda(String creator, int price, String style) {
        this.creator = creator;
        this.price = price;
        this.style = style;
    }

    public Posuda() {
        this.creator = "";
        this.price = 0;
        this.style = "обычный";
    }

    public String getCreator() {
        return creator;
    }
    public int getPrice() {
        return price;
    }
    public String getStyle() {
        return style;
    }

    public void name(String name) { }       //метод для переопределения

    public void printInfo(Posuda object) {
        System.out.printf("Производитель: " + getCreator() + "\n" +
                        "Цена: " + getPrice() + "\n" +
                        "Стиль: " + getStyle() + "\n");
    }
}

