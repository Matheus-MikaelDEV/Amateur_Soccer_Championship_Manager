package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Partida {
    private LocalDateTime data;
    private String local;

    private Campeonato campeonato;

    private String time1, time2;

    public Partida(LocalDateTime data, String local, Campeonato campeonato, String time1, String time2) {
        this.data = data;
        this.local = local;
        this.campeonato = campeonato;
        this.time1 = time1;
        this.time2 = time2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        sb.append(data.format(formatter));
        sb.append("\n" + local);
        sb.append("\n" + time1);
        sb.append("\n" + time2);

        return sb.toString();
    }
}
