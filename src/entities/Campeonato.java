package entities;

import entities.enums.Cor;
import entities.enums.Divisao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nome;
    private String descricao;

    private List<Time> times = new ArrayList<Time>();

    public Campeonato(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void addTime(Time time) {
        this.times.add(time);
    }

    public boolean removerTime(String nome) {
        boolean removido = false;

        if (this.times.isEmpty()) {
            removido = false;
        } else {
            this.times.removeIf(t -> t.getNome().equalsIgnoreCase(nome));
            removido = true;
        }

        return removido;
    }

    public boolean atualizarTime(String velhoNome, String NovoNome, Divisao divisao, Cor cor, LocalDate fundacao) {
        boolean atualizado = false;

        if (this.times.isEmpty()) {
            atualizado = false;
        } else {
            for (Time time : times) {
                if (time.getNome().equalsIgnoreCase(velhoNome)) {
                    time.setNome(NovoNome);
                    time.setDivisao(divisao);
                    time.setCor(cor);
                    time.setFundacao(fundacao);

                    atualizado = true;
                }
            }
        }

        return atualizado;
    }

    public boolean atualizarJogadores (String timeNome, String velhoNome, String NovoNome, Integer idade, Integer camisa) {
        boolean atualizado = false;

        if (this.times.isEmpty()) {
            atualizado = false;
        } else {
            for (Time time : times) {
                if (time.getNome().equalsIgnoreCase(timeNome)) {
                    for (Jogador jogador : time.getJogadores()) {
                        if (jogador.getNome().equalsIgnoreCase(velhoNome)) {
                            atualizado = true;
                            jogador.setNome(NovoNome);
                            jogador.setIdade(idade);
                            jogador.setNumeroDaCamisa(camisa);
                        }
                    }
                }
            }
        }
        return atualizado;
    }

    public String listaDeJogadores() {
        StringBuilder sb = new StringBuilder();
        for (Time time : times) {
            sb.append(time.getNome());
            sb.append(" - Jogadores:\n");
            for (Jogador jogador : time.getJogadores()) {
                sb.append(jogador.getNome());
                sb.append(" - ");
                sb.append(jogador.getIdade());
                sb.append(" - ");
                sb.append(jogador.getNumeroDaCamisa());
            }
        }

        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Time> getTimes() {
        return times;
    }
}
