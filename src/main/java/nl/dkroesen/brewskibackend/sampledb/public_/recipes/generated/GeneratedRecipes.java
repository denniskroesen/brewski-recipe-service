package nl.dkroesen.brewskibackend.sampledb.public_.recipes.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.LongField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.util.Optional;
import nl.dkroesen.brewskibackend.sampledb.public_.recipes.Recipes;

/**
 * The generated base for the {@link
 * nl.dkroesen.brewskibackend.sampledb.public_.recipes.Recipes}-interface
 * representing entities of the {@code recipes}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedRecipes {
    
    /**
     * This Field corresponds to the {@link Recipes} field that can be obtained
     * using the {@link Recipes#getRecipeId()} method.
     */
    LongField<Recipes, Long> RECIPE_ID = LongField.create(
        Identifier.RECIPE_ID,
        Recipes::getRecipeId,
        Recipes::setRecipeId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Recipes} field that can be obtained
     * using the {@link Recipes#getName()} method.
     */
    StringField<Recipes, String> NAME = StringField.create(
        Identifier.NAME,
        o -> OptionalUtil.unwrap(o.getName()),
        Recipes::setName,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the recipeId of this Recipes. The recipeId field corresponds to
     * the database column sampledb.public.recipes.recipe_id.
     * 
     * @return the recipeId of this Recipes
     */
    long getRecipeId();
    
    /**
     * Returns the name of this Recipes. The name field corresponds to the
     * database column sampledb.public.recipes.name.
     * 
     * @return the name of this Recipes
     */
    Optional<String> getName();
    
    /**
     * Sets the recipeId of this Recipes. The recipeId field corresponds to the
     * database column sampledb.public.recipes.recipe_id.
     * 
     * @param recipeId to set of this Recipes
     * @return         this Recipes instance
     */
    Recipes setRecipeId(long recipeId);
    
    /**
     * Sets the name of this Recipes. The name field corresponds to the database
     * column sampledb.public.recipes.name.
     * 
     * @param name to set of this Recipes
     * @return     this Recipes instance
     */
    Recipes setName(String name);
    
    enum Identifier implements ColumnIdentifier<Recipes> {
        
        RECIPE_ID ("recipe_id"),
        NAME      ("name");
        
        private final String columnName;
        private final TableIdentifier<Recipes> tableIdentifier;
        
        Identifier(String columnName) {
            this.columnName      = columnName;
            this.tableIdentifier = TableIdentifier.of(    getDbmsName(), 
                getSchemaName(), 
                getTableName());
        }
        
        @Override
        public String getDbmsName() {
            return "sampledb";
        }
        
        @Override
        public String getSchemaName() {
            return "public";
        }
        
        @Override
        public String getTableName() {
            return "recipes";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<Recipes> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}