public class Relogio {
    private int segundos;
    private int minutos;
    private int horas;

    public Relogio() {
        setSegundos(0);
        setMinutos(0);
        setHoras(0);
    }

    public Relogio(
            int segundos,
            int minutos,
            int horas) {
        setSegundos(segundos);
        setMinutos(minutos);
        setHoras(horas);
    }

    // Getters

    public int getSegundos() {
        return segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getHoras() {
        return horas;
    }

    // Setters

    public int setSegundos(int segundos) {
        this.segundos = segundos;
        return segundos;
    }

    public int setMinutos(int minutos) {
        this.minutos = minutos;
        return minutos;
    }

    public int setHoras(int horas) {
        this.horas = horas;
        return horas;
    }
}