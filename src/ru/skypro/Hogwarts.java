package ru.skypro;

public class Hogwarts {
    private int skillMagic;
    private int transgression;
    private String name;

    public Hogwarts(String name, int skillMagic, int transgression) {
        this.name = name;
        this.skillMagic = skillMagic;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Студент " + name +
                " обладает силой магии " + skillMagic +
                " и может трансгрессировать на расстояние " + transgression;
    }

    public void compareStudents (Hogwarts student) {
        if (this.getSkillMagic()>student.getSkillMagic()) {
            System.out.println(this.getName() + " обладает большей силой магии, чем " + student.getName());
        } else if (this.getSkillMagic()==student.getSkillMagic()) {
            System.out.println("Сила магии студента " + this.getName() +
                    " равна силе магии студента " + student.getName());
        } else {
            System.out.println(student.getName() + " обладает большей силой магии, чем " + this.getName());
        }
        if (this.getTransgression()>student.getTransgression()) {
            System.out.println(this.getName() + " трансгрессирует на большее расстояние, чем "
                    + student.getName());
        } else if (this.getTransgression()==student.getTransgression()) {
            System.out.println(this.getName() + " и " + student.getName() +
                    " могут трансгрессировать на одинаковое расстояние");
        } else {
            System.out.println(student.getName() + " трансгрессирует на большее расстояние, чем "
                    + this.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkillMagic() {
        return skillMagic;
    }

    public void setSkillMagic(int skillMagic) {
        this.skillMagic = skillMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
