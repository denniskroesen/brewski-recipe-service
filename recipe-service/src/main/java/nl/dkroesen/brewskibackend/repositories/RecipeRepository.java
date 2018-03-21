package nl.dkroesen.brewskibackend.repositories;

import nl.dkroesen.brewskibackend.entities.Recipe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "recipe", path = "recipes")
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Long> {

    Recipe findByName(@Param("name") String name);

    @Query("SELECT c.recipe_id, c.name FROM Recipe c where c.recipe_id = :id")
    Recipe findById(@Param("id") Long id);


}