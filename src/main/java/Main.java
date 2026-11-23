import java.util.Scanner;

public class Main {

    static Relogio relogio = new Relogio(0, 0, 24);
    static int segundos;
    static int minutos;
    static int horas;
    static Scanner sc = new Scanner(System.in);

    public static void addSegundo() {

        if (relogio.getSegundos() < 59) {
            segundos = relogio.getSegundos() + 1;
            relogio.setSegundos(segundos);
        } else {
            segundos = 0;
            relogio.setSegundos(segundos);
            addMinuto();
        }
    }

    public static void addMinuto() {

        if (relogio.getMinutos() < 59) {
            minutos = relogio.getMinutos() + 1;
            relogio.setMinutos(minutos);
        } else {
            minutos = 0;
            relogio.setMinutos(minutos);
            addHora();

        }
    }

    public static void addHora() {

        if (relogio.getHoras() < 23) {
            horas = relogio.getHoras() + 1;
            relogio.setHoras(horas);
        } else {
            minutos = 0;
            relogio.setHoras(horas);
        }
    }

    public static void remSegundo() {

        if (relogio.getSegundos() > 0) {
            segundos = relogio.getSegundos() - 1;
            relogio.setSegundos(segundos);
        } else {
            segundos = 59;
            relogio.setSegundos(segundos);
            remMinuto();
        }
    }

    public static void remMinuto() {

        if (relogio.getMinutos() > 0) {
            minutos = relogio.getMinutos() - 1;
            relogio.setMinutos(minutos);
        } else {
            minutos = 59;
            relogio.setMinutos(minutos);
            remHora();
        }
    }

    public static void remHora() {

        if (relogio.getHoras() > 0) {
            horas = relogio.getHoras() - 1;
            relogio.setHoras(horas);
        } else {
            System.out.println("AAAH! Acabou o tempo!");
            relogio.setHoras(6);
            relogio.setMinutos(6);
            relogio.setSegundos(6);
        }
    }

    public static void mostrarTempo() {
        System.out.println(
                "\nHora: " + relogio.getHoras() + "\nMinutos: " + relogio.getMinutos() + "\nSegundos "
                        + relogio.getSegundos());
    }

    public static void main(String[] args) {
        int opcao = 0;
        do {
            System.out.println("\nMANIPULE O TEMPO!\n===========\nEscolha como manipular o tempo:");
            System.out.println("1 - Adicionar 1 Segundo");
            System.out.println("2 - Adicionar 1 Minuto");
            System.out.println("3 - Adicionar 1 Hora");
            System.out.println("4 - Remover 1 Segundo");
            System.out.println("5 - Remover 1 Minuto");
            System.out.println("6 - Remover 1 Hora");
            System.out.println("99 - Mostrar o Tempo");

            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    addSegundo();
                    break;
                case 2:
                    addMinuto();
                    break;
                case 3:
                    addHora();
                    break;
                case 4:
                    remSegundo();
                    break;
                case 5:
                    remMinuto();
                    break;
                case 6:
                    remHora();
                    break;
                case 99:
                    mostrarTempo();
                    break;
                default:
                    System.out.println("\nOpção Inválida! X_X");
                    break;
            }
        } while (opcao != 0);
        sc.close();
    }
}