package lab31;

import Posuda.*;

public class Main {

    public static void main(String[] args) {
        Castrula castrula = new Castrula("Завод кастрюль", 100, "Цветной", 8, true);
        Skovoroda skovoroda = new Skovoroda("Завод сковородок", 80, "Черный");
        Tarelka tarelka = new Tarelka("Завод тарелок", 12, "Белый", 7);

        castrula.name("Глубочайшая кастрюля");
        skovoroda.name("Просто сковорода");
        tarelka.name("Широчайшая тарелка");

        castrula.printInfo(castrula);
        skovoroda.printInfo(skovoroda);
        tarelka.printInfo(tarelka);
    }
}
