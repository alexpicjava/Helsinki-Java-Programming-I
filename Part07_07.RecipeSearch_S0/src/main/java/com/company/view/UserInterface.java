package com.company.view;

import com.company.model.Recipe;

import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {

    public static void menu(){
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
}
