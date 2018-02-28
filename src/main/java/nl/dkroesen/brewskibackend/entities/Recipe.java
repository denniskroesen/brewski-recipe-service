package nl.dkroesen.brewskibackend.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long recipe_id;
    private String name;

    protected Recipe() {}

    @OneToMany(targetEntity=RecipeStep.class, fetch=FetchType.EAGER)
    @JoinColumn(name="recipe_id")
    private List<RecipeStep> recipeStepsList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(Long recipe_id) {
        this.recipe_id = recipe_id;
    }

    public List<RecipeStep> getRecipeStepsList() {
        return recipeStepsList;
    }

    public void setRecipeStepsList(List<RecipeStep> recipeStepsList) {
        this.recipeStepsList = recipeStepsList;
    }
}
