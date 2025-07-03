package entities;

import entities.enums.Cor;
import entities.enums.Divisao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private Divisao divisao;
    private Cor cor;
    private LocalDate fundacao;

    private List<Jogador> jogadores = new ArrayList<>();
    private List<Jogador> jogadoresReservas = new ArrayList<>();

    public Time(String nome, Divisao divisao, Cor cor, LocalDate fundacao) {
        this.nome = nome;
        this.divisao = divisao;
        this.cor = cor;
        this.fundacao = fundacao;
    }

    public void addJogadores(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void addJogadoresReservas(Jogador jogador) {
        this.jogadoresReservas.add(jogador);
    }

    public String getNome() {
        return nome;
    }

    public Divisao getDivisao() {
        return divisao;
    }

    public Cor getCor() {
        return cor;
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public List<Jogador> getJogadoresReservas() {
        return jogadoresReservas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDivisao(Divisao divisao) {
        this.divisao = divisao;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public void setFundacao(LocalDate fundacao) {
        this.fundacao = fundacao;
    }
}
