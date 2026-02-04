package GuessingGame;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void easyGame() {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\nO jogo vai começar!");

        int tries = 10;
        int answer = random.nextInt(1, 2);
        boolean continueGame = true;

        System.out.print("Adivinhe um número entre 1 e 50 (" + tries + " tentativas): ");

        while (tries > 0 && continueGame) {
            int guess = ler.nextInt();

            if (guess == answer) {
                int score = 100 + (tries * 50);
                System.out.println("Você acertou o número sorteado! (" + answer + ")");
                saveScore(score, "Fácil");
                continueGame = false;
            } else {
                tries--;

                if (tries > 0) {
                    System.out.print(
                            guess + " não é a resposta correta.\n" +
                                    "Tente novamente (" + tries + " tentativas): "
                    );
                } else {
                    System.out.println(
                            "Suas tentativas acabaram. O número correto era: " + answer
                    );
                    continueGame = false;
                }
            }
        }
    }

    public static void mediumGame() {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\nO jogo vai começar!");

        int tries = 7;
        int answer = random.nextInt(1, 101);
        boolean continueGame = true;

        System.out.print("Adivinhe um número entre 1 e 100 (" + tries + " tentativas): ");

        while (tries > 0 && continueGame) {
            int guess = ler.nextInt();

            if (guess == answer) {
                int score = 200 + (tries * 50);
                System.out.println("Você acertou o número sorteado! (" + answer + ")");
                saveScore(score, "Médio");
                continueGame = false;
            } else {
                tries--;

                if (tries > 0) {
                    System.out.print(
                            guess + " não é a resposta correta.\n" +
                                    "Tente novamente (" + tries + " tentativas): "
                    );
                } else {
                    System.out.println(
                            "Suas tentativas acabaram. O número correto era: " + answer
                    );
                    continueGame = false;
                }
            }
        }
    }

    public static void hardGame() {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\nO jogo vai começar!");

        int tries = 5;
        int answer = random.nextInt(1, 201);
        boolean continueGame = true;

        System.out.print("Adivinhe um número entre 1 e 200 (" + tries + " tentativas): ");

        while (tries > 0 && continueGame) {
            int guess = ler.nextInt();

            if (guess == answer) {
                int score = 300 + (tries * 50);
                System.out.println("Você acertou o número sorteado! (" + answer + ")");
                saveScore(score, "Difícil");
                continueGame = false;
            } else {
                tries--;

                if (tries > 0) {
                    System.out.print(
                            guess + " não é a resposta correta.\n" +
                                    "Tente novamente (" + tries + " tentativas): "
                    );
                } else {
                    System.out.println(
                            "Suas tentativas acabaram. O número correto era: " + answer
                    );
                    continueGame = false;
                }
            }
        }
    }

    public static void game() {
        Scanner ler = new Scanner(System.in);

        System.out.print(
                "Escolha o nível de dificuldade (1, 2 ou 3):\n" +
                        "1 - Fácil: Adivinhar um número entre 1 e 50, com 10 tentativas (100 pontos)\n" +
                        "2 - Médio: Adivinhar um número entre 1 e 100, com 7 tentativae (200 pontos)\n" +
                        "3 - Difícil: Adivinhar um número entre 1 e 200, com 5 tentativas (300 pontos)\n"
        );

        int opcMode = ler.nextInt();

        switch (opcMode) {
            case 1 -> {
                System.out.println("Você escolheu o modo fácil.");
                easyGame();
            }
            case 2 -> {
                System.out.println("Você escolheu o modo médio.");
                mediumGame();
            }
            case 3 -> {
                System.out.println("Você escolheu o modo difícil.");
                hardGame();
            }
            default -> System.out.println("Erro ao selecionar opção.");
        }
    }

    public static void rules() {
        System.out.println("=== Regras do Jogo de Adivinhação ===");

        System.out.println("Objetivo:");
        System.out.println("Descobrir o número secreto gerado pelo computador dentro do limite de tentativas.\n");

        System.out.println("Níveis de dificuldade:");
        System.out.println("1 - Fácil: número entre 1 e 50, com 10 tentativas (100 pontos)");
        System.out.println("2 - Médio: número entre 1 e 100, com 7 tentativas (200 pontos)");
        System.out.println("3 - Difícil: número entre 1 e 200, com 5 tentativas (300 pontos)");
        System.out.println("Obs:");
        System.out.println("- A cada tentativa usada, são descontados pontos.");
        System.out.println("- Bônus por conclusão rápida: +50 pontos para cada tentativa não utilizada.\n");

        System.out.println("Como funciona:");
        System.out.println("- O jogador digita palpites pelo console.");
        System.out.println("- A cada erro, uma tentativa é consumida.");
        System.out.println("- O jogo termina ao acertar o número ou acabar as tentativas.\n");

        System.out.println("Boa sorte e divirta-se!");
    }

    static int[] scores = new int[10];
    static String[] difficulties = new String[10];
    static int scoreIndex = 0;

    public static void saveScore(int score, String difficulty) {
        if (scoreIndex < 10) {
            scores[scoreIndex] = score;
            difficulties[scoreIndex] = difficulty;
            scoreIndex++;
        } else {
            for (int i = 0; i < 9; i++) {
                scores[i] = scores[i + 1];
                difficulties[i] = difficulties[i + 1];
            }
            scores[9] = score;
            difficulties[9] = difficulty;
        }
    }

    public static void scoreHistory() {
        System.out.println("=== Histórico de Pontuações ===");

        if (scoreIndex == 0) {
            System.out.println("Nenhuma pontuação registrada ainda.");
            return;
        }

        for (int i = 0; i < scoreIndex; i++) {
            System.out.println(
                    (i + 1) + "º | Pontos: " + scores[i] +
                            " | Dificuldade: " + difficulties[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opc;

        while (true) {
            System.out.println("=== Jogo de adivinhação ===");
            System.out.print(
                    "Menu principal:\n" +
                            "1 - Iniciar Novo Jogo\n" +
                            "2 - Ver Regras\n" +
                            "3 - Ver Histórico de Pontuações\n" +
                            "4 - Sair\n"
            );

            try {
                opc = Integer.parseInt(ler.nextLine());

                switch (opc) {
                    case 1 -> game();
                    case 2 -> rules();
                    case 3 -> scoreHistory();
                    case 4 -> {
                        System.out.println("Encerrando menu...");
                        return;
                    }
                    default -> System.out.println("Opção inválida. Digite um número entre 1 e 4.");
                }
                System.out.println("Voltar ao menu? [s] [n]");
                String menuReturn = ler.nextLine().toLowerCase();
                if (menuReturn.equals("n")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite apenas números.");
            }
        }
    }
}
