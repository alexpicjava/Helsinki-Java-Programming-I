package com.company;

import com.company.frontController.FrontController;
import com.company.model.Recipe;

import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //we are starting our software, we are booting it
        FrontController.maiLoop(scanner, recipes);

        //Exit program
        System.out.println("Bye, bye, you have created " + recipes.size() + " recipes: " + recipes);
    }
}