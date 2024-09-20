package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import com.corndel.cashregister.exercises.models.RecipeBook;

public class Exercise3a {
  /**
   * Given a recipeBook containing recipes, returns the title of the last recipe
   * in the array.
   * 
   * Return null if there are no recipes.
   */
  public static Recipe lastRecipe(RecipeBook recipeBook) {
    // TODO

    if (recipeBook.recipes.size() == 0){
      return null;
    }
    else {
      return recipeBook.recipes.getLast();
    }
  }

//  public static String lastRecipeTitle(RecipeBook recipeBook) {
//    return recipeBook.recipes.getLast().name;
//  }

}
