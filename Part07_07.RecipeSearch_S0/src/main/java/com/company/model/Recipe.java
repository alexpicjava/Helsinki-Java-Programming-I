package com.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
@Entity
@Table(name = "STUDENT")
public class Recipe {

    @Id
    @Column(name = "RECIPE_ID")
    private long recipe_id;
    @Column(name="NAME")
    private String name;
    @Column(name="COOK_TIME")
    private int cookTime;
    @Column(name="INGREDIENTS")
    private List<String> ingredients;

    public Recipe() {
    }

    public Recipe(String name, int cookTime, List<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
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