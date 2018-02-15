package nl.dkroesen.brewskibackend.sampledb.public_.recipes;

import nl.dkroesen.brewskibackend.sampledb.public_.recipe_steps.RecipeSteps;
import nl.dkroesen.brewskibackend.sampledb.public_.recipes.generated.GeneratedRecipes;

import java.util.List;

/**
 * The main interface for entities of the {@code recipes}-table in the database.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dkroesen
 */
public interface Recipes extends GeneratedRecipes {

    List<RecipeSteps> getRecipeStepsList();
    void setRecipeStepsList(List<RecipeSteps> recipeStepsList);

}