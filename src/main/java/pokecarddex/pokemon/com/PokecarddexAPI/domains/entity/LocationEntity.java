package pokecarddex.pokemon.com.PokecarddexAPI.domains.entity;

public class LocationEntity {
    private Integer id;
    private String name;
    private Integer generationId;
    private String map;

    public void setName(String name) {
        this.name = name;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGenerationId() {
        return generationId;
    }

    public Integer getId() {
        return id;
    }

    public String getMap() {
        return map;
    }

    public String getName() {
        return name;
    }

    public void setGenerationId(Integer generationId) {
        this.generationId = generationId;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
