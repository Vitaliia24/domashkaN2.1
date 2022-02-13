package ru.skypro;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int skillMagic, int transgression,
                     int cunning, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super(name, skillMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + ", обладает хитростью " + cunning +
                ", решительностью " + determination +
                ", амбициозностью " + ambition +
                ", находчивостью " + resourcefulness +
                " и жаждой власти " + lustForPower;
    }

    public void compareStudentSlytherin (Slytherin student) {
        if (this.getCunning() > student.getCunning()) {
            System.out.println("Хитрость " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getCunning() < student.getCunning()) {
            System.out.println("Хитрость " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Хитрость " + this.getName() + " равна хитрости " + student.getName());
        }

        if (this.getDetermination() > student.getDetermination()) {
            System.out.println("Решительность " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getDetermination() < student.getDetermination()) {
            System.out.println("Решительность " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Решительность " + this.getName() + " равна решительности " + student.getName());
        }

        if (this.getAmbition() > student.getAmbition()) {
            System.out.println("Амбициозность " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getAmbition() < student.getAmbition()) {
            System.out.println("Амбициозность " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Амбициозность " + this.getName() + " равна амбициозности " + student.getName());
        }

        if (this.getResourcefulness() > student.getResourcefulness()) {
            System.out.println("Находчивость " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getResourcefulness() < student.getResourcefulness()) {
            System.out.println("Находчивость " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Находчивость " + this.getName() + " равна находчивости " + student.getName());
        }

        if (this.getLustForPower() > student.getLustForPower()) {
            System.out.println("Жажда власти " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getLustForPower() < student.getLustForPower()) {
            System.out.println("Жажда власти " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Жажда власти " + this.getName() + " равна жажде власти " + student.getName());
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
}
