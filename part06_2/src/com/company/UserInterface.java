package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<String> words;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.words = new ArrayList<>();
    }

    public void start() {

        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (alreadyEntered(word)) {
                break;
            }
            this.words.add(word);
        }

        System.out.println("You gave the same word twice!");
    }

    public boolean alreadyEntered(String word) {
        if (this.words.contains(word)) {
            return true;
        }
        return false;
    }



}
