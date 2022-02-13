package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 89,79,13,67, 66);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер",31,64,35,55,55);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли",37,55,66,12,12);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг",66,33,34,45,66,86);
        Ravenclaw parvatiPatil = new Ravenclaw("Парвати Патил",66,82,12,88,33, 55);
        Ravenclaw marcusBelbi = new Ravenclaw("Маркус Белби",78,46,43,49,86,45);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит",36,38,35,94,26);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори",49,76,37,61,67);
        Hufflepuff justinFletchley = new Hufflepuff("Джастин Финч-Флетчли",94,61,62,94,65);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой",37,38,93,68,32,55,55);
        Slytherin grahamMontagu = new Slytherin("Грехэм Монтегю",55,53,86,81,34,45,22);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",41,52,83,64,38,37,44);

        System.out.println("harryPotter = " + harryPotter);
        System.out.println();

        System.out.println("dracoMalfoy = " + dracoMalfoy);
        System.out.println();

        harryPotter.compareStudentGryffindor(ronWeasley);
        System.out.println();

        parvatiPatil.compareStudentRavenclaw (zhouChang);
        System.out.println();

        hermioneGranger.compareStudents(gregoryGoyle);
        System.out.println();
    }


}
