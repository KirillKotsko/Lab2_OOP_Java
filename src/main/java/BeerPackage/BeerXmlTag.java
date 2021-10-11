package BeerPackage;

public enum BeerXmlTag {
    BEERS("beers"),
    ID("id"),
    TYPE("type"),
    BEER("beer"),
    NAME("name"),
    ALCO("alco"),
    MANUFACTURE("manufacture"),
    INGREDIENTS("ingredients"),
    TURNOVERS("turnovers"),
    TRANSPARENCY("transparency"),
    FILTERED("filtered"),
    NUTRITIONAL("nutritional"),
    CHARS("chars");

    private String value;

    BeerXmlTag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
