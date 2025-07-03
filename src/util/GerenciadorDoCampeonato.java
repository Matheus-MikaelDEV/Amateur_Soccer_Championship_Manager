package util;

import entities.Campeonato;
import entities.Partida;
import entities.Time;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDoCampeonato {
    private List<Partida> partidas = new ArrayList<>();

    boolean possivel = false;

    public boolean possivel(LocalDateTime data, String local, Campeonato campeonato, String time1, String time2)  {
        boolean time1Existe = false;
        boolean time2Existe = false;

        boolean possivel = false;

        for (Time timeExiste : campeonato.getTimes()) {
            if (timeExiste.getNome().equals(time1)) {
                time1Existe = true;
            }

            if (timeExiste.getNome().equals(time2)) {
                time2Existe = true;
            }
        }

        if (time1Existe && time2Existe) {
            possivel = true;
        } else {
            possivel = false;
        }

        return possivel;
    }

    public boolean addPartida(Partida partida, Boolean possivel) {
        boolean adicionado = false;

        if (possivel) {
            partidas.add(partida);
            adicionado = true;
        } else {
            adicionado = false;
        }

        return adicionado;
    }

    public boolean removerPartida(int opcao) {
        boolean removido = false;

        if (partidas.isEmpty() || partidas == null) {
            removido = false;
        } else {
            for (int i = 0; i < partidas.size(); i++) {
                if (i == opcao - 1) {
                    partidas.remove(i);
                    removido = true;
                }
            }
        }

        return removido;
    }

    public String listarPartidas() {
        StringBuilder sb = new StringBuilder();

        sb.append(partidas.size() + "\n");
        for (Partida partida : partidas) {
            int i = 0;
            sb.append(i + 1);
            sb.append(" - " + partida);
            i++;
        }

        return sb.toString();
    }
}
