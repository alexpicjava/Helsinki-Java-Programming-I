package com.company;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (alreadyEntered(word)) {
                break;
            }
        }

        System.out.println("You gave the same word twice!");
    }

    public boolean alreadyEntered(String word) {
        if (word.equals("end")) {
            return true;
        }

        return false;
    }



}
