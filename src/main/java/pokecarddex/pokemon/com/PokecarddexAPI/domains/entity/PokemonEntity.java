package pokecarddex.pokemon.com.PokecarddexAPI.domains.entity;

import java.util.List;

public class PokemonEntity {
    private Integer id;
    private String name;
    private List<PokemonLocationEntity> pokemonLocations;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<PokemonLocationEntity> getPokemonLocations() {
        return pokemonLocations;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPokemonLocations(List<PokemonLocationEntity> pokemonLocations) {
        this.pokemonLocations = pokemonLocations;
    }
}
