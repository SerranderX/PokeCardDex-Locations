package pokecarddex.pokemon.com.PokecarddexAPI.domains.entity;

public class PokemonLocationEntity {
    private Integer locationId;
    private String coordinatesAppear;
    private Integer generationId;

    public String getCoordinatesAppear() {
        return coordinatesAppear;
    }

    public void setCoordinatesAppear(String coordinatesAppear) {
        this.coordinatesAppear = coordinatesAppear;
    }

    public Integer getGenerationId() {
        return generationId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setGenerationId(Integer generationId) {
        this.generationId = generationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }
}
