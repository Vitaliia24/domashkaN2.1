package ru.skypro;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int skillMagic, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, skillMagic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() + ", обладает умом " + mind +
                ", мудростью " + wisdom +
                ", остроумием " + wit +
                " и творчеством " + creation;
    }

    public void compareStudentRavenclaw (Ravenclaw student) {
        if (this.getMind() > student.getMind()) {
            System.out.println("Ум " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getMind() < student.getMind()) {
            System.out.println("Ум " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Ум " + this.getName() + " такой же, как у " + student.getName());
        }

        if (this.getWisdom() > student.getWisdom()) {
            System.out.println("Мудрость " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getWisdom() < student.getWisdom()) {
            System.out.println("Мудрость " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Мудрость " + this.getName() + " равна мудрости " + student.getName());
        }

        if (this.getWit() > student.getWit()) {
            System.out.println("Остроумие " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getWit() < student.getWit()) {
            System.out.println("Остроумие " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Остроумие " + this.getName() + " равно остроумию " + student.getName());
        }

        if (this.getCreation() > student.getCreation()) {
            System.out.println("Творчество " + this.getName() + " выше, чем у " + student.getName());
        } else if (this.getCreation() < student.getCreation()) {
            System.out.println("Творчество " + student.getName() + " выше, чем у " + this.getName());
        } else {
            System.out.println("Творчество " + this.getName() + " равно творчеству " + student.getName());
        }
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }
}
