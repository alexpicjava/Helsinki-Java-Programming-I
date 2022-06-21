package com.company.model;

import java.util.List;

public class Recipe {
    
    private String name;
    private int cookTime;
    private List<String> ingredients;

    public Recipe() {
    }

    public Recipe(String name, int cookTime, List<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public int getCookTime() {
        return this.cookTime;
    }

    public List<String> getIngredients() {
        return this.ingredients;
    }

    @Override
    public String toString() {
        return this.name + ", " + "cooking time: " + this.cookTime;
    }


}