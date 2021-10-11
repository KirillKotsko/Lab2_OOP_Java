package BeerPackage;

public enum BeerType {
    LIGHT("light"),
    DARK("dark"),
    LIVE("live"),
    LAGER("lager");

    private String value;

    BeerType(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
