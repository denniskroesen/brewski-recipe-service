package nl.dkroesen.brewskibackend.sampledb.public_.recipes;

import nl.dkroesen.brewskibackend.sampledb.public_.recipe_steps.RecipeSteps;
import nl.dkroesen.brewskibackend.sampledb.public_.recipe_steps.RecipeStepsManager;
import nl.dkroesen.brewskibackend.sampledb.public_.recipes.generated.GeneratedRecipesController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * REST controller logic
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dkroesen
 */
@RestController
public class RecipesController extends GeneratedRecipesController {

    @Autowired
    private RecipeStepsManager recipeStepsManager;

    @RequestMapping(value = "/recipes/{id}", method = GET)
    public Recipes getById(@PathVariable(value = "id") long id) {
        Recipes recipes = manager.stream()
                .filter(Recipes.RECIPE_ID.equal(id))
                .findAny()
                .orElse(null);
        List<RecipeSteps> recipeSteps = recipeStepsManager.stream()
                .filter(RecipeSteps.RECIPE_ID.equal(id))
                .collect(toList());
        recipes.setRecipeStepsList(recipeSteps);
        return recipes;
    }

    @RequestMapping(value = "/recipes/add", method = POST)
    public void add(@RequestBody Recipes recipes){
        manager.persist(recipes);
        recipes.getRecipeStepsList().forEach(e -> recipeStepsManager.persist(e));
    }

}