create table recipes
(
  recipe_id bigserial not null
    constraint recipes_pkey
    primary key,
  name varchar(255)
);

create table recipe_steps
(
  recipe_step_id bigserial not null,
  recipe_id bigint
    constraint recipe_steps_recipes_recipe_id_fk
    references recipes,
  duration integer,
  target_temperature integer
);

create unique index recipe_steps_recipe_step_id_uindex
  on recipe_steps (recipe_step_id);

