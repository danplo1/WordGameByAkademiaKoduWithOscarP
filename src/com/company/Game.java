package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 21.09.2018.
 */
public class Game {
    public static void main(String[] args) {
        new Game().start();
    }

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int points; // typ prymitywny, wartośc domyślna 0;


    public void start() {
        long startTime = System.currentTimeMillis();

        while (true) {

            char randomChar = (char) (random.nextInt(123 - 97) + 97); ///losuje liczby z zakresu od 97 - 122

            System.out.println("Twój znak to: " + randomChar);

            System.out.println("Podaj swoją odpowiedź: ");
            char userAnswer = scanner.nextLine().charAt(0);

            if (randomChar == userAnswer) {
                points++;

            } else {
                break;
            }
            if (points == 10) {
                break;
            }
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Twój wynik to: " + points + " a czas gry: " + (stopTime - startTime) / 1000 + " sekund.");

    }
}
