package Lesson6;

public class Notebook {
    int id;
    String madeIn;
    String model;
    int ram;
    int hdd;
    int prise;
    String color;

    @Override
    public String toString() {
        return String.format(
            "id: %d Made in: %s model: %s RAM: %d Gb HD: %d Gb Color: %s Prise: %d",
            id, madeIn, model, ram, hdd, color, prise);
    }
}
