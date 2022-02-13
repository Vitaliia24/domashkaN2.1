package ru.skypro;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loalty;
    private int honesty;

    public Hufflepuff(String name, int skillMagic, int transgression, int industriousness, int loalty, int honesty) {
        super(name, skillMagic, transgression);
        this.industriousness = industriousness;
        this.loalty = loalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", обладает трудолюбием " + industriousness +
                ", верностью " + loalty +
                " и честностью " + honesty;
    }

    public void compareStudentHufflepuff (Hufflepuff student) {
        if (this.getIndustriousness() > student.getIndustriousness()) {
            System.out.println("Трудолюбие " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getIndustriousness() < student.getIndustriousness()) {
            System.out.println("Трудолюбие " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Трудолюбие " + this.getName() + " равно трудолюбию " + student.getName());
        }

        if (this.getLoalty() > student.getLoalty()) {
            System.out.println("Верность " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getLoalty() < student.getLoalty()) {
            System.out.println("Верность " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Верность " + this.getName() + " равна верности" + student.getName());
        }

        if (this.getHonesty() > student.getHonesty()) {
            System.out.println("Честность " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getHonesty() < student.getHonesty()) {
            System.out.println("Честность " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Честность " + this.getName() + " равна честности" + student.getName());
        }
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoalty() {
        return loalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
