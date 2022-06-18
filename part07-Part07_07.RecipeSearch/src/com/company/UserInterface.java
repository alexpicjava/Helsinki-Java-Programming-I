package com.company;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {

    ArrayList <Recipe> recipes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

    }

    public void start(){
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        readFile(fileName);
        menu();
        loopMenu();
    }

    public void loopMenu(){

        while(true){
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
    
            if (command.equals("stop")){
                break;
            }else if (command.equals("list")){
                listRecipes();
            }else if (command.equals("find name")){
                System.out.println("name: ");
                String name = scanner.nextLine();
                findName(name);
    
            }else if (command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int cookTime = Integer.valueOf(scanner.nextLine());
                cookingTime(cookTime);
    
            }else if (command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                findIngredient(ingredient);
            }
        }
    }

    public void findIngredient(String ingredient){
        for(Recipe recipe: recipes){
            for (String ingre :recipe.getIngredients())
            if(ingre.equals(ingredient)){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
    }

    public void cookingTime(int cookTime){
        for(Recipe recipe: recipes){
            if(recipe.getCookTime() <= cookTime){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
    }

    public void findName(String name){
        System.out.println("Receipes: ");
        for(Recipe recipe: recipes){
            if(recipe.getName().contains(name)){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
    }

    public void listRecipes(){
        System.out.println("Receipes: ");
        for(Recipe recipe: recipes){
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
        }

    }

    public void readFile(String fileName) {
        
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
