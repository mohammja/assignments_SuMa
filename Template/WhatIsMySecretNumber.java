package Template;

import java.util.Scanner;

public class WhatIsMySecretNumber extends Game {

    Scanner sc;
    private int secretNum;
    private int[] playerGuesses;

    @Override
    void initializeGame() {
        System.out.println("Welcome to the Guessing Game!");
        secretNum = (int) (Math.random() * 100) + 1;
        playerGuesses = new int[playersCount];
    }

    @Override
    void makePlay(int player) {
        sc = new Scanner(System.in);
        System.out.println("Player " + (player + 1) + " what is your guess: ");
        int playerGuess = sc.nextInt();
        playerGuesses[player] = playerGuess;
        if (playerGuess < secretNum) {
            System.out.println("Too low maybe next try!");
        } else if (playerGuess > secretNum) {
            System.out.println("Too high maybe next try!");
        }
    }

    @Override
    boolean endOfGame() {
        for (int i = 0; i < playersCount; i++) {
            if (playerGuesses[i] == secretNum) {
                return true;
            }
        }
        return false;
    }

    @Override
    void printWinner() {
        for (int i = 0; i < playersCount; i++) {
            if (playerGuesses[i] == secretNum) {
                System.out.println("Player " + (i + 1) + " wins the game!");
            }
        }
    }

}
