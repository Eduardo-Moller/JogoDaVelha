package jogo;

import java.util.Random;
import java.util.Scanner;

/**
 * @author admin
 */
public class JogoDaVelha2 {

    public static Posicao[][] matriz = {
        {new Posicao(1), new Posicao(2), new Posicao(3)},
        {new Posicao(4), new Posicao(5), new Posicao(6)},
        {new Posicao(7), new Posicao(8), new Posicao(9)}
    };

    static int[] vetorVitoriaJogador1 = new int[9];
    static int[] vetorVitoriaJogador2 = new int[9];
    static String marcadorJogador1;
    static String marcadorJogador2;
    static String nomejogador1;
    static String nomejogador2;

    public static class Posicao {

        boolean selecionado;
        String numPosicao;
        int jogador;

        public Posicao(int numPosicao) {
            this.numPosicao = String.valueOf(numPosicao);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        int cont = 0;
        boolean escolhaValida;
        boolean botJogando;

        do {
            System.out.println("Escolha 1 para jogar Jogador x Jogador e 2 para jogar contra a CPU ");
            int escolhaModoDeJogo = ler.nextInt();

            escolhaValida = escolhaModoDeJogo == 1 || escolhaModoDeJogo == 2;
            botJogando = escolhaModoDeJogo == 2;

            if (!escolhaValida) {
                System.out.println("Escolha invalida");
            }
        } while (!escolhaValida);
        System.out.println("Digite o nome do JOGADOR 1");
        nomejogador1 = ler.next();
        if (!botJogando) {
            System.out.println("Digite o nome do JOGADOR 2");
            nomejogador2 = ler.next();
        }else{
            nomejogador2="CPU";
        }
        System.out.println("Escolha 1 para X ou 2 O ");
        int marcador = ler.nextInt();
        if (marcador == 1) {
            marcadorJogador1 = "X";
            marcadorJogador2 = "O";

        } else {
            marcadorJogador1 = "O";
            marcadorJogador2 = "X";
        }
        imprimirMatriz();
        boolean jogador1Jogando = true;
        boolean ninguemGanhou = true;
        do {
            int posicao;
            if (jogador1Jogando) {
                System.out.println("Digite a posição ao qual o " + nomejogador1 + " deseja jogar");
                posicao = ler.nextInt();
            } else if (!botJogando) {
                System.out.println("Digite a posição ao qual o " + nomejogador2 + " deseja jogar");
                posicao = ler.nextInt();
            } else {
                posicao = random.nextInt(1, 10);
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        
                        if (matriz[i][j].numPosicao.equals(String.valueOf(posicao)) && matriz[i][j].selecionado) {
                            continue;
                        }
                    }
                }
                System.out.println("Bot selecionou: " + posicao);
            }

            if (posicao > 9 || posicao <= 0) {
                System.out.print("Posicão invalida");
                continue;
            }
            switch (posicao) {
                case 1 -> {
                    if (matriz[0][0].selecionado) {
                        System.out.println("Posicão já selecinada");
                        continue;
                    }
                    matriz[0][0].selecionado = true;
                    if (jogador1Jogando) {
                        matriz[0][0].jogador = 1;
                        vetorVitoriaJogador1[0] = 1;
                    } else {
                        matriz[0][0].jogador = 2;
                        vetorVitoriaJogador2[0] = 1;
                    }

                }

                case 2 -> {
                    if (matriz[0][1].selecionado) {
                        System.out.println("Posicão já selecinada");
                        continue;
                    }
                    matriz[0][1].selecionado = true;
                    if (jogador1Jogando) {
                        matriz[0][1].jogador = 1;
                        vetorVitoriaJogador1[1] = 2;
                    } else {
                        matriz[0][1].jogador = 2;
                        vetorVitoriaJogador2[1] = 2;
                    }

                }

                case 3 -> {
                    if (matriz[0][2].selecionado) {
                        System.out.println("Posicão já selecinada");
                        continue;
                    }
                    matriz[0][2].selecionado = true;
                    if (jogador1Jogando) {
                        matriz[0][2].jogador = 1;
                        vetorVitoriaJogador1[2] = 3;
                    } else {
                        matriz[0][2].jogador = 2;
                        vetorVitoriaJogador2[2] = 3;
                    }

                }

                case 4 -> {
                    if (matriz[1][0].selecionado) {
                        System.out.println("Posicão já selecinada");
                        continue;
                    }
                    matriz[1][0].selecionado = true;
                    if (jogador1Jogando) {
                        matriz[1][0].jogador = 1;
                        vetorVitoriaJogador1[3] = 4;
                    } else {
                        matriz[1][0].jogador = 2;
                        vetorVitoriaJogador2[3] = 4;
                    }

                }

                case 5 -> {
                    if (matriz[1][1].selecionado) {
                        System.out.println("Posicão já selecinada");
                        continue;
                    }
                    matriz[1][1].selecionado = true;
                    if (jogador1Jogando) {
                        matriz[1][1].jogador = 1;
                        vetorVitoriaJogador1[4] = 5;
                    } else {
                        matriz[1][1].jogador = 2;
                        vetorVitoriaJogador2[4] = 5;
                    }

                }

                case 6 -> {
                    if (matriz[1][2].selecionado) {
                        System.out.println("Posicão já selecinada");
                        continue;
                    }
                    matriz[1][2].selecionado = true;
                    if (jogador1Jogando) {
                        matriz[1][2].jogador = 1;
                        vetorVitoriaJogador1[5] = 6;
                    } else {
                        matriz[1][2].jogador = 2;
                        vetorVitoriaJogador2[5] = 6;
                    }

                }

                case 7 -> {
                    if (matriz[2][0].selecionado) {
                        System.out.println("Posicão já selecinada");
                        continue;
                    }
                    matriz[2][0].selecionado = true;
                    if (jogador1Jogando) {
                        matriz[2][0].jogador = 1;
                        vetorVitoriaJogador1[6] = 7;
                    } else {
                        matriz[2][0].jogador = 2;
                        vetorVitoriaJogador2[6] = 7;
                    }

                }

                case 8 -> {
                    if (matriz[2][1].selecionado) {
                        System.out.println("Posicão já selecinada");
                        continue;
                    }
                    matriz[2][1].selecionado = true;
                    if (jogador1Jogando) {
                        matriz[2][1].jogador = 1;
                        vetorVitoriaJogador1[7] = 8;
                    } else {
                        matriz[2][1].jogador = 2;
                        vetorVitoriaJogador2[7] = 8;
                    }

                }

                case 9 -> {
                    if (matriz[2][2].selecionado) {
                        System.out.println("Posicão já selecinada");
                        continue;
                    }
                    matriz[2][2].selecionado = true;
                    if (jogador1Jogando) {
                        matriz[2][2].jogador = 1;
                        vetorVitoriaJogador1[8] = 9;
                    } else {
                        matriz[2][2].jogador = 2;
                        vetorVitoriaJogador2[8] = 9;
                    }
                }
                default -> {
                }
            }

            imprimirMatriz();
            jogador1Jogando = !jogador1Jogando;

            if (jogadorGanhou(vetorVitoriaJogador1)) {
                System.out.println("O " + nomejogador1 + " ganhou");
                ninguemGanhou = false;
            } else if (jogadorGanhou(vetorVitoriaJogador2)) {
                System.out.println("O " + nomejogador2 + " ganhou");
                ninguemGanhou = false;
            } else {
                ++cont;
                if (cont == 9) {
                    System.out.println("Deu velha");
                    ninguemGanhou = false;
                }
            }

        } while (ninguemGanhou);
    }

    //valida vitoria do jogador
    private static boolean jogadorGanhou(int[] vetorVitoriaJogador) {
        if (vetorVitoriaJogador[0] == 1 && vetorVitoriaJogador[1] == 2 && vetorVitoriaJogador[2] == 3) {
            return true;
        }
        if (vetorVitoriaJogador[3] == 4 && vetorVitoriaJogador[4] == 5 && vetorVitoriaJogador[5] == 6) {
            return true;
        }
        if (vetorVitoriaJogador[6] == 7 && vetorVitoriaJogador[7] == 8 && vetorVitoriaJogador[8] == 9) {
            return true;
        }
        if (vetorVitoriaJogador[0] == 1 && vetorVitoriaJogador[4] == 5 && vetorVitoriaJogador[8] == 9) {
            return true;
        }
        if (vetorVitoriaJogador[2] == 3 && vetorVitoriaJogador[4] == 5 && vetorVitoriaJogador[6] == 7) {
            return true;
        }
        if (vetorVitoriaJogador[0] == 1 && vetorVitoriaJogador[3] == 4 && vetorVitoriaJogador[6] == 7) {
            return true;
        }
        if (vetorVitoriaJogador[1] == 2 && vetorVitoriaJogador[4] == 5 && vetorVitoriaJogador[7] == 8) {
            return true;
        }
        if (vetorVitoriaJogador[2] == 3 && vetorVitoriaJogador[5] == 6 && vetorVitoriaJogador[8] == 9) {
            return true;
        }
        return false;
    }

    //imprime a matriz
    public static void imprimirMatriz() {
        System.out.println(" ");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (matriz[l][c].selecionado) {
                    if (matriz[l][c].jogador == 1) {
                        System.out.print(marcadorJogador1 + " ");
                    }
                    if (matriz[l][c].jogador == 2) {
                        System.out.print(marcadorJogador2 + " ");
                    }
                } else {
                    System.out.print(matriz[l][c].numPosicao + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
