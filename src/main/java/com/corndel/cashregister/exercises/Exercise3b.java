package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.RecipeBook;

public class Exercise3b {
  /**
   * Given a recipeBook containing recipes, returns the total number of servings
   * in the book
   */
  public static int countServings(RecipeBook recipeBook) {
    // TODO

    int totalServings = 0;

    for (var currRecipe : recipeBook.recipes){
      totalServings += currRecipe.servings;
    }

    return totalServings;
  }
}
