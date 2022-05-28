package penguin.enums;

public enum Planet {
    DEFAULT(-1),
    EARTH(0),
    MARS(1),
    PLUTO(2),
    SUN(3),
    MERCURY(4),
    VENERA(5);

    private final int n;

    Planet(int n) {
        this.n = n;
    }

    public static Planet getPlanet(int n) {
        for (Planet planet : values()) {
            if (planet.n == n) {
                return planet;
            }
        }
        return DEFAULT;
    }
}
