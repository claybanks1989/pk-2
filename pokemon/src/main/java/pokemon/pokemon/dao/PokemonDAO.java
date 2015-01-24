package pokemon.pokemon.dao;


import java.util.List;

import pokemon.pokemon.dto.Pokemon;

public interface PokemonDAO {

	 // create
    public void createPokemon(Pokemon pokemon);

    // read
    public Pokemon getPokemon(Integer id);

    // Update
    public void updatePokemon(Pokemon pokemon);

    // delete
    public void deletePokemon(Integer id);

    // List

    public List<Pokemon> getStudentList();

    // save

    public void save(Pokemon pokemon);

	
}
