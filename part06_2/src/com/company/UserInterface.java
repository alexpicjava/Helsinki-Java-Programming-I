package com.company;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private WordSet wordSet;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.wordSet = new WordSet();
    }

    public void start() {

        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (wordSet.contains(word)) {
                break;
            }
            this.wordSet.add(word);
        }

        System.out.println("You gave the same word twice!");
    }
}
