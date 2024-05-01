/*
 * 
 * You can use the following import statements
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.recipe;

import org.springframework.web.bind.annotation.*;
import com.example.recipe.RecipeService;
import java.util.*;

@RestController 
public class RecipeController{
    RecipeService recipeService = new RecipeService();

    @GetMapping("/recipes")
    public Arraylist<Recipe> getRecipes(){
        return recipeService.getAllRecipes();
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipeById(@PathVariable("recipeId") int recipeId){
        return recipeService.getRecipeById(recipeId);
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe){
        return recipeService.addRecipe(recipe);
    } 

    @PutMapping("/recipes/{recipeId}")
    public Recipe updateRecipe(@PathVariable("recipeId") int recipeId, @requestBody Recipe recipe){
        return recipeServies.updateRecipe(recipeId, recipe);
    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRcipe(@PathVariable("recipeId") int recipeId){
        recipeService.deleteRcipe(recipeId);
    }

}