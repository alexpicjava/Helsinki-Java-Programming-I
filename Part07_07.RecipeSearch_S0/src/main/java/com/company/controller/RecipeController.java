package com.company.controller;

import com.company.model.Recipe;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeController {


    public static void findIngredient(String ingredient,ArrayList<Recipe> recipes) {
        for (Recipe recipe : recipes) {
            for (String ingre : recipe.getIngredients()) {
                if (ingre.equals(ingredient)) {
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
                }
            }
        }
    }


    public static void cookingTime(int cookTime, ArrayList<Recipe> recipes){
        for(Recipe recipe: recipes){
            if(recipe.getCookTime() <= cookTime){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
    }

    public static void findName(String name, ArrayList<Recipe> recipes){
        System.out.println("Receipes: ");
        for(Recipe recipe: recipes){
            if(recipe.getName().contains(name)){
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
    }

    public static void listRecipes(ArrayList<Recipe> recipes){
        System.out.println("Recipes: ");
        for(Recipe recipe: recipes){
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
        }

    }

    public static void readFile(String fileName, ArrayList recipes) {

        try (Scanner readFile = new Scanner(Paths.get(fileName))){

            while(readFile.hasNextLine()){
                String name = readFile.nextLine();
                if (name.isEmpty()){
                    continue;
                }
                int cookTime = Integer.valueOf(readFile.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while(readFile.hasNextLine()){
                    String ingredient = readFile.nextLine();
                    if (ingredient.isEmpty()){
                        break;
                    }ingredients.add(ingredient);
                }
                Recipe newRecipe = new Recipe(name, cookTime, ingredients);
                recipes.add(newRecipe);
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
