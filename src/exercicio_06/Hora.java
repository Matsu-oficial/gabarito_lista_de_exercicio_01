package exercicio_06;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = verificarHora(horas);
        this.minutos = verificarMinuto(minutos);
        this.segundos = verificarSegundo(segundos);
    }

    private int verificarSegundo(int segundos) {
        return verificarMinuto(segundos);
    }

    private int verificarMinuto(int minutos) {
        return (minutos >= 0 && minutos <= 59 ? minutos : 0);
    }

    private int verificarHora(int horas) {
        return (horas >= 0 && horas <= 23 ? horas : 0);
    }

    public String formatar() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    }

