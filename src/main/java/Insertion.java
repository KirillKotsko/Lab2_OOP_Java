import BeerPackage.*;

import java.util.*;

final public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Beer> beerSet = new HashSet<Beer>();

        System.out.println("Amount of objects beer: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter name: ");
            String name = sc.next();

            System.out.println("Enter beer type (1 - light, 2 - dark, 3 - live, 'other' - lager)");
            BeerType type;
            switch (sc.nextInt()) {
                case 1:
                    type = BeerType.LIGHT;
                    break;
                case 2:
                    type = BeerType.DARK;
                    break;
                case 3:
                    type = BeerType.LIVE;
                    break;
                default:
                    type = BeerType.LAGER;
                    break;
            }

            System.out.println("Enter alcoholic or not (true - yes, (other) - no):");
            boolean al = Boolean.parseBoolean(sc.next());

            System.out.println("Enter manufacture: ");
            String manufacture = sc.next();

            System.out.println("Enter ingredient (water, salt, hop, sugar(as default)):");
            Set<String> ingredients = new HashSet<String>();
            while (true) {
                System.out.println("Enter ingredient:");
                String ingredient = sc.next();
                ingredients.add(ingredient);
                System.out.println("Want more? (true - yes, (other) - no)");
                if (!Boolean.parseBoolean(sc.next()))
                    break;
            }

            System.out.println("Enter turnovers: ");
            int turnovers = sc.nextInt();

            System.out.println("Enter transparency(%): ");
            int transparency = sc.nextInt();

            System.out.println("Enter filtered or not (true - yes, (other) - no): ");
            boolean filtered = Boolean.parseBoolean(sc.next());

            System.out.println("Enter the nutritional value: ");
            int theNutritionalValue = sc.nextInt();

            try {
                Beer.Chars chars = new Beer().new Chars(turnovers, transparency, filtered, theNutritionalValue);
                Beer s = new Beer(i, name, type, al, manufacture, ingredients, chars);
                beerSet.add(s);
                System.out.println("\n\t\tAdded!!!\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        beerSet.forEach((beer) -> System.out.println(beer));
    }
}
