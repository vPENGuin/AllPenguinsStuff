package penguin.enums;

import static penguin.enums.Planet.DEFAULT;

public class Main {
    public static void main(String[] args) {
        int n = 3; // 0 - 5

        Planet planet = DEFAULT;

        // -1 - default
        // 0 - Earth
        // 1 - Mars
        // 2 - Pluto
        // 3 - Sun
        // 4 - Mercury
        // 5 - Venera

        planet = Planet.getPlanet(n);
        System.out.println(planet);

        Planet earth = Planet.valueOf("EARTH");
        System.out.println(earth);

        String algName = "DSA";
        CryptoAlgs alg = CryptoAlgs.valueOf(algName);

        String message = "Hello! Who is there?";
        String cypherMessage = alg.cypher(message);

        System.out.println(cypherMessage);
    }
}
