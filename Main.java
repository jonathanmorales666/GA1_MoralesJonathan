package main;

public class Main {
    public static void main(String[] args) {
        habitat habitatSabana = new habitat("Sabana", 5000.0);
        habitat habitatOceano = new habitat("Océano", 10000.0);
        habitat habitatMontana = new habitat("Montaña", 8000.0);

        leon leon = new leon("Simba", 5, 190.0, "Sabana", "Marrón oscuro", 110, true);
        delfin delfin = new delfin("Flipper", 8, 300.0, "Océano", "Gris", 360, 40.0);
        aguila aguila = new aguila("Aquila", 10, 5.0, "Montaña", 2.5, true, "Árbol alto");
        cuidador cuidador = new cuidador("Juan", "Matutino");

        System.out.println("=== INFORMACIÓN DEL ZOOLÓGICO ===\n");

        System.out.println("--- LEÓN ---");
        System.out.println(leon);
        leon.comer();
        leon.amamantar();
        leon.rugir();
        System.out.println();

        System.out.println("--- DELFÍN ---");
        System.out.println(delfin);
        delfin.comer();
        delfin.amamantar();
        delfin.saltar();
        System.out.println();

        System.out.println("--- ÁGUILA ---");
        System.out.println(aguila);
        aguila.comer();
        aguila.volar();
        aguila.cazar();
        System.out.println();

        System.out.println("--- HÁBITATS ---");
        habitatSabana.describirClima();
        habitatOceano.describirClima();
        habitatMontana.describirClima();
        System.out.println();

        System.out.println("--- CUIDADOR ---");
        System.out.println(cuidador);
        cuidador.alimentar();
    }
}