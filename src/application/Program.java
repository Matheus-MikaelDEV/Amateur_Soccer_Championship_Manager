package application;

import entities.Campeonato;
import entities.Partida;
import util.GerenciadorDoCampeonato;
import entities.Jogador;
import entities.Time;
import entities.enums.Cor;
import entities.enums.Divisao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Gerenciamento de Campeonato Amador de Futebol");

        System.out.print("Qual o nome do campeonato? ");
        String nome = sc.nextLine();
        System.out.print("Descrição do campeonato: ");
        String descricao = sc.nextLine();

        Campeonato campeonato = new Campeonato(nome, descricao);
        GerenciadorDoCampeonato gerenciador  = new GerenciadorDoCampeonato();

        int opcao = 0;

        do {
            System.out.println("Menu: ");
            System.out.println("1 - Menu de Time\n2 - Menu de Jogadores\n3 - Menu de Partidas\n4 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    int opcaoDeTime = 0;

                    //Menu do time
                    do {
                        System.out.println("Menu de Time: ");
                        System.out.println("1 - Adicionar Time\n2 - Remover Time\n3 - Atualizar Time\n4 - Sair");
                        opcaoDeTime = sc.nextInt();
                        sc.nextLine();

                        String nomeDoTime = "";

                        switch (opcaoDeTime) {
                            case 1:
                                System.out.print("Qual o nome do time? ");
                                nomeDoTime = sc.nextLine();
                                System.out.print("Qual a divisão do time? ");
                                Divisao divisao = Divisao.valueOf(sc.nextLine().toUpperCase().replace("É", "E").replace(" ", "_"));
                                System.out.print("Qual a cor do time? ");
                                Cor cor = Cor.valueOf(sc.nextLine().toUpperCase());
                                System.out.print("Qual a data de fundação do time (dd/MM/yyyy)? ");
                                String data = sc.nextLine();

                                Time time = new Time(nomeDoTime, divisao, cor, LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                                System.out.println("Cadastro dos 11 titulares");

                                for (int i = 0; i < 11; i++){
                                    System.out.printf("Nome do %d° jogador: ", i + 1);
                                    String nomeDoJogador = sc.nextLine();
                                    System.out.printf("Idade do %d° jogador: ", i + 1);
                                    Integer idade = sc.nextInt();
                                    sc.nextLine();
                                    System.out.printf("Camisa do %d° jogador: ", i + 1);
                                    Integer camisa = sc.nextInt();
                                    sc.nextLine();

                                    Jogador jogador = new Jogador(nomeDoJogador, idade, camisa);

                                    time.addJogadores(jogador);
                                }

                                System.out.println("Cadastro dos 7 reservas");

                                for (int i = 0; i < 7; i++){
                                    System.out.printf("Nome do %d° jogador: ", i + 1);
                                    String nomeDoJogador = sc.nextLine();
                                    System.out.printf("Idade do %d° jogador: ", i + 1);
                                    Integer idade = sc.nextInt();
                                    sc.nextLine();
                                    System.out.printf("Camisa do %d° jogador: ", i + 1);
                                    Integer camisa = sc.nextInt();
                                    sc.nextLine();

                                    Jogador jogador = new Jogador(nomeDoJogador, idade, camisa);

                                    time.addJogadores(jogador);
                                }

                                campeonato.addTime(time);

                                System.out.println("Time cadastrado com sucesso!");
                                break;
                            case 2:
                                System.out.print("Qual o nome do time que deseja remover? ");
                                nomeDoTime = sc.nextLine();

                                campeonato.removerTime(nomeDoTime);

                                if (campeonato.removerTime(nomeDoTime)){
                                    System.out.println("Time removido com sucesso!");
                                } else {
                                    System.out.println("Erro ao remover time!");
                                }
                                break;
                            case 3:
                                System.out.print("Qual time deseja atualizar? ");
                                nomeDoTime = sc.nextLine();

                                System.out.print("Qual time deseja atualizar? ");
                                String novoNomeTime = sc.nextLine();
                                System.out.print("Qual a divisão do time? ");
                                Divisao novaDivisao = Divisao.valueOf(sc.nextLine().toUpperCase());
                                System.out.print("Qual a cor do time? ");
                                Cor novaCor = Cor.valueOf(sc.nextLine().toUpperCase());
                                System.out.print("Qual a data de fundação do time (dd/MM/yyyy)? ");
                                String novaData = sc.nextLine();

                                campeonato.atualizarTime(nomeDoTime, novoNomeTime, novaDivisao, novaCor, LocalDate.parse(novaData, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                                if (campeonato.atualizarTime(nomeDoTime, novoNomeTime, novaDivisao, novaCor, LocalDate.parse(novaData, DateTimeFormatter.ofPattern("dd/MM/yyyy")))) {
                                    System.out.println("Time atualizado com sucesso!");
                                } else {
                                    System.out.println("Erro ao atualizar time!");
                                }
                                break;
                            case 4:
                                System.out.println("Retornando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (opcaoDeTime != 4);
                    break;

                //menu do jogador
                case 2:
                    int opcaoMenuJogador = 0;

                    do {
                        System.out.println("Menu de Jogadores: ");
                        System.out.println("1 - Editar Jogador\n2 - Listar Jogadores\n3 - Voltar ao Menu Principal");
                        opcaoMenuJogador = sc.nextInt();
                        sc.nextLine();

                        switch (opcaoMenuJogador){
                            case 1:
                                System.out.print("Nome do time que deseja alterar o jogador? ");
                                String nomeDoTime = sc.nextLine();

                                System.out.print("Qual o nome do jogador que deseja editar? ");
                                String jogadorAntigo = sc.nextLine();

                                System.out.print("Qual o novo nome do jogador? ");
                                String jogadorNovo = sc.nextLine();
                                System.out.print("Qual a idade do jogador? ");
                                Integer idade = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Qual o camisa do jogador? ");
                                Integer camisa = sc.nextInt();
                                sc.nextLine();

                                campeonato.atualizarJogadores(nomeDoTime, jogadorAntigo, jogadorNovo, idade, camisa);

                                if (campeonato.atualizarJogadores(nomeDoTime, jogadorAntigo, jogadorNovo, idade, camisa)) {
                                    System.out.println("Jogador atualizado com sucesso!");
                                } else {
                                    System.out.println("Erro ao atualizar Jogador!");
                                }
                                break;
                            case 2:
                                System.out.println(campeonato.listaDeJogadores());
                                break;
                            case 3:
                                System.out.println("Retornando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (opcaoMenuJogador != 3);
                    break;
                    case 3:

                        // menu da partida
                        int opcaoPartida = 0;

                        do {
                            System.out.println("Menu de Partidas: ");
                            System.out.println("1 - Adicionar Partida\n2 - Remover Partida\n3 - Listar Partida\n4 - Voltar ao Menu Principal");
                            opcaoPartida = sc.nextInt();
                            sc.nextLine();

                            switch (opcaoPartida){
                                case 1:
                                    System.out.print("Local da partida: ");
                                    String localDaPartida = sc.nextLine();
                                    System.out.print("Data (dd/MM/yyyy HH:mm: ");
                                    String dataPartida = sc.nextLine();
                                    System.out.print("Nome do primeiro time: ");
                                    String nomeDoPrimeiroTime = sc.nextLine();
                                    System.out.print("Nome do segundo time: ");
                                    String nomeDoSegundoTime = sc.nextLine();

                                    Partida partida = new Partida(LocalDateTime.parse(dataPartida, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")), localDaPartida, campeonato, nomeDoPrimeiroTime, nomeDoSegundoTime);

                                    gerenciador.possivel(LocalDateTime.parse(dataPartida, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")), localDaPartida, campeonato, nomeDoPrimeiroTime, nomeDoSegundoTime);

                                    if (gerenciador.possivel(LocalDateTime.parse(dataPartida, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")), localDaPartida, campeonato, nomeDoPrimeiroTime, nomeDoSegundoTime)) {
                                        System.out.println("Partida cadastrada com sucesso!");
                                    } else {
                                        System.out.println("Erro ao adicionar Partida!");
                                    }

                                    gerenciador.addPartida(partida, gerenciador.possivel(LocalDateTime.parse(dataPartida, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")), localDaPartida, campeonato, nomeDoPrimeiroTime, nomeDoSegundoTime));
                                    break;
                                case 2:
                                    System.out.println("Partidas: ");
                                    System.out.println(gerenciador.listarPartidas());

                                    System.out.print("Qual vai remover (escolha pelo número): ");
                                    int remover = sc.nextInt();

                                    gerenciador.removerPartida(remover);

                                    if (gerenciador.removerPartida(remover)) {
                                        System.out.println("Partida removida com sucesso!");
                                } else {
                                        System.out.println("Erro ao remover Partida!");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Partidas: ");
                                    System.out.println(gerenciador.listarPartidas());
                                    break;
                                case 4:
                                    System.out.println("Retornando ao menu principal...");
                                    break;
                                default:
                                    System.out.println("Opção inválida!");
                            }
                        } while (opcaoPartida != 4);
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}