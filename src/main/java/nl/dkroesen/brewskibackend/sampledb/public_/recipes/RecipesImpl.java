package nl.dkroesen.brewskibackend.sampledb.public_.recipes;

import nl.dkroesen.brewskibackend.sampledb.public_.recipe_steps.RecipeSteps;
import nl.dkroesen.brewskibackend.sampledb.public_.recipes.generated.GeneratedRecipesImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * The default implementation of the {@link
 * nl.dkroesen.brewskibackend.sampledb.public_.recipes.Recipes}-interface.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dkroesen
 */
public final class RecipesImpl 
extends GeneratedRecipesImpl 
implements Recipes {

    private List<RecipeSteps> recipeStepsList = new ArrayList<>();

    public List<RecipeSteps> getRecipeStepsList() {
        return recipeStepsList;
    }

    public void setRecipeStepsList(List<RecipeSteps> recipeStepsList) {
        this.recipeStepsList = recipeStepsList;
    }
}