package BeerPackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Beer {
    private int id;
    private String name;
    private BeerType type;
    private Boolean al;
    private String manufacture;
    private Set<String> ingredients = new HashSet<String>();
    private Chars chars = new Chars();

    public Beer() {
    }

    public Beer(int id, String name, BeerType type, Boolean al, String manufacture, Set<String> ingredients, Chars chars) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.al = al;
        this.manufacture = manufacture;
        this.ingredients = new HashSet<String>(ingredients);
        this.chars = chars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeerType getType() {
        return type;
    }

    public void setType(BeerType type) {
        this.type = type;
    }

    public Boolean isAl() {
        return al;
    }

    public void setAl(Boolean al) {
        this.al = al;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Set<String> getIngredients() {
        return new HashSet<String>(ingredients);
    }

    public void setIngredients(Set<String> ingredients) {
        this.ingredients = new HashSet<String>(ingredients);
    }

    public Chars getChars() {
        return chars;
    }

    public void setChars(Chars chars) {
        this.chars = chars;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nId: ");
        sb.append(id).append("\nName: ").append(name);
        sb.append("\nBeer type: ").append(type);
        sb.append("\nAlcoholic: ").append(al.toString());
        sb.append("\nManufacture: ").append(manufacture);
        sb.append("\nIngredients: ");
        for (var x: ingredients)
            sb.append(x + " ");
        sb.append(chars);
        return sb.toString();
    }

    public class Chars {
        private int turnovers;
        private int transparency;
        private Boolean filtered;
        private int theNutritionalValue;

        public Chars(int turnovers, int transparency, Boolean filtered, int theNutritionalValue) throws OutOfPercentValueException {
            this.turnovers = turnovers;
            if (transparency > 100 || transparency < 0)
                throw new OutOfPercentValueException();
            this.transparency = transparency;
            this.filtered = filtered;
            this.theNutritionalValue = theNutritionalValue;
        }

        public Chars() {
        }

        public int getTurnovers() {
            return turnovers;
        }

        public void setTurnovers(int turnovers) {
            this.turnovers = turnovers;
        }

        public int getTransparency() {
            return transparency;
        }

        public void setTransparency(int transparency) {
            this.transparency = transparency;
        }

        public Boolean isFiltered() {
            return filtered;
        }

        public void setFiltered(Boolean filtered) {
            this.filtered = filtered;
        }

        public int getTheNutritionalValue() {
            return theNutritionalValue;
        }

        public void setTheNutritionalValue(int theNutritionalValue) {
            this.theNutritionalValue = theNutritionalValue;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("\nChars:\n\tTurnovers:");
            sb.append(turnovers);
            sb.append("\n\tFiltered: ").append(filtered.toString());
            sb.append("\n\tTransparency: ").append(transparency + "%");
            sb.append("\n\tThe nutritional value: ").append(theNutritionalValue).append('\n');
            return sb.toString();
        }
    }
}
