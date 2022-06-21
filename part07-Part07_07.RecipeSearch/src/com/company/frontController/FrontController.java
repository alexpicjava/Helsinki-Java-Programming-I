package com.company.frontController;

import com.company.controller.RecipeController;
import com.company.model.Recipe;
import com.company.utils.Utilities;
import com.company.view.UserInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class FrontController {


    public static void maiLoop(Scanner scanner, ArrayList<Recipe> recipes){

        String fileName = Utilities.ask(scanner, "File to read: ");

        RecipeController.readFile(fileName, recipes);
        UserInterface.menu();

        while(true){

            String command = Utilities.ask(scanner, "Enter command: ");

            if (command.equals("stop")){
                break;
            }else if (command.equals("list")){
                RecipeController.listRecipes(recipes);
            }else if (command.equals("find name")){
                String name = Utilities.ask(scanner, "name: ");
                RecipeController.findName(name, recipes);

            }else if (command.equals("find cooking time")){
                int cookTime = Integer.valueOf(Utilities.ask(scanner, "Max cooking time: "));
                RecipeController.cookingTime(cookTime, recipes);

            }else if (command.equals("find ingredient")){
                String ingredient = Utilities.ask(scanner, "Ingredient:");
                RecipeController.findIngredient(ingredient, recipes);
            }
        }
    }


}
